# Rest Template
A REST Client in Java using Spring RestTemplate

Want to trigger an email or send a push notification. Want to consume any third party APIs. Using Spring's RestTemplate can be a simple solution whenever you want to access any API from your own WebServer.

=====
## POST

``` java
PostObject payload = new PostObject();
RestClient client = new RestClient("your_url");
client.post(payload,APIResponse.class);
```
## GET

``` java
RestClient client = new RestClient("your_url");
client.get(APIResponse.class);
```

## Multipart POST

``` java
RestClient client = new RestClient("your_url");
List<FormRequest> lists = new ArrayList<>();
FormRequest form = new FormRequest();
form.setKey("file");
MultipartFile file = ".. your file..";
form.setData(file);
lists.add(form);
client.multipartPost(lists,APIResponse.class);
```

## Adding headers, query or path params

The RestClient constructor is overloaded in order to accomodate headers, query params and path params

``` java
// all these are instances of Map<String, String>
RestClient client = new RestClient("your_url",queryParams,urlParams,headers);
```
## Async calls

A ListenableFuture is used in order to receive callbacks

``` java
client.postAsync(payload,APIResponse.class)..addCallback(new ListenableFutureCallback<ResponseEntity<APIResponse>>() {

			@Override
			public void onSuccess(ResponseEntity<APIResponse> arg0) {
				arg0.getBody(); // returns an instance ofAPIResponse
				
			}

			@Override
			public void onFailure(Throwable arg0) {
				// handle errors
				
			}

			
		});
```        


