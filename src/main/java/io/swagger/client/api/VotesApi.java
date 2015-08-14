package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.CommonResponse;

import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

public class VotesApi {
  private ApiClient apiClient;

  public VotesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public VotesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Post or update vote
   * This is to enable users to indicate their opinion on the plausibility of a causal relationship between a treatment and outcome. QuantiModo incorporates crowd-sourced plausibility estimations into their algorithm. This is done allowing user to indicate their view of the plausibility of each relationship with thumbs up/down buttons placed next to each prediction.
   * @param cause Cause variable name
   * @param effect Effect variable name
   * @param vote Vote: 0 (for implausible) or 1 (for plausible)
   * @return CommonResponse
   */
  public CommonResponse v1VotesPost (String cause, String effect, Boolean vote) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'cause' is set
    if (cause == null) {
       throw new ApiException(400, "Missing the required parameter 'cause' when calling v1VotesPost");
    }
    
    // verify the required parameter 'effect' is set
    if (effect == null) {
       throw new ApiException(400, "Missing the required parameter 'effect' when calling v1VotesPost");
    }
    

    // create path and map variables
    String path = "/v1/votes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "cause", cause));
    
    queryParams.addAll(apiClient.parameterToPairs("", "effect", effect));
    
    queryParams.addAll(apiClient.parameterToPairs("", "vote", vote));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String[] authNames = new String[] { "oauth2" };
      String response = apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){
        return (CommonResponse) apiClient.deserialize(response, "", CommonResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Delete vote
   * Delete previously posted vote
   * @param cause Cause variable name
   * @param effect Effect variable name
   * @return CommonResponse
   */
  public CommonResponse v1VotesDeletePost (String cause, String effect) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'cause' is set
    if (cause == null) {
       throw new ApiException(400, "Missing the required parameter 'cause' when calling v1VotesDeletePost");
    }
    
    // verify the required parameter 'effect' is set
    if (effect == null) {
       throw new ApiException(400, "Missing the required parameter 'effect' when calling v1VotesDeletePost");
    }
    

    // create path and map variables
    String path = "/v1/votes/delete".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "cause", cause));
    
    queryParams.addAll(apiClient.parameterToPairs("", "effect", effect));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String[] authNames = new String[] { "oauth2" };
      String response = apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){
        return (CommonResponse) apiClient.deserialize(response, "", CommonResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
