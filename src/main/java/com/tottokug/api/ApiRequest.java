package com.tottokug.api;

import java.util.Map;

import com.tottokug.api.azureml.AzureMLParameter;

public interface ApiRequest {

	public Map<String, AzureMLParameter> getParameters();

	public Map<String, String> getHeaders();

	public String getRequestBody();
}
