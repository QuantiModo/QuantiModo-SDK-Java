package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.TypeRef;

import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.Connector;
import io.swagger.client.model.ConnectorInfo;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-08-31T05:51:00.313Z")
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
  public List<Connector> v1ConnectorsListGet () throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
    // create path and map variables
    String path = "/v1/connectors/list".replaceAll("\\{format\\}","json");

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

    String[] authNames = new String[] { "oauth2" };
    
    

    

    
    
    TypeRef returnType = new TypeRef<List<Connector>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    

    
    
    
    
  }
  
  /**
   * Obtain a token from 3rd party data source
   * Attempt to obtain a token from the data provider, store it in the database. With this, the connector to continue to obtain new user data until the token is revoked.
   * @param connector Lowercase system name of the source application or device. Get a list of available connectors from the /connectors/list endpoint.
   * @return void
   */
  public void v1ConnectorsConnectorConnectGet (String connector) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'connector' is set
     if (connector == null) {
        throw new ApiException(400, "Missing the required parameter 'connector' when calling v1ConnectorsConnectorConnectGet");
     }
     
    // create path and map variables
    String path = "/v1/connectors/{connector}/connect".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "connector" + "\\}", apiClient.escapeString(connector.toString()));

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

    String[] authNames = new String[] { "oauth2" };
    
    

    

    
    
    apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, null);
    
    

    
    
    
    
    
    
    
    
  }
  
  /**
   * Delete stored connection info
   * The disconnect method deletes any stored tokens or connection information from the connectors database.
   * @param connector Lowercase system name of the source application or device. Get a list of available connectors from the /connectors/list endpoint.
   * @return void
   */
  public void v1ConnectorsConnectorDisconnectGet (String connector) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'connector' is set
     if (connector == null) {
        throw new ApiException(400, "Missing the required parameter 'connector' when calling v1ConnectorsConnectorDisconnectGet");
     }
     
    // create path and map variables
    String path = "/v1/connectors/{connector}/disconnect".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "connector" + "\\}", apiClient.escapeString(connector.toString()));

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

    String[] authNames = new String[] { "oauth2" };
    
    

    

    
    
    apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, null);
    
    

    
    
    
    
    
    
    
    
  }
  
  /**
   * Get connector info for user
   * Returns information about the connector such as the connector id, whether or not is connected for this user (i.e. we have a token or credentials), and its update history for the user.
   * @param connector Lowercase system name of the source application or device. Get a list of available connectors from the /connectors/list endpoint.
   * @return ConnectorInfo
   */
  public ConnectorInfo v1ConnectorsConnectorInfoGet (String connector) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'connector' is set
     if (connector == null) {
        throw new ApiException(400, "Missing the required parameter 'connector' when calling v1ConnectorsConnectorInfoGet");
     }
     
    // create path and map variables
    String path = "/v1/connectors/{connector}/info".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "connector" + "\\}", apiClient.escapeString(connector.toString()));

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

    String[] authNames = new String[] { "oauth2" };
    
    

    

    
    
    TypeRef returnType = new TypeRef<ConnectorInfo>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    

    
    
    
    
    
    
    
    
  }
  
  /**
   * Sync with data source
   * The update method tells the QM Connector Framework to check with the data provider (such as Fitbit or MyFitnessPal) and retrieve any new measurements available.
   * @param connector Lowercase system name of the source application or device
   * @return void
   */
  public void v1ConnectorsConnectorUpdateGet (String connector) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'connector' is set
     if (connector == null) {
        throw new ApiException(400, "Missing the required parameter 'connector' when calling v1ConnectorsConnectorUpdateGet");
     }
     
    // create path and map variables
    String path = "/v1/connectors/{connector}/update".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "connector" + "\\}", apiClient.escapeString(connector.toString()));

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

    String[] authNames = new String[] { "oauth2" };
    
    

    

    
    
    apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, null);
    
    

    
    
    
    
    
    
    
    
  }
  
}
