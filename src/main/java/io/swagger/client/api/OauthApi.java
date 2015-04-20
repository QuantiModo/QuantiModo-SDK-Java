package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiInvoker;

import io.swagger.client.model.*;

import java.util.*;


import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

public class OauthApi {
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
   * Authorize
   * Ask the user if they want to allow a client applications to submit or obtain data from their QM  account.
   * @param responseType Response type
   * @param redirectUri Redirect uri
   * @param realm Realm
   * @param clientId Client id
   * @param scope Scope
   * @param state State
   * @return void
   */
  public void oauth2AuthorizeGet (String responseType, String redirectUri, String realm, String clientId, String scope, String state) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/oauth2/authorize".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (responseType != null)
      queryParams.put("response_type", ApiInvoker.parameterToString(responseType));
    if (redirectUri != null)
      queryParams.put("redirect_uri", ApiInvoker.parameterToString(redirectUri));
    if (realm != null)
      queryParams.put("realm", ApiInvoker.parameterToString(realm));
    if (clientId != null)
      queryParams.put("client_id", ApiInvoker.parameterToString(clientId));
    if (scope != null)
      queryParams.put("scope", ApiInvoker.parameterToString(scope));
    if (state != null)
      queryParams.put("state", ApiInvoker.parameterToString(state));
    
    
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
