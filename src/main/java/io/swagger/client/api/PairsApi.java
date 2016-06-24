package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.model.*;
import io.swagger.client.Pair;

import io.swagger.client.model.Pairs;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-24T22:10:22.059Z")
public class PairsApi {
  private ApiClient apiClient;

  public PairsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PairsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get pairs
   * Pairs cause measurements with effect measurements grouped over the duration of action after the onset delay.
   * @param cause Original variable name for the explanatory or independent variable (required)
   * @param effect Original variable name for the outcome or dependent variable (required)
   * @param accessToken User&#39;s OAuth2 access token (optional)
   * @param causeSource Name of data source that the cause measurements should come from (optional)
   * @param causeUnit Abbreviated name for the unit cause measurements to be returned in (optional)
   * @param delay Delay before onset of action (in seconds) from the cause variable settings. (optional)
   * @param duration Duration of action (in seconds) from the cause variable settings. (optional)
   * @param effectSource Name of data source that the effectmeasurements should come from (optional)
   * @param effectUnit Abbreviated name for the unit effect measurements to be returned in (optional)
   * @param endTime The most recent date (in epoch time) for which we should return measurements (optional)
   * @param startTime The earliest date (in epoch time) for which we should return measurements (optional)
   * @param limit The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. (optional)
   * @param offset Now suppose you wanted to show results 11-20. You&#39;d set the offset to 10 and the limit to 10. (optional)
   * @param sort Sort by given field. If the field is prefixed with &#x60;-, it will sort in descending order. (optional)
   * @return List<Pairs>
   * @throws ApiException if fails to make API call
   */
  public List<Pairs> v1PairsCsvGet(String cause, String effect, String accessToken, String causeSource, String causeUnit, String delay, String duration, String effectSource, String effectUnit, String endTime, String startTime, Integer limit, Integer offset, Integer sort) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'cause' is set
    if (cause == null) {
      throw new ApiException(400, "Missing the required parameter 'cause' when calling v1PairsCsvGet");
    }
    
    // verify the required parameter 'effect' is set
    if (effect == null) {
      throw new ApiException(400, "Missing the required parameter 'effect' when calling v1PairsCsvGet");
    }
    
    // create path and map variables
    String localVarPath = "/v1/pairsCsv".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cause", cause));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "causeSource", causeSource));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "causeUnit", causeUnit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "delay", delay));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "duration", duration));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "effect", effect));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "effectSource", effectSource));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "effectUnit", effectUnit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<List<Pairs>> localVarReturnType = new GenericType<List<Pairs>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get pairs
   * Pairs cause measurements with effect measurements grouped over the duration of action after the onset delay.
   * @param cause Original variable name for the explanatory or independent variable (required)
   * @param effect Original variable name for the outcome or dependent variable (required)
   * @param accessToken User&#39;s OAuth2 access token (optional)
   * @param causeSource Name of data source that the cause measurements should come from (optional)
   * @param causeUnit Abbreviated name for the unit cause measurements to be returned in (optional)
   * @param delay Delay before onset of action (in seconds) from the cause variable settings. (optional)
   * @param duration Duration of action (in seconds) from the cause variable settings. (optional)
   * @param effectSource Name of data source that the effectmeasurements should come from (optional)
   * @param effectUnit Abbreviated name for the unit effect measurements to be returned in (optional)
   * @param endTime The most recent date (in epoch time) for which we should return measurements (optional)
   * @param startTime The earliest date (in epoch time) for which we should return measurements (optional)
   * @param limit The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. (optional)
   * @param offset Now suppose you wanted to show results 11-20. You&#39;d set the offset to 10 and the limit to 10. (optional)
   * @param sort Sort by given field. If the field is prefixed with &#x60;-, it will sort in descending order. (optional)
   * @return List<Pairs>
   * @throws ApiException if fails to make API call
   */
  public List<Pairs> v1PairsGet(String cause, String effect, String accessToken, String causeSource, String causeUnit, String delay, String duration, String effectSource, String effectUnit, String endTime, String startTime, Integer limit, Integer offset, Integer sort) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'cause' is set
    if (cause == null) {
      throw new ApiException(400, "Missing the required parameter 'cause' when calling v1PairsGet");
    }
    
    // verify the required parameter 'effect' is set
    if (effect == null) {
      throw new ApiException(400, "Missing the required parameter 'effect' when calling v1PairsGet");
    }
    
    // create path and map variables
    String localVarPath = "/v1/pairs".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cause", cause));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "causeSource", causeSource));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "causeUnit", causeUnit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "delay", delay));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "duration", duration));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "effect", effect));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "effectSource", effectSource));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "effectUnit", effectUnit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<List<Pairs>> localVarReturnType = new GenericType<List<Pairs>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
