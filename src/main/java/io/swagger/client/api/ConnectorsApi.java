package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiInvoker;

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
  String basePath = "https://localhost/api";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
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

    
    
    String[] contentTypes = {
      
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (List<Connector>) ApiInvoker.deserialize(response, "array", Connector.class);
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
   * The `connect` method tells it to attempt to obtain a token from the data provider, store it in `connect`.`credentials`, allowing the connector to obtain user data.
   * @param connector Lowercase system name of the source application or device
   * @return void
   */
  public void connectorsConnectorConnectGet (String connector) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/connectors/{connector}/connect".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "connector" + "\\}", apiInvoker.escapeString(connector.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    
    
    String[] contentTypes = {
      
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
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
   * The `connectInstructions` method returns instructions that describe what parameters and endpoint to use to connect to the given data provider.
   * @param connector Lowercase system name of the source application or device
   * @return void
   */
  public void connectorsConnectorConnectInstructionsGet (String connector) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/connectors/{connector}/connectInstructions".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "connector" + "\\}", apiInvoker.escapeString(connector.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    
    
    String[] contentTypes = {
      
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
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
   * The `disconnect` method deletes any stored tokens or connection information from the `connectors` database.
   * @param connector Lowercase system name of the source application or device
   * @return void
   */
  public void connectorsConnectorDisconnectGet (String connector) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/connectors/{connector}/disconnect".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "connector" + "\\}", apiInvoker.escapeString(connector.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    
    
    String[] contentTypes = {
      
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
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
   * The `info` method returns information about the connector such as the connector id, whether or not is connected (i.e. we have a token in the `connector`.`credentials` table, and the update history from the `connector`.`updates` table.)
   * @param connector Lowercase system name of the source application or device
   * @return void
   */
  public void connectorsConnectorInfoGet (String connector) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/connectors/{connector}/info".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "connector" + "\\}", apiInvoker.escapeString(connector.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    
    
    String[] contentTypes = {
      
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
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
   * The `update` method tells the QM Connector Framework to check with the data provider (such as Fitbit or MyFitnessPal) and put any new data in the `quantimodo`.`measurements` table.
   * @param connector Lowercase system name of the source application or device
   * @return void
   */
  public void connectorsConnectorUpdateGet (String connector) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/connectors/{connector}/update".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "connector" + "\\}", apiInvoker.escapeString(connector.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    
    
    String[] contentTypes = {
      
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
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
