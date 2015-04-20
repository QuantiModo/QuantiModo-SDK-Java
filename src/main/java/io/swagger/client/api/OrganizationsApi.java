package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiInvoker;

import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.UserTokenRequest;
import io.swagger.client.model.UserTokenFailedResponse;
import io.swagger.client.model.UserTokenSuccessfulResponse;

import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

public class OrganizationsApi {
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
   * Get user tokens for existing users, create new users
   * Get user tokens for existing users, create new users
   * @param organizationId Organization ID
   * @param body Provides organization token and user ID
   * @return UserTokenSuccessfulResponse
   */
  public UserTokenSuccessfulResponse v1OrganizationsOrganizationIdUsersPost (Integer organizationId, UserTokenRequest body) throws ApiException {
    Object postBody = body;
    

    // create path and map variables
    String path = "/v1/organizations/{organizationId}/users".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "organizationId" + "\\}", apiInvoker.escapeString(organizationId.toString()));

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
        return (UserTokenSuccessfulResponse) ApiInvoker.deserialize(response, "", UserTokenSuccessfulResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
