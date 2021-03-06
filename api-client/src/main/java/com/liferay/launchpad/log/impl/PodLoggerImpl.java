package com.liferay.launchpad.log.impl;

import com.liferay.launchpad.log.PodLogger;
import com.liferay.launchpad.log.PodLoggerFactoryInterface;
public class PodLoggerImpl implements PodLoggerFactoryInterface {

	@Override
	public PodLogger getLogger(String name) {
		return new Slf4jLogger(name);
	}

}