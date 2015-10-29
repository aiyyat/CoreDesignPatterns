package org.technicalyorker.dp.behavioural.cor.handlers;

import java.io.IOException;
import java.io.StringReader;
import java.util.Enumeration;
import java.util.Properties;

import org.technicalyorker.dp.behavioural.cor.HandlerContext;
import org.technicalyorker.dp.behavioural.cor.HandlerException;

public class PropertiesParameterHandler implements Handler {

	@Override
	public Status handle(HandlerContext context) {
		Properties props = new Properties();
		try {
			props.load(new StringReader(context.getRequest()));
			Enumeration<String> e = (Enumeration<String>) props.propertyNames();
			while (e.hasMoreElements()) {
				String key = e.nextElement();
				String value = props.getProperty(key);
				if (key.startsWith("header.")) {
					context.addHeader(key.substring(7), value);
				} else {
					context.addParameter(key, value);
				}
			}
			return Status.CONTINUE;
		} catch (IOException e) {
			context.addFault(new HandlerException("Unable to parse the request"));
			return Status.SUSPEND;
		}
	}
}
