package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.TypeRef;

import io.swagger.client.model.InlineResponse2005;
import io.swagger.client.model.Connector;
import io.swagger.client.model.InlineResponse2006;
import io.swagger.client.model.InlineResponse2002;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-03T22:24:11.560Z")
public class ConnectorApi {
  private ApiClient apiClient;

  public ConnectorApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ConnectorApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Get all Connectors
   * Get all Connectors
   * @param name name
   * @param displayName display_name
   * @param image image
   * @param getItUrl get_it_url
   * @param shortDescription short_description
   * @param longDescription long_description
   * @param enabled enabled
   * @param oauth oauth
   * @param limit limit
   * @param offset offset
   * @param sort sort
   * @return InlineResponse2005
   */
  public InlineResponse2005 connectorsGet (String name, String displayName, String image, String getItUrl, String shortDescription, String longDescription, Boolean enabled, Boolean oauth, Integer limit, Integer offset, String sort) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
    // create path and map variables
    String path = "/connectors".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "name", name));
    
    queryParams.addAll(apiClient.parameterToPairs("", "display_name", displayName));
    
    queryParams.addAll(apiClient.parameterToPairs("", "image", image));
    
    queryParams.addAll(apiClient.parameterToPairs("", "get_it_url", getItUrl));
    
    queryParams.addAll(apiClient.parameterToPairs("", "short_description", shortDescription));
    
    queryParams.addAll(apiClient.parameterToPairs("", "long_description", longDescription));
    
    queryParams.addAll(apiClient.parameterToPairs("", "enabled", enabled));
    
    queryParams.addAll(apiClient.parameterToPairs("", "oauth", oauth));
    
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

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<InlineResponse2005>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Store Connector
   * Store Connector
   * @param body Connector that should be stored
   * @return InlineResponse2006
   */
  public InlineResponse2006 connectorsPost (Connector body) throws ApiException {
    Object postBody = body;
    byte[] postBinaryBody = null;
    
    // create path and map variables
    String path = "/connectors".replaceAll("\\{format\\}","json");

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

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<InlineResponse2006>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Get Connector
   * Get Connector
   * @param id id of Connector
   * @return InlineResponse2006
   */
  public InlineResponse2006 connectorsIdGet (Integer id) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling connectorsIdGet");
     }
     
    // create path and map variables
    String path = "/connectors/{id}".replaceAll("\\{format\\}","json")
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

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<InlineResponse2006>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Update Connector
   * Update Connector
   * @param id id of Connector
   * @param body Connector that should be updated
   * @return InlineResponse2002
   */
  public InlineResponse2002 connectorsIdPut (Integer id, Connector body) throws ApiException {
    Object postBody = body;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling connectorsIdPut");
     }
     
    // create path and map variables
    String path = "/connectors/{id}".replaceAll("\\{format\\}","json")
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

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<InlineResponse2002>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Delete Connector
   * Delete Connector
   * @param id id of Connector
   * @return InlineResponse2002
   */
  public InlineResponse2002 connectorsIdDelete (Integer id) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling connectorsIdDelete");
     }
     
    // create path and map variables
    String path = "/connectors/{id}".replaceAll("\\{format\\}","json")
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

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<InlineResponse2002>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
}
