package com.tottokug.api.azureml;

import com.tottokug.api.ParameterType;

public interface AzureMLParameter {

	ParameterType getParameterType();

	String getParameterKey();

	String getParameterValue();

}
