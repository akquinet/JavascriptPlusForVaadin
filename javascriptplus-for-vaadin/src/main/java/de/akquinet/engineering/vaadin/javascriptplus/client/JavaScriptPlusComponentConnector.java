/*
 * Vaangular (c) 2015 akquinet engineering GmbH
 */
package de.akquinet.engineering.vaadin.javascriptplus.client;

import com.vaadin.client.JavaScriptConnectorHelper;
import com.vaadin.client.communication.HasJavaScriptConnectorHelper;
import com.vaadin.client.ui.AbstractComponentConnector;
import com.vaadin.client.ui.JavaScriptWidget;
import com.vaadin.shared.ui.Connect;
import com.vaadin.shared.ui.JavaScriptComponentState;

import de.akquinet.engineering.vaadin.javascriptplus.AbstractJavaScriptPlusComponent;

@Connect(AbstractJavaScriptPlusComponent.class)
public final class JavaScriptPlusComponentConnector extends
        AbstractComponentConnector implements HasJavaScriptConnectorHelper {

    
	private static final long serialVersionUID = 1L;
	
	private final JavaScriptConnectorHelper helper = new JavaScriptPlusConnectorHelper(this);
    
	@Override
	public JavaScriptWidget getWidget() {
	    return (JavaScriptWidget) super.getWidget();
	}

	@Override
    protected void init() {
        super.init();
        helper.init();
    }

    @Override
    public JavaScriptConnectorHelper getJavascriptConnectorHelper() {
        return helper;
    }

    @Override
    public JavaScriptComponentState getState() {
        return (JavaScriptComponentState) super.getState();
    }

    @Override
    public void onUnregister() {
        super.onUnregister();
        helper.onUnregister();
    }
    
}
