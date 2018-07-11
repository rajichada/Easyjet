Feature:
  Scenario: Get a free quote with a blank firstname
    Given I enter url "https://www.d3dsecurity.co.uk"
    When I click on Register
    Given I enter the firstname as " "
    And  I enter the lastname as "Chada"
    And I enter the Email as "abc@yahoo.com"
    And I enter the phone number as "1234567890"
    When I click on send message
    Then I should see an Error message" Please enter the required field"
