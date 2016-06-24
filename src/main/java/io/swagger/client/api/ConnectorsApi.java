package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.model.*;
import io.swagger.client.Pair;

import io.swagger.client.model.ConnectorInstruction;
import io.swagger.client.model.ConnectorInfo;
import io.swagger.client.model.Connector;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-24T22:10:22.059Z")
public class ConnectorsApi {
  private ApiClient apiClient;

  public ConnectorsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ConnectorsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get embeddable connect javascript
   * Get embeddable connect javascript. Usage:    - Embedding in applications with popups for 3rd-party authentication windows.      Use &#x60;qmSetupInPopup&#x60; function after connecting &#x60;connect.js&#x60;.    - Embedding in applications with popups for 3rd-party authentication windows.      Requires a selector to block. It will be embedded in this block.      Use &#x60;qmSetupOnPage&#x60; function after connecting &#x60;connect.js&#x60;.    - Embedding in mobile applications without popups for 3rd-party authentication.      Use &#x60;qmSetupOnMobile&#x60; function after connecting &#x60;connect.js&#x60;.      if using the MoodiModo Clones, Use &#x60;qmSetupOnIonic&#x60; function after connecting &#x60;connect.js&#x60;. 
   * @param accessToken User&#39;s OAuth2 access token (optional)
   * @throws ApiException if fails to make API call
   */
  public void v1ConnectJsGet(String accessToken) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/connect.js".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));

    
    
    final String[] localVarAccepts = {
      "application/x-javascript"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2", "internalApiKey" };


    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Mobile connect page
   * This page is designed to be opened in a webview.  Instead of using popup authentication boxes, it uses redirection. You can include the user&#39;s access_token as a URL parameter like https://app.quantimo.do/api/v1/connect/mobile?access_token&#x3D;123
   * @param accessToken User OAuth access token (required)
   * @throws ApiException if fails to make API call
   */
  public void v1ConnectMobileGet(String accessToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling v1ConnectMobileGet");
    }
    
    // create path and map variables
    String localVarPath = "/v1/connect/mobile".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));

    
    
    final String[] localVarAccepts = {
      "text/html"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2", "internalApiKey" };


    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Obtain a token from 3rd party data source
   * Attempt to obtain a token from the data provider, store it in the database. With this, the connector to continue to obtain new user data until the token is revoked.
   * @param connector Lowercase system name of the source application or device. Get a list of available connectors from the /connectors/list endpoint. (required)
   * @param accessToken User&#39;s OAuth2 access token (optional)
   * @throws ApiException if fails to make API call
   */
  public void v1ConnectorsConnectorConnectGet(String connector, String accessToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'connector' is set
    if (connector == null) {
      throw new ApiException(400, "Missing the required parameter 'connector' when calling v1ConnectorsConnectorConnectGet");
    }
    
    // create path and map variables
    String localVarPath = "/v1/connectors/{connector}/connect".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "connector" + "\\}", apiClient.escapeString(connector.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));

    
    
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
   * Connection Instructions
   * Returns instructions that describe what parameters and endpoint to use to connect to the given data provider.
   * @param connector Lowercase system name of the source application or device. Get a list of available connectors from the /connectors/list endpoint. (required)
   * @param parameters JSON Array of Parameters for the request to enable connector. (required)
   * @param url URL which should be used to enable the connector. (required)
   * @param usePopup Should use popup when enabling connector (required)
   * @param accessToken User&#39;s OAuth2 access token (optional)
   * @throws ApiException if fails to make API call
   */
  public void v1ConnectorsConnectorConnectInstructionsGet(String connector, String parameters, String url, Boolean usePopup, String accessToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'connector' is set
    if (connector == null) {
      throw new ApiException(400, "Missing the required parameter 'connector' when calling v1ConnectorsConnectorConnectInstructionsGet");
    }
    
    // verify the required parameter 'parameters' is set
    if (parameters == null) {
      throw new ApiException(400, "Missing the required parameter 'parameters' when calling v1ConnectorsConnectorConnectInstructionsGet");
    }
    
    // verify the required parameter 'url' is set
    if (url == null) {
      throw new ApiException(400, "Missing the required parameter 'url' when calling v1ConnectorsConnectorConnectInstructionsGet");
    }
    
    // verify the required parameter 'usePopup' is set
    if (usePopup == null) {
      throw new ApiException(400, "Missing the required parameter 'usePopup' when calling v1ConnectorsConnectorConnectInstructionsGet");
    }
    
    // create path and map variables
    String localVarPath = "/v1/connectors/{connector}/connectInstructions".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "connector" + "\\}", apiClient.escapeString(connector.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "parameters", parameters));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "url", url));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "usePopup", usePopup));

    
    
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
   * Connect Parameter
   * Returns instructions that describe what parameters and endpoint to use to connect to the given data provider.
   * @param connector Lowercase system name of the source application or device. Get a list of available connectors from the /connectors/list endpoint. (required)
   * @param displayName Name of the parameter that is user visible in the form (required)
   * @param key Name of the property that the user has to enter such as username or password Connector (used in HTTP request) (required)
   * @param placeholder Placeholder hint value for the parameter input tag. (required)
   * @param type Type of input field such as those found here http://www.w3schools.com/tags/tag_input.asp (required)
   * @param usePopup Should use popup when enabling connector (required)
   * @param accessToken User&#39;s OAuth2 access token (optional)
   * @param defaultValue Default parameter value (optional)
   * @return ConnectorInstruction
   * @throws ApiException if fails to make API call
   */
  public ConnectorInstruction v1ConnectorsConnectorConnectParameterGet(String connector, String displayName, String key, String placeholder, String type, Boolean usePopup, String accessToken, String defaultValue) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'connector' is set
    if (connector == null) {
      throw new ApiException(400, "Missing the required parameter 'connector' when calling v1ConnectorsConnectorConnectParameterGet");
    }
    
    // verify the required parameter 'displayName' is set
    if (displayName == null) {
      throw new ApiException(400, "Missing the required parameter 'displayName' when calling v1ConnectorsConnectorConnectParameterGet");
    }
    
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling v1ConnectorsConnectorConnectParameterGet");
    }
    
    // verify the required parameter 'placeholder' is set
    if (placeholder == null) {
      throw new ApiException(400, "Missing the required parameter 'placeholder' when calling v1ConnectorsConnectorConnectParameterGet");
    }
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling v1ConnectorsConnectorConnectParameterGet");
    }
    
    // verify the required parameter 'usePopup' is set
    if (usePopup == null) {
      throw new ApiException(400, "Missing the required parameter 'usePopup' when calling v1ConnectorsConnectorConnectParameterGet");
    }
    
    // create path and map variables
    String localVarPath = "/v1/connectors/{connector}/connectParameter".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "connector" + "\\}", apiClient.escapeString(connector.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "defaultValue", defaultValue));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "displayName", displayName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "key", key));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "placeholder", placeholder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "usePopup", usePopup));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<ConnectorInstruction> localVarReturnType = new GenericType<ConnectorInstruction>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete stored connection info
   * The disconnect method deletes any stored tokens or connection information from the connectors database.
   * @param connector Lowercase system name of the source application or device. Get a list of available connectors from the /connectors/list endpoint. (required)
   * @throws ApiException if fails to make API call
   */
  public void v1ConnectorsConnectorDisconnectGet(String connector) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'connector' is set
    if (connector == null) {
      throw new ApiException(400, "Missing the required parameter 'connector' when calling v1ConnectorsConnectorDisconnectGet");
    }
    
    // create path and map variables
    String localVarPath = "/v1/connectors/{connector}/disconnect".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "connector" + "\\}", apiClient.escapeString(connector.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
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
   * Get connector info for user
   * Returns information about the connector such as the connector id, whether or not is connected for this user (i.e. we have a token or credentials), and its update history for the user.
   * @param connector Lowercase system name of the source application or device. Get a list of available connectors from the /connectors/list endpoint. (required)
   * @param accessToken User&#39;s OAuth2 access token (optional)
   * @return ConnectorInfo
   * @throws ApiException if fails to make API call
   */
  public ConnectorInfo v1ConnectorsConnectorInfoGet(String connector, String accessToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'connector' is set
    if (connector == null) {
      throw new ApiException(400, "Missing the required parameter 'connector' when calling v1ConnectorsConnectorInfoGet");
    }
    
    // create path and map variables
    String localVarPath = "/v1/connectors/{connector}/info".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "connector" + "\\}", apiClient.escapeString(connector.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<ConnectorInfo> localVarReturnType = new GenericType<ConnectorInfo>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Sync with data source
   * The update method tells the QM Connector Framework to check with the data provider (such as Fitbit or MyFitnessPal) and retrieve any new measurements available.
   * @param connector Lowercase system name of the source application or device (required)
   * @param accessToken User&#39;s OAuth2 access token (optional)
   * @throws ApiException if fails to make API call
   */
  public void v1ConnectorsConnectorUpdateGet(String connector, String accessToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'connector' is set
    if (connector == null) {
      throw new ApiException(400, "Missing the required parameter 'connector' when calling v1ConnectorsConnectorUpdateGet");
    }
    
    // create path and map variables
    String localVarPath = "/v1/connectors/{connector}/update".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "connector" + "\\}", apiClient.escapeString(connector.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));

    
    
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
   * List of Connectors
   * A connector pulls data from other data providers using their API or a screenscraper. Returns a list of all available connectors and information about them such as their id, name, whether the user has provided access, logo url, connection instructions, and the update history.
   * @return List<Connector>
   * @throws ApiException if fails to make API call
   */
  public List<Connector> v1ConnectorsListGet() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/connectors/list".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<List<Connector>> localVarReturnType = new GenericType<List<Connector>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
