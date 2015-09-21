grails-spring-security-oauth-twitter [![Build Status](https://api.travis-ci.org/donbeave/grails-spring-security-oauth-twitter.png?branch=master)](https://travis-ci.org/donbeave/grails-spring-security-oauth-twitter)
====================================

Twitter extension for [Grails Spring Security OAuth][spring-security-oauth-plugin] plugin

Installation
------------

Add the following plugin definition to your BuildConfig:
```groovy
// ...
plugins {
  // ...
  compile ':spring-security-oauth:2.0.2'
  compile ':spring-security-oauth-twitter:0.1'
  // ...
}
```

Usage
-----

Add to your Config:
```groovy
oauth {
  // ...
  providers {
    // ...
    twitter {
      // for spring-security-oauth version 2.0.2
      api = org.scribe.builder.api.TwitterApi.SSL
      // for spring-security-oauth version 2.1.0 and above
      // api = org.scribe.builder.api.TwitterApi
      key = 'oauth_twitter_key'
      secret = 'oauth_twitter_secret'
      successUri = '/oauth/twitter/success'
      failureUri = '/oauth/twitter/error'
      callback = "${baseURL}/oauth/twitter/callback"
    }
    // ...
  }
}
```

In your view you can use the taglib exposed from this plugin and from OAuth plugin to create links and to know if the user is authenticated with a given provider:
```xml
<oauth:connect provider="twitter" id="twitter-connect-link">Twitter</oauth:connect>

Logged with twitter?
<s2o:ifLoggedInWith provider="twitter">yes</s2o:ifLoggedInWith>
<s2o:ifNotLoggedInWith provider="twitter">no</s2o:ifNotLoggedInWith>
```

Copyright and license
---------------------

Copyright 2012-2014 Mihai Cazacu, Enrico Comiti and Alexey Zhokhov under the [Apache License, Version 2.0](LICENSE). Supported by [AZ][zhokhov].

[zhokhov]: http://www.zhokhov.com
[spring-security-oauth-plugin]: https://github.com/enr/grails-spring-security-oauth
