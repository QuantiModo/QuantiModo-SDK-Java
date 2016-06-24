package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.model.*;
import io.swagger.client.Pair;

import io.swagger.client.model.UnitCategory;
import io.swagger.client.model.Unit;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-24T22:10:22.059Z")
public class UnitsApi {
  private ApiClient apiClient;

  public UnitsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UnitsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get unit categories
   * Get a list of the categories of measurement units such as &#39;Distance&#39;, &#39;Duration&#39;, &#39;Energy&#39;, &#39;Frequency&#39;, &#39;Miscellany&#39;, &#39;Pressure&#39;, &#39;Proportion&#39;, &#39;Rating&#39;, &#39;Temperature&#39;, &#39;Volume&#39;, and &#39;Weight&#39;.
   * @return UnitCategory
   * @throws ApiException if fails to make API call
   */
  public UnitCategory v1UnitCategoriesGet() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/unitCategories".replaceAll("\\{format\\}","json");

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

    GenericType<UnitCategory> localVarReturnType = new GenericType<UnitCategory>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get all available units
   * Get all available units
   * @param accessToken User&#39;s OAuth2 access token (optional)
   * @param id Unit id (optional)
   * @param unitName Unit name (optional)
   * @param abbreviatedUnitName Restrict the results to a specific unit by providing the unit abbreviation. (optional)
   * @param categoryName Restrict the results to a specific unit category by providing the unit category name. (optional)
   * @return List<Unit>
   * @throws ApiException if fails to make API call
   */
  public List<Unit> v1UnitsGet(String accessToken, Integer id, String unitName, String abbreviatedUnitName, String categoryName) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/units".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "unitName", unitName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "abbreviatedUnitName", abbreviatedUnitName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "categoryName", categoryName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<List<Unit>> localVarReturnType = new GenericType<List<Unit>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Units for Variable
   * Get a list of all possible units to use for a given variable
   * @param accessToken User&#39;s OAuth2 access token (optional)
   * @param unitName Name of Unit you want to retrieve (optional)
   * @param abbreviatedUnitName Abbreviated Unit Name of the unit you want (optional)
   * @param categoryName Name of the category you want units for (optional)
   * @param variable Name of the variable you want units for (optional)
   * @return List<Unit>
   * @throws ApiException if fails to make API call
   */
  public List<Unit> v1UnitsVariableGet(String accessToken, String unitName, String abbreviatedUnitName, String categoryName, String variable) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/unitsVariable".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "unitName", unitName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "abbreviatedUnitName", abbreviatedUnitName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "categoryName", categoryName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "variable", variable));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<List<Unit>> localVarReturnType = new GenericType<List<Unit>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
