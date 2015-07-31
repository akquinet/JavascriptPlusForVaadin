/*
 * Vaangular (c) 2015 akquinet engineering GmbH
 */
package de.akquinet.engineering.vaadin.javascriptplus.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.vaadin.client.JavaScriptConnectorHelper;

final class JavaScriptPlusConnectorHelper extends JavaScriptConnectorHelper {
	
	public JavaScriptPlusConnectorHelper(JavaScriptPlusComponentConnector connector) {
		super(connector);
		this.connector = connector;
	}
	
	private JavaScriptPlusComponentConnector connector;

	@Override
    protected void showInitProblem(
            java.util.ArrayList<String> attemptedNames) {
       connector.getWidget().showNoInitFound(attemptedNames);
    }

	@Override
	public JavaScriptObject getConnectorWrapper() {
		JavaScriptObject connWrapper = super.getConnectorWrapper();
		augmentConnectorWrapper(connWrapper, this);
		return connWrapper;
	}
	
	private void setDeferredVariableImpl(String name, String value) {
		connector.getConnection().updateVariable(connector.getConnectorId(),
				name, value, false);
	}
	
	private static native void augmentConnectorWrapper(JavaScriptObject obj, JavaScriptPlusConnectorHelper h)
	/*-{
	    obj.setDeferredVariable=function(name, value) {
	    	$entry(h.@de.akquinet.engineering.vaadin.javascriptplus.client.JavaScriptPlusConnectorHelper::setDeferredVariableImpl(*)).call(h, name, JSON.stringify(value));
	    };
	}-*/;
	
}