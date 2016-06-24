
# Connection

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | id |  [optional]
**userId** | **Integer** | ID of user that owns this correlation |  [optional]
**connectorId** | **Integer** | The id for the connector data source for which the connection is connected | 
**connectStatus** | **String** | Indicates whether a connector is currently connected to a service for a user. |  [optional]
**connectError** | **String** | Error message if there is a problem with authorizing this connection. |  [optional]
**updateRequestedAt** | [**DateTime**](DateTime.md) | Time at which an update was requested by a user. |  [optional]
**updateStatus** | **String** | Indicates whether a connector is currently updated. |  [optional]
**updateError** | **String** | Indicates if there was an error during the update. |  [optional]
**lastSuccessfulUpdatedAt** | [**DateTime**](DateTime.md) | The time at which the connector was last successfully updated. |  [optional]
**createdAt** | [**DateTime**](DateTime.md) | When the record was first created. Use ISO 8601 datetime format |  [optional]
**updatedAt** | [**DateTime**](DateTime.md) | When the record in the database was last updated. Use ISO 8601 datetime format |  [optional]



