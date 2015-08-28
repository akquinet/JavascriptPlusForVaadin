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
var de_akquinet_engineering_vaadin_javascriptplus_demo_TimeBox = function() {
	
	var connector = this;
	var rootElement = null;
	
	this.onStateChange = function() {
		
		if(rootElement == null) {
			var rootElement = connector.getElement();
			
			var from = document.createElement("input");
			from.type = "time";
			from.addEventListener("change", function() {
				connector.setDeferredVariable("to", to.value);
				connector.setDeferredVariable("from", from.value);				
			});

			var to = document.createElement("input");
			to.type = "time";
			to.style.marginLeft = "10px";
			to.addEventListener("change", function() {
				connector.setDeferredVariable("to", to.value);
				connector.setDeferredVariable("from", from.value);				
			});
			
			rootElement.appendChild(from);
			rootElement.appendChild(to);
		}
		
	}
	
}