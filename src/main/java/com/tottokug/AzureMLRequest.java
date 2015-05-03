package com.tottokug;

import java.util.Map;

public interface AzureMLRequest {

	public Map<String, MLParameter> getParameters();

	public Map<String, String> getHeaders();

	public String getRequestBody();

}
