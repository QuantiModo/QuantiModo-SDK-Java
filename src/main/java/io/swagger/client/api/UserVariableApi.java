package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.TypeRef;

import io.swagger.client.model.InlineResponse20021;
import java.math.BigDecimal;
import io.swagger.client.model.InlineResponse20022;
import io.swagger.client.model.UserVariable;
import io.swagger.client.model.InlineResponse2002;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-05T03:15:54.261Z")
public class UserVariableApi {
  private ApiClient apiClient;

  public UserVariableApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UserVariableApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Get all UserVariables
   * Get all UserVariables
   * @param clientId client_id
   * @param variableId variable_id
   * @param defaultUnitId default_unit_id
   * @param minimumAllowedValue minimum_allowed_value
   * @param maximumAllowedValue maximum_allowed_value
   * @param fillingValue filling_value
   * @param joinWith join_with
   * @param onsetDelay onset_delay
   * @param durationOfAction duration_of_action
   * @param variableCategoryId variable_category_id
   * @param updated updated
   * @param _public public
   * @param causeOnly cause_only
   * @param fillingType filling_type
   * @param numberOfMeasurements number_of_measurements
   * @param numberOfProcessedMeasurements number_of_processed_measurements
   * @param measurementsAtLastAnalysis measurements_at_last_analysis
   * @param lastUnitId last_unit_id
   * @param lastOriginalUnitId last_original_unit_id
   * @param lastOriginalValue last_original_value
   * @param lastValue last_value
   * @param lastSourceId last_source_id
   * @param numberOfCorrelations number_of_correlations
   * @param status status
   * @param errorMessage error_message
   * @param lastSuccessfulUpdateTime last_successful_update_time
   * @param standardDeviation standard_deviation
   * @param variance variance
   * @param minimumRecordedDailyValue minimum_recorded_daily_value
   * @param maximumRecordedDailyValue maximum_recorded_daily_value
   * @param mean mean
   * @param median median
   * @param mostCommonUnitId most_common_unit_id
   * @param mostCommonValue most_common_value
   * @param numberOfUniqueDailyValues number_of_unique_daily_values
   * @param numberOfChanges number_of_changes
   * @param skewness skewness
   * @param kurtosis kurtosis
   * @param latitude latitude
   * @param longitude longitude
   * @param location location
   * @param createdAt created_at
   * @param updatedAt updated_at
   * @param outcome outcome
   * @param sources sources
   * @param earliestSourceTime earliest_source_time
   * @param latestSourceTime latest_source_time
   * @param earliestMeasurementTime earliest_measurement_time
   * @param latestMeasurementTime latest_measurement_time
   * @param earliestFillingTime earliest_filling_time
   * @param latestFillingTime latest_filling_time
   * @param limit limit
   * @param offset offset
   * @param sort sort
   * @return InlineResponse20021
   */
  public InlineResponse20021 userVariablesGet (String clientId, Integer variableId, Integer defaultUnitId, BigDecimal minimumAllowedValue, BigDecimal maximumAllowedValue, BigDecimal fillingValue, Integer joinWith, Integer onsetDelay, Integer durationOfAction, Integer variableCategoryId, Integer updated, Integer _public, Boolean causeOnly, String fillingType, Integer numberOfMeasurements, Integer numberOfProcessedMeasurements, Integer measurementsAtLastAnalysis, Integer lastUnitId, Integer lastOriginalUnitId, Integer lastOriginalValue, BigDecimal lastValue, Integer lastSourceId, Integer numberOfCorrelations, String status, String errorMessage, String lastSuccessfulUpdateTime, BigDecimal standardDeviation, BigDecimal variance, BigDecimal minimumRecordedDailyValue, BigDecimal maximumRecordedDailyValue, BigDecimal mean, BigDecimal median, Integer mostCommonUnitId, BigDecimal mostCommonValue, BigDecimal numberOfUniqueDailyValues, Integer numberOfChanges, BigDecimal skewness, BigDecimal kurtosis, BigDecimal latitude, BigDecimal longitude, String location, String createdAt, String updatedAt, Boolean outcome, String sources, Integer earliestSourceTime, Integer latestSourceTime, Integer earliestMeasurementTime, Integer latestMeasurementTime, Integer earliestFillingTime, Integer latestFillingTime, Integer limit, Integer offset, String sort) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
    // create path and map variables
    String path = "/userVariables".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "client_id", clientId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "variable_id", variableId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "default_unit_id", defaultUnitId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "minimum_allowed_value", minimumAllowedValue));
    
    queryParams.addAll(apiClient.parameterToPairs("", "maximum_allowed_value", maximumAllowedValue));
    
    queryParams.addAll(apiClient.parameterToPairs("", "filling_value", fillingValue));
    
    queryParams.addAll(apiClient.parameterToPairs("", "join_with", joinWith));
    
    queryParams.addAll(apiClient.parameterToPairs("", "onset_delay", onsetDelay));
    
    queryParams.addAll(apiClient.parameterToPairs("", "duration_of_action", durationOfAction));
    
    queryParams.addAll(apiClient.parameterToPairs("", "variable_category_id", variableCategoryId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "updated", updated));
    
    queryParams.addAll(apiClient.parameterToPairs("", "public", _public));
    
    queryParams.addAll(apiClient.parameterToPairs("", "cause_only", causeOnly));
    
    queryParams.addAll(apiClient.parameterToPairs("", "filling_type", fillingType));
    
    queryParams.addAll(apiClient.parameterToPairs("", "number_of_measurements", numberOfMeasurements));
    
    queryParams.addAll(apiClient.parameterToPairs("", "number_of_processed_measurements", numberOfProcessedMeasurements));
    
    queryParams.addAll(apiClient.parameterToPairs("", "measurements_at_last_analysis", measurementsAtLastAnalysis));
    
    queryParams.addAll(apiClient.parameterToPairs("", "last_unit_id", lastUnitId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "last_original_unit_id", lastOriginalUnitId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "last_original_value", lastOriginalValue));
    
    queryParams.addAll(apiClient.parameterToPairs("", "last_value", lastValue));
    
    queryParams.addAll(apiClient.parameterToPairs("", "last_source_id", lastSourceId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "number_of_correlations", numberOfCorrelations));
    
    queryParams.addAll(apiClient.parameterToPairs("", "status", status));
    
    queryParams.addAll(apiClient.parameterToPairs("", "error_message", errorMessage));
    
    queryParams.addAll(apiClient.parameterToPairs("", "last_successful_update_time", lastSuccessfulUpdateTime));
    
    queryParams.addAll(apiClient.parameterToPairs("", "standard_deviation", standardDeviation));
    
    queryParams.addAll(apiClient.parameterToPairs("", "variance", variance));
    
    queryParams.addAll(apiClient.parameterToPairs("", "minimum_recorded_daily_value", minimumRecordedDailyValue));
    
    queryParams.addAll(apiClient.parameterToPairs("", "maximum_recorded_daily_value", maximumRecordedDailyValue));
    
    queryParams.addAll(apiClient.parameterToPairs("", "mean", mean));
    
    queryParams.addAll(apiClient.parameterToPairs("", "median", median));
    
    queryParams.addAll(apiClient.parameterToPairs("", "most_common_unit_id", mostCommonUnitId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "most_common_value", mostCommonValue));
    
    queryParams.addAll(apiClient.parameterToPairs("", "number_of_unique_daily_values", numberOfUniqueDailyValues));
    
    queryParams.addAll(apiClient.parameterToPairs("", "number_of_changes", numberOfChanges));
    
    queryParams.addAll(apiClient.parameterToPairs("", "skewness", skewness));
    
    queryParams.addAll(apiClient.parameterToPairs("", "kurtosis", kurtosis));
    
    queryParams.addAll(apiClient.parameterToPairs("", "latitude", latitude));
    
    queryParams.addAll(apiClient.parameterToPairs("", "longitude", longitude));
    
    queryParams.addAll(apiClient.parameterToPairs("", "location", location));
    
    queryParams.addAll(apiClient.parameterToPairs("", "created_at", createdAt));
    
    queryParams.addAll(apiClient.parameterToPairs("", "updated_at", updatedAt));
    
    queryParams.addAll(apiClient.parameterToPairs("", "outcome", outcome));
    
    queryParams.addAll(apiClient.parameterToPairs("", "sources", sources));
    
    queryParams.addAll(apiClient.parameterToPairs("", "earliest_source_time", earliestSourceTime));
    
    queryParams.addAll(apiClient.parameterToPairs("", "latest_source_time", latestSourceTime));
    
    queryParams.addAll(apiClient.parameterToPairs("", "earliest_measurement_time", earliestMeasurementTime));
    
    queryParams.addAll(apiClient.parameterToPairs("", "latest_measurement_time", latestMeasurementTime));
    
    queryParams.addAll(apiClient.parameterToPairs("", "earliest_filling_time", earliestFillingTime));
    
    queryParams.addAll(apiClient.parameterToPairs("", "latest_filling_time", latestFillingTime));
    
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

    

    
    
    TypeRef returnType = new TypeRef<InlineResponse20021>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Store UserVariable
   * Store UserVariable
   * @param body UserVariable that should be stored
   * @return InlineResponse20022
   */
  public InlineResponse20022 userVariablesPost (UserVariable body) throws ApiException {
    Object postBody = body;
    byte[] postBinaryBody = null;
    
    // create path and map variables
    String path = "/userVariables".replaceAll("\\{format\\}","json");

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

    

    
    
    TypeRef returnType = new TypeRef<InlineResponse20022>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Get UserVariable
   * Get UserVariable
   * @param id id of UserVariable
   * @return InlineResponse20022
   */
  public InlineResponse20022 userVariablesIdGet (Integer id) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling userVariablesIdGet");
     }
     
    // create path and map variables
    String path = "/userVariables/{id}".replaceAll("\\{format\\}","json")
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

    

    
    
    TypeRef returnType = new TypeRef<InlineResponse20022>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Update UserVariable
   * Update UserVariable
   * @param id id of UserVariable
   * @param body UserVariable that should be updated
   * @return InlineResponse2002
   */
  public InlineResponse2002 userVariablesIdPut (Integer id, UserVariable body) throws ApiException {
    Object postBody = body;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling userVariablesIdPut");
     }
     
    // create path and map variables
    String path = "/userVariables/{id}".replaceAll("\\{format\\}","json")
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
   * Delete UserVariable
   * Delete UserVariable
   * @param id id of UserVariable
   * @return InlineResponse2002
   */
  public InlineResponse2002 userVariablesIdDelete (Integer id) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling userVariablesIdDelete");
     }
     
    // create path and map variables
    String path = "/userVariables/{id}".replaceAll("\\{format\\}","json")
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
