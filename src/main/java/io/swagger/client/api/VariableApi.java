package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.TypeRef;

import io.swagger.client.model.InlineResponse20027;
import java.math.BigDecimal;
import io.swagger.client.model.InlineResponse20028;
import io.swagger.client.model.Variable;
import io.swagger.client.model.InlineResponse2002;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-03T22:24:11.560Z")
public class VariableApi {
  private ApiClient apiClient;

  public VariableApi() {
    this(Configuration.getDefaultApiClient());
  }

  public VariableApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Get all Variables
   * Get all Variables
   * @param id id
   * @param clientId client_id
   * @param parentId parent_id
   * @param name name
   * @param variableCategoryId variable_category_id
   * @param defaultUnitId default_unit_id
   * @param combinationOperation combination_operation
   * @param fillingValue filling_value
   * @param maximumAllowedValue maximum_allowed_value
   * @param minimumAllowedValue minimum_allowed_value
   * @param onsetDelay onset_delay
   * @param durationOfAction duration_of_action
   * @param _public public
   * @param causeOnly cause_only
   * @param mostCommonValue most_common_value
   * @param mostCommonUnitId most_common_unit_id
   * @param standardDeviation standard_deviation
   * @param variance variance
   * @param mean mean
   * @param median median
   * @param numberOfMeasurements number_of_measurements
   * @param numberOfUniqueValues number_of_unique_values
   * @param skewness skewness
   * @param kurtosis kurtosis
   * @param latitude latitude
   * @param longitude longitude
   * @param location location
   * @param status status
   * @param errorMessage error_message
   * @param lastSuccessfulUpdateTime last_successful_update_time
   * @param createdAt created_at
   * @param updatedAt updated_at
   * @param productUrl product_url
   * @param imageUrl image_url
   * @param price price
   * @param numberOfUserVariables number_of_user_variables
   * @param outcome outcome
   * @param minimumRecordedValue minimum_recorded_value
   * @param maximumRecordedValue maximum_recorded_value
   * @param limit limit
   * @param offset offset
   * @param sort sort
   * @return InlineResponse20027
   */
  public InlineResponse20027 variablesGet (Integer id, String clientId, Integer parentId, String name, Integer variableCategoryId, Integer defaultUnitId, String combinationOperation, BigDecimal fillingValue, BigDecimal maximumAllowedValue, BigDecimal minimumAllowedValue, Integer onsetDelay, Integer durationOfAction, Integer _public, Boolean causeOnly, BigDecimal mostCommonValue, Integer mostCommonUnitId, BigDecimal standardDeviation, BigDecimal variance, BigDecimal mean, BigDecimal median, BigDecimal numberOfMeasurements, BigDecimal numberOfUniqueValues, BigDecimal skewness, BigDecimal kurtosis, BigDecimal latitude, BigDecimal longitude, String location, String status, String errorMessage, String lastSuccessfulUpdateTime, String createdAt, String updatedAt, String productUrl, String imageUrl, BigDecimal price, Integer numberOfUserVariables, Boolean outcome, BigDecimal minimumRecordedValue, BigDecimal maximumRecordedValue, Integer limit, Integer offset, String sort) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
    // create path and map variables
    String path = "/variables".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
    queryParams.addAll(apiClient.parameterToPairs("", "client_id", clientId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "parent_id", parentId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "name", name));
    
    queryParams.addAll(apiClient.parameterToPairs("", "variable_category_id", variableCategoryId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "default_unit_id", defaultUnitId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "combination_operation", combinationOperation));
    
    queryParams.addAll(apiClient.parameterToPairs("", "filling_value", fillingValue));
    
    queryParams.addAll(apiClient.parameterToPairs("", "maximum_allowed_value", maximumAllowedValue));
    
    queryParams.addAll(apiClient.parameterToPairs("", "minimum_allowed_value", minimumAllowedValue));
    
    queryParams.addAll(apiClient.parameterToPairs("", "onset_delay", onsetDelay));
    
    queryParams.addAll(apiClient.parameterToPairs("", "duration_of_action", durationOfAction));
    
    queryParams.addAll(apiClient.parameterToPairs("", "public", _public));
    
    queryParams.addAll(apiClient.parameterToPairs("", "cause_only", causeOnly));
    
    queryParams.addAll(apiClient.parameterToPairs("", "most_common_value", mostCommonValue));
    
    queryParams.addAll(apiClient.parameterToPairs("", "most_common_unit_id", mostCommonUnitId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "standard_deviation", standardDeviation));
    
    queryParams.addAll(apiClient.parameterToPairs("", "variance", variance));
    
    queryParams.addAll(apiClient.parameterToPairs("", "mean", mean));
    
    queryParams.addAll(apiClient.parameterToPairs("", "median", median));
    
    queryParams.addAll(apiClient.parameterToPairs("", "number_of_measurements", numberOfMeasurements));
    
    queryParams.addAll(apiClient.parameterToPairs("", "number_of_unique_values", numberOfUniqueValues));
    
    queryParams.addAll(apiClient.parameterToPairs("", "skewness", skewness));
    
    queryParams.addAll(apiClient.parameterToPairs("", "kurtosis", kurtosis));
    
    queryParams.addAll(apiClient.parameterToPairs("", "latitude", latitude));
    
    queryParams.addAll(apiClient.parameterToPairs("", "longitude", longitude));
    
    queryParams.addAll(apiClient.parameterToPairs("", "location", location));
    
    queryParams.addAll(apiClient.parameterToPairs("", "status", status));
    
    queryParams.addAll(apiClient.parameterToPairs("", "error_message", errorMessage));
    
    queryParams.addAll(apiClient.parameterToPairs("", "last_successful_update_time", lastSuccessfulUpdateTime));
    
    queryParams.addAll(apiClient.parameterToPairs("", "created_at", createdAt));
    
    queryParams.addAll(apiClient.parameterToPairs("", "updated_at", updatedAt));
    
    queryParams.addAll(apiClient.parameterToPairs("", "product_url", productUrl));
    
    queryParams.addAll(apiClient.parameterToPairs("", "image_url", imageUrl));
    
    queryParams.addAll(apiClient.parameterToPairs("", "price", price));
    
    queryParams.addAll(apiClient.parameterToPairs("", "number_of_user_variables", numberOfUserVariables));
    
    queryParams.addAll(apiClient.parameterToPairs("", "outcome", outcome));
    
    queryParams.addAll(apiClient.parameterToPairs("", "minimum_recorded_value", minimumRecordedValue));
    
    queryParams.addAll(apiClient.parameterToPairs("", "maximum_recorded_value", maximumRecordedValue));
    
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

    

    
    
    TypeRef returnType = new TypeRef<InlineResponse20027>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Store Variable
   * Store Variable
   * @param body Variable that should be stored
   * @return InlineResponse20028
   */
  public InlineResponse20028 variablesPost (Variable body) throws ApiException {
    Object postBody = body;
    byte[] postBinaryBody = null;
    
    // create path and map variables
    String path = "/variables".replaceAll("\\{format\\}","json");

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

    

    
    
    TypeRef returnType = new TypeRef<InlineResponse20028>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Get Variable
   * Get Variable
   * @param id id of Variable
   * @return InlineResponse20028
   */
  public InlineResponse20028 variablesIdGet (Integer id) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling variablesIdGet");
     }
     
    // create path and map variables
    String path = "/variables/{id}".replaceAll("\\{format\\}","json")
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

    

    
    
    TypeRef returnType = new TypeRef<InlineResponse20028>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Update Variable
   * Update Variable
   * @param id id of Variable
   * @param body Variable that should be updated
   * @return InlineResponse2002
   */
  public InlineResponse2002 variablesIdPut (Integer id, Variable body) throws ApiException {
    Object postBody = body;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling variablesIdPut");
     }
     
    // create path and map variables
    String path = "/variables/{id}".replaceAll("\\{format\\}","json")
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
   * Delete Variable
   * Delete Variable
   * @param id id of Variable
   * @return InlineResponse2002
   */
  public InlineResponse2002 variablesIdDelete (Integer id) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling variablesIdDelete");
     }
     
    // create path and map variables
    String path = "/variables/{id}".replaceAll("\\{format\\}","json")
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
