package de.akquinet.engineering.vaadin.javascriptplus.demo;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.vaadin.annotations.JavaScript;

import de.akquinet.engineering.vaadin.javascriptplus.AbstractJavaScriptPlusComponent;

@JavaScript("timebox.js")
public class TimeBox extends AbstractJavaScriptPlusComponent {

	private static final long serialVersionUID = 1L;

	private final List<ValueChangeListener> valueChangeListeners = new ArrayList<>();
	private LocalTime from;
	private LocalTime to;
	
	public LocalTime getFrom() {
		return from;
	}
	
	public LocalTime getTo() {
		return to;
	}
	
	@Override
	protected void onChangeVariables(Map<String, Object> variables) {
		LocalTime from = getTime(variables, "from");
		LocalTime to = getTime(variables, "to");
		
		boolean hasChange = Objects.equals(this.from, from) == false || Objects.equals(this.to, to) == false;
		
		this.from = from;
		this.to = to;
		
		if(hasChange) {
				valueChangeListeners.stream().filter(l -> l != null).forEach(l -> l.valueChange(this, from, to));
		}
	}
	
	private LocalTime getTime(Map<String, Object> variables, String key) {
		Object value = variables.get(key);
		
		if(value instanceof String == false) {
			return null;
		}
		
		String stringValue = ((String) value).replace("\"", "");
		
		try {
			return LocalTime.parse(stringValue, DateTimeFormatter.ofPattern("HH:mm"));
		}
		catch(DateTimeParseException | IllegalArgumentException e) {
			return null;
		}
	}
	
	public void addValueChangeListener(ValueChangeListener listener) {
		this.valueChangeListeners.add(listener);
	}

	public void removeValueChangeListener(ValueChangeListener listener) {
		this.valueChangeListeners.remove(listener);
	}
	
	@FunctionalInterface
	public static interface ValueChangeListener {
		
		public void valueChange(TimeBox source, LocalTime from, LocalTime to);
		
	}

}
