package com.tottokug;

public interface ApiClient {

	public String getApiKey();

	public String getApiEndpoint();

	public AzureMLResponse request(AzureMLRequest request);

	public AzureMLBatchResponse requestBatch(AzureMLBatchRequest requset);

}
