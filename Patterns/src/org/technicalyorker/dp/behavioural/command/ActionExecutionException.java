package org.technicalyorker.dp.behavioural.command;

public class ActionExecutionException extends IllegalStateException {
	private static final long serialVersionUID = -6082730493922427515L;

	public ActionExecutionException() {
	}

	public ActionExecutionException(String string) {
		super(string);
	}
}
