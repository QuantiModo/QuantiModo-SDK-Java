package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import java.math.BigDecimal;
import io.swagger.client.model.InlineResponse2005;
import io.swagger.client.model.MeasurementPost;
import java.io.File;
import io.swagger.client.model.InlineResponse20020;
import io.swagger.client.model.Measurement;
import io.swagger.client.model.InlineResponse2002;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-09T02:16:51.363Z")
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
   * Get measurements for this user
   * Measurements are any value that can be recorded like daily steps, a mood rating, or apples eaten.
   * @param accessToken User&#39;s OAuth2 access token
   * @param userId ID of user that owns this measurement
   * @param clientId The ID of the client application which originally stored the measurement
   * @param connectorId The id for the connector data source from which the measurement was obtained
   * @param variableId ID of the variable for which we are creating the measurement records
   * @param sourceId Application or device used to record the measurement values
   * @param startTime start time for the measurement event. Use ISO 8601 datetime format
   * @param value The value of the measurement after conversion to the default unit for that variable
   * @param unitId The default unit id for the variable
   * @param originalValue Unconverted value of measurement as originally posted (before conversion to default unit)
   * @param originalUnitId Unit id of the measurement as originally submitted
   * @param duration Duration of the event being measurement in seconds
   * @param note An optional note the user may include with their measurement
   * @param latitude Latitude at which the measurement was taken
   * @param longitude Longitude at which the measurement was taken
   * @param location Optional human readable name for the location where the measurement was recorded
   * @param createdAt When the record was first created. Use ISO 8601 datetime format
   * @param updatedAt When the record was last updated. Use ISO 8601 datetime format
   * @param error An error message if there is a problem with the measurement
   * @param limit The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. The maximum limit is 200 records.
   * @param offset OFFSET says to skip that many rows before beginning to return rows to the client. OFFSET 0 is the same as omitting the OFFSET clause. If both OFFSET and LIMIT appear, then OFFSET rows are skipped before starting to count the LIMIT rows that are returned.
   * @param sort Sort by given field. If the field is prefixed with &#39;-&#39;, it will sort in descending order.
   * @return InlineResponse2005
   */
  public InlineResponse2005 measurementsGet(String accessToken, Integer userId, String clientId, Integer connectorId, Integer variableId, Integer sourceId, String startTime, BigDecimal value, Integer unitId, BigDecimal originalValue, Integer originalUnitId, Integer duration, String note, BigDecimal latitude, BigDecimal longitude, String location, String createdAt, String updatedAt, String error, Integer limit, Integer offset, String sort) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/measurements".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));
    
    queryParams.addAll(apiClient.parameterToPairs("", "user_id", userId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "client_id", clientId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "connector_id", connectorId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "variable_id", variableId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "source_id", sourceId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "start_time", startTime));
    
    queryParams.addAll(apiClient.parameterToPairs("", "value", value));
    
    queryParams.addAll(apiClient.parameterToPairs("", "unit_id", unitId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "original_value", originalValue));
    
    queryParams.addAll(apiClient.parameterToPairs("", "original_unit_id", originalUnitId));
    
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

    String[] authNames = new String[] { "quantimodo_oauth2" };

    
    GenericType<InlineResponse2005> returnType = new GenericType<InlineResponse2005>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Post a new set or update existing measurements to the database
   * You can submit or update multiple measurements in a measurements sub-array.  If the variable these measurements correspond to does not already exist in the database, it will be automatically added.
   * @param accessToken User&#39;s OAuth2 access token
   * @param body Measurement that should be stored
   * @return InlineResponse2005
   */
  public InlineResponse2005 measurementsPost(String accessToken, MeasurementPost body) throws ApiException {
    Object postBody = body;
    
    // create path and map variables
    String path = "/measurements".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "quantimodo_oauth2" };

    
    GenericType<InlineResponse2005> returnType = new GenericType<InlineResponse2005>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get Measurements CSV
   * Download a CSV containing all user measurements
   * @param accessToken User&#39;s OAuth2 access token
   * @return File
   */
  public File measurementsCsvGet(String accessToken) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/measurements/csv".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));
    

    

    

    final String[] accepts = {
      "text/csv"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "quantimodo_oauth2" };

    
    GenericType<File> returnType = new GenericType<File>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Post Request for Measurements CSV
   * Use this endpoint to schedule a CSV export containing all user measurements to be emailed to the user within 24 hours.
   * @param accessToken User&#39;s OAuth2 access token
   * @return Integer
   */
  public Integer measurementsRequestCsvPost(String accessToken) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/measurements/request_csv".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "quantimodo_oauth2" };

    
    GenericType<Integer> returnType = new GenericType<Integer>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get Measurement
   * Get Measurement
   * @param id id of Measurement
   * @param accessToken User&#39;s OAuth2 access token
   * @return InlineResponse20020
   */
  public InlineResponse20020 measurementsIdGet(Integer id, String accessToken) throws ApiException {
    Object postBody = null;
    
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

    
    queryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "quantimodo_oauth2" };

    
    GenericType<InlineResponse20020> returnType = new GenericType<InlineResponse20020>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Update Measurement
   * Update Measurement
   * @param id id of Measurement
   * @param accessToken User&#39;s OAuth2 access token
   * @param body Measurement that should be updated
   * @return InlineResponse2002
   */
  public InlineResponse2002 measurementsIdPut(Integer id, String accessToken, Measurement body) throws ApiException {
    Object postBody = body;
    
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

    
    queryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "quantimodo_oauth2" };

    
    GenericType<InlineResponse2002> returnType = new GenericType<InlineResponse2002>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Delete Measurement
   * Delete Measurement
   * @param id id of Measurement
   * @param accessToken User&#39;s OAuth2 access token
   * @return InlineResponse2002
   */
  public InlineResponse2002 measurementsIdDelete(Integer id, String accessToken) throws ApiException {
    Object postBody = null;
    
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

    
    queryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "quantimodo_oauth2" };

    
    GenericType<InlineResponse2002> returnType = new GenericType<InlineResponse2002>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
