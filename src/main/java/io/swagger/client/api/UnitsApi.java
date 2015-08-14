package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.UnitCategory;
import io.swagger.client.model.Unit;

import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

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
   */
  public UnitCategory unitCategoriesGet () throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/unitCategories".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String[] authNames = new String[] { "oauth2" };
      String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){
        return (UnitCategory) apiClient.deserialize(response, "", UnitCategory.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get all available units
   * Get all available units
   * @param unitName Unit name
   * @param abbreviatedUnitName Restrict the results to a specific unit by providing the unit abbreviation.
   * @param categoryName Restrict the results to a specific unit category by providing the unit category name.
   * @return List<Unit>
   */
  public List<Unit> unitsGet (String unitName, String abbreviatedUnitName, String categoryName) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/units".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "unitName", unitName));
    
    queryParams.addAll(apiClient.parameterToPairs("", "abbreviatedUnitName", abbreviatedUnitName));
    
    queryParams.addAll(apiClient.parameterToPairs("", "categoryName", categoryName));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String[] authNames = new String[] { "oauth2" };
      String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){
        return (List<Unit>) apiClient.deserialize(response, "array", Unit.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Units for Variable
   * Get a list of all possible units to use for a given variable
   * @param unitName Name of Unit you want to retrieve
   * @param abbreviatedUnitName Abbreviated Unit Name of the unit you want
   * @param categoryName Name of the category you want units for
   * @param variable Name of the variable you want units for
   * @return List<Unit>
   */
  public List<Unit> unitsVariableGet (String unitName, String abbreviatedUnitName, String categoryName, String variable) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/unitsVariable".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "unitName", unitName));
    
    queryParams.addAll(apiClient.parameterToPairs("", "abbreviatedUnitName", abbreviatedUnitName));
    
    queryParams.addAll(apiClient.parameterToPairs("", "categoryName", categoryName));
    
    queryParams.addAll(apiClient.parameterToPairs("", "variable", variable));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String[] authNames = new String[] { "oauth2" };
      String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){
        return (List<Unit>) apiClient.deserialize(response, "array", Unit.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
