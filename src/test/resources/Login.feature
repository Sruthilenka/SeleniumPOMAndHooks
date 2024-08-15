Feature: Check Login

  Scenario: Login to the portal
    Given I am on login page
    When I entered login credentials
      | username      | password      |
      | standard_user | secret_sauce1 |
    Then I click on Login button