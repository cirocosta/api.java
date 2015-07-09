package com.liferay.launchpad.api;

/**
 * Simple JSON engine.
 */
public interface JsonEngine {

	/**
	 * Parses JSON string to given model.
	 */
	public <T> T parseJsonToModel(String json, Class<T> model);

	/**
	 * Serializes object to JSON string.
	 */
	public String serializeToJson(Object object);

}