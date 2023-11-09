Feature: home Page Functionality

  Background:
    Given  user opens the URL

    Scenario Outline: User is on login page screen
      When user clicks on login button
      And user enters "<Username>"
      And user clicks on next button
       Then user Input "<Password>"
      And user clicks on sign-in button



      Examples:
      | Username               | Password
      | WRambau@clientele.co.za| clientele001
