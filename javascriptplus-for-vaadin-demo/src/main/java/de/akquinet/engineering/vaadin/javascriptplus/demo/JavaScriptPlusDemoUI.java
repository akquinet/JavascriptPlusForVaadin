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
package de.akquinet.engineering.vaadin.javascriptplus.demo;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@Theme("valo")
public class JavaScriptPlusDemoUI extends UI {

	private static final long serialVersionUID = 1L;

	@Override
	protected void init(VaadinRequest request) {
		TimeBox timeBox = new TimeBox();
		timeBox.addValueChangeListener((source, from, to) -> Notification.show("Value Changed: from=" + from + ", to=" + to));

		Button button = new Button("Apply");

		VerticalLayout layoutContent = new VerticalLayout();
		layoutContent.setMargin(true);
		layoutContent.setSpacing(true);
		layoutContent.addComponent(timeBox);
		layoutContent.addComponent(button);

		setContent(layoutContent);
	}

}
