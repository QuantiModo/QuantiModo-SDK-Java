package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import java.math.BigDecimal;
import io.swagger.client.model.InlineResponse20017;
import io.swagger.client.model.Correlation;
import io.swagger.client.model.InlineResponse20018;
import io.swagger.client.model.InlineResponse2002;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-09T02:16:51.363Z")
public class CorrelationApi {
  private ApiClient apiClient;

  public CorrelationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CorrelationApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Get all Correlations
   * Get all Correlations
   * @param accessToken User&#39;s OAuth2 access token
   * @param timestamp Time at which correlation was calculated
   * @param userId ID of user that owns this correlation
   * @param correlation Pearson correlation coefficient between cause and effect measurements
   * @param causeId variable ID of the predictor variable for which the user desires correlations
   * @param effectId variable ID of the outcome variable for which the user desires correlations
   * @param onsetDelay User estimated or default time after cause measurement before a perceivable effect is observed
   * @param durationOfAction Time over which the cause is expected to produce a perceivable effect following the onset delay
   * @param numberOfPairs Number of points that went into the correlation calculation
   * @param valuePredictingHighOutcome cause value that predicts an above average effect value (in default unit for predictor variable)
   * @param valuePredictingLowOutcome cause value that predicts a below average effect value (in default unit for predictor variable)
   * @param optimalPearsonProduct Optimal Pearson Product
   * @param vote Vote
   * @param statisticalSignificance A function of the effect size and sample size
   * @param causeUnit Unit of the predictor variable
   * @param causeUnitId Unit ID of the predictor variable
   * @param causeChanges Cause changes
   * @param effectChanges Effect changes
   * @param qmScore QM Score
   * @param error error
   * @param createdAt When the record was first created. Use ISO 8601 datetime format
   * @param updatedAt When the record in the database was last updated. Use ISO 8601 datetime format
   * @param reversePearsonCorrelationCoefficient Correlation when cause and effect are reversed. For any causal relationship, the forward correlation should exceed the reverse correlation
   * @param predictivePearsonCorrelationCoefficient Predictive Pearson Correlation Coefficient
   * @param limit Limit the number of results returned
   * @param offset Records from give Offset
   * @param sort Sort records by given field
   * @return InlineResponse20017
   */
  public InlineResponse20017 correlationsGet(String accessToken, Integer timestamp, Integer userId, BigDecimal correlation, Integer causeId, Integer effectId, Integer onsetDelay, Integer durationOfAction, Integer numberOfPairs, BigDecimal valuePredictingHighOutcome, BigDecimal valuePredictingLowOutcome, BigDecimal optimalPearsonProduct, BigDecimal vote, BigDecimal statisticalSignificance, String causeUnit, Integer causeUnitId, Integer causeChanges, Integer effectChanges, BigDecimal qmScore, String error, String createdAt, String updatedAt, BigDecimal reversePearsonCorrelationCoefficient, BigDecimal predictivePearsonCorrelationCoefficient, Integer limit, Integer offset, String sort) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/correlations".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));
    
    queryParams.addAll(apiClient.parameterToPairs("", "timestamp", timestamp));
    
    queryParams.addAll(apiClient.parameterToPairs("", "user_id", userId));
    
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
    
    queryParams.addAll(apiClient.parameterToPairs("", "statistical_significance", statisticalSignificance));
    
    queryParams.addAll(apiClient.parameterToPairs("", "cause_unit", causeUnit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "cause_unit_id", causeUnitId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "cause_changes", causeChanges));
    
    queryParams.addAll(apiClient.parameterToPairs("", "effect_changes", effectChanges));
    
    queryParams.addAll(apiClient.parameterToPairs("", "qm_score", qmScore));
    
    queryParams.addAll(apiClient.parameterToPairs("", "error", error));
    
    queryParams.addAll(apiClient.parameterToPairs("", "created_at", createdAt));
    
    queryParams.addAll(apiClient.parameterToPairs("", "updated_at", updatedAt));
    
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

    
    GenericType<InlineResponse20017> returnType = new GenericType<InlineResponse20017>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Store Correlation
   * Store Correlation
   * @param accessToken User&#39;s OAuth2 access token
   * @param body Correlation that should be stored
   * @return InlineResponse20018
   */
  public InlineResponse20018 correlationsPost(String accessToken, Correlation body) throws ApiException {
    Object postBody = body;
    
    // create path and map variables
    String path = "/correlations".replaceAll("\\{format\\}","json");

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

    
    GenericType<InlineResponse20018> returnType = new GenericType<InlineResponse20018>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get Correlation Details
   * Get Correlation
   * @param id id of Correlation
   * @param accessToken User&#39;s OAuth2 access token
   * @return InlineResponse20018
   */
  public InlineResponse20018 correlationsIdGet(Integer id, String accessToken) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling correlationsIdGet");
     }
     
    // create path and map variables
    String path = "/correlations/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<InlineResponse20018> returnType = new GenericType<InlineResponse20018>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Update Correlation
   * Update Correlation
   * @param id id of Correlation
   * @param accessToken User&#39;s OAuth2 access token
   * @param body Correlation that should be updated
   * @return InlineResponse2002
   */
  public InlineResponse2002 correlationsIdPut(Integer id, String accessToken, Correlation body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling correlationsIdPut");
     }
     
    // create path and map variables
    String path = "/correlations/{id}".replaceAll("\\{format\\}","json")
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
   * Delete Correlation
   * Delete Correlation
   * @param id id of Correlation
   * @param accessToken User&#39;s OAuth2 access token
   * @return InlineResponse2002
   */
  public InlineResponse2002 correlationsIdDelete(Integer id, String accessToken) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling correlationsIdDelete");
     }
     
    // create path and map variables
    String path = "/correlations/{id}".replaceAll("\\{format\\}","json")
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
