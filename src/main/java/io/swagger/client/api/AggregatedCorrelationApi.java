package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import java.math.BigDecimal;
import io.swagger.client.model.InlineResponse200;
import io.swagger.client.model.AggregatedCorrelation;
import io.swagger.client.model.InlineResponse2001;
import io.swagger.client.model.InlineResponse2002;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-09T02:16:51.363Z")
public class AggregatedCorrelationApi {
  private ApiClient apiClient;

  public AggregatedCorrelationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AggregatedCorrelationApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Get all AggregatedCorrelations
   * Get all AggregatedCorrelations
   * @param accessToken User&#39;s OAuth2 access token
   * @param correlation Pearson correlation coefficient between cause and effect measurements
   * @param causeId Variable ID of the predictor variable for which the user desires correlations
   * @param effectId Variable ID of the outcome variable for which the user desires correlations
   * @param onsetDelay User estimated (or default number of seconds) after cause measurement before a perceivable effect is observed
   * @param durationOfAction Number of seconds over which the predictor variable event is expected to produce a perceivable effect following the onset delay
   * @param numberOfPairs Number of predictor/outcome data points used in the analysis
   * @param valuePredictingHighOutcome Predictor daily aggregated measurement value that predicts an above average effect measurement value (in default unit for predictor variable)
   * @param valuePredictingLowOutcome Predictor daily aggregated measurement value that predicts a below average effect measurement value (in default unit for outcome variable)
   * @param optimalPearsonProduct Optimal Pearson Product
   * @param numberOfUsers Number of users whose data was used in this aggregation
   * @param numberOfCorrelations Number of correlational analyses used in this aggregation
   * @param statisticalSignificance A function of the effect size and sample size
   * @param causeUnit Abbreviated unit name for the predictor variable
   * @param causeUnitId Unit ID for the predictor variable
   * @param causeChanges Number of times that the predictor time series changes
   * @param effectChanges Number of times that the predictor time series changes
   * @param aggregateQmScore Aggregated QM Score which is directly proportional with the relevance of each predictor or outcome
   * @param createdAt Date at which the analysis was first performed
   * @param updatedAt Date at which the analysis was last updated
   * @param status Indicates whether an analysis is up to date (UPDATED), needs to be updated (WAITING), or had an error (ERROR)
   * @param errorMessage Message describing any problems encountered during the analysis
   * @param lastSuccessfulUpdateTime Last Successful update time
   * @param reversePearsonCorrelationCoefficient Correlation when cause and effect are reversed. For any causal relationship, the forward correlation should exceed the reverse correlation
   * @param predictivePearsonCorrelationCoefficient Predictive Pearson Correlation Coefficient
   * @param limit Limit the number of results returned
   * @param offset Records from give Offset
   * @param sort Sort records by given field
   * @return InlineResponse200
   */
  public InlineResponse200 aggregatedCorrelationsGet(String accessToken, BigDecimal correlation, Integer causeId, Integer effectId, Integer onsetDelay, Integer durationOfAction, Integer numberOfPairs, BigDecimal valuePredictingHighOutcome, BigDecimal valuePredictingLowOutcome, BigDecimal optimalPearsonProduct, Integer numberOfUsers, Integer numberOfCorrelations, BigDecimal statisticalSignificance, String causeUnit, Integer causeUnitId, Integer causeChanges, Integer effectChanges, BigDecimal aggregateQmScore, String createdAt, String updatedAt, String status, String errorMessage, String lastSuccessfulUpdateTime, BigDecimal reversePearsonCorrelationCoefficient, BigDecimal predictivePearsonCorrelationCoefficient, Integer limit, Integer offset, String sort) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/aggregatedCorrelations".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));
    
    queryParams.addAll(apiClient.parameterToPairs("", "correlation", correlation));
    
    queryParams.addAll(apiClient.parameterToPairs("", "cause_id", causeId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "effect_id", effectId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "onset_delay", onsetDelay));
    
    queryParams.addAll(apiClient.parameterToPairs("", "duration_of_action", durationOfAction));
    
    queryParams.addAll(apiClient.parameterToPairs("", "number_of_pairs", numberOfPairs));
    
    queryParams.addAll(apiClient.parameterToPairs("", "value_predicting_high_outcome", valuePredictingHighOutcome));
    
    queryParams.addAll(apiClient.parameterToPairs("", "value_predicting_low_outcome", valuePredictingLowOutcome));
    
    queryParams.addAll(apiClient.parameterToPairs("", "optimal_pearson_product", optimalPearsonProduct));
    
    queryParams.addAll(apiClient.parameterToPairs("", "number_of_users", numberOfUsers));
    
    queryParams.addAll(apiClient.parameterToPairs("", "number_of_correlations", numberOfCorrelations));
    
    queryParams.addAll(apiClient.parameterToPairs("", "statistical_significance", statisticalSignificance));
    
    queryParams.addAll(apiClient.parameterToPairs("", "cause_unit", causeUnit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "cause_unit_id", causeUnitId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "cause_changes", causeChanges));
    
    queryParams.addAll(apiClient.parameterToPairs("", "effect_changes", effectChanges));
    
    queryParams.addAll(apiClient.parameterToPairs("", "aggregate_qm_score", aggregateQmScore));
    
    queryParams.addAll(apiClient.parameterToPairs("", "created_at", createdAt));
    
    queryParams.addAll(apiClient.parameterToPairs("", "updated_at", updatedAt));
    
    queryParams.addAll(apiClient.parameterToPairs("", "status", status));
    
    queryParams.addAll(apiClient.parameterToPairs("", "error_message", errorMessage));
    
    queryParams.addAll(apiClient.parameterToPairs("", "last_successful_update_time", lastSuccessfulUpdateTime));
    
    queryParams.addAll(apiClient.parameterToPairs("", "reverse_pearson_correlation_coefficient", reversePearsonCorrelationCoefficient));
    
    queryParams.addAll(apiClient.parameterToPairs("", "predictive_pearson_correlation_coefficient", predictivePearsonCorrelationCoefficient));
    
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

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Store AggregatedCorrelation
   * Store AggregatedCorrelation
   * @param accessToken User&#39;s OAuth2 access token
   * @param body AggregatedCorrelation that should be stored
   * @return InlineResponse2001
   */
  public InlineResponse2001 aggregatedCorrelationsPost(String accessToken, AggregatedCorrelation body) throws ApiException {
    Object postBody = body;
    
    // create path and map variables
    String path = "/aggregatedCorrelations".replaceAll("\\{format\\}","json");

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

    
    GenericType<InlineResponse2001> returnType = new GenericType<InlineResponse2001>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get AggregatedCorrelation
   * Get AggregatedCorrelation
   * @param id id of AggregatedCorrelation
   * @param accessToken User&#39;s OAuth2 access token
   * @return InlineResponse2001
   */
  public InlineResponse2001 aggregatedCorrelationsIdGet(Integer id, String accessToken) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling aggregatedCorrelationsIdGet");
     }
     
    // create path and map variables
    String path = "/aggregatedCorrelations/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<InlineResponse2001> returnType = new GenericType<InlineResponse2001>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Update AggregatedCorrelation
   * Update AggregatedCorrelation
   * @param id id of AggregatedCorrelation
   * @param accessToken User&#39;s OAuth2 access token
   * @param body AggregatedCorrelation that should be updated
   * @return InlineResponse2002
   */
  public InlineResponse2002 aggregatedCorrelationsIdPut(Integer id, String accessToken, AggregatedCorrelation body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling aggregatedCorrelationsIdPut");
     }
     
    // create path and map variables
    String path = "/aggregatedCorrelations/{id}".replaceAll("\\{format\\}","json")
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
   * Delete AggregatedCorrelation
   * Delete AggregatedCorrelation
   * @param id id of AggregatedCorrelation
   * @param accessToken User&#39;s OAuth2 access token
   * @return InlineResponse2002
   */
  public InlineResponse2002 aggregatedCorrelationsIdDelete(Integer id, String accessToken) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling aggregatedCorrelationsIdDelete");
     }
     
    // create path and map variables
    String path = "/aggregatedCorrelations/{id}".replaceAll("\\{format\\}","json")
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
