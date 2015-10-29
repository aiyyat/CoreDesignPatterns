package org.technicalyorker.dp.behavioural.command;

import org.technicalyorker.dp.behavioural.command.action.AddUserCommand;

public class ApplicationController {
	AddUserCommand addUserAction = new AddUserCommand();

	public void processRequest() {
		if ("AddUserAction".equals(ActionContext.getAction())) {
			if (ActionStatus.FAILURE == addUserAction.execute()) {
				throw new ActionExecutionException("Action "
						+ ActionContext.getAction()
						+ "Could not be completed!!" + ActionContext.getFault());
			}
		}
	}
}
