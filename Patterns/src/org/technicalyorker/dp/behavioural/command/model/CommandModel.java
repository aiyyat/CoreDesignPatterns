package org.technicalyorker.dp.behavioural.command.model;

import java.util.HashMap;

public class CommandModel extends HashMap<String, String> {
	private static final long serialVersionUID = 4307289966824634373L;

	public CommandModel() {

	}

	public CommandModel(int initialCapacity, float loadFactor) {
		super(initialCapacity, loadFactor);
	}
}
