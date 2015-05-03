package com.tottokug;

import java.io.IOException;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApiClientAbstract implements ApiClient {

	static final Logger logger = LoggerFactory.getLogger(ApiClientAbstract.class);

	private String apikey;
	private String endpoint;

	public String getApiKey() {

		return this.apikey;
	}

	public String getApiEndpoint() {
		return this.endpoint;
	}

	public AzureMLResponse request(AzureMLRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	public AzureMLBatchResponse requestBatch(AzureMLBatchRequest requset) {
		// TODO Auto-generated method stub
		return null;
	}

	public void requestHttp() {
		try (CloseableHttpClient httpClient = HttpClientBuilder.create().disableAuthCaching().build()) {

		} catch (IOException e) {
			logger.trace(e.getMessage(), e);
			logger.error(e.getMessage());
		}
	}

}
