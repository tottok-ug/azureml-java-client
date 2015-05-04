package com.tottokug.api.azureml;

import com.tottokug.api.ParameterType;

public interface MLParameter {

	ParameterType getParameterType();

	String getParameterKey();

	String getParameterValue();

}
