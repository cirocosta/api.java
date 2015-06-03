package com.liferay.app.api.query;

import com.liferay.app.api.Util;

import java.util.Map;

/**
 * Common terms filter.
 */
public final class CommonTermsFilter extends BaseFilter<Map> {

	public CommonTermsFilter threshold(double threshold) {
		this.value.put("threshold", threshold);
		return this;
	}

	protected CommonTermsFilter(String field, Object value) {
		super(field, "common", Util.wrap("query", value));
	}

	protected CommonTermsFilter(String field, Object value, double threshold) {
		this(field, value);
		threshold(threshold);
	}

}