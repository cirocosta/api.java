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

import com.liferay.launchpad.ApiClient;

import org.junit.BeforeClass;
import org.junit.Test;
public class PodMultiMapTest {

	@BeforeClass
	public static void setup() {ApiClient.init(); }

	@Test
	public void testPodMultiMapFactory_constructorDummyCoverage() {
		new PodMultiMapFactory.Default();
	}

	@Test
	public void testNewMultiMap_dummyCoverage() {
		PodMultiMap.newMultiMap();
	}

	@Test
	public void testNewCaseSensitiveMultiMap_dummyCoverage() {
		PodMultiMap.newCaseSensitiveMultiMap();
	}

}