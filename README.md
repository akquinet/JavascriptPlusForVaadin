JavaScript Plus for vaadin
==========================

## What is JavaScript Plus for vaadin?

JavaScript Plus for vaadin provides an extended version of vaadin's `AbstractJavaScriptComponent` (see [JavaDoc](https://vaadin.com/api/7.5.2/com/vaadin/ui/AbstractJavaScriptComponent.html) from vaadin for more info) that is capable of deferred variable changes. Deferred variable change means: a value is not transferred to the server immediately, but instead waits until the next non-deferred action (like a button click) occurs. Then, the value is synced with the servers. Fields (like TextFields) with `immediate=false` use this. 

Deferred variable change has some advantages: 
- the application has a better responsiveness
- network bandwith and server resources are used economically

Up to now, these advantages were not available in JavaScript. With JavaScript Plus for vaadin, this is about to change. 

Now, you have  one more method coming with the connector: 

```javascript
connector.setDeferredVariable("varname", somevalue);
```

on the Java side, you then have

```java
@Override
protected void onChangeVariables(Map<String, Object> variables) {
	Object value = variables.get("varname");
	// do something with value
}
```

onChangeVariables is called possibly quite after the JavaScript - for instance when a button-click occurs. It is called before event handlers fire, so you can be quite sure to have up-to-date values there.

## Using JavaScript Plus for vaadin

Instead of `com.vaadin.ui.AbstractJavaScriptComponent` you have to use `de.akquinet.engineering.vaadin.javascriptplus.AbstractJavaScriptPlusComponent` - all other aspects of JavaScript components will remain the same. 

Plus: you either have to use a custom widgetset that includes *de/akquinet/engineering/vaadin/javascriptplus/JavaScriptPlusForVaadin.gwt.xml* or you have to change the widgetset to the pre-compiled version we ship: 

```java
@VaadinServletConfiguration(ui = yourui.class, widgetset = "de.akquinet.engineering.vaadin.javascriptplus.JavaScriptPlusForVaadin")
```

You find a **Demo** in `javascriptplus-for-vaadin-demo` and also in sister-project [vaangular](https://github.com/akquinet/vaangular/)
