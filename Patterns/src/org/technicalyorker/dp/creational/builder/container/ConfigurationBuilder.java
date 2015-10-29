package org.technicalyorker.dp.creational.builder.container;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

/**
 * This is the Configuration Builder that can take configuration key value pairs
 * from multiple sources.
 * 
 * @author achuth
 *
 */
public class ConfigurationBuilder {
	private Properties primaryProperties = new Properties();
	private Properties otherProperties = new Properties();
	private Properties defaultConfigurationProperties = new Properties();
	{
	}

	public ConfigurationBuilder setPrimaryProperties(Properties properties) {
		append(primaryProperties, properties);
		return this;
	}

	/**
	 * Reads from Properties File and add to the properties object. For Now I am
	 * just mocking the values.
	 * 
	 * @param propertiesFileName
	 * @return
	 */
	public ConfigurationBuilder addFromPropertiesFile(String propertiesFileName) {
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream(propertiesFileName));
			append(otherProperties, properties);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return this;
	}

	/**
	 * @param propertiesFileName
	 * @return
	 */
	public ConfigurationBuilder addFromXMLFile(String propertiesFileName) {
		System.out.println("Loading from XML File:" + propertiesFileName);
		// Lazy me, so you Provide an implementation
		return this;
	}

	/**
	 * Reads from Database and add to the properties object. For Now I am just
	 * mocking the values.
	 * 
	 * @param propertiesFileName
	 * @return
	 */
	public ConfigurationBuilder addFromDatabase(String driver, String url,
			String username, String password) {
		System.out.println("Loading from DB:" + url);
		// Lazy me, so you Provide an implementation
		return this;
	}

	public Configuration build() {
		Properties properties = new Properties();
		append(properties, otherProperties);
		append(properties, primaryProperties);
		if (0 == properties.size()) {
			append(properties, defaultConfigurationProperties);
		}
		System.out.println("Debug: Loaded Beans.." + properties);
		return new Configuration(properties);
	}

	private void append(Properties input, Properties toAdd) {
		input.putAll(toAdd);
	}
}
