package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import java.math.BigDecimal;
import io.swagger.client.model.InlineResponse20012;
import io.swagger.client.model.InlineResponse20013;
import io.swagger.client.model.CommonVariableRelationship;
import io.swagger.client.model.InlineResponse2002;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-09T02:16:51.363Z")
public class CommonVariableRelationshipApi {
  private ApiClient apiClient;

  public CommonVariableRelationshipApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CommonVariableRelationshipApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Get all CommonVariableRelationships
   * Get all CommonVariableRelationships
   * @param accessToken User&#39;s OAuth2 access token
   * @param id id
   * @param confidenceLevel Our confidence that a consistent predictive relationship exists based on the amount of evidence, reproducibility, and other factors
   * @param confidenceScore A quantitative representation of our confidence that a consistent predictive relationship exists based on the amount of evidence, reproducibility, and other factors
   * @param direction Direction is positive if higher predictor values generally precede higher outcome values. Direction is negative if higher predictor values generally precede lower outcome values.
   * @param durationOfAction Estimated number of seconds following the onset delay in which a stimulus produces a perceivable effect
   * @param errorMessage error_message
   * @param onsetDelay Estimated number of seconds that pass before a stimulus produces a perceivable effect
   * @param outcomeVariableId Variable ID for the outcome variable
   * @param predictorVariableId Variable ID for the predictor variable
   * @param predictorUnitId ID for default unit of the predictor variable
   * @param sinnRank A value representative of the relevance of this predictor relative to other predictors of this outcome.  Usually used for relevancy sorting.
   * @param strengthScore A value represented to the size of the effect which the predictor appears to have on the outcome.
   * @param strengthLevel Can be weak, medium, or strong based on the size of the effect which the predictor appears to have on the outcome relative to other variable relationship strength scores.
   * @param upVotes Number of users who feel that there is a plausible causal relationship between the predictor and outcome variables.
   * @param downVotes Number of users who do not feel that there is a plausible causal relationship between the predictor and outcome variables.
   * @param valuePredictingHighOutcome Value for the predictor variable (in it&#39;s default unit) which typically precedes an above average outcome value
   * @param valuePredictingLowOutcome Value for the predictor variable (in it&#39;s default unit) which typically precedes a below average outcome value
   * @param numberOfUsers Number of users whose data was aggregated to obtain this relationship
   * @param dataSource data_source
   * @param limit The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. The maximum limit is 200 records.
   * @param offset OFFSET says to skip that many rows before beginning to return rows to the client. OFFSET 0 is the same as omitting the OFFSET clause. If both OFFSET and LIMIT appear, then OFFSET rows are skipped before starting to count the LIMIT rows that are returned.
   * @param sort Sort by given field. If the field is prefixed with &#39;-&#39;, it will sort in descending order.
   * @return InlineResponse20012
   */
  public InlineResponse20012 commonVariableRelationshipsGet(String accessToken, Integer id, String confidenceLevel, BigDecimal confidenceScore, String direction, Integer durationOfAction, String errorMessage, Integer onsetDelay, Integer outcomeVariableId, Integer predictorVariableId, Integer predictorUnitId, BigDecimal sinnRank, BigDecimal strengthScore, String strengthLevel, Integer upVotes, Integer downVotes, BigDecimal valuePredictingHighOutcome, BigDecimal valuePredictingLowOutcome, Integer numberOfUsers, String dataSource, Integer limit, Integer offset, String sort) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/commonVariableRelationships".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));
    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
    queryParams.addAll(apiClient.parameterToPairs("", "confidence_level", confidenceLevel));
    
    queryParams.addAll(apiClient.parameterToPairs("", "confidence_score", confidenceScore));
    
    queryParams.addAll(apiClient.parameterToPairs("", "direction", direction));
    
    queryParams.addAll(apiClient.parameterToPairs("", "duration_of_action", durationOfAction));
    
    queryParams.addAll(apiClient.parameterToPairs("", "error_message", errorMessage));
    
    queryParams.addAll(apiClient.parameterToPairs("", "onset_delay", onsetDelay));
    
    queryParams.addAll(apiClient.parameterToPairs("", "outcome_variable_id", outcomeVariableId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "predictor_variable_id", predictorVariableId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "predictor_unit_id", predictorUnitId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "sinn_rank", sinnRank));
    
    queryParams.addAll(apiClient.parameterToPairs("", "strength_score", strengthScore));
    
    queryParams.addAll(apiClient.parameterToPairs("", "strength_level", strengthLevel));
    
    queryParams.addAll(apiClient.parameterToPairs("", "up_votes", upVotes));
    
    queryParams.addAll(apiClient.parameterToPairs("", "down_votes", downVotes));
    
    queryParams.addAll(apiClient.parameterToPairs("", "value_predicting_high_outcome", valuePredictingHighOutcome));
    
    queryParams.addAll(apiClient.parameterToPairs("", "value_predicting_low_outcome", valuePredictingLowOutcome));
    
    queryParams.addAll(apiClient.parameterToPairs("", "number_of_users", numberOfUsers));
    
    queryParams.addAll(apiClient.parameterToPairs("", "data_source", dataSource));
    
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

    
    GenericType<InlineResponse20012> returnType = new GenericType<InlineResponse20012>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Store CommonVariableRelationship
   * Store CommonVariableRelationship
   * @param accessToken User&#39;s OAuth2 access token
   * @param body CommonVariableRelationship that should be stored
   * @return InlineResponse20013
   */
  public InlineResponse20013 commonVariableRelationshipsPost(String accessToken, CommonVariableRelationship body) throws ApiException {
    Object postBody = body;
    
    // create path and map variables
    String path = "/commonVariableRelationships".replaceAll("\\{format\\}","json");

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

    
    GenericType<InlineResponse20013> returnType = new GenericType<InlineResponse20013>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get CommonVariableRelationship
   * Get CommonVariableRelationship
   * @param id id of CommonVariableRelationship
   * @param accessToken User&#39;s OAuth2 access token
   * @return InlineResponse20013
   */
  public InlineResponse20013 commonVariableRelationshipsIdGet(Integer id, String accessToken) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling commonVariableRelationshipsIdGet");
     }
     
    // create path and map variables
    String path = "/commonVariableRelationships/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<InlineResponse20013> returnType = new GenericType<InlineResponse20013>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Update CommonVariableRelationship
   * Update CommonVariableRelationship
   * @param id id of CommonVariableRelationship
   * @param accessToken User&#39;s OAuth2 access token
   * @param body CommonVariableRelationship that should be updated
   * @return InlineResponse2002
   */
  public InlineResponse2002 commonVariableRelationshipsIdPut(Integer id, String accessToken, CommonVariableRelationship body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling commonVariableRelationshipsIdPut");
     }
     
    // create path and map variables
    String path = "/commonVariableRelationships/{id}".replaceAll("\\{format\\}","json")
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
   * Delete CommonVariableRelationship
   * Delete CommonVariableRelationship
   * @param id id of CommonVariableRelationship
   * @param accessToken User&#39;s OAuth2 access token
   * @return InlineResponse2002
   */
  public InlineResponse2002 commonVariableRelationshipsIdDelete(Integer id, String accessToken) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling commonVariableRelationshipsIdDelete");
     }
     
    // create path and map variables
    String path = "/commonVariableRelationships/{id}".replaceAll("\\{format\\}","json")
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
