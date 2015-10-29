package org.technicalyorker.dp.behavioural.cor.handlers;

import org.technicalyorker.dp.behavioural.cor.HandlerContext;
/**
 * Defines the chain processor. 
 * @author achuth
 *
 */
public class ChainProcessor {
	Handler[] handlers = new Handler[] { new EndPointHandler(),
			new PropertiesParameterHandler(), new SecurityHandler(),
			new MessageHandler() };

	public String process(String request) {
		HandlerContext context = new HandlerContext();
		context.setRequest(request);
		for (Handler handler : handlers) {
			if (Status.SUSPEND == handler.handle(context)) {
				break;
			}
		}
		return context.getResponse();
	}
}
