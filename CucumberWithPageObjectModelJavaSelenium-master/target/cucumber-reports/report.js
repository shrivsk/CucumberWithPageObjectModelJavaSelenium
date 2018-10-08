$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/com/qa/features/freecrm.feature");
formatter.feature({
  "line": 1,
  "name": "Valtech Web test",
  "description": "",
  "id": "valtech-web-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate Valtech test",
  "description": "",
  "id": "valtech-web-test;validate-valtech-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user is on veltech home page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "validate homepage title",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User is on the recent blogs page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "validate recent blogs page title",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "validate about page header h1",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "validate work page header h1",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "validate service page header h1",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "count the total number of office",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageSteps.user_opens_browser()"
});
formatter.result({
  "duration": 26386554463,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_is_on_veltech_home_page()"
});
formatter.result({
  "duration": 4711101427,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.validateHomepageTitle()"
});
formatter.result({
  "duration": 39396947,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.userIsOnTheRecentBlogsPage()"
});
formatter.result({
  "duration": 136904804,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.validateBlogPageTitle()"
});
formatter.result({
  "duration": 178830921,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 28
    }
  ],
  "location": "HomePageSteps.validateAboutPageHeaderH(int)"
});
formatter.result({
  "duration": 3408803028,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 27
    }
  ],
  "location": "HomePageSteps.validateWorkPageHeaderH(int)"
});
formatter.result({
  "duration": 8318968341,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 30
    }
  ],
  "location": "HomePageSteps.validateServicePageHeaderH(int)"
});
formatter.result({
  "duration": 1377805200,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.countTheTotalNumberOfOffice()"
});
formatter.result({
  "duration": 3288041569,
  "status": "passed"
});
});