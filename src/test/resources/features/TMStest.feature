Feature: As user I want to create Orders using TMS Application.

  Scenario Outline: Validate that user can be able to create Order.
    Given User has valid data and information to create order.
    And User logs into TMS Website
    And Redirected to dashboard to create order
    And User click create order button
    And Captures and Select Order Information '<OrderId>', '<PONumber>', '<Customer>', '<Route>', '<Product>', '<ProductDescription>', '<DeliveryType>', '<Quantity>', '<SlotTime>'.
    Then Click Save Button.
    And Click Edit Button
    And Click Auth Button


    Examples:
      | OrderId | PONumber | Customer           | Route              | Product | ProductDescription | DeliveryType | Quantity | CollectionDate | DeliveryDate | SlotTime |
      |TMS001   |TMS002    |SIM001 - Simone Sims|000001 - Zinja Mguni|Product  |TMSP1               |DeliveryType |20         |2024-09-22     |2024-09-22    |00:00     |
      |TMS001   |TMS002    |SIM001 - Simone Sims|000001 - Zinja Mguni|Product  |TMSP2               |DeliveryType |20         |2024-09-22     |2024-09-22    |00:00     |
      |TMS001   |TMS002    |SIM001 - Simone Sims|000001 - Zinja Mguni|Product  |TMSP3               |DeliveryType |20         |2024-09-22     |2024-09-22    |00:00     |


