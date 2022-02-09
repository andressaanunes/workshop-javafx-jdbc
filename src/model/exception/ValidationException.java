package model.exception;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ValidationException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	private Map<String, String> errors = new ConcurrentHashMap<>();
	
	public ValidationException(String msg) {
		super(msg);
		
	}
	
	public Map<String, String> getErros(){
		return errors;
	}
	
	public void addError(String fielName, String errorMessage) {
		errors.put(fielName, errorMessage);
	}
}
