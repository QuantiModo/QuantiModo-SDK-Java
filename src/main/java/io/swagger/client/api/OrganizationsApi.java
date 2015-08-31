package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.TypeRef;

import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.UserTokenRequest;
import io.swagger.client.model.UserTokenFailedResponse;
import io.swagger.client.model.UserTokenSuccessfulResponse;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-08-31T05:51:00.313Z")
public class OrganizationsApi {
  private ApiClient apiClient;

  public OrganizationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OrganizationsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
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
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'organizationId' is set
     if (organizationId == null) {
        throw new ApiException(400, "Missing the required parameter 'organizationId' when calling v1OrganizationsOrganizationIdUsersPost");
     }
     
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling v1OrganizationsOrganizationIdUsersPost");
     }
     
    // create path and map variables
    String path = "/v1/organizations/{organizationId}/users".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };
    
    

    

    
    
    TypeRef returnType = new TypeRef<UserTokenSuccessfulResponse>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    

    
    
    
    
    
    
    
    
  }
  
}
