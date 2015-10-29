package org.technicalyorker.dp.creational.builder;

public class Client {
	public static void main(String[] args) {
		ContainerContextFactory factory = new CurrentFolderPropertiesContainerContextFactory();

		System.out.println("Info:"
				+ factory.getPrototypeBeanForId("student5", Student.class));
		System.out.println("Info:" + factory.getPrototypeBeanForId("student4"));
		System.out
				.println("Error:" + factory.getPrototypeBeanForId("student1"));
	}
}
