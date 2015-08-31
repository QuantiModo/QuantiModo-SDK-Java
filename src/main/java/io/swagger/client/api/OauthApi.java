package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.TypeRef;

import io.swagger.client.model.*;

import java.util.*;


import java.io.File;
import java.util.Map;
import java.util.HashMap;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-08-31T05:51:00.313Z")
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
   * Client provides authorization token obtained from /api/oauth2/authorize to this endpoint and receives an access token. Access token can then be used to query different API endpoints of QuantiModo.
   * @param clientId Client id
   * @param clientSecret Client secret
   * @param grantType Grant Type can be &#39;authorization_code&#39; or &#39;refresh_token&#39;
   * @param responseType Response type
   * @param scope Scope
   * @param redirectUri Redirect uri
   * @param state State
   * @param realm Realm
   * @return void
   */
  public void oauth2AccesstokenGet (String clientId, String clientSecret, String grantType, String responseType, String scope, String redirectUri, String state, String realm) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'clientId' is set
     if (clientId == null) {
        throw new ApiException(400, "Missing the required parameter 'clientId' when calling oauth2AccesstokenGet");
     }
     
     // verify the required parameter 'clientSecret' is set
     if (clientSecret == null) {
        throw new ApiException(400, "Missing the required parameter 'clientSecret' when calling oauth2AccesstokenGet");
     }
     
     // verify the required parameter 'grantType' is set
     if (grantType == null) {
        throw new ApiException(400, "Missing the required parameter 'grantType' when calling oauth2AccesstokenGet");
     }
     
    // create path and map variables
    String path = "/oauth2/accesstoken".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "client_id", clientId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "client_secret", clientSecret));
    
    queryParams.addAll(apiClient.parameterToPairs("", "grant_type", grantType));
    
    queryParams.addAll(apiClient.parameterToPairs("", "response_type", responseType));
    
    queryParams.addAll(apiClient.parameterToPairs("", "scope", scope));
    
    queryParams.addAll(apiClient.parameterToPairs("", "redirect_uri", redirectUri));
    
    queryParams.addAll(apiClient.parameterToPairs("", "state", state));
    
    queryParams.addAll(apiClient.parameterToPairs("", "realm", realm));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "oauth2" };
    
    

    

    
    
    apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, null);
    
    

    
    
    
    
  }
  
  /**
   * Authorize
   * Ask the user if they want to allow a client applications to submit or obtain data from their QM account. It will redirect the user to the url provided by the client application with the code as a query parameter or error in case of an error.
   * @param clientId This is the unique ID that QuantiModo uses to identify your application. Obtain a client id by emailing info@quantimo.do.
   * @param clientSecret This is the secret for your obtained clietn_id. QuantiModo uses this to validate that only your application uses the client_id.
   * @param responseType If the value is code, launches a Basic flow, requiring a POST to the token endpoint to obtain the tokens. If the value is token id_token or id_token token, launches an Implicit flow, requiring the use of Javascript at the redirect URI to retrieve tokens from the URI #fragment.
   * @param scope Scopes include basic, readmeasurements, and writemeasurements. The \&quot;basic\&quot; scope allows you to read user info (displayname, email, etc). The \&quot;readmeasurements\&quot; scope allows one to read a user&#39;s data. The \&quot;writemeasurements\&quot; scope allows you to write user data. Separate multiple scopes by a space.
   * @param redirectUri The redirect URI is the URL within your client application that will receive the OAuth2 credentials.
   * @param state An opaque string that is round-tripped in the protocol; that is to say, it is returned as a URI parameter in the Basic flow, and in the URI
   * @param realm Name of the realm representing the users of your distributed applications and services. A \&quot;realm\&quot; attribute MAY be included to indicate the scope of protection.
   * @return void
   */
  public void oauth2AuthorizeGet (String clientId, String clientSecret, String responseType, String scope, String redirectUri, String state, String realm) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'clientId' is set
     if (clientId == null) {
        throw new ApiException(400, "Missing the required parameter 'clientId' when calling oauth2AuthorizeGet");
     }
     
     // verify the required parameter 'clientSecret' is set
     if (clientSecret == null) {
        throw new ApiException(400, "Missing the required parameter 'clientSecret' when calling oauth2AuthorizeGet");
     }
     
     // verify the required parameter 'responseType' is set
     if (responseType == null) {
        throw new ApiException(400, "Missing the required parameter 'responseType' when calling oauth2AuthorizeGet");
     }
     
     // verify the required parameter 'scope' is set
     if (scope == null) {
        throw new ApiException(400, "Missing the required parameter 'scope' when calling oauth2AuthorizeGet");
     }
     
    // create path and map variables
    String path = "/oauth2/authorize".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "client_id", clientId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "client_secret", clientSecret));
    
    queryParams.addAll(apiClient.parameterToPairs("", "response_type", responseType));
    
    queryParams.addAll(apiClient.parameterToPairs("", "scope", scope));
    
    queryParams.addAll(apiClient.parameterToPairs("", "redirect_uri", redirectUri));
    
    queryParams.addAll(apiClient.parameterToPairs("", "state", state));
    
    queryParams.addAll(apiClient.parameterToPairs("", "realm", realm));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "oauth2" };
    
    

    

    
    
    apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, null);
    
    

    
    
    
    
  }
  
}
