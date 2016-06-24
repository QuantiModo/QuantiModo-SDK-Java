package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.model.*;
import io.swagger.client.Pair;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-24T22:10:22.059Z")
public class AuthenticationApi {
  private ApiClient apiClient;

  public AuthenticationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AuthenticationApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Second Step in Social Authentication flow with JWT Token
   *  Here is the flow for how social authentication works with a JWT Token  1.**Client:** The client needs to open popup with social auth url (&#x60;https://app/quantimo.do/api/v2/auth/social/login?provider&#x3D;{provider}&amp;redirectUrl&#x3D;{url}&#x60;) of server with &#x60;provider&#x60; and &#x60;redirectUrl&#x60;. (Url should be registered with our social apps. Facebook and Twitter are fine with any redirect url with the same domain base url but Google needs exact redirect url.)   2.**Server:** The QM server will redirect user to that provider to get access.   3.**Client:** After successful or failed authentication, it will be redirected to given &#x60;redirectUrl&#x60; with code or error.   4.**Client:** The client needs to get that code and needs to send an Ajax request to server at &#x60;https://app.quantimo.do/api/v2/auth/social/authorizeCode?provider&#x3D;{provider}&amp;code&#x3D;{authorizationCode}&#x60;   5.**Server:** The QM server will authorize that code from the social connection and will authenticate user and will retrieve user info.   6.**Server:** The QM server will try to find existing user by unique identity. If the user already exists then it will login. Otherwise, it will create new user and will then login.   7.**Server:** Once user is found/created, it will return a JWT token for that user in the response.
   * @param code Authorization code obtained from the provider. (required)
   * @param provider The current options are &#x60;google&#x60; and &#x60;facebook&#x60;. (required)
   * @throws ApiException if fails to make API call
   */
  public void v2AuthSocialAuthorizeCodeGet(String code, String provider) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'code' is set
    if (code == null) {
      throw new ApiException(400, "Missing the required parameter 'code' when calling v2AuthSocialAuthorizeCodeGet");
    }
    
    // verify the required parameter 'provider' is set
    if (provider == null) {
      throw new ApiException(400, "Missing the required parameter 'provider' when calling v2AuthSocialAuthorizeCodeGet");
    }
    
    // create path and map variables
    String localVarPath = "/v2/auth/social/authorizeCode".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "code", code));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "provider", provider));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };


    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Native Social Authentication
   *       If you are using native authentication via Facebook or Google SDKs then you should use the following flow.   1.**Client:** Using native authentication via your native mobile app, get an access token using the instructions provided by the Facebook SDK (https://developers.facebook.com/docs/facebook-login) or Google (https://developers.google.com/identity/protocols/OAuth2)   2.**Client:** Send an Ajax request with provider name and access token on &#x60;https://app.quantimo.do/api/v2/auth/social/authorizeToken?provider&#x3D;{provider}&amp;accessToken&#x3D;{accessToken}&amp;refreshToken&#x3D;{refreshToken}&#x60; (&#x60;refreshToken&#x60; is optional)   3.**Server:** Server will try to get user info and will find existing user by unique identity. If user exist then it will do a login for that or it will create new user and will do login   4.**Server:** Once user is found/created, it will return a JWT token for that user in response   5.**Client:** After getting the JWT token to get a QM access token follow these steps and include your JWT token in them as a header (Authorization: Bearer **{yourJWThere}**) or as a url parameter (https://app.quantimo.do/api/v2/oauth/authorize?token&#x3D;{yourJWThere}). 
   * @param accessToken User&#39;s OAuth2 access token obtained from Google or FB native SDK (required)
   * @param provider The current options are &#x60;google&#x60; and &#x60;facebook&#x60;. (required)
   * @param refreshToken Optional refresh token obtained from Google or FB native SDK (optional)
   * @throws ApiException if fails to make API call
   */
  public void v2AuthSocialAuthorizeTokenGet(String accessToken, String provider, String refreshToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling v2AuthSocialAuthorizeTokenGet");
    }
    
    // verify the required parameter 'provider' is set
    if (provider == null) {
      throw new ApiException(400, "Missing the required parameter 'provider' when calling v2AuthSocialAuthorizeTokenGet");
    }
    
    // create path and map variables
    String localVarPath = "/v2/auth/social/authorizeToken".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "refreshToken", refreshToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessToken", accessToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "provider", provider));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };


    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * First Setp in Social Authentication flow with JWT Token
   *  Here is the flow for how social authentication works with a JWT Token  1.**Client:** The client needs to open popup with social auth url (&#x60;https://app/quantimo.do/api/v2/auth/social/login?provider&#x3D;{provider}&amp;redirectUrl&#x3D;{url}&#x60;) of server with &#x60;provider&#x60; and &#x60;redirectUrl&#x60;. (Url should be registered with our social apps. Facebook and Twitter are fine with any redirect url with the same domain base url but Google needs exact redirect url.)   2.**Server:** The QM server will redirect user to that provider to get access.   3.**Client:** After successful or failed authentication, it will be redirected to given &#x60;redirectUrl&#x60; with code or error.   4.**Client:** The client needs to get that code and needs to send an Ajax request to server at &#x60;https://app.quantimo.do/api/v2/auth/social/authorizeCode?provider&#x3D;{provider}&amp;code&#x3D;{authorizationCode}&#x60;   5.**Server:** The QM server will authorize that code from the social connection and will authenticate user and will retrieve user info.   6.**Server:** The QM server will try to find existing user by unique identity. If the user already exists then it will login. Otherwise, it will create new user and will then login.   7.**Server:** Once user is found/created, it will return a JWT token for that user in the response.
   * @param redirectUrl The redirect URI is the URL within your client application that will receive the OAuth2 credentials. Url should be registered with our social apps. Facebook and Twitter are fine with any redirect url with the same domain base url but Google needs exact redirect url. (required)
   * @param provider The current options are &#x60;google&#x60; and &#x60;facebook&#x60;. (required)
   * @throws ApiException if fails to make API call
   */
  public void v2AuthSocialLoginGet(String redirectUrl, String provider) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'redirectUrl' is set
    if (redirectUrl == null) {
      throw new ApiException(400, "Missing the required parameter 'redirectUrl' when calling v2AuthSocialLoginGet");
    }
    
    // verify the required parameter 'provider' is set
    if (provider == null) {
      throw new ApiException(400, "Missing the required parameter 'provider' when calling v2AuthSocialLoginGet");
    }
    
    // create path and map variables
    String localVarPath = "/v2/auth/social/login".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "redirectUrl", redirectUrl));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "provider", provider));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };


    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get a user access token
   * Client provides authorization token obtained from /api/v1/oauth2/authorize to this endpoint and receives an access token. Access token can then be used to query different API endpoints of QuantiModo. ### Request Access Token After user approves your access to the given scope form the https:/app.quantimo.do/v2/oauth2/authorize endpoint, you&#39;ll recevive an authorization code to request an access token. This time make a &#x60;POST&#x60; request to &#x60;/api/v2/oauth/access_token&#x60; with parameters including: * &#x60;grant_type&#x60; Can be &#x60;authorization_code&#x60; or &#x60;refresh_token&#x60; since we are getting the &#x60;access_token&#x60; for the first time we don&#39;t have a &#x60;refresh_token&#x60; so this must be &#x60;authorization_code&#x60;. * &#x60;code&#x60; Authorization code you received with the previous request. * &#x60;redirect_uri&#x60; Your application&#39;s redirect url.         ### Refreshing Access Token Access tokens expire at some point, to continue using our api you need to refresh them with &#x60;refresh_token&#x60; you received along with the &#x60;access_token&#x60;. To do this make a &#x60;POST&#x60; request to &#x60;/api/v2/oauth/access_token&#x60; with correct parameters, which are: * &#x60;grant_type&#x60; This time grant type must be &#x60;refresh_token&#x60; since we have it. * &#x60;clientId&#x60; Your application&#39;s client id. * &#x60;client_secret&#x60; Your application&#39;s client secret. * &#x60;refresh_token&#x60; The refresh token you received with the &#x60;access_token&#x60;. Every request you make to this endpoint will give you a new refresh token and make the old one expired. So you can keep getting new access tokens with new refresh tokens. ### Using Access Token Currently we support 2 ways for this, you can&#39;t use both at the same time. * Adding access token to the request header as &#x60;Authorization: Bearer {access_token}&#x60; * Adding to the url as a query parameter &#x60;?access_token&#x3D;{access_token}&#x60;         You can read more about OAuth2 from [here](http://oauth.net/2/)
   * @param clientId This is the unique ID that QuantiModo uses to identify your application. Obtain a client id by emailing info@quantimo.do. (required)
   * @param clientSecret This is the secret for your obtained clientId. QuantiModo uses this to validate that only your application uses the clientId. (required)
   * @param grantType Grant Type can be &#39;authorization_code&#39; or &#39;refresh_token&#39; (required)
   * @param code Authorization code you received with the previous request. (required)
   * @param responseType If the value is code, launches a Basic flow, requiring a POST to the token endpoint to obtain the tokens. If the value is token id_token or id_token token, launches an Implicit flow, requiring the use of Javascript at the redirect URI to retrieve tokens from the URI #fragment. (optional)
   * @param scope Scopes include basic, readmeasurements, and writemeasurements. The \&quot;basic\&quot; scope allows you to read user info (displayname, email, etc). The \&quot;readmeasurements\&quot; scope allows one to read a user&#39;s data. The \&quot;writemeasurements\&quot; scope allows you to write user data. Separate multiple scopes by a space. (optional)
   * @param redirectUri The redirect URI is the URL within your client application that will receive the OAuth2 credentials. (optional)
   * @param state An opaque string that is round-tripped in the protocol; that is to say, it is returned as a URI parameter in the Basic flow, and in the URI (optional)
   * @throws ApiException if fails to make API call
   */
  public void v2Oauth2AccessTokenGet(String clientId, String clientSecret, String grantType, String code, String responseType, String scope, String redirectUri, String state) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling v2Oauth2AccessTokenGet");
    }
    
    // verify the required parameter 'clientSecret' is set
    if (clientSecret == null) {
      throw new ApiException(400, "Missing the required parameter 'clientSecret' when calling v2Oauth2AccessTokenGet");
    }
    
    // verify the required parameter 'grantType' is set
    if (grantType == null) {
      throw new ApiException(400, "Missing the required parameter 'grantType' when calling v2Oauth2AccessTokenGet");
    }
    
    // verify the required parameter 'code' is set
    if (code == null) {
      throw new ApiException(400, "Missing the required parameter 'code' when calling v2Oauth2AccessTokenGet");
    }
    
    // create path and map variables
    String localVarPath = "/v2/oauth2/access_token".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "clientId", clientId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "client_secret", clientSecret));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "grant_type", grantType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "code", code));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "response_type", responseType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "scope", scope));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "redirect_uri", redirectUri));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "state", state));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };


    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Request Authorization Code
   * You can implement OAuth2 authentication to your application using our **OAuth2** endpoints.  You need to redirect users to &#x60;/api/v2/oauth/authorize&#x60; endpoint to get an authorization code and include the parameters below.   This page will ask the user if they want to allow a client&#39;s application to submit or obtain data from their QM account. It will redirect the user to the url provided by the client application with the code as a query parameter or error in case of an error.     See the /api/v2/oauth/access_token endpoint for the next steps.
   * @param clientId This is the unique ID that QuantiModo uses to identify your application. Obtain a client id by creating a free application at [https://admin.quantimo.do](https://admin.quantimo.do). (required)
   * @param clientSecret This is the secret for your obtained clientId. QuantiModo uses this to validate that only your application uses the clientId.  Obtain this by creating a free application at [https://admin.quantimo.do](https://admin.quantimo.do). (required)
   * @param responseType If the value is code, launches a Basic flow, requiring a POST to the token endpoint to obtain the tokens. If the value is token id_token or id_token token, launches an Implicit flow, requiring the use of Javascript at the redirect URI to retrieve tokens from the URI #fragment. (required)
   * @param scope Scopes include basic, readmeasurements, and writemeasurements. The \&quot;basic\&quot; scope allows you to read user info (displayname, email, etc). The \&quot;readmeasurements\&quot; scope allows one to read a user&#39;s data. The \&quot;writemeasurements\&quot; scope allows you to write user data. Separate multiple scopes by a space. (required)
   * @param redirectUri The redirect URI is the URL within your client application that will receive the OAuth2 credentials. (optional)
   * @param state An opaque string that is round-tripped in the protocol; that is to say, it is returned as a URI parameter in the Basic flow, and in the URI (optional)
   * @throws ApiException if fails to make API call
   */
  public void v2OauthAuthorizeGet(String clientId, String clientSecret, String responseType, String scope, String redirectUri, String state) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientId' when calling v2OauthAuthorizeGet");
    }
    
    // verify the required parameter 'clientSecret' is set
    if (clientSecret == null) {
      throw new ApiException(400, "Missing the required parameter 'clientSecret' when calling v2OauthAuthorizeGet");
    }
    
    // verify the required parameter 'responseType' is set
    if (responseType == null) {
      throw new ApiException(400, "Missing the required parameter 'responseType' when calling v2OauthAuthorizeGet");
    }
    
    // verify the required parameter 'scope' is set
    if (scope == null) {
      throw new ApiException(400, "Missing the required parameter 'scope' when calling v2OauthAuthorizeGet");
    }
    
    // create path and map variables
    String localVarPath = "/v2/oauth/authorize".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "clientId", clientId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "client_secret", clientSecret));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "response_type", responseType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "scope", scope));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "redirect_uri", redirectUri));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "state", state));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };


    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
