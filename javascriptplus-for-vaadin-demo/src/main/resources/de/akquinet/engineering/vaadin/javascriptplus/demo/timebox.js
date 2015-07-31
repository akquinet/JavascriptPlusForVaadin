var de_akquinet_engineering_vaadin_javascriptplus_demo_TimeBox = function() {
	
	var connector = this;
	
	this.onStateChange = function() {
		connector.setDeferredVariable("foo", "bar");
	}
	
}