
Feature: As a User I want to Validate TMS Platform Login Functionality

  Scenario Outline: Validate logIn functionality with valid credentials
    Given Driver has launched TMS Platform
    When Driver Captures UserName and Password
    And Driver click Login
    And Click Order Button
    And Click Create Order Button
    And Enter '<OrderId>' and '<PONumber>'
    And Select '<Customer>', '<Route>', '<Product>', Capture '<ProductDescription>', select '<DeliveryType>' and Capture '<Quantity>'
    And Enter '<SlotTime>'

    Then Click SaveButton
    And Click Edit Button
    And Click Auth Button


    @Test1
    Examples:
      | OrderId |PONumber|Customer          | Route              |Product|ProductDescription|DeliveryType|Quantity| SlotTime |
      |TMS11011   |TMS10111|000001 - Customer 1|000001 - Josh|Product|TMCLeSP           |Cargo Trucks|20      |00:00     |
#      |TMS008   |TMS004|SIM001 - Simone Sims|000001 - Zinja Mguni|Product|TMCLeSP           |Cargo Trucks|2      |00:00     |

#      |TMS001   |TMS002|SIM001 - Simone Sims|000001 - Zinja Mguni|Product|TMCLeSP           |Cargo Trucks|20         |00:00     |
#      |TMS001   |TMS002|SIM001 - Simone Sims|000001 - Zinja Mguni|Product|TMCLeSP           |Cargo Trucks|20         |00:00     |
#
#      |TMS001   |TMS002|SIM001 - Simone Sims|000001 - Zinja Mguni|Product|TMCLeSP           |Cargo Trucks|20        |00:00     |
#      |TMS001   |TMS002|SIM001 - Simone Sims|000001 - Zinja Mguni|Product|TMCLeSP           |Cargo Trucks|20        |00:00     |
#
