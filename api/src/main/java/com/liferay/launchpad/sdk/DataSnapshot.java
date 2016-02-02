/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under the terms of the
 * GNU Lesser General Public License as published by the Free Software Foundation; either version
 * 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 */

package com.liferay.launchpad.sdk;

/**
 * DataSnapshot.
 */
public interface DataSnapshot {

	/**
	 * Navigates in key path, e.g. "/foo" -> data.child("1") -> /foo/1.
	 */
	public DataSnapshot child(String... names);

	/**
	 * Retrieves a snapshot of the existing data.
	 */
	public <T> T currentValue();

	/**
	 * Retrieves a snapshot of the existing data and parses into the target type.
	 * @see #currentValue()
	 */
	public <T> T currentValue(Class<T> type);

	/**
	 * Parses the body depending on content-type. If content-type is NOT set,
	 * it will use assume the "plain/text" content type.
	 * Returns {@link Request#bodyValue()} if data not committed,
	 * {@link Response#bodyValue()} otherwise.
	 * If body is not set, returns <code>null</code>.
	 * If body can not be parsed, throws an Exception.
	 */
	public <T> T newValue();

	/**
	 * Parses the body depending on content-type into the target type.
	 * @see #newValue()
	 */
	public <T> T newValue(Class<T> type);

	/**
	 * Navigates to parent key path, e.g. "/foo/1/child" -> data.parent() -> /foo/1.
	 */
	public DataSnapshot parent();

}