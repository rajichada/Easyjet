Feature:
@register
  Scenario: Registration
    Given I enter url "register"
    Given I enter MyEmailAddressIs "abc123@yahoo.com"
    Given I enter Confirm your email address "abc123@yahoo.com"
    Given I enter Your password "satya123"
    Given I enter Confirm your password "satya123"
    Given I enter Title "Mrs"
    Given I enter First Name "Satya"
    Given I enter Surname "Chada"
    Given I enter Address "23,Lower Eraley"
    Given I enter Town "Reading"
    Given I enter Postcode "Rg6 4hl"
    And I enter Country as "CHE"
    Given I enter the Phone number "134567890"
    When I click on Register
    Then I should see Error message "Sorry, but the email address you are asking us to register at this time has already been registered."



#  Scenario: SignIn
#    Given I enter url "https://www.easyjet.com/en/register"
#    When I click on Login
#    Given I enter Email Address as "abc@yahoo.com"
#    Given I enter password as "satya123"
#    When I click on Signin

