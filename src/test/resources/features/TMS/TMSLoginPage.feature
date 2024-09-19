Feature: Validate TMS Login Functionality

  Scenario Outline: Using Valid Credentials
    Given User has launched TMS Website
    When User captured valid Username and Password
    And Click LogIn Button and Navigate to Dashboard

    And On DashbOard Click to selct '<AutoDemoTest>' from drop list
    And click Orders Button
    Then Click create Order Button
    Examples:
      |AutoDemoTest|
      | AutoDemoTest |

