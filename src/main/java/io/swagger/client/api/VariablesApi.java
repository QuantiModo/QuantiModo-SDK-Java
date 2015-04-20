package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiInvoker;

import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.Variable;
import io.swagger.client.model.VariableCategory;
import io.swagger.client.model.VariableUserSettings;
import java.util.*;

import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

public class VariablesApi {
  String basePath = "https://localhost/api";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  
  /**
   * Get public variables
   * Get public variables
   * @return void
   */
  public void publicVariablesGet () throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/public/variables".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    
    
    String[] contentTypes = {
      
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get top 5 PUBLIC variables with the most correlations
   * Get top 5 PUBLIC variables with the most correlations containing the entered search characters. For example, search for &#39;mood&#39; as an effect. Since &#39;Overall Mood&#39; has a lot of correlations with other variables, it should be in the autocomplete list.
   * @param search Search query
   * @param effectOrCause Allows us to specify which column in the `correlations` table will be searched. Choices are effect or cause.
   * @return void
   */
  public void publicVariablesSearchSearchGet (String search, String effectOrCause) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/public/variables/search/{search}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "search" + "\\}", apiInvoker.escapeString(search.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (effectOrCause != null)
      queryParams.put("effectOrCause", ApiInvoker.parameterToString(effectOrCause));
    
    
    String[] contentTypes = {
      
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get variable categories
   * The variable categories include Activity, Causes of Illness, Cognitive Performance, Conditions, Environment, Foods, Location, Miscellaneous, Mood, Nutrition, Physical Activity, Physique, Sleep, Social Interactions, Symptoms, Treatments, Vital Signs, and Work.
   * @return void
   */
  public void variableCategoriesGet () throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/variableCategories".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    
    
    String[] contentTypes = {
      
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Change variable user setting
   * Change variable user setting
   * @param sharingData Variable user settings data
   * @return void
   */
  public void variableUserSettingsPost (List<VariableUserSettings> sharingData) throws ApiException {
    Object postBody = sharingData;
    

    // create path and map variables
    String path = "/variableUserSettings".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    
    
    String[] contentTypes = {
      
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get variables by the category name
   * Get variables by the category name
   * @param userId User id
   * @param categoryName Category name
   * @return void
   */
  public void variablesGet (Integer userId, String categoryName) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/variables".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (userId != null)
      queryParams.put("userId", ApiInvoker.parameterToString(userId));
    if (categoryName != null)
      queryParams.put("categoryName", ApiInvoker.parameterToString(categoryName));
    
    
    String[] contentTypes = {
      
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Set variable
   * Allows the client to create a new variable in the `variables` table.
   * @param variableName Original name for the variable.
   * @return void
   */
  public void variablesPost (List<Variable> variableName) throws ApiException {
    Object postBody = variableName;
    

    // create path and map variables
    String path = "/variables".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    
    
    String[] contentTypes = {
      
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get variables by search query
   * Get variables containing the search characters. Used to provide auto-complete function in variable search boxes.
   * @param search Search query
   * @param categoryName Filter variables by category name.
   * @param source Filter variables by source name.
   * @param limit Search limit
   * @param offset Search offset
   * @return void
   */
  public void variablesSearchSearchGet (String search, String categoryName, String source, Integer limit, Integer offset) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/variables/search/{search}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "search" + "\\}", apiInvoker.escapeString(search.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (categoryName != null)
      queryParams.put("categoryName", ApiInvoker.parameterToString(categoryName));
    if (source != null)
      queryParams.put("source", ApiInvoker.parameterToString(source));
    if (limit != null)
      queryParams.put("limit", ApiInvoker.parameterToString(limit));
    if (offset != null)
      queryParams.put("offset", ApiInvoker.parameterToString(offset));
    
    
    String[] contentTypes = {
      
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get info about a variable
   * Get all of the settings and information about a variable by name
   * @param variableName Variable name
   * @param categoryName categoryName` parameter allows us to filter the variables so that only ones from the specified category are returned.
   * @return void
   */
  public void variablesVariableNameGet (String variableName, String categoryName) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/variables/{variableName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "variableName" + "\\}", apiInvoker.escapeString(variableName.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (categoryName != null)
      queryParams.put("categoryName", ApiInvoker.parameterToString(categoryName));
    
    
    String[] contentTypes = {
      
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
