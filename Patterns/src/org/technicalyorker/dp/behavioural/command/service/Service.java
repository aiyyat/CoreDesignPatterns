package org.technicalyorker.dp.behavioural.command.service;

public interface Service {

	public boolean userExists(String username);

	public void createUser(String username, String role, String group);
}
