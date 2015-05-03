Azure Machine Learning API java client
===


# How to use
```Java

  final String API_ENDPOINT = "";
  final String API_KEY = "";
  AzureMLClient azureMLClient = new AzureMLClient(API_ENDPOINT,API_KEY);
　　
　// Request
　AzureMLRequest request = new AzureMLRequest();
　Map<String,MLParameter> parameters = new HashMap<>();
　parameters.put("label",new StringParameter("1"));
　parameters.put("f1",new NumberParameter(1));
　request.setParameter(parameters);
　azureMLClient.request(request);
　
　// BatchRequest
　AzureMLBatchRequest batchRequest = new BatchRequest();
　batchRequest.addRequest(aRequset);
　batchRequest.addRequest(bRequest);
　azureMLClint.BatchRequest(batchRequest);
```
