package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.model.*;
import io.swagger.client.Pair;

import io.swagger.client.model.Correlation;
import io.swagger.client.model.JsonErrorResponse;
import io.swagger.client.model.PostCorrelation;
import io.swagger.client.model.CommonResponse;
import io.swagger.client.model.VoteDelete;
import io.swagger.client.model.PostVote;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-24T22:10:22.059Z")
public class CorrelationsApi {
  private ApiClient apiClient;

  public CorrelationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CorrelationsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get aggregated correlations
   * Get correlations based on the anonymized aggregate data from all QuantiModo users.
   * @param accessToken User&#39;s OAuth2 access token (optional)
   * @param effect ORIGINAL variable name of the effect variable for which the user desires correlations (optional)
   * @param cause ORIGINAL variable name of the cause variable for which the user desires correlations (optional)
   * @param correlationCoefficient Pearson correlation coefficient between cause and effect after lagging by onset delay and grouping by duration of action (optional)
   * @param onsetDelay The number of seconds which pass following a cause measurement before an effect would likely be observed. (optional)
   * @param durationOfAction The time in seconds over which the cause would be expected to exert a measurable effect. We have selected a default value for each variable. This default value may be replaced by a user specified by adjusting their variable user settings. (optional)
   * @param lastUpdated The time that this measurement was last updated in the UTC format \&quot;YYYY-MM-DDThh:mm:ss\&quot; (optional)
   * @param limit The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. (optional)
   * @param offset Now suppose you wanted to show results 11-20. You&#39;d set the offset to 10 and the limit to 10. (optional)
   * @param sort Sort by given field. If the field is prefixed with &#x60;-, it will sort in descending order. (optional)
   * @return List<Correlation>
   * @throws ApiException if fails to make API call
   */
  public List<Correlation> v1AggregatedCorrelationsGet(String accessToken, String effect, String cause, String correlationCoefficient, String onsetDelay, String durationOfAction, String lastUpdated, Integer limit, Integer offset, Integer sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/aggregatedCorrelations".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "effect", effect));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cause", cause));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "correlationCoefficient", correlationCoefficient));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "onsetDelay", onsetDelay));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "durationOfAction", durationOfAction));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lastUpdated", lastUpdated));
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

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<List<Correlation>> localVarReturnType = new GenericType<List<Correlation>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Store or Update a Correlation
   * Add correlation
   * @param body Provides correlation data (required)
   * @param accessToken User&#39;s OAuth2 access token (optional)
   * @throws ApiException if fails to make API call
   */
  public void v1AggregatedCorrelationsPost(PostCorrelation body, String accessToken) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling v1AggregatedCorrelationsPost");
    }
    
    // create path and map variables
    String localVarPath = "/v1/aggregatedCorrelations".replaceAll("\\{format\\}","json");

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


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get correlations
   * Get correlations.&lt;br&gt;Supported filter parameters:&lt;br&gt;&lt;ul&gt;&lt;li&gt;&lt;b&gt;correlationCoefficient&lt;/b&gt; - Pearson correlation coefficient between cause and effect after lagging by onset delay and grouping by duration of action&lt;/li&gt;&lt;li&gt;&lt;b&gt;onsetDelay&lt;/b&gt; - The number of seconds which pass following a cause measurement before an effect would likely be observed.&lt;/li&gt;&lt;li&gt;&lt;b&gt;durationOfAction&lt;/b&gt; - The time in seconds over which the cause would be expected to exert a measurable effect. We have selected a default value for each variable. This default value may be replaced by a user specified by adjusting their variable user settings.&lt;/li&gt;&lt;li&gt;&lt;b&gt;lastUpdated&lt;/b&gt; - The time that this measurement was last updated in the UTC format \&quot;YYYY-MM-DDThh:mm:ss\&quot;&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;
   * @param accessToken User&#39;s OAuth2 access token (optional)
   * @param effect ORIGINAL variable name of the effect variable for which the user desires correlations (optional)
   * @param cause ORIGINAL variable name of the cause variable for which the user desires correlations (optional)
   * @param correlationCoefficient Pearson correlation coefficient between cause and effect after lagging by onset delay and grouping by duration of action (optional)
   * @param onsetDelay The number of seconds which pass following a cause measurement before an effect would likely be observed. (optional)
   * @param durationOfAction The time in seconds over which the cause would be expected to exert a measurable effect. We have selected a default value for each variable. This default value may be replaced by a user specified by adjusting their variable user settings. (optional)
   * @param lastUpdated The time that this measurement was last updated in the UTC format \&quot;YYYY-MM-DDThh:mm:ss\&quot; (optional)
   * @param limit The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. (optional)
   * @param offset Now suppose you wanted to show results 11-20. You&#39;d set the offset to 10 and the limit to 10. (optional)
   * @param sort Sort by given field. If the field is prefixed with &#x60;-, it will sort in descending order. (optional)
   * @return List<Correlation>
   * @throws ApiException if fails to make API call
   */
  public List<Correlation> v1CorrelationsGet(String accessToken, String effect, String cause, String correlationCoefficient, String onsetDelay, String durationOfAction, String lastUpdated, Integer limit, Integer offset, Integer sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/correlations".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "effect", effect));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cause", cause));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "correlationCoefficient", correlationCoefficient));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "onsetDelay", onsetDelay));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "durationOfAction", durationOfAction));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lastUpdated", lastUpdated));
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

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<List<Correlation>> localVarReturnType = new GenericType<List<Correlation>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Search user correlations for a given cause
   * Returns average of all correlations and votes for all user cause variables for a given cause. If parameter \&quot;include_public\&quot; is used, it also returns public correlations. User correlation overwrites or supersedes public correlation.
   * @param organizationId Organization ID (required)
   * @param userId User id (required)
   * @param variableName Effect variable name (required)
   * @param organizationToken Organization access token (required)
   * @param accessToken User&#39;s OAuth2 access token (optional)
   * @param includePublic Include public correlations, Can be \&quot;1\&quot; or empty. (optional)
   * @return List<Correlation>
   * @throws ApiException if fails to make API call
   */
  public List<Correlation> v1OrganizationsOrganizationIdUsersUserIdVariablesVariableNameCausesGet(Integer organizationId, Integer userId, String variableName, String organizationToken, String accessToken, String includePublic) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling v1OrganizationsOrganizationIdUsersUserIdVariablesVariableNameCausesGet");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling v1OrganizationsOrganizationIdUsersUserIdVariablesVariableNameCausesGet");
    }
    
    // verify the required parameter 'variableName' is set
    if (variableName == null) {
      throw new ApiException(400, "Missing the required parameter 'variableName' when calling v1OrganizationsOrganizationIdUsersUserIdVariablesVariableNameCausesGet");
    }
    
    // verify the required parameter 'organizationToken' is set
    if (organizationToken == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationToken' when calling v1OrganizationsOrganizationIdUsersUserIdVariablesVariableNameCausesGet");
    }
    
    // create path and map variables
    String localVarPath = "/v1/organizations/{organizationId}/users/{userId}/variables/{variableName}/causes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "variableName" + "\\}", apiClient.escapeString(variableName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "organization_token", organizationToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includePublic", includePublic));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<List<Correlation>> localVarReturnType = new GenericType<List<Correlation>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Search user correlations for a given cause
   * Returns average of all correlations and votes for all user cause variables for a given effect. If parameter \&quot;include_public\&quot; is used, it also returns public correlations. User correlation overwrites or supersedes public correlation.
   * @param organizationId Organization ID (required)
   * @param userId User id (required)
   * @param variableName Cause variable name (required)
   * @param organizationToken Organization access token (required)
   * @param accessToken User&#39;s OAuth2 access token (optional)
   * @param includePublic Include public correlations, Can be \&quot;1\&quot; or empty. (optional)
   * @return List<CommonResponse>
   * @throws ApiException if fails to make API call
   */
  public List<CommonResponse> v1OrganizationsOrganizationIdUsersUserIdVariablesVariableNameEffectsGet(Integer organizationId, Integer userId, String variableName, String organizationToken, String accessToken, String includePublic) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling v1OrganizationsOrganizationIdUsersUserIdVariablesVariableNameEffectsGet");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling v1OrganizationsOrganizationIdUsersUserIdVariablesVariableNameEffectsGet");
    }
    
    // verify the required parameter 'variableName' is set
    if (variableName == null) {
      throw new ApiException(400, "Missing the required parameter 'variableName' when calling v1OrganizationsOrganizationIdUsersUserIdVariablesVariableNameEffectsGet");
    }
    
    // verify the required parameter 'organizationToken' is set
    if (organizationToken == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationToken' when calling v1OrganizationsOrganizationIdUsersUserIdVariablesVariableNameEffectsGet");
    }
    
    // create path and map variables
    String localVarPath = "/v1/organizations/{organizationId}/users/{userId}/variables/{variableName}/effects".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "variableName" + "\\}", apiClient.escapeString(variableName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "organization_token", organizationToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_public", includePublic));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<List<CommonResponse>> localVarReturnType = new GenericType<List<CommonResponse>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get average correlations for variables containing search term
   * Returns the average correlations from all users for all public variables that contain the characters in the search query. Returns average of all users public variable correlations with a specified cause or effect.
   * @param search Name of the variable that you want to know the causes or effects of. (required)
   * @param effectOrCause Setting this to effect indicates that the searched variable is the effect and that the causes of this variable should be returned.  cause indicates that the searched variable is the cause and the effects should be returned. (required)
   * @param accessToken User&#39;s OAuth2 access token (optional)
   * @return List<Correlation>
   * @throws ApiException if fails to make API call
   */
  public List<Correlation> v1PublicCorrelationsSearchSearchGet(String search, String effectOrCause, String accessToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'search' is set
    if (search == null) {
      throw new ApiException(400, "Missing the required parameter 'search' when calling v1PublicCorrelationsSearchSearchGet");
    }
    
    // verify the required parameter 'effectOrCause' is set
    if (effectOrCause == null) {
      throw new ApiException(400, "Missing the required parameter 'effectOrCause' when calling v1PublicCorrelationsSearchSearchGet");
    }
    
    // create path and map variables
    String localVarPath = "/v1/public/correlations/search/{search}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "search" + "\\}", apiClient.escapeString(search.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "effectOrCause", effectOrCause));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<List<Correlation>> localVarReturnType = new GenericType<List<Correlation>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Search user correlations for a given effect
   * Returns average of all correlations and votes for all user cause variables for a given effect
   * @param variableName Effect variable name (required)
   * @return List<Correlation>
   * @throws ApiException if fails to make API call
   */
  public List<Correlation> v1VariablesVariableNameCausesGet(String variableName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'variableName' is set
    if (variableName == null) {
      throw new ApiException(400, "Missing the required parameter 'variableName' when calling v1VariablesVariableNameCausesGet");
    }
    
    // create path and map variables
    String localVarPath = "/v1/variables/{variableName}/causes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "variableName" + "\\}", apiClient.escapeString(variableName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<List<Correlation>> localVarReturnType = new GenericType<List<Correlation>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Search user correlations for a given cause
   * Returns average of all correlations and votes for all user effect variables for a given cause
   * @param variableName Cause variable name (required)
   * @param accessToken User&#39;s OAuth2 access token (optional)
   * @return List<Correlation>
   * @throws ApiException if fails to make API call
   */
  public List<Correlation> v1VariablesVariableNameEffectsGet(String variableName, String accessToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'variableName' is set
    if (variableName == null) {
      throw new ApiException(400, "Missing the required parameter 'variableName' when calling v1VariablesVariableNameEffectsGet");
    }
    
    // create path and map variables
    String localVarPath = "/v1/variables/{variableName}/effects".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "variableName" + "\\}", apiClient.escapeString(variableName.toString()));

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

    GenericType<List<Correlation>> localVarReturnType = new GenericType<List<Correlation>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Search public correlations for a given effect
   * Returns average of all correlations and votes for all public cause variables for a given effect
   * @param variableName Effect variable name (required)
   * @param accessToken User&#39;s OAuth2 access token (optional)
   * @return List<Correlation>
   * @throws ApiException if fails to make API call
   */
  public List<Correlation> v1VariablesVariableNamePublicCausesGet(String variableName, String accessToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'variableName' is set
    if (variableName == null) {
      throw new ApiException(400, "Missing the required parameter 'variableName' when calling v1VariablesVariableNamePublicCausesGet");
    }
    
    // create path and map variables
    String localVarPath = "/v1/variables/{variableName}/public/causes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "variableName" + "\\}", apiClient.escapeString(variableName.toString()));

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

    GenericType<List<Correlation>> localVarReturnType = new GenericType<List<Correlation>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Search public correlations for a given cause
   * Returns average of all correlations and votes for all public cause variables for a given cause
   * @param variableName Cause variable name (required)
   * @param accessToken User&#39;s OAuth2 access token (optional)
   * @return List<Correlation>
   * @throws ApiException if fails to make API call
   */
  public List<Correlation> v1VariablesVariableNamePublicEffectsGet(String variableName, String accessToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'variableName' is set
    if (variableName == null) {
      throw new ApiException(400, "Missing the required parameter 'variableName' when calling v1VariablesVariableNamePublicEffectsGet");
    }
    
    // create path and map variables
    String localVarPath = "/v1/variables/{variableName}/public/effects".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "variableName" + "\\}", apiClient.escapeString(variableName.toString()));

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

    GenericType<List<Correlation>> localVarReturnType = new GenericType<List<Correlation>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete vote
   * Delete previously posted vote
   * @param body The cause and effect variable names for the predictor vote to be deleted. (required)
   * @param accessToken User&#39;s OAuth2 access token (optional)
   * @return CommonResponse
   * @throws ApiException if fails to make API call
   */
  public CommonResponse v1VotesDeletePost(VoteDelete body, String accessToken) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling v1VotesDeletePost");
    }
    
    // create path and map variables
    String localVarPath = "/v1/votes/delete".replaceAll("\\{format\\}","json");

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
   * Post or update vote
   * This is to enable users to indicate their opinion on the plausibility of a causal relationship between a treatment and outcome. QuantiModo incorporates crowd-sourced plausibility estimations into their algorithm. This is done allowing user to indicate their view of the plausibility of each relationship with thumbs up/down buttons placed next to each prediction.
   * @param body Contains the cause variable, effect variable, and vote value. (required)
   * @param accessToken User&#39;s OAuth2 access token (optional)
   * @return CommonResponse
   * @throws ApiException if fails to make API call
   */
  public CommonResponse v1VotesPost(PostVote body, String accessToken) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling v1VotesPost");
    }
    
    // create path and map variables
    String localVarPath = "/v1/votes".replaceAll("\\{format\\}","json");

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
}
