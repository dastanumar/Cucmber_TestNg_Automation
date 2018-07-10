Feature: Contact Search
Scenario: Contact Search with data excel sheet
Given I logged into suiteCRM
And I validate contacts with data in excel sheet "test1.xlsx" and "Sheet2"
Then I logout from application