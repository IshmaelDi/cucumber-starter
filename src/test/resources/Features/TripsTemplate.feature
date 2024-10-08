Feature: Trip Template Creation

  Scenario: Validate that user can be able to save trip template.
    Given User has valid data and information to create and save trip template.
    And User logs in, confirm notice and navigate to landing page.
    And On Dashboard click '<CreateOrRecreateTrip>' button, and Navigate to click '<CreateNewTrip>' button.
    And User Select '<Driver>', '<Truck>', '<Trailer>', '<Country>', '<Currency>' and click '<Continue>' button.
    And User Navigate to Finalize Trip, and click '<Proceed>' Button
    