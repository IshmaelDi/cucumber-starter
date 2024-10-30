Feature: As a User I want to Validate TMS Platform Login Functionality

  Scenario Outline: Validate logIn functionality with valid credentials
    Given Driver has launched TMS Platform
    When Driver Captures UserName and Password
    And Driver click Login




    Examples:
      |  |