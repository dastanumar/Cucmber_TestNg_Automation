$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com.app.features/Contact.feature");
formatter.feature({
  "name": "Contact creation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "contact creation and validation",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@dastan"
    }
  ]
});
formatter.step({
  "name": "I go to create contact page1",
  "keyword": "And "
});
formatter.step({
  "name": "I create new contact using1 \"\u003cprefix\u003e\" \"\u003cfirstName\u003e\" \"\u003clastName\u003e\" \"\u003cphoneNumber\u003e\" \"\u003ctitle\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "I validate all created contact1 info \"\u003cprefix\u003e\" \"\u003cfirstName\u003e\" \"\u003clastName\u003e\" \"\u003cphoneNumber\u003e\" \"\u003ctitle\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I logout from application1",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "prefix",
        "firstName",
        "lastName",
        "phoneNumber",
        "title"
      ]
    },
    {
      "cells": [
        "Prof.",
        "James",
        "Bond",
        "7733334400",
        "007"
      ]
    },
    {
      "cells": [
        "Dr.",
        "House",
        "Gred",
        "2747344400",
        "Brain"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I logged into SuiteCRM",
  "keyword": "Given "
});
formatter.match({
  "location": "UITestStepDefinition.i_logged_into_SuiteCRM()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "contact creation and validation",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@dastan"
    }
  ]
});
formatter.step({
  "name": "I go to create contact page1",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I create new contact using1 \"Prof.\" \"James\" \"Bond\" \"7733334400\" \"007\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I validate all created contact1 info \"Prof.\" \"James\" \"Bond\" \"7733334400\" \"007\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I logout from application1",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I logged into SuiteCRM",
  "keyword": "Given "
});
formatter.match({
  "location": "UITestStepDefinition.i_logged_into_SuiteCRM()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "contact creation and validation",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@dastan"
    }
  ]
});
formatter.step({
  "name": "I go to create contact page1",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I create new contact using1 \"Dr.\" \"House\" \"Gred\" \"2747344400\" \"Brain\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I validate all created contact1 info \"Dr.\" \"House\" \"Gred\" \"2747344400\" \"Brain\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I logout from application1",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});