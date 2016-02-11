package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.InlineResponse2006;
import io.swagger.client.model.TrackingReminder;
import io.swagger.client.model.InlineResponse20023;
import io.swagger.client.model.InlineResponse2002;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-09T02:16:51.363Z")
public class TrackingReminderApi {
  private ApiClient apiClient;

  public TrackingReminderApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TrackingReminderApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Get tracking reminders
   * Users can be reminded to track certain variables at a specified frequency with a default value.
   * @param accessToken User&#39;s OAuth2 access token
   * @param clientId The ID of the client application which last created or updated this tracking reminder
   * @param userId ID of the user who created a reminder
   * @param variableId Id for the variable to be tracked
   * @param popUp True if the reminders should appear as a popup notification
   * @param sms True if the reminders should be delivered via SMS
   * @param email True if the reminders should be delivered via email
   * @param notificationBar True if the reminders should appear in the notification bar
   * @param lastReminded ISO 8601 timestamp for the last time a reminder was sent
   * @param lastTracked ISO 8601 timestamp for the last time a measurement was received for this user and variable
   * @param createdAt When the record was first created. Use ISO 8601 datetime format
   * @param updatedAt When the record was last updated. Use ISO 8601 datetime format
   * @param limit The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. The maximum limit is 200 records.
   * @param offset OFFSET says to skip that many rows before beginning to return rows to the client. OFFSET 0 is the same as omitting the OFFSET clause. If both OFFSET and LIMIT appear, then OFFSET rows are skipped before starting to count the LIMIT rows that are returned.
   * @param sort Sort by given field. If the field is prefixed with &#39;-&#39;, it will sort in descending order.
   * @return InlineResponse2006
   */
  public InlineResponse2006 trackingRemindersGet(String accessToken, String clientId, Integer userId, Integer variableId, Boolean popUp, Boolean sms, Boolean email, Boolean notificationBar, String lastReminded, String lastTracked, String createdAt, String updatedAt, Integer limit, Integer offset, String sort) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/trackingReminders".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));
    
    queryParams.addAll(apiClient.parameterToPairs("", "client_id", clientId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "user_id", userId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "variable_id", variableId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "pop_up", popUp));
    
    queryParams.addAll(apiClient.parameterToPairs("", "sms", sms));
    
    queryParams.addAll(apiClient.parameterToPairs("", "email", email));
    
    queryParams.addAll(apiClient.parameterToPairs("", "notification_bar", notificationBar));
    
    queryParams.addAll(apiClient.parameterToPairs("", "last_reminded", lastReminded));
    
    queryParams.addAll(apiClient.parameterToPairs("", "last_tracked", lastTracked));
    
    queryParams.addAll(apiClient.parameterToPairs("", "created_at", createdAt));
    
    queryParams.addAll(apiClient.parameterToPairs("", "updated_at", updatedAt));
    
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

    
    GenericType<InlineResponse2006> returnType = new GenericType<InlineResponse2006>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Store TrackingReminder
   * This is to enable users to indicate their opinion on the plausibility of a causal relationship between a treatment and outcome. QuantiModo incorporates crowd-sourced plausibility estimations into their algorithm. This is done allowing user to indicate their view of the plausibility of each relationship with thumbs up/down buttons placed next to each prediction.
   * @param accessToken User&#39;s OAuth2 access token
   * @param body TrackingReminder that should be stored
   * @return InlineResponse20023
   */
  public InlineResponse20023 trackingRemindersPost(String accessToken, TrackingReminder body) throws ApiException {
    Object postBody = body;
    
    // create path and map variables
    String path = "/trackingReminders".replaceAll("\\{format\\}","json");

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

    
    GenericType<InlineResponse20023> returnType = new GenericType<InlineResponse20023>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get TrackingReminder
   * Get TrackingReminder
   * @param id id of TrackingReminder
   * @param accessToken User&#39;s OAuth2 access token
   * @return InlineResponse20023
   */
  public InlineResponse20023 trackingRemindersIdGet(Integer id, String accessToken) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling trackingRemindersIdGet");
     }
     
    // create path and map variables
    String path = "/trackingReminders/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<InlineResponse20023> returnType = new GenericType<InlineResponse20023>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Update TrackingReminder
   * Update TrackingReminder
   * @param id id of TrackingReminder
   * @param accessToken User&#39;s OAuth2 access token
   * @param body TrackingReminder that should be updated
   * @return InlineResponse2002
   */
  public InlineResponse2002 trackingRemindersIdPut(Integer id, String accessToken, TrackingReminder body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling trackingRemindersIdPut");
     }
     
    // create path and map variables
    String path = "/trackingReminders/{id}".replaceAll("\\{format\\}","json")
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
   * Delete TrackingReminder
   * Delete previously posted trackingReminder
   * @param id id of TrackingReminder
   * @param accessToken User&#39;s OAuth2 access token
   * @return InlineResponse2002
   */
  public InlineResponse2002 trackingRemindersIdDelete(Integer id, String accessToken) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling trackingRemindersIdDelete");
     }
     
    // create path and map variables
    String path = "/trackingReminders/{id}".replaceAll("\\{format\\}","json")
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
