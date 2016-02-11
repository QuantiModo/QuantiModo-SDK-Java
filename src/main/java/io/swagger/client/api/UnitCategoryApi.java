package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.InlineResponse20024;
import io.swagger.client.model.InlineResponse20025;
import io.swagger.client.model.UnitCategory;
import io.swagger.client.model.InlineResponse2002;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-09T02:16:51.363Z")
public class UnitCategoryApi {
  private ApiClient apiClient;

  public UnitCategoryApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UnitCategoryApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Get unit categories
   * Get a list of the categories of measurement units such as &#39;Distance&#39;, &#39;Duration&#39;, &#39;Energy&#39;, &#39;Frequency&#39;, &#39;Miscellany&#39;, &#39;Pressure&#39;, &#39;Proportion&#39;, &#39;Rating&#39;, &#39;Temperature&#39;, &#39;Volume&#39;, and &#39;Weight&#39;.
   * @param accessToken User&#39;s OAuth2 access token
   * @param name Unit category name
   * @param createdAt When the record was first created. Use ISO 8601 datetime format
   * @param updatedAt When the record was last updated. Use ISO 8601 datetime format
   * @param limit The LIMIT is used to limit the number of results returned. So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. The maximum limit is 200 records.
   * @param offset OFFSET says to skip that many rows before beginning to return rows to the client. OFFSET 0 is the same as omitting the OFFSET clause. If both OFFSET and LIMIT appear, then OFFSET rows are skipped before starting to count the LIMIT rows that are returned.
   * @param sort Sort by given field. If the field is prefixed with &#39;-&#39;, it will sort in descending order.
   * @return InlineResponse20024
   */
  public InlineResponse20024 unitCategoriesGet(String accessToken, String name, String createdAt, String updatedAt, Integer limit, Integer offset, String sort) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/unitCategories".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));
    
    queryParams.addAll(apiClient.parameterToPairs("", "name", name));
    
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

    
    GenericType<InlineResponse20024> returnType = new GenericType<InlineResponse20024>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Store UnitCategory
   * Store UnitCategory
   * @param accessToken User&#39;s OAuth2 access token
   * @param body UnitCategory that should be stored
   * @return InlineResponse20025
   */
  public InlineResponse20025 unitCategoriesPost(String accessToken, UnitCategory body) throws ApiException {
    Object postBody = body;
    
    // create path and map variables
    String path = "/unitCategories".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "quantimodo_oauth2" };

    
    GenericType<InlineResponse20025> returnType = new GenericType<InlineResponse20025>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get UnitCategory
   * Get UnitCategory
   * @param id id of UnitCategory
   * @param accessToken User&#39;s OAuth2 access token
   * @return InlineResponse20025
   */
  public InlineResponse20025 unitCategoriesIdGet(Integer id, String accessToken) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling unitCategoriesIdGet");
     }
     
    // create path and map variables
    String path = "/unitCategories/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "quantimodo_oauth2" };

    
    GenericType<InlineResponse20025> returnType = new GenericType<InlineResponse20025>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Update UnitCategory
   * Update UnitCategory
   * @param id id of UnitCategory
   * @param accessToken User&#39;s OAuth2 access token
   * @param body UnitCategory that should be updated
   * @return InlineResponse2002
   */
  public InlineResponse2002 unitCategoriesIdPut(Integer id, String accessToken, UnitCategory body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling unitCategoriesIdPut");
     }
     
    // create path and map variables
    String path = "/unitCategories/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "quantimodo_oauth2" };

    
    GenericType<InlineResponse2002> returnType = new GenericType<InlineResponse2002>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Delete UnitCategory
   * Delete UnitCategory
   * @param id id of UnitCategory
   * @param accessToken User&#39;s OAuth2 access token
   * @return InlineResponse2002
   */
  public InlineResponse2002 unitCategoriesIdDelete(Integer id, String accessToken) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling unitCategoriesIdDelete");
     }
     
    // create path and map variables
    String path = "/unitCategories/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "quantimodo_oauth2" };

    
    GenericType<InlineResponse2002> returnType = new GenericType<InlineResponse2002>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
