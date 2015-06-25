package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;

import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.Connector;

import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

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
   * List of Connectors
   * Returns a list of all available connectors. A connector pulls data from other data providers using their API or a screenscraper.
   * @return List<Connector>
   */
  public List<Connector> connectorsListGet () throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/connectors/list".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    

    

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
        return (List<Connector>) apiClient.deserialize(response, "array", Connector.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Obtain a token from 3rd party data source
   * Attempt to obtain a token from the data provider, store it in the database. With this, the connector to continue to obtain new user data until the token is revoked.
   * @param connector Lowercase system name of the source application or device. Get a list of available connectors from the /connectors/list endpoint.
   * @return void
   */
  public void connectorsConnectorConnectGet (String connector) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'connector' is set
    if (connector == null) {
       throw new ApiException(400, "Missing the required parameter 'connector' when calling connectorsConnectorConnectGet");
    }
    

    // create path and map variables
    String path = "/connectors/{connector}/connect".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "connector" + "\\}", apiClient.escapeString(connector.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    

    

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
   * Get connection parameters
   * Returns instructions that describe what parameters and endpoint to use to connect to the given data provider.
   * @param connector Lowercase system name of the source application or device. Get a list of available connectors from the /connectors/list endpoint.
   * @param url URL which should be used to enable the connector
   * @param parameters Array of Parameters for the request to enable connector
   * @param usePopup Should use popup when enabling connector
   * @return void
   */
  public void connectorsConnectorConnectInstructionsGet (String connector, String url, List<String> parameters, Boolean usePopup) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'connector' is set
    if (connector == null) {
       throw new ApiException(400, "Missing the required parameter 'connector' when calling connectorsConnectorConnectInstructionsGet");
    }
    
    // verify the required parameter 'url' is set
    if (url == null) {
       throw new ApiException(400, "Missing the required parameter 'url' when calling connectorsConnectorConnectInstructionsGet");
    }
    
    // verify the required parameter 'parameters' is set
    if (parameters == null) {
       throw new ApiException(400, "Missing the required parameter 'parameters' when calling connectorsConnectorConnectInstructionsGet");
    }
    
    // verify the required parameter 'usePopup' is set
    if (usePopup == null) {
       throw new ApiException(400, "Missing the required parameter 'usePopup' when calling connectorsConnectorConnectInstructionsGet");
    }
    

    // create path and map variables
    String path = "/connectors/{connector}/connectInstructions".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "connector" + "\\}", apiClient.escapeString(connector.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (url != null)
      queryParams.put("url", apiClient.parameterToString(url));
    if (parameters != null)
      queryParams.put("parameters", apiClient.parameterToString(parameters));
    if (usePopup != null)
      queryParams.put("usePopup", apiClient.parameterToString(usePopup));
    

    

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
   * Get connection parameters
   * Returns instructions that describe what parameters and endpoint to use to connect to the given data provider.
   * @param connector Lowercase system name of the source application or device. Get a list of available connectors from the /connectors/list endpoint.
   * @param displayName Name of the parameter that is user visible in the form
   * @param key Name of the property that the user has to enter such as username or password Connector (used in HTTP request) TODO What&#39;s a connector key?
   * @param usePopup Should use popup when enabling connector
   * @param type Type of input field such as those found here http://www.w3schools.com/tags/tag_input.asp
   * @param placeholder Placeholder hint value for the parameter input tag
   * @param defaultValue Default parameter value
   * @return void
   */
  public void connectorsConnectorConnectParameterGet (String connector, String displayName, String key, Boolean usePopup, String type, String placeholder, String defaultValue) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'connector' is set
    if (connector == null) {
       throw new ApiException(400, "Missing the required parameter 'connector' when calling connectorsConnectorConnectParameterGet");
    }
    
    // verify the required parameter 'displayName' is set
    if (displayName == null) {
       throw new ApiException(400, "Missing the required parameter 'displayName' when calling connectorsConnectorConnectParameterGet");
    }
    
    // verify the required parameter 'key' is set
    if (key == null) {
       throw new ApiException(400, "Missing the required parameter 'key' when calling connectorsConnectorConnectParameterGet");
    }
    
    // verify the required parameter 'usePopup' is set
    if (usePopup == null) {
       throw new ApiException(400, "Missing the required parameter 'usePopup' when calling connectorsConnectorConnectParameterGet");
    }
    
    // verify the required parameter 'type' is set
    if (type == null) {
       throw new ApiException(400, "Missing the required parameter 'type' when calling connectorsConnectorConnectParameterGet");
    }
    
    // verify the required parameter 'placeholder' is set
    if (placeholder == null) {
       throw new ApiException(400, "Missing the required parameter 'placeholder' when calling connectorsConnectorConnectParameterGet");
    }
    
    // verify the required parameter 'defaultValue' is set
    if (defaultValue == null) {
       throw new ApiException(400, "Missing the required parameter 'defaultValue' when calling connectorsConnectorConnectParameterGet");
    }
    

    // create path and map variables
    String path = "/connectors/{connector}/connectParameter".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "connector" + "\\}", apiClient.escapeString(connector.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (displayName != null)
      queryParams.put("displayName", apiClient.parameterToString(displayName));
    if (key != null)
      queryParams.put("key", apiClient.parameterToString(key));
    if (usePopup != null)
      queryParams.put("usePopup", apiClient.parameterToString(usePopup));
    if (type != null)
      queryParams.put("type", apiClient.parameterToString(type));
    if (placeholder != null)
      queryParams.put("placeholder", apiClient.parameterToString(placeholder));
    if (defaultValue != null)
      queryParams.put("defaultValue", apiClient.parameterToString(defaultValue));
    

    

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
   * Delete stored connection info
   * The disconnect method deletes any stored tokens or connection information from the connectors database.
   * @param connector Lowercase system name of the source application or device. Get a list of available connectors from the /connectors/list endpoint.
   * @return void
   */
  public void connectorsConnectorDisconnectGet (String connector) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'connector' is set
    if (connector == null) {
       throw new ApiException(400, "Missing the required parameter 'connector' when calling connectorsConnectorDisconnectGet");
    }
    

    // create path and map variables
    String path = "/connectors/{connector}/disconnect".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "connector" + "\\}", apiClient.escapeString(connector.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    

    

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
   * Get connector info for user
   * Returns information about the connector such as the connector id, whether or not is connected for this user (i.e. we have a token or credentials), and its update history for the user.
   * @param connector Lowercase system name of the source application or device. Get a list of available connectors from the /connectors/list endpoint.
   * @return void
   */
  public void connectorsConnectorInfoGet (String connector) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'connector' is set
    if (connector == null) {
       throw new ApiException(400, "Missing the required parameter 'connector' when calling connectorsConnectorInfoGet");
    }
    

    // create path and map variables
    String path = "/connectors/{connector}/info".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "connector" + "\\}", apiClient.escapeString(connector.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    

    

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
   * Sync with data source
   * The update method tells the QM Connector Framework to check with the data provider (such as Fitbit or MyFitnessPal) and retrieve any new measurements available.
   * @param connector Lowercase system name of the source application or device
   * @return void
   */
  public void connectorsConnectorUpdateGet (String connector) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'connector' is set
    if (connector == null) {
       throw new ApiException(400, "Missing the required parameter 'connector' when calling connectorsConnectorUpdateGet");
    }
    

    // create path and map variables
    String path = "/connectors/{connector}/update".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "connector" + "\\}", apiClient.escapeString(connector.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    

    

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
