

# SignRequestAllOfSignFiles

List of files that will be signed, which are copies of the original source files. A new version of these files are created as signers sign and can be downloaded at any point in the signing process.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**files** | [**List&lt;FileMini&gt;**](FileMini.md) |  |  [optional] |
|**isReadyForDownload** | **Boolean** | Indicates whether the &#x60;sign_files&#x60; documents are processing and the PDFs may be out of date. A change to any document requires processing on all &#x60;sign_files&#x60;. We recommended waiting until processing is finished (and this value is true) before downloading the PDFs. |  [optional] |



