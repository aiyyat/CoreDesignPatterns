package org.technicalyorker.dp.creational.builder;

import org.technicalyorker.dp.creational.builder.container.Configuration;

public abstract class ContainerContextFactory {
	/**
	 * Container constructs a bean defined in the properties configuration file
	 * and returns an object type.
	 * 
	 * @param id
	 * @return
	 */
	public Object getPrototypeBeanForId(String id) {
		return getPrototypeBeanForId(id, Object.class);
	}

	/**
	 * Container constructs a bean defined in the properties configuration file
	 * and returns a specific type.
	 * 
	 * Exception: Nothing to recover. Don't at all load the Container.
	 * 
	 * @param id
	 * @param t
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public <T> T getPrototypeBeanForId(String id, Class<T> t) {
		String beanName = getConfiguration().getExtendedConfiguration()
				.getProperty(id);
		if (null == beanName) {
			throw new IllegalStateException(
					"Container Unable to find a bean with id:" + id);
		}
		try {
			return (T) Class.forName(beanName);
		} catch (ClassNotFoundException e) {
			throw new IllegalStateException(e);
		}
	}

	protected abstract Configuration getConfiguration();
}
