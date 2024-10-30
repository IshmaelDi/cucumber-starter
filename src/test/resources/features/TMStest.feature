Feature: I want to logIn to TMS using valid Credentials

  Scenario Outline: Validate logIn functionality with valid credentials
    Given Driver has launched TMS Platform
    When Driver Captures UserName, Password and Click RememberMe CheckBox
    And Driver click Login




    Examples:
      |  |