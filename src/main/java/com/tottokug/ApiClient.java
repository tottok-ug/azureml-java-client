package com.tottokug;

/**
 * 
 * @author tokugami
 *
 */
public interface ApiClient {

	/**
	 * 
	 * @return
	 */
	public String getApiKey();

	/**
	 * 
	 * @return
	 */
	public String getApiEndpoint();

	/**
	 * 
	 * @param request
	 * @return
	 */
	public AzureMLResponse request(AzureMLRequest request);

	/**
	 * 
	 * @param requset
	 * @return
	 */
	public AzureMLBatchResponse requestBatch(AzureMLBatchRequest requset);

}
