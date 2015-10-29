package org.technicalyorker.dp.behavioural.command.service;

public class DummyService implements Service {

	@Override
	public boolean userExists(String username) {
		return false;
	}

	@Override
	public void createUser(String username, String role, String group) {

	}
}
