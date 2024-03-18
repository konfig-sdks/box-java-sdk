# AuthorizationApi

All URIs are relative to *https://api.box.com/2.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**authorize**](AuthorizationApi.md#authorize) | **GET** /authorize | Authorize user |
| [**refreshAccessToken**](AuthorizationApi.md#refreshAccessToken) | **POST** /oauth2/token#refresh | Refresh access token |
| [**requestAccessToken**](AuthorizationApi.md#requestAccessToken) | **POST** /oauth2/token | Request access token |
| [**revokeAccessToken**](AuthorizationApi.md#revokeAccessToken) | **POST** /oauth2/revoke | Revoke access token |


<a name="authorize"></a>
# **authorize**
> String authorize(responseType, clientId).redirectUri(redirectUri).state(state).scope(scope).execute();

Authorize user

Authorize a user by sending them through the [Box](https://box.com) website and request their permission to act on their behalf.  This is the first step when authenticating a user using OAuth 2.0. To request a user&#39;s authorization to use the Box APIs on their behalf you will need to send a user to the URL with this format.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthorizationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.box.com/2.0";
    Box client = new Box(configuration);
    String responseType = "code"; // The type of response we'd like to receive.
    String clientId = "ly1nj6n11vionaie65emwzk575hnnmrk"; // The Client ID of the application that is requesting to authenticate the user. To get the Client ID for your application, log in to your Box developer console and click the **Edit Application** link for the application you're working with. In the OAuth 2.0 Parameters section of the configuration page, find the item labelled `client_id`. The text of that item is your application's Client ID.
    String redirectUri = "http://example.com/auth/callback"; // The URI to which Box redirects the browser after the user has granted or denied the application permission. This URI match one of the redirect URIs in the configuration of your application. It must be a valid HTTPS URI and it needs to be able to handle the redirection to complete the next step in the OAuth 2.0 flow. Although this parameter is optional, it must be a part of the authorization URL if you configured multiple redirect URIs for the application in the developer console. A missing parameter causes a `redirect_uri_missing` error after the user grants application access.
    String state = "my_state"; // A custom string of your choice. Box will pass the same string to the redirect URL when authentication is complete. This parameter can be used to identify a user on redirect, as well as protect against hijacked sessions and other exploits.
    String scope = "admin_readwrite"; // A space-separated list of application scopes you'd like to authenticate the user for. This defaults to all the scopes configured for the application in its configuration page.
    try {
      String result = client
              .authorization
              .authorize(responseType, clientId)
              .redirectUri(redirectUri)
              .state(state)
              .scope(scope)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationApi#authorize");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .authorization
              .authorize(responseType, clientId)
              .redirectUri(redirectUri)
              .state(state)
              .scope(scope)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationApi#authorize");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **responseType** | **String**| The type of response we&#39;d like to receive. | [enum: code] |
| **clientId** | **String**| The Client ID of the application that is requesting to authenticate the user. To get the Client ID for your application, log in to your Box developer console and click the **Edit Application** link for the application you&#39;re working with. In the OAuth 2.0 Parameters section of the configuration page, find the item labelled &#x60;client_id&#x60;. The text of that item is your application&#39;s Client ID. | |
| **redirectUri** | **String**| The URI to which Box redirects the browser after the user has granted or denied the application permission. This URI match one of the redirect URIs in the configuration of your application. It must be a valid HTTPS URI and it needs to be able to handle the redirection to complete the next step in the OAuth 2.0 flow. Although this parameter is optional, it must be a part of the authorization URL if you configured multiple redirect URIs for the application in the developer console. A missing parameter causes a &#x60;redirect_uri_missing&#x60; error after the user grants application access. | [optional] |
| **state** | **String**| A custom string of your choice. Box will pass the same string to the redirect URL when authentication is complete. This parameter can be used to identify a user on redirect, as well as protect against hijacked sessions and other exploits. | [optional] |
| **scope** | **String**| A space-separated list of application scopes you&#39;d like to authenticate the user for. This defaults to all the scopes configured for the application in its configuration page. | [optional] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Does not return any data, but rather should be used in the browser. |  -  |
| **0** | Does not return any data, but rather should be used in the browser. |  -  |

<a name="refreshAccessToken"></a>
# **refreshAccessToken**
> AccessToken refreshAccessToken(grantType, clientId, clientSecret, refreshToken).postOAuth2TokenRefreshAccessToken(postOAuth2TokenRefreshAccessToken).execute();

Refresh access token

Refresh an Access Token using its client ID, secret, and refresh token.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthorizationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.box.com/2.0";
    Box client = new Box(configuration);
    String grantType = "refresh_token"; // The type of request being made, in this case a refresh request.
    String clientId = "clientId_example"; // The client ID of the application requesting to refresh the token.
    String clientSecret = "clientSecret_example"; // The client secret of the application requesting to refresh the token.
    String refreshToken = "refreshToken_example"; // The refresh token to refresh.
    try {
      AccessToken result = client
              .authorization
              .refreshAccessToken(grantType, clientId, clientSecret, refreshToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccessToken());
      System.out.println(result.getExpiresIn());
      System.out.println(result.getTokenType());
      System.out.println(result.getRestrictedTo());
      System.out.println(result.getRefreshToken());
      System.out.println(result.getIssuedTokenType());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationApi#refreshAccessToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AccessToken> response = client
              .authorization
              .refreshAccessToken(grantType, clientId, clientSecret, refreshToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationApi#refreshAccessToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **grantType** | **String**| The type of request being made, in this case a refresh request. | [enum: refresh_token] |
| **clientId** | **String**| The client ID of the application requesting to refresh the token. | |
| **clientSecret** | **String**| The client secret of the application requesting to refresh the token. | |
| **refreshToken** | **String**| The refresh token to refresh. | |
| **postOAuth2TokenRefreshAccessToken** | [**PostOAuth2TokenRefreshAccessToken**](PostOAuth2TokenRefreshAccessToken.md)|  | [optional] |

### Return type

[**AccessToken**](AccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a new Access Token that can be used to make authenticated API calls by passing along the token in a authorization header as follows &#x60;Authorization: Bearer &lt;Token&gt;&#x60;. |  -  |
| **0** | An authentication error. |  -  |

<a name="requestAccessToken"></a>
# **requestAccessToken**
> AccessToken requestAccessToken(grantType).clientId(clientId).clientSecret(clientSecret).code(code).refreshToken(refreshToken).assertion(assertion).subjectToken(subjectToken).subjectTokenType(subjectTokenType).actorToken(actorToken).actorTokenType(actorTokenType).scope(scope).resource(resource).boxSubjectType(boxSubjectType).boxSubjectId(boxSubjectId).boxSharedLink(boxSharedLink).postOAuth2Token(postOAuth2Token).execute();

Request access token

Request an Access Token using either a client-side obtained OAuth 2.0 authorization code or a server-side JWT assertion.  An Access Token is a string that enables Box to verify that a request belongs to an authorized session. In the normal order of operations you will begin by requesting authentication from the [authorize](https://raw.githubusercontent.com) endpoint and Box will send you an authorization code.  You will then send this code to this endpoint to exchange it for an Access Token. The returned Access Token can then be used to to make Box API calls.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthorizationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.box.com/2.0";
    Box client = new Box(configuration);
    String grantType = "authorization_code"; // The type of request being made, either using a client-side obtained authorization code, a refresh token, a JWT assertion, client credentials grant or another access token for the purpose of downscoping a token.
    String clientId = "clientId_example"; // The Client ID of the application requesting an access token.  Used in combination with `authorization_code`, `client_credentials`, or `urn:ietf:params:oauth:grant-type:jwt-bearer` as the `grant_type`.
    String clientSecret = "clientSecret_example"; // The client secret of the application requesting an access token.  Used in combination with `authorization_code`, `client_credentials`, or `urn:ietf:params:oauth:grant-type:jwt-bearer` as the `grant_type`.
    String code = "code_example"; // The client-side authorization code passed to your application by Box in the browser redirect after the user has successfully granted your application permission to make API calls on their behalf.  Used in combination with `authorization_code` as the `grant_type`.
    String refreshToken = "refreshToken_example"; // A refresh token used to get a new access token with.  Used in combination with `refresh_token` as the `grant_type`.
    String assertion = "assertion_example"; // A JWT assertion for which to request a new access token.  Used in combination with `urn:ietf:params:oauth:grant-type:jwt-bearer` as the `grant_type`.
    String subjectToken = "subjectToken_example"; // The token to exchange for a downscoped token. This can be a regular access token, a JWT assertion, or an app token.  Used in combination with `urn:ietf:params:oauth:grant-type:token-exchange` as the `grant_type`.
    String subjectTokenType = "urn:ietf:params:oauth:token-type:access_token"; // The type of `subject_token` passed in.  Used in combination with `urn:ietf:params:oauth:grant-type:token-exchange` as the `grant_type`.
    String actorToken = "actorToken_example"; // The token used to create an annotator token. This is a JWT assertion.  Used in combination with `urn:ietf:params:oauth:grant-type:token-exchange` as the `grant_type`.
    String actorTokenType = "urn:ietf:params:oauth:token-type:id_token"; // The type of `actor_token` passed in.  Used in combination with `urn:ietf:params:oauth:grant-type:token-exchange` as the `grant_type`.
    String scope = "scope_example"; // The space-delimited list of scopes that you want apply to the new access token.  The `subject_token` will need to have all of these scopes or the call will error with **401 Unauthorized**.
    String resource = "resource_example"; // Full URL for the file that the token should be generated for.
    String boxSubjectType = "enterprise"; // Used in combination with `client_credentials` as the `grant_type`.
    String boxSubjectId = "boxSubjectId_example"; // Used in combination with `client_credentials` as the `grant_type`. Value is determined by `box_subject_type`. If `user` use user ID and if `enterprise` use enterprise ID.
    String boxSharedLink = "boxSharedLink_example"; // Full URL of the shared link on the file or folder that the token should be generated for.
    try {
      AccessToken result = client
              .authorization
              .requestAccessToken(grantType)
              .clientId(clientId)
              .clientSecret(clientSecret)
              .code(code)
              .refreshToken(refreshToken)
              .assertion(assertion)
              .subjectToken(subjectToken)
              .subjectTokenType(subjectTokenType)
              .actorToken(actorToken)
              .actorTokenType(actorTokenType)
              .scope(scope)
              .resource(resource)
              .boxSubjectType(boxSubjectType)
              .boxSubjectId(boxSubjectId)
              .boxSharedLink(boxSharedLink)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccessToken());
      System.out.println(result.getExpiresIn());
      System.out.println(result.getTokenType());
      System.out.println(result.getRestrictedTo());
      System.out.println(result.getRefreshToken());
      System.out.println(result.getIssuedTokenType());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationApi#requestAccessToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AccessToken> response = client
              .authorization
              .requestAccessToken(grantType)
              .clientId(clientId)
              .clientSecret(clientSecret)
              .code(code)
              .refreshToken(refreshToken)
              .assertion(assertion)
              .subjectToken(subjectToken)
              .subjectTokenType(subjectTokenType)
              .actorToken(actorToken)
              .actorTokenType(actorTokenType)
              .scope(scope)
              .resource(resource)
              .boxSubjectType(boxSubjectType)
              .boxSubjectId(boxSubjectId)
              .boxSharedLink(boxSharedLink)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationApi#requestAccessToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **grantType** | **String**| The type of request being made, either using a client-side obtained authorization code, a refresh token, a JWT assertion, client credentials grant or another access token for the purpose of downscoping a token. | [enum: authorization_code, refresh_token, client_credentials, urn:ietf:params:oauth:grant-type:jwt-bearer, urn:ietf:params:oauth:grant-type:token-exchange] |
| **clientId** | **String**| The Client ID of the application requesting an access token.  Used in combination with &#x60;authorization_code&#x60;, &#x60;client_credentials&#x60;, or &#x60;urn:ietf:params:oauth:grant-type:jwt-bearer&#x60; as the &#x60;grant_type&#x60;. | [optional] |
| **clientSecret** | **String**| The client secret of the application requesting an access token.  Used in combination with &#x60;authorization_code&#x60;, &#x60;client_credentials&#x60;, or &#x60;urn:ietf:params:oauth:grant-type:jwt-bearer&#x60; as the &#x60;grant_type&#x60;. | [optional] |
| **code** | **String**| The client-side authorization code passed to your application by Box in the browser redirect after the user has successfully granted your application permission to make API calls on their behalf.  Used in combination with &#x60;authorization_code&#x60; as the &#x60;grant_type&#x60;. | [optional] |
| **refreshToken** | **String**| A refresh token used to get a new access token with.  Used in combination with &#x60;refresh_token&#x60; as the &#x60;grant_type&#x60;. | [optional] |
| **assertion** | **String**| A JWT assertion for which to request a new access token.  Used in combination with &#x60;urn:ietf:params:oauth:grant-type:jwt-bearer&#x60; as the &#x60;grant_type&#x60;. | [optional] |
| **subjectToken** | **String**| The token to exchange for a downscoped token. This can be a regular access token, a JWT assertion, or an app token.  Used in combination with &#x60;urn:ietf:params:oauth:grant-type:token-exchange&#x60; as the &#x60;grant_type&#x60;. | [optional] |
| **subjectTokenType** | **String**| The type of &#x60;subject_token&#x60; passed in.  Used in combination with &#x60;urn:ietf:params:oauth:grant-type:token-exchange&#x60; as the &#x60;grant_type&#x60;. | [optional] [enum: urn:ietf:params:oauth:token-type:access_token] |
| **actorToken** | **String**| The token used to create an annotator token. This is a JWT assertion.  Used in combination with &#x60;urn:ietf:params:oauth:grant-type:token-exchange&#x60; as the &#x60;grant_type&#x60;. | [optional] |
| **actorTokenType** | **String**| The type of &#x60;actor_token&#x60; passed in.  Used in combination with &#x60;urn:ietf:params:oauth:grant-type:token-exchange&#x60; as the &#x60;grant_type&#x60;. | [optional] [enum: urn:ietf:params:oauth:token-type:id_token] |
| **scope** | **String**| The space-delimited list of scopes that you want apply to the new access token.  The &#x60;subject_token&#x60; will need to have all of these scopes or the call will error with **401 Unauthorized**. | [optional] |
| **resource** | **String**| Full URL for the file that the token should be generated for. | [optional] |
| **boxSubjectType** | **String**| Used in combination with &#x60;client_credentials&#x60; as the &#x60;grant_type&#x60;. | [optional] [enum: enterprise, user] |
| **boxSubjectId** | **String**| Used in combination with &#x60;client_credentials&#x60; as the &#x60;grant_type&#x60;. Value is determined by &#x60;box_subject_type&#x60;. If &#x60;user&#x60; use user ID and if &#x60;enterprise&#x60; use enterprise ID. | [optional] |
| **boxSharedLink** | **String**| Full URL of the shared link on the file or folder that the token should be generated for. | [optional] |
| **postOAuth2Token** | [**PostOAuth2Token**](PostOAuth2Token.md)|  | [optional] |

### Return type

[**AccessToken**](AccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a new Access Token that can be used to make authenticated API calls by passing along the token in a authorization header as follows &#x60;Authorization: Bearer &lt;Token&gt;&#x60;. |  -  |
| **0** | An authentication error. |  -  |

<a name="revokeAccessToken"></a>
# **revokeAccessToken**
> revokeAccessToken().clientId(clientId).clientSecret(clientSecret).token(token).postOAuth2Revoke(postOAuth2Revoke).execute();

Revoke access token

Revoke an active Access Token, effectively logging a user out that has been previously authenticated.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Box;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthorizationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.box.com/2.0";
    Box client = new Box(configuration);
    String clientId = "clientId_example"; // The Client ID of the application requesting to revoke the access token.
    String clientSecret = "clientSecret_example"; // The client secret of the application requesting to revoke an access token.
    String token = "token_example"; // The access token to revoke.
    try {
      client
              .authorization
              .revokeAccessToken()
              .clientId(clientId)
              .clientSecret(clientSecret)
              .token(token)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationApi#revokeAccessToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .authorization
              .revokeAccessToken()
              .clientId(clientId)
              .clientSecret(clientSecret)
              .token(token)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorizationApi#revokeAccessToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **clientId** | **String**| The Client ID of the application requesting to revoke the access token. | [optional] |
| **clientSecret** | **String**| The client secret of the application requesting to revoke an access token. | [optional] |
| **token** | **String**| The access token to revoke. | [optional] |
| **postOAuth2Revoke** | [**PostOAuth2Revoke**](PostOAuth2Revoke.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an empty response when the token was successfully revoked. |  -  |
| **0** | An authentication error. |  -  |

