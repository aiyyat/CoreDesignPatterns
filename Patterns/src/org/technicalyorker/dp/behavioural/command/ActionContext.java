package org.technicalyorker.dp.behavioural.command;

import org.technicalyorker.dp.behavioural.command.model.CommandModel;

public class ActionContext {
	private static ThreadLocal<CommandModel> context = new ThreadLocal<CommandModel>() {
		@Override
		protected CommandModel initialValue() {
			return new CommandModel(20, 0.75f);
		}
	};

	public static CommandModel getModel() {
		return context.get();
	}

	public static void addParameter(String key, String value) {
		context.get().put(key, value);
	}

	public static void setFault(String fault) {
		addParameter("fault", fault);
	}

	public static void addAction(String value) {
		addParameter("action", value);
	}

	public static String getAction() {
		return getModel().get("action");
	}

	public static String getFault() {
		return getModel().get("fault");
	}
}
