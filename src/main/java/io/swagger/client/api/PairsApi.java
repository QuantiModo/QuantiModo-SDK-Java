package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiInvoker;

import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.Pairs;

import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

public class PairsApi {
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
   * Get pairs
   * Pairs cause measurements with effect measurements grouped over the duration of action after the onset delay.
   * @param cause Original variable name for the explanatory or independent variable
   * @param causeSource Name of data source that the cause measurements should come from
   * @param causeUnit Abbreviated name for the unit cause measurements to be returned in
   * @param delay Delay before onset of action (in seconds) from the cause variable settings.
   * @param duration Duration of action (in seconds) from the cause variable settings.
   * @param effect Original variable name for the outcome or dependent variable
   * @param effectSource Name of data source that the effectmeasurements should come from
   * @param effectUnit Abbreviated name for the unit effect measurements to be returned in
   * @param endTime The most recent date (in epoch time) for which we should return measurements
   * @param startTime The earliest date (in epoch time) for which we should return measurements
   * @return void
   */
  public void pairsGet (String cause, String causeSource, String causeUnit, String delay, String duration, String effect, String effectSource, String effectUnit, String endTime, String startTime) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'cause' is set
    if (cause == null) {
       throw new ApiException(400, "Missing the required parameter 'cause' when calling pairsGet");
    }
    
    // verify the required parameter 'effect' is set
    if (effect == null) {
       throw new ApiException(400, "Missing the required parameter 'effect' when calling pairsGet");
    }
    

    // create path and map variables
    String path = "/pairs".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (cause != null)
      queryParams.put("cause", ApiInvoker.parameterToString(cause));
    if (causeSource != null)
      queryParams.put("causeSource", ApiInvoker.parameterToString(causeSource));
    if (causeUnit != null)
      queryParams.put("causeUnit", ApiInvoker.parameterToString(causeUnit));
    if (delay != null)
      queryParams.put("delay", ApiInvoker.parameterToString(delay));
    if (duration != null)
      queryParams.put("duration", ApiInvoker.parameterToString(duration));
    if (effect != null)
      queryParams.put("effect", ApiInvoker.parameterToString(effect));
    if (effectSource != null)
      queryParams.put("effectSource", ApiInvoker.parameterToString(effectSource));
    if (effectUnit != null)
      queryParams.put("effectUnit", ApiInvoker.parameterToString(effectUnit));
    if (endTime != null)
      queryParams.put("endTime", ApiInvoker.parameterToString(endTime));
    if (startTime != null)
      queryParams.put("startTime", ApiInvoker.parameterToString(startTime));
    
    
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
