package org.technicalyorker.dp.behavioural.command.action;

import org.technicalyorker.dp.behavioural.command.ActionContext;
import org.technicalyorker.dp.behavioural.command.ActionStatus;
import org.technicalyorker.dp.behavioural.command.model.CommandModel;
import org.technicalyorker.dp.behavioural.command.service.DummyService;
import org.technicalyorker.dp.behavioural.command.service.Service;

public class AddUserCommand implements Command {
	private Service service = new DummyService();

	@Override
	public ActionStatus execute() {
		CommandModel model = ActionContext.getModel();
		String username = model.get("username");
		String role = model.get("role");
		String group = model.get("group");
		if (null != username && !service.userExists(username)) {
			service.createUser(username, role, group);
			System.out.println("Created a user " + username);
		} else {
			ActionContext.setFault("User is null or Already Exists");
			return ActionStatus.FAILURE;
		}
		return ActionStatus.SUCCESS;
	}
}
