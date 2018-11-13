# Micronaut-jwt

Micronaut support various in-built security features. To implement them, we need to enable security flag true in configuration.
This makes all the requests to throw error #401. It is necessary to implement a Authentication Access provider and overide 'authenticate' method in order to access those endpoints.

Micronaut provides in-built endpoints such as /login, /logout, /oauth/access_token to send POST requests with user-credentials to login, logout and refresh access token respectively.
