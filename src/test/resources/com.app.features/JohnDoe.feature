Feature: Find contact

Background:
Given I logged into suiteCRM

Scenario: John Doe Search
   When I search for "John Doe"
   Then link for user "John Doe" should be displayed

 Scenario: John Doe click
      And I open contact "John Doe"
      Then contact name should be "John Doe"
      And contact email should be "johnDoe@example.org"