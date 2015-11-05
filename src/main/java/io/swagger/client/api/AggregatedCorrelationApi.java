package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.TypeRef;

import java.math.BigDecimal;
import io.swagger.client.model.InlineResponse200;
import io.swagger.client.model.AggregatedCorrelation;
import io.swagger.client.model.InlineResponse2001;
import io.swagger.client.model.InlineResponse2002;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-05T03:15:54.261Z")
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
   * @param correlation correlation
   * @param causeId cause_id
   * @param effectId effect_id
   * @param onsetDelay onset_delay
   * @param durationOfAction duration_of_action
   * @param numberOfPairs number_of_pairs
   * @param valuePredictingHighOutcome value_predicting_high_outcome
   * @param valuePredictingLowOutcome value_predicting_low_outcome
   * @param optimalPearsonProduct optimal_pearson_product
   * @param vote vote
   * @param numberOfUsers number_of_users
   * @param numberOfCorrelations number_of_correlations
   * @param statisticalSignificance statistical_significance
   * @param causeUnit cause_unit
   * @param causeUnitId cause_unit_id
   * @param causeChanges cause_changes
   * @param effectChanges effect_changes
   * @param aggregateQmScore aggregate_qm_score
   * @param createdAt created_at
   * @param updatedAt updated_at
   * @param status status
   * @param errorMessage error_message
   * @param lastSuccessfulUpdateTime last_successful_update_time
   * @param reversePearsonCorrelationCoefficient reverse_pearson_correlation_coefficient
   * @param predictivePearsonCorrelationCoefficient predictive_pearson_correlation_coefficient
   * @param limit limit
   * @param offset offset
   * @param sort sort
   * @return InlineResponse200
   */
  public InlineResponse200 aggregatedCorrelationsGet (BigDecimal correlation, Integer causeId, Integer effectId, Integer onsetDelay, Integer durationOfAction, Integer numberOfPairs, BigDecimal valuePredictingHighOutcome, BigDecimal valuePredictingLowOutcome, BigDecimal optimalPearsonProduct, BigDecimal vote, Integer numberOfUsers, Integer numberOfCorrelations, BigDecimal statisticalSignificance, String causeUnit, Integer causeUnitId, Integer causeChanges, Integer effectChanges, BigDecimal aggregateQmScore, String createdAt, String updatedAt, String status, String errorMessage, String lastSuccessfulUpdateTime, BigDecimal reversePearsonCorrelationCoefficient, BigDecimal predictivePearsonCorrelationCoefficient, Integer limit, Integer offset, String sort) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
    // create path and map variables
    String path = "/aggregatedCorrelations".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "correlation", correlation));
    
    queryParams.addAll(apiClient.parameterToPairs("", "cause_id", causeId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "effect_id", effectId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "onset_delay", onsetDelay));
    
    queryParams.addAll(apiClient.parameterToPairs("", "duration_of_action", durationOfAction));
    
    queryParams.addAll(apiClient.parameterToPairs("", "number_of_pairs", numberOfPairs));
    
    queryParams.addAll(apiClient.parameterToPairs("", "value_predicting_high_outcome", valuePredictingHighOutcome));
    
    queryParams.addAll(apiClient.parameterToPairs("", "value_predicting_low_outcome", valuePredictingLowOutcome));
    
    queryParams.addAll(apiClient.parameterToPairs("", "optimal_pearson_product", optimalPearsonProduct));
    
    queryParams.addAll(apiClient.parameterToPairs("", "vote", vote));
    
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

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Store AggregatedCorrelation
   * Store AggregatedCorrelation
   * @param body AggregatedCorrelation that should be stored
   * @return InlineResponse2001
   */
  public InlineResponse2001 aggregatedCorrelationsPost (AggregatedCorrelation body) throws ApiException {
    Object postBody = body;
    byte[] postBinaryBody = null;
    
    // create path and map variables
    String path = "/aggregatedCorrelations".replaceAll("\\{format\\}","json");

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

    

    
    
    TypeRef returnType = new TypeRef<InlineResponse2001>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Get AggregatedCorrelation
   * Get AggregatedCorrelation
   * @param id id of AggregatedCorrelation
   * @return InlineResponse2001
   */
  public InlineResponse2001 aggregatedCorrelationsIdGet (Integer id) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
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

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<InlineResponse2001>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Update AggregatedCorrelation
   * Update AggregatedCorrelation
   * @param id id of AggregatedCorrelation
   * @param body AggregatedCorrelation that should be updated
   * @return InlineResponse2002
   */
  public InlineResponse2002 aggregatedCorrelationsIdPut (Integer id, AggregatedCorrelation body) throws ApiException {
    Object postBody = body;
    byte[] postBinaryBody = null;
    
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
   * Delete AggregatedCorrelation
   * Delete AggregatedCorrelation
   * @param id id of AggregatedCorrelation
   * @return InlineResponse2002
   */
  public InlineResponse2002 aggregatedCorrelationsIdDelete (Integer id) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
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
