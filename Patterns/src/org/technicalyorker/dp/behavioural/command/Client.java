package org.technicalyorker.dp.behavioural.command;

public class Client {
	private static final ApplicationController controller = new ApplicationController();

	public static void main(String[] args) {
		ActionContext.addParameter("username", "Thomas");
		ActionContext.addParameter("role", "admin");
		ActionContext.addParameter("group", "super");
		ActionContext.addAction("AddUserAction");
		controller.processRequest();
	}
}
