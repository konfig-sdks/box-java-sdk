

# Collection

A collection of items, including files and folders.  Currently, the only collection available is the `favorites` collection.  The contents of a collection can be explored in a similar way to which the contents of a folder is explored.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier for this collection. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | &#x60;collection&#x60; |  [optional] |
|**name** | [**NameEnum**](#NameEnum) | The name of the collection. |  [optional] |
|**collectionType** | [**CollectionTypeEnum**](#CollectionTypeEnum) | The type of the collection. This is used to determine the proper visual treatment for collections. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| COLLECTION | &quot;collection&quot; |



## Enum: NameEnum

| Name | Value |
|---- | -----|
| FAVORITES | &quot;Favorites&quot; |



## Enum: CollectionTypeEnum

| Name | Value |
|---- | -----|
| FAVORITES | &quot;favorites&quot; |



