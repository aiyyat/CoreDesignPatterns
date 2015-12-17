package org.technicalyorker.dp.structural.composite;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class FolderElement implements Element {
	private String name;
	private List<Element> elements = new LinkedList<Element>();
	private int level;

	public String getName() {
		return name;
	}

	public void initialize(String name) {
		initialize(name, 0);
	}

	void initialize(String name, int level) {
		File folder = new File(name);
		this.name = folder.getName();
		this.level = level;
		level++;
		for (java.io.File f : folder.listFiles()) {
			if (f.isDirectory()) {
				FolderElement fe = new FolderElement();
				fe.initialize(f.getAbsolutePath(), level);
				elements.add(fe);
			} else {
				FileElement fe = new FileElement();
				fe.initialize(f.getAbsolutePath(), level);
				elements.add(fe);
			}
		}
	}

	@Override
	public String toString() {
		String str = "\n";
		for (int i = 0; i < level; i++) {
			str += ".";
		}
		str += "[" + name + "]";
		for (Element element : elements) {
			str += element.toString();
		}
		return str;
	}
}
