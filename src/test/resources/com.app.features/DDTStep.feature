Feature: DDT within step testing
@run1
Scenario: Testing
   #Given I logged into SuiteCRM
   Then I pass info
| prefix | firstName | lastName | phoneNumber | title |
|Prof.   |   James   |    Bond  | 7733334400  | 007   |
|Dr.     |   House   |    Gred  | 2747344400  | Brain |
   Then I logout from application