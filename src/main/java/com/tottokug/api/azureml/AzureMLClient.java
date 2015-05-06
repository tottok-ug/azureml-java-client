package com.tottokug.api.azureml;

import java.util.List;

import org.apache.http.Header;
import org.apache.http.message.BasicHeader;

import com.tottokug.api.ApiClientAbstract;
import com.tottokug.api.ApiRequest;
import com.tottokug.api.ApiResponse;

public class AzureMLClient extends ApiClientAbstract {

    @Override
    public ApiResponse request(ApiRequest request) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public ApiResponse requestBatch(ApiRequest requset) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    protected List<Header> additionalHeaders(List<Header> header) {
	    headerlist.add(new BasicHeader("Authorization", String.format(
		    "Bearer ", this.apikey)));
	}
	return null;
    }

}
