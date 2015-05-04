package com.tottokug.api;

import java.util.Map;

import com.tottokug.api.azureml.MLParameter;

public interface ApiRequest {

	public Map<String, MLParameter> getParameters();

	public Map<String, String> getHeaders();

	public String getRequestBody();
}
