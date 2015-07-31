package de.akquinet.engineering.vaadin.javascriptplus.demo;

import java.util.Map;

import com.vaadin.annotations.JavaScript;

import de.akquinet.engineering.vaadin.javascriptplus.AbstractJavaScriptPlusComponent;

@JavaScript("timebox.js")
public class TimeBox extends AbstractJavaScriptPlusComponent {

	private static final long serialVersionUID = 1L;

	@Override
	protected void onChangeVariables(Map<String, Object> variables) {
		System.out.println(variables);
	}

}
