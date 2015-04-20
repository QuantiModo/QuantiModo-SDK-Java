package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiInvoker;

import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.Correlation;

import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

public class CorrelationsApi {
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
   * Get correlations
   * Get correlations
   * @param effect ORIGINAL variable name of the effect variable for which the user desires correlations
   * @param cause ORIGINAL variable name of the cause variable for which the user desires correlations
   * @return List<Correlation>
   */
  public List<Correlation> correlationsGet (String effect, String cause) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/correlations".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (effect != null)
      queryParams.put("effect", ApiInvoker.parameterToString(effect));
    if (cause != null)
      queryParams.put("cause", ApiInvoker.parameterToString(cause));
    
    
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
        return (List<Correlation>) ApiInvoker.deserialize(response, "array", Correlation.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get average correlations for variables containing search term
   * Returns the average correlations from all users for all public variables that contain the characters in the search query.
   * @param search Search query
   * @param effectOrCause Specifies whehter to return the effects or causes of the searched variable.
   * @return List<Correlation>
   */
  public List<Correlation> publicCorrelationsSearchSearchGet (String search, String effectOrCause) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/public/correlations/search/{search}".replaceAll("\\{format\\}","json")
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
        return (List<Correlation>) ApiInvoker.deserialize(response, "array", Correlation.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
