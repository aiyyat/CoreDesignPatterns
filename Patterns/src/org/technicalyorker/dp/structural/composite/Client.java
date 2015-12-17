package org.technicalyorker.dp.structural.composite;

public class Client {
	public static void main(String[] args) {
		FolderElement fe = new FolderElement();
		fe.initialize("./src/org/technicalyorker");
		System.out.println(fe);
	}
}
