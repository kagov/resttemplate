# Rest Template
A REST Client in Java using Spring RestTemplate

Want to trigger an email or send a push notification. Want to consume any third party APIs. Using Spring's RestTemplate can be a simple solution whenever you want to access any API from your own WebServer.

=====
## POST

``` java
PostObject payload = new PostObject();
RestClient.post(payload,"your/endpoint/url",APIResponse.class);
```
