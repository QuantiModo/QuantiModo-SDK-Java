package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.TypeRef;

import io.swagger.client.model.InlineResponse2003;
import io.swagger.client.model.InlineResponse2004;
import io.swagger.client.model.Connection;
import io.swagger.client.model.InlineResponse2002;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-03T22:24:11.560Z")
public class ConnectionApi {
  private ApiClient apiClient;

  public ConnectionApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ConnectionApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Get all Connections
   * Get all Connections
   * @param userId user_id
   * @param connectorId connector_id
   * @param connectStatus connect_status
   * @param connectError connect_error
   * @param updateRequestedAt update_requested_at
   * @param updateStatus update_status
   * @param updateError update_error
   * @param lastSuccessfulUpdatedAt last_successful_updated_at
   * @param createdAt created_at
   * @param updatedAt updated_at
   * @param limit limit
   * @param offset offset
   * @param sort sort
   * @return InlineResponse2003
   */
  public InlineResponse2003 connectionsGet (Integer userId, Integer connectorId, String connectStatus, String connectError, String updateRequestedAt, String updateStatus, String updateError, String lastSuccessfulUpdatedAt, String createdAt, String updatedAt, Integer limit, Integer offset, String sort) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
    // create path and map variables
    String path = "/connections".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "user_id", userId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "connector_id", connectorId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "connect_status", connectStatus));
    
    queryParams.addAll(apiClient.parameterToPairs("", "connect_error", connectError));
    
    queryParams.addAll(apiClient.parameterToPairs("", "update_requested_at", updateRequestedAt));
    
    queryParams.addAll(apiClient.parameterToPairs("", "update_status", updateStatus));
    
    queryParams.addAll(apiClient.parameterToPairs("", "update_error", updateError));
    
    queryParams.addAll(apiClient.parameterToPairs("", "last_successful_updated_at", lastSuccessfulUpdatedAt));
    
    queryParams.addAll(apiClient.parameterToPairs("", "created_at", createdAt));
    
    queryParams.addAll(apiClient.parameterToPairs("", "updated_at", updatedAt));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    
    queryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "quantimodo_oauth2" };

    

    
    
    TypeRef returnType = new TypeRef<InlineResponse2003>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Store Connection
   * Store Connection
   * @param body Connection that should be stored
   * @return InlineResponse2004
   */
  public InlineResponse2004 connectionsPost (Connection body) throws ApiException {
    Object postBody = body;
    byte[] postBinaryBody = null;
    
    // create path and map variables
    String path = "/connections".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "quantimodo_oauth2" };

    

    
    
    TypeRef returnType = new TypeRef<InlineResponse2004>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Get Connection
   * Get Connection
   * @param id id of Connection
   * @return InlineResponse2004
   */
  public InlineResponse2004 connectionsIdGet (Integer id) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling connectionsIdGet");
     }
     
    // create path and map variables
    String path = "/connections/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "quantimodo_oauth2" };

    

    
    
    TypeRef returnType = new TypeRef<InlineResponse2004>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Update Connection
   * Update Connection
   * @param id id of Connection
   * @param body Connection that should be updated
   * @return InlineResponse2002
   */
  public InlineResponse2002 connectionsIdPut (Integer id, Connection body) throws ApiException {
    Object postBody = body;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling connectionsIdPut");
     }
     
    // create path and map variables
    String path = "/connections/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "quantimodo_oauth2" };

    

    
    
    TypeRef returnType = new TypeRef<InlineResponse2002>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Delete Connection
   * Delete Connection
   * @param id id of Connection
   * @return InlineResponse2002
   */
  public InlineResponse2002 connectionsIdDelete (Integer id) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling connectionsIdDelete");
     }
     
    // create path and map variables
    String path = "/connections/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "quantimodo_oauth2" };

    

    
    
    TypeRef returnType = new TypeRef<InlineResponse2002>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
}
