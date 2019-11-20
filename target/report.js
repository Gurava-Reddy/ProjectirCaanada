$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/Login.feature");
formatter.feature({
  "name": "Validation of Facebook details",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login Validation",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is on FaceBook Page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.user_is_on_FaceBook_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Registrtion Detais",
  "rows": [
    {
      "cells": [
        "Logan",
        "Woverine",
        "logan@gmail.com",
        "wolverinexmen"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.user_enters_Registrtion_Detais(DataTable)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#u_0_7\"}\n  (Session info: chrome\u003d78.0.3904.97)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-203SGUU\u0027, ip: \u0027192.168.43.130\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_231\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 78.0.3904.97, chrome: {chromedriverVersion: 77.0.3865.40 (f484704e052e0..., userDataDir: C:\\Users\\chandu.mv\\AppData\\...}, goog:chromeOptions: {debuggerAddress: localhost:51614}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 44b441de4956debe911428c4d59c0f15\n*** Element info: {Using\u003did, value\u003du_0_7}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy16.click(Unknown Source)\r\n\tat com.lib.LibGlobal.selectRB(LibGlobal.java:60)\r\n\tat com.steps.StepDefination.user_enters_Registrtion_Detais(StepDefination.java:83)\r\n\tat ✽.User enters Registrtion Detais(file:src/test/resources/Feature/Login.feature:5)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User Verifies the Succces Message",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.user_Verifies_the_Succces_Message()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Quit the Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.quit_the_Browser()"
});
formatter.result({
  "status": "skipped"
});
});