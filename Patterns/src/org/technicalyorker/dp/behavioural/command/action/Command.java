package org.technicalyorker.dp.behavioural.command.action;

import org.technicalyorker.dp.behavioural.command.ActionStatus;

public interface Command {
	public ActionStatus execute();
}
