package com.liferay.launchpad.api;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ForkJoinPool;

/**
 * Configurable api executor that runs all the asynchronous calls.
 */
@MultiJava(version = 8)
public class LaunchpadAsyncRunner
		extends BaseAsyncRunner<CompletableFuture<ClientResponse>> {

	public LaunchpadAsyncRunner() {
		this(false);
	}

	public LaunchpadAsyncRunner(boolean useExecutor) {
		super(useExecutor ? null : ForkJoinPool.commonPool());
	}

	public LaunchpadAsyncRunner(int numberOfThreads) {
		super(numberOfThreads);
	}

	@Override
	public CompletableFuture<ClientResponse> runAsync(
		Callable<ClientResponse> callable) {

		return CompletableFuture.supplyAsync(() -> {
			try {
				return callable.call();
			}
			catch (Exception e) {
				throw new LaunchpadClientExecutionException(
					"Execution failed", e);
			}
		}, executor);
	}

}