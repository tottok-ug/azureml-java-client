package com.tottokug.api;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.MethodNotSupportedException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHeader;
import org.apache.http.protocol.HttpContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tottokug.api.exception.ApiClientException;

/**
 * 
 * @author tokugami
 *
 */
public abstract class ApiClientAbstract implements ApiClient {

    static final Logger logger = LoggerFactory
	    .getLogger(ApiClientAbstract.class);

    private String apikey;
    private String endpoint;

    private ResponseHandler<ApiResponse> responseHandler;

    private HttpContext httpContext;

    /**
     * @author tokugami
     */
    public ApiClientAbstract() {
	responseHandler = new ResponseHandler<ApiResponse>() {

	    @Override
	    public ApiResponse handleResponse(HttpResponse arg0)
		    throws ClientProtocolException, IOException {
		return null;
	    }

	};
    }

    /**
     * @author tokugami
     */
    public String getApiKey() {

	return this.apikey;
    }

    /**
     * @author tokugami
     */
    public String getApiEndpoint() {
	return this.endpoint;
    }

    public ApiResponse requestHttp(ApiRequest request)
	    throws URISyntaxException, MethodNotSupportedException,
	    ApiClientException {
	List<Header> defaultHeaders = Collections
		.synchronizedList(new ArrayList<Header>());

	try (CloseableHttpClient httpClient = HttpClientBuilder.create()
		.setDefaultHeaders(defaultHeaders).disableAuthCaching().build()) {
	    HttpHost httpHost;
	    httpHost = new HttpHost(this.getHostName());

	    HttpRequest httpRequest;
	    httpRequest = new HttpPost();
	    httpRequest.setHeaders(this.marshallHeader(request.getHeaders()));
	    return httpClient.execute(httpHost, httpRequest, responseHandler,
		    httpContext);
	} catch (IOException e) {
	    logger.trace(e.getMessage(), e);
	    logger.error(e.getMessage());
	}
	throw new ApiClientException();
    }

    /**
     * @param headers
     * @return
     */
    private Header[] marshallHeader(Map<String, String> headers) {
	List<Header> headerlist = Collections
		.synchronizedList(new ArrayList<>());
	headers.forEach((k, v) -> {
	    headerlist.add(new BasicHeader(k, v));
	});
	

	return this.additionalHeaders(headerlist).toArray(new Header[0]);
    }

    protected abstract List<Header> additionalHeaders(List<Header> header);

    private String getHostName() throws URISyntaxException {
	URI uri = new URI(this.endpoint);
	return uri.getHost();
    }

}
