
Feature: As a User I want to Validate TMS Platform Login Functionality

  Scenario Outline: Validate logIn functionality with valid credentials
    Given Driver has launched TMS Platform
    When Driver Captures UserName and Password
    And Driver click Login
    And Click Order Button
    And Click Create Order Button
    And Enter '<OrderId>' and '<PONumber>'
    And Select '<Customer>', '<Route>', '<Product>', Capture '<ProductDescription>', select '<DeliveryType>' and Capture '<Quantity>'
    And Enter '<CollectionDate>', '<DeliveryDate>' and '<SlotTime>'
    Then Click SaveButton


    Examples:
      | OrderId | PONumber | Customer | Route | Product | ProductDescription | DeliveryType | Quantity | CollectionDate | DeliveryDate | SlotTime |
      |TMS001   |TMS002    |SIM001 - Simone Sims|000001 - Zinja Mguni|Product|TMSP|DeliveryType|20|2024-09-22  |2024-09-22    |01:30     |

