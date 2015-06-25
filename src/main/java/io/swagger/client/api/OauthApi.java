package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;

import io.swagger.client.model.*;

import java.util.*;


import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

public class OauthApi {
  private ApiClient apiClient;

  public OauthApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OauthApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Access Token
   * Client provides authorization token obtained from /api/oauth2/authorize to this endpoint and receives an access token. Access token can then
   * @param responseType Response type
   * @param redirectUri Redirect uri
   * @param realm Realm
   * @param clientId Client id
   * @param scope Scope
   * @param state State
   * @return void
   */
  public void oauth2AccesstokenGet (String responseType, String redirectUri, String realm, String clientId, String scope, String state) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'responseType' is set
    if (responseType == null) {
       throw new ApiException(400, "Missing the required parameter 'responseType' when calling oauth2AccesstokenGet");
    }
    
    // verify the required parameter 'redirectUri' is set
    if (redirectUri == null) {
       throw new ApiException(400, "Missing the required parameter 'redirectUri' when calling oauth2AccesstokenGet");
    }
    
    // verify the required parameter 'realm' is set
    if (realm == null) {
       throw new ApiException(400, "Missing the required parameter 'realm' when calling oauth2AccesstokenGet");
    }
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
       throw new ApiException(400, "Missing the required parameter 'clientId' when calling oauth2AccesstokenGet");
    }
    
    // verify the required parameter 'scope' is set
    if (scope == null) {
       throw new ApiException(400, "Missing the required parameter 'scope' when calling oauth2AccesstokenGet");
    }
    
    // verify the required parameter 'state' is set
    if (state == null) {
       throw new ApiException(400, "Missing the required parameter 'state' when calling oauth2AccesstokenGet");
    }
    

    // create path and map variables
    String path = "/oauth2/accesstoken".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (responseType != null)
      queryParams.put("response_type", apiClient.parameterToString(responseType));
    if (redirectUri != null)
      queryParams.put("redirect_uri", apiClient.parameterToString(redirectUri));
    if (realm != null)
      queryParams.put("realm", apiClient.parameterToString(realm));
    if (clientId != null)
      queryParams.put("client_id", apiClient.parameterToString(clientId));
    if (scope != null)
      queryParams.put("scope", apiClient.parameterToString(scope));
    if (state != null)
      queryParams.put("state", apiClient.parameterToString(state));
    

    

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
   * Authorize
   * Ask the user if they want to allow a client applications to submit or obtain data from their QM  account.
   * @param clientId This is the unique ID that QuantiModo uses to identify your application. Obtain a client id by emailing info@quantimo.do.
   * @param realm Name of the realm representing the users of your distributed applications and services. A \&quot;realm\&quot; attribute MAY be included to indicate the scope of protection.
   * @param redirectUri The redirect URI is the URL within your client application that will receive the OAuth2 credentials.
   * @param responseType If the value is code, launches a Basic flow, requiring a POST to the token endpoint to obtain the tokens. If the value is token id_token or id_token token, launches an Implicit flow, requiring the use of Javascript at the redirect URI to retrieve tokens from the URI #fragment.
   * @param scope Scopes include basic, readmeasurements, and writemeasurements. The \&quot;basic\&quot; scope allows you to read user info (displayname, email, etc). The \&quot;readmeasurements\&quot; scope allows one to read a user&#39;s data. The \&quot;writemeasurements\&quot; scope allows you to write user data. Separate multiple scopes by a space.
   * @param state An opaque string that is round-tripped in the protocol; that is to say, it is returned as a URI parameter in the Basic flow, and in the URI
   * @return void
   */
  public void oauth2AuthorizeGet (String clientId, String realm, String redirectUri, String responseType, String scope, String state) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
       throw new ApiException(400, "Missing the required parameter 'clientId' when calling oauth2AuthorizeGet");
    }
    
    // verify the required parameter 'realm' is set
    if (realm == null) {
       throw new ApiException(400, "Missing the required parameter 'realm' when calling oauth2AuthorizeGet");
    }
    
    // verify the required parameter 'redirectUri' is set
    if (redirectUri == null) {
       throw new ApiException(400, "Missing the required parameter 'redirectUri' when calling oauth2AuthorizeGet");
    }
    
    // verify the required parameter 'responseType' is set
    if (responseType == null) {
       throw new ApiException(400, "Missing the required parameter 'responseType' when calling oauth2AuthorizeGet");
    }
    
    // verify the required parameter 'scope' is set
    if (scope == null) {
       throw new ApiException(400, "Missing the required parameter 'scope' when calling oauth2AuthorizeGet");
    }
    
    // verify the required parameter 'state' is set
    if (state == null) {
       throw new ApiException(400, "Missing the required parameter 'state' when calling oauth2AuthorizeGet");
    }
    

    // create path and map variables
    String path = "/oauth2/authorize".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (clientId != null)
      queryParams.put("client_id", apiClient.parameterToString(clientId));
    if (realm != null)
      queryParams.put("realm", apiClient.parameterToString(realm));
    if (redirectUri != null)
      queryParams.put("redirect_uri", apiClient.parameterToString(redirectUri));
    if (responseType != null)
      queryParams.put("response_type", apiClient.parameterToString(responseType));
    if (scope != null)
      queryParams.put("scope", apiClient.parameterToString(scope));
    if (state != null)
      queryParams.put("state", apiClient.parameterToString(state));
    

    

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
