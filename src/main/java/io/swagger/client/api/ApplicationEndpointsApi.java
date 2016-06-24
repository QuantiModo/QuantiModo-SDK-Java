package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.model.*;
import io.swagger.client.Pair;

import io.swagger.client.model.InlineResponse2003;
import io.swagger.client.model.InlineResponse2004;
import java.math.BigDecimal;
import io.swagger.client.model.InlineResponse2005;
import io.swagger.client.model.InlineResponse2001;
import io.swagger.client.model.InlineResponse2006;
import io.swagger.client.model.InlineResponse2007;
import io.swagger.client.model.InlineResponse2008;
import io.swagger.client.model.InlineResponse2009;
import io.swagger.client.model.InlineResponse20010;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-24T22:10:22.059Z")
public class ApplicationEndpointsApi {
  private ApiClient apiClient;

  public ApplicationEndpointsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ApplicationEndpointsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get all Connections
   * Get all Connections
   * @param accessToken Application&#39;s OAuth2 access token (optional)
   * @param connectorId The id for the connector data source for which the connection is connected (optional)
   * @param connectStatus Indicates whether a connector is currently connected to a service for a user. (optional)
   * @param connectError Error message if there is a problem with authorizing this connection. (optional)
   * @param updateRequestedAt Time at which an update was requested by a user. (optional)
   * @param updateStatus Indicates whether a connector is currently updated. (optional)
   * @param updateError Indicates if there was an error during the update. (optional)
   * @param lastSuccessfulUpdatedAt The time at which the connector was last successfully updated. (optional)
   * @param createdAt When the record was first created. Use ISO 8601 datetime format  (optional)
   * @param updatedAt When the record was last updated. Use ISO 8601 datetime format  (optional)
   * @param limit The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. The maximum limit is 200 records. (optional)
   * @param offset OFFSET says to skip that many rows before beginning to return rows to the client. OFFSET 0 is the same as omitting the OFFSET clause. If both OFFSET and LIMIT appear, then OFFSET rows are skipped before starting to count the LIMIT rows that are returned. (optional)
   * @param sort Sort by given field. If the field is prefixed with &#39;-&#39;, it will sort in descending order. (optional)
   * @return InlineResponse2003
   * @throws ApiException if fails to make API call
   */
  public InlineResponse2003 v2ApplicationConnectionsGet(String accessToken, Integer connectorId, String connectStatus, String connectError, String updateRequestedAt, String updateStatus, String updateError, String lastSuccessfulUpdatedAt, String createdAt, String updatedAt, Integer limit, Integer offset, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v2/application/connections".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "connector_id", connectorId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "connect_status", connectStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "connect_error", connectError));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "update_requested_at", updateRequestedAt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "update_status", updateStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "update_error", updateError));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "last_successful_updated_at", lastSuccessfulUpdatedAt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "created_at", createdAt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "updated_at", updatedAt));
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

    String[] localVarAuthNames = new String[] { "oauth2", "internalApiKey" };

    GenericType<InlineResponse2003> localVarReturnType = new GenericType<InlineResponse2003>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get all Credentials
   * Get all Credentials
   * @param accessToken Application&#39;s OAuth2 access token (optional)
   * @param connectorId The id for the connector data source from which the credential was obtained (optional)
   * @param attrKey Attribute name such as token, userid, username, or password (optional)
   * @param attrValue Encrypted value for the attribute specified (optional)
   * @param createdAt When the record was first created. Use ISO 8601 datetime format  (optional)
   * @param updatedAt When the record was last updated. Use ISO 8601 datetime format  (optional)
   * @param limit The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. The maximum limit is 200 records. (optional)
   * @param offset OFFSET says to skip that many rows before beginning to return rows to the client. OFFSET 0 is the same as omitting the OFFSET clause. If both OFFSET and LIMIT appear, then OFFSET rows are skipped before starting to count the LIMIT rows that are returned. (optional)
   * @param sort Sort by given field. If the field is prefixed with &#39;-&#39;, it will sort in descending order. (optional)
   * @return InlineResponse2004
   * @throws ApiException if fails to make API call
   */
  public InlineResponse2004 v2ApplicationCredentialsGet(String accessToken, Integer connectorId, String attrKey, String attrValue, String createdAt, String updatedAt, Integer limit, Integer offset, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v2/application/credentials".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "connector_id", connectorId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "attr_key", attrKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "attr_value", attrValue));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "created_at", createdAt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "updated_at", updatedAt));
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

    String[] localVarAuthNames = new String[] { "oauth2", "internalApiKey" };

    GenericType<InlineResponse2004> localVarReturnType = new GenericType<InlineResponse2004>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get measurements for all users using your application
   * Measurements are any value that can be recorded like daily steps, a mood rating, or apples eaten.
   * @param accessToken Application&#39;s OAuth2 access token (optional)
   * @param clientId The ID of the client application which originally stored the measurement (optional)
   * @param connectorId The id for the connector data source from which the measurement was obtained (optional)
   * @param variableId ID of the variable for which we are creating the measurement records (optional)
   * @param sourceId Application or device used to record the measurement values (optional)
   * @param startTime start time for the measurement event. Use ISO 8601 datetime format  (optional)
   * @param value The value of the measurement after conversion to the default unit for that variable (optional)
   * @param unitId The default unit id for the variable (optional)
   * @param originalValue Unconverted value of measurement as originally posted (before conversion to default unit) (optional)
   * @param originalUnitId Unit id of the measurement as originally submitted (optional)
   * @param duration Duration of the event being measurement in seconds (optional)
   * @param note An optional note the user may include with their measurement (optional)
   * @param latitude Latitude at which the measurement was taken (optional)
   * @param longitude Longitude at which the measurement was taken (optional)
   * @param location Optional human readable name for the location where the measurement was recorded (optional)
   * @param createdAt When the record was first created. Use ISO 8601 datetime format  (optional)
   * @param updatedAt When the record was last updated. Use ISO 8601 datetime format  (optional)
   * @param error An error message if there is a problem with the measurement (optional)
   * @param limit The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. The maximum limit is 200 records. (optional)
   * @param offset OFFSET says to skip that many rows before beginning to return rows to the client. OFFSET 0 is the same as omitting the OFFSET clause. If both OFFSET and LIMIT appear, then OFFSET rows are skipped before starting to count the LIMIT rows that are returned. (optional)
   * @param sort Sort by given field. If the field is prefixed with &#39;-&#39;, it will sort in descending order. (optional)
   * @return InlineResponse2005
   * @throws ApiException if fails to make API call
   */
  public InlineResponse2005 v2ApplicationMeasurementsGet(String accessToken, String clientId, Integer connectorId, Integer variableId, Integer sourceId, String startTime, BigDecimal value, Integer unitId, BigDecimal originalValue, Integer originalUnitId, Integer duration, String note, BigDecimal latitude, BigDecimal longitude, String location, String createdAt, String updatedAt, String error, Integer limit, Integer offset, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v2/application/measurements".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "client_id", clientId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "connector_id", connectorId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "variable_id", variableId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "source_id", sourceId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_time", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "value", value));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "unit_id", unitId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "original_value", originalValue));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "original_unit_id", originalUnitId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "duration", duration));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "note", note));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "latitude", latitude));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "longitude", longitude));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "location", location));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "created_at", createdAt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "updated_at", updatedAt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "error", error));
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

    String[] localVarAuthNames = new String[] { "oauth2", "internalApiKey" };

    GenericType<InlineResponse2005> localVarReturnType = new GenericType<InlineResponse2005>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get tracking reminders
   * Get the variable id, frequency, and default value for the user tracking reminders 
   * @param accessToken User&#39;s OAuth2 access token (optional)
   * @param clientId The ID of the client application which last created or updated this trackingReminder (optional)
   * @param createdAt When the record was first created. Use ISO 8601 datetime format  (optional)
   * @param updatedAt When the record was last updated. Use ISO 8601 datetime format  (optional)
   * @param limit The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. The maximum limit is 200 records. (optional)
   * @param offset OFFSET says to skip that many rows before beginning to return rows to the client. OFFSET 0 is the same as omitting the OFFSET clause. If both OFFSET and LIMIT appear, then OFFSET rows are skipped before starting to count the LIMIT rows that are returned. (optional)
   * @param sort Sort by given field. If the field is prefixed with &#39;-&#39;, it will sort in descending order. (optional)
   * @return InlineResponse2001
   * @throws ApiException if fails to make API call
   */
  public InlineResponse2001 v2ApplicationTrackingRemindersGet(String accessToken, String clientId, String createdAt, String updatedAt, Integer limit, Integer offset, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v2/application/trackingReminders".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "client_id", clientId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "created_at", createdAt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "updated_at", updatedAt));
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

    String[] localVarAuthNames = new String[] { "oauth2", "internalApiKey" };

    GenericType<InlineResponse2001> localVarReturnType = new GenericType<InlineResponse2001>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get all Updates
   * Get all Updates
   * @param accessToken Application&#39;s OAuth2 access token (optional)
   * @param connectorId connector_id (optional)
   * @param numberOfMeasurements number_of_measurements (optional)
   * @param success success (optional)
   * @param message message (optional)
   * @param createdAt When the record was first created. Use ISO 8601 datetime format  (optional)
   * @param updatedAt When the record was last updated. Use ISO 8601 datetime format  (optional)
   * @param limit The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. The maximum limit is 200 records. (optional)
   * @param offset OFFSET says to skip that many rows before beginning to return rows to the client. OFFSET 0 is the same as omitting the OFFSET clause. If both OFFSET and LIMIT appear, then OFFSET rows are skipped before starting to count the LIMIT rows that are returned. (optional)
   * @param sort Sort by given field. If the field is prefixed with &#39;-&#39;, it will sort in descending order. (optional)
   * @return InlineResponse2006
   * @throws ApiException if fails to make API call
   */
  public InlineResponse2006 v2ApplicationUpdatesGet(String accessToken, Integer connectorId, Integer numberOfMeasurements, Boolean success, String message, String createdAt, String updatedAt, Integer limit, Integer offset, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v2/application/updates".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "connector_id", connectorId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "number_of_measurements", numberOfMeasurements));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "success", success));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "message", message));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "created_at", createdAt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "updated_at", updatedAt));
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

    String[] localVarAuthNames = new String[] { "oauth2", "internalApiKey" };

    GenericType<InlineResponse2006> localVarReturnType = new GenericType<InlineResponse2006>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get all UserVariableRelationships
   * Get all UserVariableRelationships
   * @param accessToken User&#39;s OAuth2 access token (optional)
   * @param id id (optional)
   * @param confidenceLevel Our confidence that a consistent predictive relationship exists based on the amount of evidence, reproducibility, and other factors (optional)
   * @param confidenceScore A quantitative representation of our confidence that a consistent predictive relationship exists based on the amount of evidence, reproducibility, and other factors (optional)
   * @param direction Direction is positive if higher predictor values generally precede higher outcome values. Direction is negative if higher predictor values generally precede lower outcome values. (optional)
   * @param durationOfAction Estimated number of seconds following the onset delay in which a stimulus produces a perceivable effect (optional)
   * @param errorMessage error_message (optional)
   * @param onsetDelay Estimated number of seconds that pass before a stimulus produces a perceivable effect (optional)
   * @param outcomeVariableId Variable ID for the outcome variable (optional)
   * @param predictorVariableId Variable ID for the predictor variable (optional)
   * @param predictorUnitId ID for default unit of the predictor variable (optional)
   * @param sinnRank A value representative of the relevance of this predictor relative to other predictors of this outcome.  Usually used for relevancy sorting. (optional)
   * @param strengthLevel Can be weak, medium, or strong based on the size of the effect which the predictor appears to have on the outcome relative to other variable relationship strength scores. (optional)
   * @param strengthScore A value represented to the size of the effect which the predictor appears to have on the outcome. (optional)
   * @param vote vote (optional)
   * @param valuePredictingHighOutcome Value for the predictor variable (in it&#39;s default unit) which typically precedes an above average outcome value (optional)
   * @param valuePredictingLowOutcome Value for the predictor variable (in it&#39;s default unit) which typically precedes a below average outcome value (optional)
   * @param limit The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. The maximum limit is 200 records. (optional)
   * @param offset OFFSET says to skip that many rows before beginning to return rows to the client. OFFSET 0 is the same as omitting the OFFSET clause. If both OFFSET and LIMIT appear, then OFFSET rows are skipped before starting to count the LIMIT rows that are returned. (optional)
   * @param sort Sort by given field. If the field is prefixed with &#39;-&#39;, it will sort in descending order. (optional)
   * @return InlineResponse2007
   * @throws ApiException if fails to make API call
   */
  public InlineResponse2007 v2ApplicationUserVariableRelationshipsGet(String accessToken, Integer id, String confidenceLevel, BigDecimal confidenceScore, String direction, Integer durationOfAction, String errorMessage, Integer onsetDelay, Integer outcomeVariableId, Integer predictorVariableId, Integer predictorUnitId, BigDecimal sinnRank, String strengthLevel, BigDecimal strengthScore, String vote, BigDecimal valuePredictingHighOutcome, BigDecimal valuePredictingLowOutcome, Integer limit, Integer offset, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v2/application/userVariableRelationships".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "confidence_level", confidenceLevel));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "confidence_score", confidenceScore));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "direction", direction));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "duration_of_action", durationOfAction));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "error_message", errorMessage));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "onset_delay", onsetDelay));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "outcome_variable_id", outcomeVariableId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "predictor_variable_id", predictorVariableId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "predictor_unit_id", predictorUnitId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sinn_rank", sinnRank));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "strength_level", strengthLevel));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "strength_score", strengthScore));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "vote", vote));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "value_predicting_high_outcome", valuePredictingHighOutcome));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "value_predicting_low_outcome", valuePredictingLowOutcome));
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

    String[] localVarAuthNames = new String[] { "oauth2", "internalApiKey" };

    GenericType<InlineResponse2007> localVarReturnType = new GenericType<InlineResponse2007>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get all UserVariables
   * Get all UserVariables
   * @param accessToken User&#39;s OAuth2 access token (optional)
   * @param clientId The ID of the client application which last created or updated this user variable (optional)
   * @param parentId ID of the parent variable if this variable has any parent (optional)
   * @param variableId ID of variable (optional)
   * @param defaultUnitId D of unit to use for this variable (optional)
   * @param minimumAllowedValue Minimum reasonable value for this variable (uses default unit) (optional)
   * @param maximumAllowedValue Maximum reasonable value for this variable (uses default unit) (optional)
   * @param fillingValue Value for replacing null measurements (optional)
   * @param joinWith The Variable this Variable should be joined with. If the variable is joined with some other variable then it is not shown to user in the list of variables (optional)
   * @param onsetDelay Estimated number of seconds that pass before a stimulus produces a perceivable effect (optional)
   * @param durationOfAction Estimated duration of time following the onset delay in which a stimulus produces a perceivable effect (optional)
   * @param variableCategoryId ID of variable category (optional)
   * @param updated updated (optional)
   * @param _public Is variable public (optional)
   * @param causeOnly A value of 1 indicates that this variable is generally a cause in a causal relationship.  An example of a causeOnly variable would be a variable such as Cloud Cover which would generally not be influenced by the behaviour of the user (optional)
   * @param fillingType 0 -&gt; No filling, 1 -&gt; Use filling-value (optional)
   * @param numberOfMeasurements Number of measurements (optional)
   * @param numberOfProcessedMeasurements Number of processed measurements (optional)
   * @param measurementsAtLastAnalysis Number of measurements at last analysis (optional)
   * @param lastUnitId ID of last Unit (optional)
   * @param lastOriginalUnitId ID of last original Unit (optional)
   * @param lastOriginalValue Last original value which is stored (optional)
   * @param lastValue Last Value (optional)
   * @param lastSourceId ID of last source (optional)
   * @param numberOfCorrelations Number of correlations for this variable (optional)
   * @param status status (optional)
   * @param errorMessage error_message (optional)
   * @param lastSuccessfulUpdateTime When this variable or its settings were last updated (optional)
   * @param standardDeviation Standard deviation (optional)
   * @param variance Variance (optional)
   * @param minimumRecordedValue Minimum recorded value of this variable (optional)
   * @param maximumRecordedValue Maximum recorded value of this variable (optional)
   * @param mean Mean (optional)
   * @param median Median (optional)
   * @param mostCommonUnitId Most common Unit ID (optional)
   * @param mostCommonValue Most common value (optional)
   * @param numberOfUniqueDailyValues Number of unique daily values (optional)
   * @param numberOfChanges Number of changes (optional)
   * @param skewness Skewness (optional)
   * @param kurtosis Kurtosis (optional)
   * @param latitude Latitude (optional)
   * @param longitude Longitude (optional)
   * @param location Location (optional)
   * @param createdAt When the record was first created. Use ISO 8601 datetime format  (optional)
   * @param updatedAt When the record was last updated. Use ISO 8601 datetime format  (optional)
   * @param outcome Outcome variables (those with &#x60;outcome&#x60; &#x3D;&#x3D; 1) are variables for which a human would generally want to identify the influencing factors.  These include symptoms of illness, physique, mood, cognitive performance, etc.  Generally correlation calculations are only performed on outcome variables (optional)
   * @param sources Comma-separated list of source names to limit variables to those sources (optional)
   * @param earliestSourceTime Earliest source time (optional)
   * @param latestSourceTime Latest source time (optional)
   * @param earliestMeasurementTime Earliest measurement time (optional)
   * @param latestMeasurementTime Latest measurement time (optional)
   * @param earliestFillingTime Earliest filling time (optional)
   * @param latestFillingTime Latest filling time (optional)
   * @param limit The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. The maximum limit is 200 records. (optional)
   * @param offset OFFSET says to skip that many rows before beginning to return rows to the client. OFFSET 0 is the same as omitting the OFFSET clause. If both OFFSET and LIMIT appear, then OFFSET rows are skipped before starting to count the LIMIT rows that are returned. (optional)
   * @param sort Sort by given field. If the field is prefixed with &#39;-&#39;, it will sort in descending order. (optional)
   * @return InlineResponse2008
   * @throws ApiException if fails to make API call
   */
  public InlineResponse2008 v2ApplicationUserVariablesGet(String accessToken, String clientId, Integer parentId, Integer variableId, Integer defaultUnitId, BigDecimal minimumAllowedValue, BigDecimal maximumAllowedValue, BigDecimal fillingValue, Integer joinWith, Integer onsetDelay, Integer durationOfAction, Integer variableCategoryId, Integer updated, Integer _public, Boolean causeOnly, String fillingType, Integer numberOfMeasurements, Integer numberOfProcessedMeasurements, Integer measurementsAtLastAnalysis, Integer lastUnitId, Integer lastOriginalUnitId, Integer lastOriginalValue, BigDecimal lastValue, Integer lastSourceId, Integer numberOfCorrelations, String status, String errorMessage, String lastSuccessfulUpdateTime, BigDecimal standardDeviation, BigDecimal variance, BigDecimal minimumRecordedValue, BigDecimal maximumRecordedValue, BigDecimal mean, BigDecimal median, Integer mostCommonUnitId, BigDecimal mostCommonValue, BigDecimal numberOfUniqueDailyValues, Integer numberOfChanges, BigDecimal skewness, BigDecimal kurtosis, BigDecimal latitude, BigDecimal longitude, String location, String createdAt, String updatedAt, Boolean outcome, String sources, Integer earliestSourceTime, Integer latestSourceTime, Integer earliestMeasurementTime, Integer latestMeasurementTime, Integer earliestFillingTime, Integer latestFillingTime, Integer limit, Integer offset, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v2/application/userVariables".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "client_id", clientId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "parent_id", parentId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "variable_id", variableId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "default_unit_id", defaultUnitId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "minimum_allowed_value", minimumAllowedValue));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "maximum_allowed_value", maximumAllowedValue));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filling_value", fillingValue));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "join_with", joinWith));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "onset_delay", onsetDelay));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "duration_of_action", durationOfAction));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "variable_category_id", variableCategoryId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "updated", updated));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "public", _public));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cause_only", causeOnly));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filling_type", fillingType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "number_of_measurements", numberOfMeasurements));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "number_of_processed_measurements", numberOfProcessedMeasurements));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "measurements_at_last_analysis", measurementsAtLastAnalysis));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "last_unit_id", lastUnitId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "last_original_unit_id", lastOriginalUnitId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "last_original_value", lastOriginalValue));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "last_value", lastValue));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "last_source_id", lastSourceId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "number_of_correlations", numberOfCorrelations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "error_message", errorMessage));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "last_successful_update_time", lastSuccessfulUpdateTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "standard_deviation", standardDeviation));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "variance", variance));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "minimum_recorded_value", minimumRecordedValue));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "maximum_recorded_value", maximumRecordedValue));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "mean", mean));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "median", median));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "most_common_unit_id", mostCommonUnitId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "most_common_value", mostCommonValue));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "number_of_unique_daily_values", numberOfUniqueDailyValues));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "number_of_changes", numberOfChanges));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "skewness", skewness));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "kurtosis", kurtosis));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "latitude", latitude));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "longitude", longitude));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "location", location));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "created_at", createdAt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "updated_at", updatedAt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "outcome", outcome));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sources", sources));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "earliest_source_time", earliestSourceTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "latest_source_time", latestSourceTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "earliest_measurement_time", earliestMeasurementTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "latest_measurement_time", latestMeasurementTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "earliest_filling_time", earliestFillingTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "latest_filling_time", latestFillingTime));
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

    String[] localVarAuthNames = new String[] { "oauth2", "internalApiKey" };

    GenericType<InlineResponse2008> localVarReturnType = new GenericType<InlineResponse2008>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get all VariableUserSources
   * Get all VariableUserSources
   * @param accessToken User&#39;s OAuth2 access token (optional)
   * @param variableId ID of variable (optional)
   * @param timestamp Time that this measurement occurred Uses epoch minute (epoch time divided by 60) (optional)
   * @param earliestMeasurementTime Earliest measurement time (optional)
   * @param latestMeasurementTime Latest measurement time (optional)
   * @param createdAt When the record was first created. Use ISO 8601 datetime format  (optional)
   * @param updatedAt When the record was last updated. Use ISO 8601 datetime format  (optional)
   * @param limit The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. The maximum limit is 200 records. (optional)
   * @param offset OFFSET says to skip that many rows before beginning to return rows to the client. OFFSET 0 is the same as omitting the OFFSET clause. If both OFFSET and LIMIT appear, then OFFSET rows are skipped before starting to count the LIMIT rows that are returned. (optional)
   * @param sort Sort by given field. If the field is prefixed with &#39;-&#39;, it will sort in descending order. (optional)
   * @return InlineResponse2009
   * @throws ApiException if fails to make API call
   */
  public InlineResponse2009 v2ApplicationVariableUserSourcesGet(String accessToken, Integer variableId, Integer timestamp, Integer earliestMeasurementTime, Integer latestMeasurementTime, String createdAt, String updatedAt, Integer limit, Integer offset, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v2/application/variableUserSources".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "variable_id", variableId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "timestamp", timestamp));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "earliest_measurement_time", earliestMeasurementTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "latest_measurement_time", latestMeasurementTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "created_at", createdAt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "updated_at", updatedAt));
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

    String[] localVarAuthNames = new String[] { "oauth2", "internalApiKey" };

    GenericType<InlineResponse2009> localVarReturnType = new GenericType<InlineResponse2009>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get all Votes
   * Get all Votes
   * @param accessToken User&#39;s OAuth2 access token (optional)
   * @param clientId The ID of the client application which last created or updated this vote (optional)
   * @param causeId ID of predictor variable (optional)
   * @param effectId ID of outcome variable (optional)
   * @param value Value of Vote. 1 is for upvote. 0 is for downvote.  Otherwise, there is no vote. (optional)
   * @param createdAt When the record was first created. Use ISO 8601 datetime format  (optional)
   * @param updatedAt When the record was last updated. Use ISO 8601 datetime format  (optional)
   * @param limit The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. The maximum limit is 200 records. (optional)
   * @param offset OFFSET says to skip that many rows before beginning to return rows to the client. OFFSET 0 is the same as omitting the OFFSET clause. If both OFFSET and LIMIT appear, then OFFSET rows are skipped before starting to count the LIMIT rows that are returned. (optional)
   * @param sort Sort by given field. If the field is prefixed with &#39;-&#39;, it will sort in descending order. (optional)
   * @return InlineResponse20010
   * @throws ApiException if fails to make API call
   */
  public InlineResponse20010 v2ApplicationVotesGet(String accessToken, String clientId, Integer causeId, Integer effectId, Integer value, String createdAt, String updatedAt, Integer limit, Integer offset, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v2/application/votes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "client_id", clientId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cause_id", causeId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "effect_id", effectId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "value", value));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "created_at", createdAt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "updated_at", updatedAt));
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

    String[] localVarAuthNames = new String[] { "oauth2", "internalApiKey" };

    GenericType<InlineResponse20010> localVarReturnType = new GenericType<InlineResponse20010>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
