package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.model.*;
import io.swagger.client.Pair;

import io.swagger.client.model.Variable;
import io.swagger.client.model.UserVariables;
import io.swagger.client.model.VariableCategory;
import io.swagger.client.model.VariablesNew;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-24T22:10:22.059Z")
public class VariablesApi {
  private ApiClient apiClient;

  public VariablesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public VariablesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get public variables
   * This endpoint retrieves an array of all public variables. Public variables are things like foods, medications, symptoms, conditions, and anything not unique to a particular user. For instance, a telephone number or name would not be a public variable.
   * @return Variable
   * @throws ApiException if fails to make API call
   */
  public Variable v1PublicVariablesGet() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/public/variables".replaceAll("\\{format\\}","json");

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

    GenericType<Variable> localVarReturnType = new GenericType<Variable>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get top 5 PUBLIC variables with the most correlations
   * Get top 5 PUBLIC variables with the most correlations containing the entered search characters. For example, search for &#39;mood&#39; as an effect. Since &#39;Overall Mood&#39; has a lot of correlations with other variables, it should be in the autocomplete list.&lt;br&gt;Supported filter parameters:&lt;br&gt;&lt;ul&gt;&lt;li&gt;&lt;b&gt;category&lt;/b&gt; - Category of Variable&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;
   * @param search Search query can be some fraction of a variable name. (required)
   * @param accessToken User&#39;s OAuth2 access token (optional)
   * @param categoryName Filter variables by category name. The variable categories include Activity, Causes of Illness, Cognitive Performance, Conditions, Environment, Foods, Location, Miscellaneous, Mood, Nutrition, Physical Activity, Physique, Sleep, Social Interactions, Symptoms, Treatments, Vital Signs, and Work. (optional)
   * @param source Specify a data source name to only return variables from a specific data source. (optional)
   * @param effectOrCause Indicate if you only want variables that have user correlations.  Possible values are effect and cause. (optional)
   * @param publicEffectOrCause Indicate if you only want variables that have aggregated correlations.  Possible values are effect and cause. (optional)
   * @param limit The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. (optional)
   * @param offset Now suppose you wanted to show results 11-20. You&#39;d set the offset to 10 and the limit to 10. (optional)
   * @param sort Sort by given field. If the field is prefixed with &#x60;-, it will sort in descending order. (optional)
   * @return Variable
   * @throws ApiException if fails to make API call
   */
  public Variable v1PublicVariablesSearchSearchGet(String search, String accessToken, String categoryName, String source, String effectOrCause, String publicEffectOrCause, Integer limit, Integer offset, Integer sort) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'search' is set
    if (search == null) {
      throw new ApiException(400, "Missing the required parameter 'search' when calling v1PublicVariablesSearchSearchGet");
    }
    
    // create path and map variables
    String localVarPath = "/v1/public/variables/search/{search}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "search" + "\\}", apiClient.escapeString(search.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "categoryName", categoryName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "source", source));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "effectOrCause", effectOrCause));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "publicEffectOrCause", publicEffectOrCause));
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

    GenericType<Variable> localVarReturnType = new GenericType<Variable>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update User Settings for a Variable
   * Users can change the parameters used in analysis of that variable such as the expected duration of action for a variable to have an effect, the estimated delay before the onset of action. In order to filter out erroneous data, they are able to set the maximum and minimum reasonable daily values for a variable.
   * @param userVariables Variable user settings data (required)
   * @throws ApiException if fails to make API call
   */
  public void v1UserVariablesPost(UserVariables userVariables) throws ApiException {
    Object localVarPostBody = userVariables;
    
    // verify the required parameter 'userVariables' is set
    if (userVariables == null) {
      throw new ApiException(400, "Missing the required parameter 'userVariables' when calling v1UserVariablesPost");
    }
    
    // create path and map variables
    String localVarPath = "/v1/userVariables".replaceAll("\\{format\\}","json");

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


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Variable categories
   * The variable categories include Activity, Causes of Illness, Cognitive Performance, Conditions, Environment, Foods, Location, Miscellaneous, Mood, Nutrition, Physical Activity, Physique, Sleep, Social Interactions, Symptoms, Treatments, Vital Signs, and Work.
   * @return List<VariableCategory>
   * @throws ApiException if fails to make API call
   */
  public List<VariableCategory> v1VariableCategoriesGet() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/variableCategories".replaceAll("\\{format\\}","json");

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

    GenericType<List<VariableCategory>> localVarReturnType = new GenericType<List<VariableCategory>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get variables by the category name
   * Get variables by the category name. &lt;br&gt;Supported filter parameters:&lt;br&gt;&lt;ul&gt;&lt;li&gt;&lt;b&gt;name&lt;/b&gt; - Original name of the variable (supports exact name match only)&lt;/li&gt;&lt;li&gt;&lt;b&gt;lastUpdated&lt;/b&gt; - Filter by the last time any of the properties of the variable were changed. Uses UTC format \&quot;YYYY-MM-DDThh:mm:ss\&quot;&lt;/li&gt;&lt;li&gt;&lt;b&gt;source&lt;/b&gt; - The name of the data source that created the variable (supports exact name match only). So if you have a client application and you only want variables that were last updated by your app, you can include the name of your app here&lt;/li&gt;&lt;li&gt;&lt;b&gt;latestMeasurementTime&lt;/b&gt; - Filter variables based on the last time a measurement for them was created or updated in the UTC format \&quot;YYYY-MM-DDThh:mm:ss\&quot;&lt;/li&gt;&lt;li&gt;&lt;b&gt;numberOfMeasurements&lt;/b&gt; - Filter variables by the total number of measurements that they have. This could be used of you want to filter or sort by popularity.&lt;/li&gt;&lt;li&gt;&lt;b&gt;lastSource&lt;/b&gt; - Limit variables to those which measurements were last submitted by a specific source. So if you have a client application and you only want variables that were last updated by your app, you can include the name of your app here. (supports exact name match only)&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;
   * @param accessToken User&#39;s OAuth2 access token (optional)
   * @param id Common variable id (optional)
   * @param userId User id (optional)
   * @param category Filter data by category (optional)
   * @param name Original name of the variable (supports exact name match only) (optional)
   * @param lastUpdated Filter by the last time any of the properties of the variable were changed. Uses UTC format \&quot;YYYY-MM-DDThh:mm:ss\&quot; (optional)
   * @param source The name of the data source that created the variable (supports exact name match only). So if you have a client application and you only want variables that were last updated by your app, you can include the name of your app here (optional)
   * @param latestMeasurementTime Filter variables based on the last time a measurement for them was created or updated in the UTC format \&quot;YYYY-MM-DDThh:mm:ss\&quot; (optional)
   * @param numberOfMeasurements Filter variables by the total number of measurements that they have. This could be used of you want to filter or sort by popularity. (optional)
   * @param lastSource Limit variables to those which measurements were last submitted by a specific source. So if you have a client application and you only want variables that were last updated by your app, you can include the name of your app here. (supports exact name match only) (optional)
   * @param limit The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. (optional)
   * @param offset Now suppose you wanted to show results 11-20. You&#39;d set the offset to 10 and the limit to 10. (optional)
   * @param sort Sort by given field. If the field is prefixed with &#x60;-, it will sort in descending order. (optional)
   * @return Variable
   * @throws ApiException if fails to make API call
   */
  public Variable v1VariablesGet(String accessToken, Integer id, Integer userId, String category, String name, String lastUpdated, String source, String latestMeasurementTime, String numberOfMeasurements, String lastSource, Integer limit, Integer offset, Integer sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/variables".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "userId", userId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "category", category));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lastUpdated", lastUpdated));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "source", source));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "latestMeasurementTime", latestMeasurementTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "numberOfMeasurements", numberOfMeasurements));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lastSource", lastSource));
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

    String[] localVarAuthNames = new String[] { "oauth2", "basicAuth" };

    GenericType<Variable> localVarReturnType = new GenericType<Variable>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create Variables
   * Allows the client to create a new variable in the &#x60;variables&#x60; table.
   * @param body Original name for the variable. (required)
   * @param accessToken User&#39;s OAuth2 access token (optional)
   * @throws ApiException if fails to make API call
   */
  public void v1VariablesPost(VariablesNew body, String accessToken) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling v1VariablesPost");
    }
    
    // create path and map variables
    String localVarPath = "/v1/variables".replaceAll("\\{format\\}","json");

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
   * Get variables by search query
   * Get variables containing the search characters for which the currently logged in user has measurements. Used to provide auto-complete function in variable search boxes.
   * @param search Search query which may be an entire variable name or a fragment of one. (required)
   * @param accessToken User&#39;s OAuth2 access token (optional)
   * @param categoryName Filter variables by category name. The variable categories include Activity, Causes of Illness, Cognitive Performance, Conditions, Environment, Foods, Location, Miscellaneous, Mood, Nutrition, Physical Activity, Physique, Sleep, Social Interactions, Symptoms, Treatments, Vital Signs, and Work. (optional)
   * @param includePublic Set to true if you would like to include public variables when no user variables are found. (optional)
   * @param manualTracking Set to true if you would like to exlude variables like apps and website names. (optional)
   * @param source Specify a data source name to only return variables from a specific data source. (optional)
   * @param effectOrCause Indicate if you only want variables that have user correlations.  Possible values are effect and cause. (optional)
   * @param publicEffectOrCause Indicate if you only want variables that have aggregated correlations.  Possible values are effect and cause. (optional)
   * @param limit The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. (optional)
   * @param offset Now suppose you wanted to show results 11-20. You&#39;d set the offset to 10 and the limit to 10. (optional)
   * @return List<Variable>
   * @throws ApiException if fails to make API call
   */
  public List<Variable> v1VariablesSearchSearchGet(String search, String accessToken, String categoryName, Boolean includePublic, Boolean manualTracking, String source, String effectOrCause, String publicEffectOrCause, Integer limit, Integer offset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'search' is set
    if (search == null) {
      throw new ApiException(400, "Missing the required parameter 'search' when calling v1VariablesSearchSearchGet");
    }
    
    // create path and map variables
    String localVarPath = "/v1/variables/search/{search}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "search" + "\\}", apiClient.escapeString(search.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "categoryName", categoryName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includePublic", includePublic));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "manualTracking", manualTracking));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "source", source));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "effectOrCause", effectOrCause));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "publicEffectOrCause", publicEffectOrCause));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<List<Variable>> localVarReturnType = new GenericType<List<Variable>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get info about a variable
   * Get all of the settings and information about a variable by its name. If the logged in user has modified the settings for the variable, these will be provided instead of the default settings for that variable.
   * @param variableName Variable name (required)
   * @param accessToken User&#39;s OAuth2 access token (optional)
   * @return Variable
   * @throws ApiException if fails to make API call
   */
  public Variable v1VariablesVariableNameGet(String variableName, String accessToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'variableName' is set
    if (variableName == null) {
      throw new ApiException(400, "Missing the required parameter 'variableName' when calling v1VariablesVariableNameGet");
    }
    
    // create path and map variables
    String localVarPath = "/v1/variables/{variableName}".replaceAll("\\{format\\}","json")
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

    GenericType<Variable> localVarReturnType = new GenericType<Variable>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
