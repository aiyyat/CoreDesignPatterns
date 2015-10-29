package org.technicalyorker.dp.behavioural.cor.handlers;

import org.technicalyorker.dp.behavioural.cor.HandlerContext;

public interface Handler {
	public Status handle(HandlerContext context);
}
