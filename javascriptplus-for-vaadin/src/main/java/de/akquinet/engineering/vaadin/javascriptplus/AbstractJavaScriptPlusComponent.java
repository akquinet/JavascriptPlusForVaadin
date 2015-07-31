/*
 * Vaangular (c) 2015 akquinet engineering GmbH
 */
package de.akquinet.engineering.vaadin.javascriptplus;

import java.util.Map;

import com.vaadin.server.VariableOwner;
import com.vaadin.ui.AbstractJavaScriptComponent;

@SuppressWarnings("deprecation")
public abstract class AbstractJavaScriptPlusComponent extends AbstractJavaScriptComponent implements VariableOwner {

	private static final long serialVersionUID = 1L;

	public AbstractJavaScriptPlusComponent() {
		super();
	}
	
	@Override
	public void changeVariables(Object source, Map<String, Object> variables) {
		onChangeVariables(variables);
	}
	
	protected void onChangeVariables(Map<String, Object> variables) {
	}

}
