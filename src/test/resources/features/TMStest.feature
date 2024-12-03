Feature: As Driver I want to create an Order using TMS Application.

  Scenario Outline: Validate that user can be able to create Order.
    Given User has valid data and information to create order.
    And User logs into TMS Website
    And Redirected to dashboard to create order
    And User click create order button
    And Captures and Select Order Information '<OrderId>', '<PONumber>', '<Customer>', '<Route>', '<Product>', '<ProductDescription>', '<DeliveryType>', '<Quantity>', '<SlotTime>'.
    Then Click Save Button.



    Examples:
      |OrderId    |PONumber           |Customer            |Route               |Product  |ProductDescription           |DeliveryType |Quantity    |SlotTime |
      |OrderId 1st|Product Order 10111|SIM001 - Simone Sims|000001 - Zinja Mguni|Product  |Order Successfully Created 01|DeliveryType |20          |00:00     |
      |OrderId 2nd|Product Order 10112|SIM001 - Simone Sims|000001 - Zinja Mguni|Product  |Order Successfully Created 02|DeliveryType |10          |00:00     |
      |OrderId 3rd|Product Order 10113|SIM001 - Simone Sims|000001 - Zinja Mguni|Product  |Order Successfully Created 03|DeliveryType |5           |00:00     |


