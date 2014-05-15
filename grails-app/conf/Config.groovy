// configuration for plugin testing - will not be included in the plugin zip

log4j = {
    // Example of changing the log pattern for the default console
    // appender:
    //
    //appenders {
    //    console name:'stdout', layout:pattern(conversionPattern: '%c{2} %m%n')
    //}

    error  'org.codehaus.groovy.grails.web.servlet',  //  controllers
           'org.codehaus.groovy.grails.web.pages', //  GSP
           'org.codehaus.groovy.grails.web.sitemesh', //  layouts
           'org.codehaus.groovy.grails.web.mapping.filter', // URL mapping
           'org.codehaus.groovy.grails.web.mapping', // URL mapping
           'org.codehaus.groovy.grails.commons', // core / classloading
           'org.codehaus.groovy.grails.plugins', // plugins
           'org.codehaus.groovy.grails.orm.hibernate', // hibernate integration
           'org.springframework',
           'org.hibernate',
           'net.sf.ehcache.hibernate'
}

// just for test, to avoid oauthService BeanCreationException "No oauth configuration found"
environments {
  test {
    oauth {
      providers {
        twitter {
            api = org.scribe.builder.api.TwitterApi
            key = 'oauth_twitter_key'
            secret = 'oauth_twitter_secret'
            successUri = '/oauth/twitter/success'
            failureUri = '/oauth/twitter/failure'
            callback = "${baseURL}/oauth/twitter/callback"
        }
      }
    }
  }
}
