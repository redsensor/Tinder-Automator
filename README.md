Sample Appium Tinder Automation
---

This contains the source code for running sample [Appium](http://github.com/appium/appium) tests using [JUnit](http://www.junit.org).

In order to run the tests, you will need to install [Apache Maven](http://maven.apache.org), and Appium (according to the Appium [installation instructions](https://github.com/appium/appium).

You will then need to start appium, eg:

    grunt appium

To compile and run all tests, run:

    mvn clean test

To run a single test, run:

    mvn -Dtest=appium.tutorial.android.AutomatingASimpleActionTest test
