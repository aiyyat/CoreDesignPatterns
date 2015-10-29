package org.technicalyorker.dp.behavioural.cor.handlers;

import org.technicalyorker.dp.behavioural.cor.HandlerContext;

public class MessageHandler implements Handler {
	@Override
	public Status handle(HandlerContext context) {
		if ("guest".equals(context.getHeader("username"))) {
			context.setResponse("Welcome Guest User, Thanks for Trying our Site!");
		} else if ("WHO_AM_I?".equals(context.getParameter("question"))
				&& "DUFF_BEER".equals(context.getParameter("drink"))
				&& "SPRING_FIELD_NUCLEAR_POWER_PLANT".equals(context
						.getParameter("occupation"))) {
			context.setResponse("Its, Homer Jay Simpson");
		}
		return Status.CONTINUE;
	}
}
