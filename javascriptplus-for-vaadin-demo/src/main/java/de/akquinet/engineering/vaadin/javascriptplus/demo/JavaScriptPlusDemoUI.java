package de.akquinet.engineering.vaadin.javascriptplus.demo;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@Theme("valo")
public class JavaScriptPlusDemoUI extends UI {

	private static final long serialVersionUID = 1L;

	@Override
	protected void init(VaadinRequest request) {

		TimeBox timeBox = new TimeBox();

		Button button = new Button("Save");

		VerticalLayout layoutContent = new VerticalLayout();
		layoutContent.setMargin(true);
		layoutContent.setSpacing(true);
		layoutContent.addComponent(new Label("hello world"));
		layoutContent.addComponent(timeBox);
		layoutContent.addComponent(button);

		setContent(layoutContent);
	}

}
