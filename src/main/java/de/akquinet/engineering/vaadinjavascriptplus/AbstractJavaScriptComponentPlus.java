/*
 * Vaangular (c) 2015 akquinet engineering GmbH
 */
package de.akquinet.engineering.vaadinjavascriptplus;

import java.util.Map;

import com.vaadin.server.VariableOwner;
import com.vaadin.ui.AbstractJavaScriptComponent;

@SuppressWarnings("deprecation")
public abstract class AbstractJavaScriptComponentPlus extends AbstractJavaScriptComponent implements VariableOwner {

	private static final long serialVersionUID = 1L;

	public AbstractJavaScriptComponentPlus() {
		super();
	}
	
	@Override
	public void changeVariables(Object source, Map<String, Object> variables) {
		onChangeVariables(source, variables);
	}
	
	protected abstract void onChangeVariables(Object source, Map<String, Object> variables);

}
