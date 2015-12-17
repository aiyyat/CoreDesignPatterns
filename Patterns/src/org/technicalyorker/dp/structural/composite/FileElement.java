package org.technicalyorker.dp.structural.composite;

import java.io.File;

public class FileElement implements Element {
	private String name;
	private int level;

	@Override
	public void initialize(String name) {
		initialize(name, 0);
	}

	void initialize(String name, int i) {
		this.level = i;
		this.name = name;
		File f = new File(name);
		if (f.exists()) {
			setName(f.getName());
		}
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		String str = "\n";
		for (int i = 0; i < level; i++) {
			str += ".";
		}
		return str + name;
	}

}
