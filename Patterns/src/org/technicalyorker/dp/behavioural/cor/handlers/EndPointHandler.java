package org.technicalyorker.dp.behavioural.cor.handlers;

import org.technicalyorker.dp.behavioural.cor.HandlerContext;
import org.technicalyorker.dp.behavioural.cor.HandlerException;

public class EndPointHandler implements Handler {
	@Override
	public Status handle(HandlerContext context) {
		if (null == context.getRequest()) {
			context.addFault(new HandlerException(
					"Request is empty, nothing to process"));
			return Status.SUSPEND;
		}
		return Status.CONTINUE;
	}
}
