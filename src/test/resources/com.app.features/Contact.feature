Feature: Contact creation
Background: 
    Given I logged into SuiteCRM
@dastan
Scenario Outline: contact creation and validation
    And I go to create contact page1
    Then I create new contact using1 "<prefix>" "<firstName>" "<lastName>" "<phoneNumber>" "<title>"
    And I validate all created contact1 info "<prefix>" "<firstName>" "<lastName>" "<phoneNumber>" "<title>"
    Then I logout from application1

    
Examples:
| prefix | firstName | lastName | phoneNumber | title |
|Prof.   |   James   |    Bond  | 7733334400  | 007   |
|Dr.     |   House   |    Gred  | 2747344400  | Brain |



    
    