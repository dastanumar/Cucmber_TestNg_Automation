Feature: Note on Dashboard
@smoke
Scenario: Post a note on Dashboard
      Given I logged into SuiteCRM
      When I post "Hello Everyone"
      Then Post should be displayed
      Then I logout from application
  
