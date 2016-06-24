# UserApi

All URIs are relative to *https://app.quantimo.do/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1OrganizationsOrganizationIdUsersPost**](UserApi.md#v1OrganizationsOrganizationIdUsersPost) | **POST** /v1/organizations/{organizationId}/users | Get user tokens for existing users, create new users
[**v1UserMeGet**](UserApi.md#v1UserMeGet) | **GET** /v1/user/me | Get all available units for variableGet authenticated user


<a name="v1OrganizationsOrganizationIdUsersPost"></a>
# **v1OrganizationsOrganizationIdUsersPost**
> UserTokenSuccessfulResponse v1OrganizationsOrganizationIdUsersPost(organizationId, body, accessToken)

Get user tokens for existing users, create new users

Get user tokens for existing users, create new users

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: internalApiKey
ApiKeyAuth internalApiKey = (ApiKeyAuth) defaultClient.getAuthentication("internalApiKey");
internalApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//internalApiKey.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
Integer organizationId = 56; // Integer | Organization ID
UserTokenRequest body = new UserTokenRequest(); // UserTokenRequest | Provides organization token and user ID
String accessToken = "accessToken_example"; // String | User's OAuth2 access token
try {
    UserTokenSuccessfulResponse result = apiInstance.v1OrganizationsOrganizationIdUsersPost(organizationId, body, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#v1OrganizationsOrganizationIdUsersPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **Integer**| Organization ID |
 **body** | [**UserTokenRequest**](UserTokenRequest.md)| Provides organization token and user ID |
 **accessToken** | **String**| User&#39;s OAuth2 access token | [optional]

### Return type

[**UserTokenSuccessfulResponse**](UserTokenSuccessfulResponse.md)

### Authorization

[oauth2](../README.md#oauth2), [internalApiKey](../README.md#internalApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="v1UserMeGet"></a>
# **v1UserMeGet**
> User v1UserMeGet()

Get all available units for variableGet authenticated user

Returns user info for the currently authenticated user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

UserApi apiInstance = new UserApi();
try {
    User result = apiInstance.v1UserMeGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#v1UserMeGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**User**](User.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

