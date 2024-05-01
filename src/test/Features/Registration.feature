Feature: Verify Registration Form on Loqbox Website

  Scenario: Verify Registration Form Presence
    Given I launch the Chrome browser
    When I navigate to the Loqbox website
    Then I verify that the registration form is present on the webpage
    And I close the browser


Feature: Registration Process Verification on Loqbox Website

  @Test
  Scenario: Verify User Can Add Details to Registration
    Given I launch the Chrome browser
    And I navigate to the Loqbox website
    When I fill registration details for "<Lahiru>" and "<Sandakith>" and "<lsandakith@gmail.com>" and "<It11402862@2>" and "<19/05/2005>" and "<07713238833>" and "<d1>" and "<postcode>" and "<SW1W0NY>" and "<22>" and "<al1>" and "<al2>" and "<galle>" and "<sri lanka>"
    And I click on the Next button
    Then the system navigates to the next page
    And the user can see the payment details form
    And I close the browser
