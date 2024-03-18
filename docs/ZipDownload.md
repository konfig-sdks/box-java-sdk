

# ZipDownload

Represents a successful request to create a `zip` archive of a list of files and folders.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**downloadUrl** | **String** | The URL that can be used to download the &#x60;zip&#x60; archive. A &#x60;Get&#x60; request to this URL will start streaming the items requested. By default, this URL is only valid for a few seconds, until the &#x60;expires_at&#x60; time, unless a download is started after which it is valid for the duration of the download.  It is important to note that the domain and path of this URL might change between API calls, and therefore it&#39;s important to use this URL as-is. |  [optional] |
|**statusUrl** | **String** | The URL that can be used to get the status of the &#x60;zip&#x60; archive being downloaded. A &#x60;Get&#x60; request to this URL will return the number of files in the archive as well as the number of items already downloaded or skipped. By default, this URL is only valid for a few seconds, until the &#x60;expires_at&#x60; time, unless a download is started after which the URL is valid for 12 hours from the start of the download.  It is important to note that the domain and path of this URL might change between API calls, and therefore it&#39;s important to use this URL as-is. |  [optional] |
|**expiresAt** | **OffsetDateTime** | The time and date when this archive will expire. After this time the &#x60;status_url&#x60; and &#x60;download_url&#x60; will return an error.  By default, these URLs are only valid for a few seconds, unless a download is started after which the &#x60;download_url&#x60; is valid for the duration of the download, and the &#x60;status_url&#x60; is valid for 12 hours from the start of the download. |  [optional] |
|**nameConflicts** | **List&lt;List&lt;ZipDownloadNameConflictsInnerInner&gt;&gt;** | A list of conflicts that occurred when trying to create the archive. This would occur when multiple items have been requested with the same name.  To solve these conflicts, the API will automatically rename an item and return a mapping between the original item&#39;s name and its new name.  For every conflict, both files will be renamed and therefore this list will always be a multiple of 2. |  [optional] |



