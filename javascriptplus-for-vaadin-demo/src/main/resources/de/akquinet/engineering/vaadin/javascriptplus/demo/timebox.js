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