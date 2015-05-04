package com.tottokug.api;

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
	public ApiResponse request(ApiRequest request);

	/**
	 * 
	 * @param requset
	 * @return
	 */
	public ApiResponse requestBatch(ApiRequest requset);

}
