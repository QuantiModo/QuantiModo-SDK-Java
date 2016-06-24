package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.model.*;
import io.swagger.client.Pair;

import io.swagger.client.model.InlineResponse200;
import io.swagger.client.model.CommonResponse;
import io.swagger.client.model.TrackingReminderNotificationSkip;
import io.swagger.client.model.TrackingReminderNotificationSnooze;
import io.swagger.client.model.TrackingReminderNotificationTrack;
import io.swagger.client.model.TrackingReminderDelete;
import io.swagger.client.model.InlineResponse2001;
import io.swagger.client.model.TrackingReminder;
import io.swagger.client.model.InlineResponse2002;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-24T22:10:22.059Z")
public class RemindersApi {
  private ApiClient apiClient;

  public RemindersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RemindersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get specific pending tracking reminders
   * Specfic pending reminder instances that still need to be tracked.  
   * @param accessToken User&#39;s OAuth2 access token (optional)
   * @param variableCategoryName Limit tracking reminder notifications to a specific variable category (optional)
   * @param createdAt When the record was first created. Use ISO 8601 datetime format. Time zone should be UTC and not local.  (optional)
   * @param updatedAt When the record was last updated. Use ISO 8601 datetime format. Time zone should be UTC and not local.  (optional)
   * @param limit The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. The maximum limit is 200 records. (optional)
   * @param offset OFFSET says to skip that many rows before beginning to return rows to the client. OFFSET 0 is the same as omitting the OFFSET clause. If both OFFSET and LIMIT appear, then OFFSET rows are skipped before starting to count the LIMIT rows that are returned. (optional)
   * @param sort Sort by given field. If the field is prefixed with &#39;-&#39;, it will sort in descending order. (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public InlineResponse200 v1TrackingReminderNotificationsGet(String accessToken, String variableCategoryName, String createdAt, String updatedAt, Integer limit, Integer offset, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/trackingReminderNotifications".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "variableCategoryName", variableCategoryName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "createdAt", createdAt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "updatedAt", updatedAt));
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

    String[] localVarAuthNames = new String[] { "quantimodo_oauth2" };

    GenericType<InlineResponse200> localVarReturnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Skip a pending tracking reminder
   * Deletes the pending tracking reminder
   * @param body Id of the pending reminder to be skipped or deleted (required)
   * @param accessToken User&#39;s OAuth2 access token (optional)
   * @return CommonResponse
   * @throws ApiException if fails to make API call
   */
  public CommonResponse v1TrackingReminderNotificationsSkipPost(TrackingReminderNotificationSkip body, String accessToken) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling v1TrackingReminderNotificationsSkipPost");
    }
    
    // create path and map variables
    String localVarPath = "/v1/trackingReminderNotifications/skip".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<CommonResponse> localVarReturnType = new GenericType<CommonResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Snooze a pending tracking reminder
   * Changes the reminder time to now plus one hour
   * @param body Id of the pending reminder to be snoozed (required)
   * @param accessToken User&#39;s OAuth2 access token (optional)
   * @return CommonResponse
   * @throws ApiException if fails to make API call
   */
  public CommonResponse v1TrackingReminderNotificationsSnoozePost(TrackingReminderNotificationSnooze body, String accessToken) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling v1TrackingReminderNotificationsSnoozePost");
    }
    
    // create path and map variables
    String localVarPath = "/v1/trackingReminderNotifications/snooze".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<CommonResponse> localVarReturnType = new GenericType<CommonResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Track a pending tracking reminder
   * Adds the default measurement for the pending tracking reminder with the reminder time as the measurment start time
   * @param body Id of the pending reminder to be tracked (required)
   * @param accessToken User&#39;s OAuth2 access token (optional)
   * @return CommonResponse
   * @throws ApiException if fails to make API call
   */
  public CommonResponse v1TrackingReminderNotificationsTrackPost(TrackingReminderNotificationTrack body, String accessToken) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling v1TrackingReminderNotificationsTrackPost");
    }
    
    // create path and map variables
    String localVarPath = "/v1/trackingReminderNotifications/track".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<CommonResponse> localVarReturnType = new GenericType<CommonResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete tracking reminder
   * Delete previously created tracking reminder
   * @param body Id of reminder to be deleted (required)
   * @param accessToken User&#39;s OAuth2 access token (optional)
   * @return CommonResponse
   * @throws ApiException if fails to make API call
   */
  public CommonResponse v1TrackingRemindersDeletePost(TrackingReminderDelete body, String accessToken) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling v1TrackingRemindersDeletePost");
    }
    
    // create path and map variables
    String localVarPath = "/v1/trackingReminders/delete".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<CommonResponse> localVarReturnType = new GenericType<CommonResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get repeating tracking reminder settings
   * Users can be reminded to track certain variables at a specified frequency with a default value.  
   * @param accessToken User&#39;s OAuth2 access token (optional)
   * @param variableCategoryName Limit tracking reminders to a specific variable category (optional)
   * @param createdAt When the record was first created. Use ISO 8601 datetime format. Time zone should be UTC and not local.  (optional)
   * @param updatedAt When the record was last updated. Use ISO 8601 datetime format. Time zone should be UTC and not local.  (optional)
   * @param limit The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. The maximum limit is 200 records. (optional)
   * @param offset OFFSET says to skip that many rows before beginning to return rows to the client. OFFSET 0 is the same as omitting the OFFSET clause. If both OFFSET and LIMIT appear, then OFFSET rows are skipped before starting to count the LIMIT rows that are returned. (optional)
   * @param sort Sort by given field. If the field is prefixed with &#39;-&#39;, it will sort in descending order. (optional)
   * @return InlineResponse2001
   * @throws ApiException if fails to make API call
   */
  public InlineResponse2001 v1TrackingRemindersGet(String accessToken, String variableCategoryName, String createdAt, String updatedAt, Integer limit, Integer offset, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/trackingReminders".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "variableCategoryName", variableCategoryName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "createdAt", createdAt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "updatedAt", updatedAt));
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

    String[] localVarAuthNames = new String[] { "quantimodo_oauth2" };

    GenericType<InlineResponse2001> localVarReturnType = new GenericType<InlineResponse2001>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Store a Tracking Reminder
   * This is to enable users to create reminders to track a variable with a default value at a specified frequency
   * @param accessToken User&#39;s OAuth2 access token (optional)
   * @param body TrackingReminder that should be stored (optional)
   * @return InlineResponse2002
   * @throws ApiException if fails to make API call
   */
  public InlineResponse2002 v1TrackingRemindersPost(String accessToken, TrackingReminder body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/v1/trackingReminders".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "quantimodo_oauth2" };

    GenericType<InlineResponse2002> localVarReturnType = new GenericType<InlineResponse2002>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
