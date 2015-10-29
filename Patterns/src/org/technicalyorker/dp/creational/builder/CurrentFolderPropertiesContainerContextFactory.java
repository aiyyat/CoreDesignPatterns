package org.technicalyorker.dp.creational.builder;

import org.technicalyorker.dp.creational.builder.container.Configuration;
import org.technicalyorker.dp.creational.builder.container.ConfigurationBuilder;

/**
 * Spring like Container which only instantiates object based on the default
 * constructor. properties have been avoided for simplicity.
 * 
 * @author achuth
 *
 */
public class CurrentFolderPropertiesContainerContextFactory extends
		ContainerContextFactory {
	ConfigurationBuilder builder = new ConfigurationBuilder();
	Configuration configuration;

	/**
	 * Load the configuration properties by default. If nothing is passed the
	 * default configuration switch over.
	 * 
	 * For simplicity its just hardcoding the properties file instead of reading
	 * from current folder.
	 * 
	 * @param uris
	 */
	public CurrentFolderPropertiesContainerContextFactory() {
		builder.addFromPropertiesFile(
				"/home/achuth/git/source/Patterns/src/load1.properties")
				.addFromPropertiesFile(
						"/home/achuth/git/source/Patterns/src/load2.properties");
		configuration = builder.build();
	}

	@Override
	protected Configuration getConfiguration() {
		return configuration;
	}
}
