/*
 * Copyright 2015 akquinet engineering GmbH
 *  
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
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
