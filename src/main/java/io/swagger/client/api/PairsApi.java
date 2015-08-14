package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.Pairs;

import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

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
   * @param cause Original variable name for the explanatory or independent variable
   * @param effect Original variable name for the outcome or dependent variable
   * @param causeSource Name of data source that the cause measurements should come from
   * @param causeUnit Abbreviated name for the unit cause measurements to be returned in
   * @param delay Delay before onset of action (in seconds) from the cause variable settings.
   * @param duration Duration of action (in seconds) from the cause variable settings.
   * @param effectSource Name of data source that the effectmeasurements should come from
   * @param effectUnit Abbreviated name for the unit effect measurements to be returned in
   * @param endTime The most recent date (in epoch time) for which we should return measurements
   * @param startTime The earliest date (in epoch time) for which we should return measurements
   * @param limit The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0.
   * @param offset Now suppose you wanted to show results 11-20. You&#39;d set the offset to 10 and the limit to 10.
   * @param sort Sort by given field. If the field is prefixed with `-, it will sort in descending order.
   * @return List<Pairs>
   */
  public List<Pairs> pairsGet (String cause, String effect, String causeSource, String causeUnit, String delay, String duration, String effectSource, String effectUnit, String endTime, String startTime, Integer limit, Integer offset, Integer sort) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'cause' is set
    if (cause == null) {
       throw new ApiException(400, "Missing the required parameter 'cause' when calling pairsGet");
    }
    
    // verify the required parameter 'effect' is set
    if (effect == null) {
       throw new ApiException(400, "Missing the required parameter 'effect' when calling pairsGet");
    }
    

    // create path and map variables
    String path = "/pairs".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "cause", cause));
    
    queryParams.addAll(apiClient.parameterToPairs("", "causeSource", causeSource));
    
    queryParams.addAll(apiClient.parameterToPairs("", "causeUnit", causeUnit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "delay", delay));
    
    queryParams.addAll(apiClient.parameterToPairs("", "duration", duration));
    
    queryParams.addAll(apiClient.parameterToPairs("", "effect", effect));
    
    queryParams.addAll(apiClient.parameterToPairs("", "effectSource", effectSource));
    
    queryParams.addAll(apiClient.parameterToPairs("", "effectUnit", effectUnit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    
    queryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    
    queryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    

    

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
      String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){
        return (List<Pairs>) apiClient.deserialize(response, "array", Pairs.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
