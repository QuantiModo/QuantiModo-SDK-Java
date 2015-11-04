package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.TypeRef;

import io.swagger.client.model.InlineResponse20011;
import java.math.BigDecimal;
import io.swagger.client.model.MeasurementPost;
import java.io.File;
import io.swagger.client.model.InlineResponse20012;
import io.swagger.client.model.Measurement;
import io.swagger.client.model.InlineResponse2002;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-03T22:24:11.560Z")
public class MeasurementApi {
  private ApiClient apiClient;

  public MeasurementApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MeasurementApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Get all Measurements
   * Get all Measurements
   * @param userId user_id
   * @param clientId client_id
   * @param connectorId connector_id
   * @param variableId variable_id
   * @param startTime start_time
   * @param value value
   * @param originalValue original_value
   * @param duration duration
   * @param note note
   * @param latitude latitude
   * @param longitude longitude
   * @param location location
   * @param createdAt created_at
   * @param updatedAt updated_at
   * @param error error
   * @param limit limit
   * @param offset offset
   * @param sort sort
   * @return InlineResponse20011
   */
  public InlineResponse20011 measurementsGet (Integer userId, String clientId, Integer connectorId, Integer variableId, Integer startTime, BigDecimal value, BigDecimal originalValue, Integer duration, String note, BigDecimal latitude, BigDecimal longitude, String location, String createdAt, String updatedAt, String error, Integer limit, Integer offset, String sort) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
    // create path and map variables
    String path = "/measurements".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "user_id", userId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "client_id", clientId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "connector_id", connectorId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "variable_id", variableId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "start_time", startTime));
    
    queryParams.addAll(apiClient.parameterToPairs("", "value", value));
    
    queryParams.addAll(apiClient.parameterToPairs("", "original_value", originalValue));
    
    queryParams.addAll(apiClient.parameterToPairs("", "duration", duration));
    
    queryParams.addAll(apiClient.parameterToPairs("", "note", note));
    
    queryParams.addAll(apiClient.parameterToPairs("", "latitude", latitude));
    
    queryParams.addAll(apiClient.parameterToPairs("", "longitude", longitude));
    
    queryParams.addAll(apiClient.parameterToPairs("", "location", location));
    
    queryParams.addAll(apiClient.parameterToPairs("", "created_at", createdAt));
    
    queryParams.addAll(apiClient.parameterToPairs("", "updated_at", updatedAt));
    
    queryParams.addAll(apiClient.parameterToPairs("", "error", error));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    
    queryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<InlineResponse20011>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Store Measurement
   * Store Measurement
   * @param body Measurement that should be stored
   * @return InlineResponse20011
   */
  public InlineResponse20011 measurementsPost (MeasurementPost body) throws ApiException {
    Object postBody = body;
    byte[] postBinaryBody = null;
    
    // create path and map variables
    String path = "/measurements".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<InlineResponse20011>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Get Measurements CSV
   * Get Measurements CSV
   * @return File
   */
  public File measurementsCsvGet () throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
    // create path and map variables
    String path = "/measurements/csv".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "text/csv"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<File>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Post Request for Measurements CSV
   * Post Request for Measurements CSV
   * @return Integer
   */
  public Integer measurementsRequestCsvPost () throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
    // create path and map variables
    String path = "/measurements/request_csv".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<Integer>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Get Measurement
   * Get Measurement
   * @param id id of Measurement
   * @return InlineResponse20012
   */
  public InlineResponse20012 measurementsIdGet (Integer id) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling measurementsIdGet");
     }
     
    // create path and map variables
    String path = "/measurements/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<InlineResponse20012>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Update Measurement
   * Update Measurement
   * @param id id of Measurement
   * @param body Measurement that should be updated
   * @return InlineResponse2002
   */
  public InlineResponse2002 measurementsIdPut (Integer id, Measurement body) throws ApiException {
    Object postBody = body;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling measurementsIdPut");
     }
     
    // create path and map variables
    String path = "/measurements/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<InlineResponse2002>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Delete Measurement
   * Delete Measurement
   * @param id id of Measurement
   * @return InlineResponse2002
   */
  public InlineResponse2002 measurementsIdDelete (Integer id) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling measurementsIdDelete");
     }
     
    // create path and map variables
    String path = "/measurements/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<InlineResponse2002>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
}
