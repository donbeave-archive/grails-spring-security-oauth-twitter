grails-spring-security-oauth-twitter
====================================

Twitter extension for [Grails Spring Security OAuth][spring-security-oauth] plugin

Installation
------------

Add the following plugin definition to your BuildConfig:
```
…
plugins {
…
	compile ':spring-security-oauth:2.0.2'
	compile ':spring-security-oauth-twitter:0.1'
…
}
```

Usage
-----

Add to your Config:
```
oauth {
  …
  providers {
    …
    twitter {
      api = org.scribe.builder.api.FacebookApi
      key = 'oauth_facebook_key'
      secret = 'oauth_facebook_secret'
      successUri = '/oauth/facebook/success'
      failureUri = '/oauth/facebook/error'
      callback = "${baseURL}/oauth/facebook/callback"
    }
    …
  }
}
```

In your view you can use the taglib exposed from this plugin and from OAuth plugin to create links and to know if the user is authenticated with a given provider:
```
<oauth:connect provider="twitter" id="twitter-connect-link">Twitter</oauth:connect>
Logged with twitter? <s2o:ifLoggedInWith provider="twitter">yes</s2o:ifLoggedInWith> <s2o:ifNotLoggedInWith provider="twitter">no</s2o:ifNotLoggedInWith>
```
