package org.technicalyorker.dp.creational.builder.container;

import java.util.Properties;

public class Configuration {
	Properties extendedConfiguration = new Properties();

	public Configuration(Properties properties) {
		this.extendedConfiguration = properties;
	}

	public Properties getExtendedConfiguration() {
		return extendedConfiguration;
	}

	public void setExtendedConfiguration(Properties extendedConfiguration) {
		this.extendedConfiguration = extendedConfiguration;
	}

	@Override
	public String toString() {
		return "Configuration [extendedConfiguration=" + extendedConfiguration
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((extendedConfiguration == null) ? 0 : extendedConfiguration
						.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Configuration other = (Configuration) obj;
		if (extendedConfiguration == null) {
			if (other.extendedConfiguration != null)
				return false;
		} else if (!extendedConfiguration.equals(other.extendedConfiguration))
			return false;
		return true;
	}
}
