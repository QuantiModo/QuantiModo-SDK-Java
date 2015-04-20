package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiInvoker;

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
   * Get unit categories
   * 
   * @return void
   */
  public void unitCategoriesGet () throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/unitCategories".replaceAll("\\{format\\}","json");

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
   * Get all available units
   * Get all available units
   * @param unitName Unit name
   * @param abbreviatedUnitName Unit abbreviation
   * @param categoryName Unit category
   * @return void
   */
  public void unitsGet (String unitName, String abbreviatedUnitName, String categoryName) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/units".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (unitName != null)
      queryParams.put("unitName", ApiInvoker.parameterToString(unitName));
    if (abbreviatedUnitName != null)
      queryParams.put("abbreviatedUnitName", ApiInvoker.parameterToString(abbreviatedUnitName));
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
   * Get all available units for variable
   * Get all available units for variable
   * @param variable Variable name
   * @param unitName Unit name
   * @param cabbreviatedUnitName Unit abbreviation
   * @param categoryName Unit category
   * @return void
   */
  public void unitsVariableGet (String variable, String unitName, String cabbreviatedUnitName, String categoryName) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/unitsVariable".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (variable != null)
      queryParams.put("variable", ApiInvoker.parameterToString(variable));
    if (unitName != null)
      queryParams.put("unitName", ApiInvoker.parameterToString(unitName));
    if (cabbreviatedUnitName != null)
      queryParams.put("cabbreviatedUnitName", ApiInvoker.parameterToString(cabbreviatedUnitName));
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
