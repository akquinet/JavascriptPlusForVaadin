package de.akquinet.engineering.vaadin.javascriptplus.demo;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinServlet;

@WebServlet()
@VaadinServletConfiguration(ui = JavaScriptPlusDemoUI.class, productionMode = false, widgetset = "de.akquinet.engineering.vaadin.javascriptplus.JavaScriptPlusForVaadin")
public class JavaScriptPlusDemoServlet extends VaadinServlet {

	private static final long serialVersionUID = 1L;

}
