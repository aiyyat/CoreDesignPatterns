package org.technicalyorker.dp.behavioural.memento;

import java.util.Stack;

public class SnapshotManager extends Stack<Memento> {
	private static final long serialVersionUID = -3358600632742187088L;

	public Memento popMemento() {
		if (size() > 1) {
			return pop();
		} else {
			return peek();
		}
	}

	public void saveMemento(Memento memento) {
		add(memento);
	}
}
