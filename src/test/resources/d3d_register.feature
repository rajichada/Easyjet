Feature:Registration file for D3D
@registration
Scenario: Registration for d3dsecurity
  Given I enter url "/"
  When I click on Register button on Homepage
  Given I enter firstname as "Satya"
  And I enter lastname as "Chada"
  And I enter email as "abc@yahoo.com"
  And I enter new password as "satya123"
  And I enter confirm password as "satya123"
  When I click on Register
  Then I should see the Errormessage "Username not valid"
