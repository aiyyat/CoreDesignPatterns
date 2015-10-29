package org.technicalyorker.dp.behavioural.cor;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;

import org.technicalyorker.dp.behavioural.cor.handlers.ChainProcessor;
/**
 * 
 * @author achuth
 *
 */
public class Client {
	private final static ChainProcessor processor = new ChainProcessor();

	public static void main(String[] args) throws UnsupportedEncodingException,
			IOException {
		System.out
				.println(processor
						.process(getRequest("/home/achuth/git/source/Patterns/src/org/technicalyorker/dp/behavioural/cor/authenticated.properties")));
		System.out
				.println(processor
						.process(getRequest("/home/achuth/git/source/Patterns/src/org/technicalyorker/dp/behavioural/cor/guest.properties")));
	}

	private static String getRequest(String fileName)
			throws UnsupportedEncodingException, IOException {
		return new String(Files.readAllBytes(new File(fileName).toPath()),
				"UTF-8");
	}
}
