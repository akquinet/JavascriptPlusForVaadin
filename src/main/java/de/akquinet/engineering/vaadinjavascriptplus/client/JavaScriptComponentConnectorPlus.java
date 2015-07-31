/*
 * Vaangular (c) 2015 akquinet engineering GmbH
 */
package de.akquinet.engineering.vaadinjavascriptplus.client;

import com.vaadin.client.JavaScriptConnectorHelper;
import com.vaadin.client.communication.HasJavaScriptConnectorHelper;
import com.vaadin.client.ui.AbstractComponentConnector;
import com.vaadin.client.ui.JavaScriptWidget;
import com.vaadin.shared.ui.Connect;
import com.vaadin.shared.ui.JavaScriptComponentState;

import de.akquinet.engineering.vaadinjavascriptplus.AbstractJavaScriptComponentPlus;

@Connect(AbstractJavaScriptComponentPlus.class)
public final class JavaScriptComponentConnectorPlus extends
        AbstractComponentConnector implements HasJavaScriptConnectorHelper {

    
	private static final long serialVersionUID = 1L;
	
	private final JavaScriptConnectorHelper helper = new JavaScriptConnectorHelperPlus(this);
    
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
