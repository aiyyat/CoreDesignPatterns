package org.technicalyorker.dp.behavioural.cor.handlers;

import org.technicalyorker.dp.behavioural.cor.HandlerContext;

public class SecurityHandler implements Handler {
	@Override
	public Status handle(HandlerContext context) {
		if (!("admin".equals(context.getHeader("username")) && ("password123"
				.equals(context.getHeader("password"))))) {
			context.addHeader("username", "guest");
		}
		return Status.CONTINUE;
	}
}
