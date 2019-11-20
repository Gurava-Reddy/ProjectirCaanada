Feature: Validation of Facebook details

  Scenario: Login Validation
    Given User is on FaceBook Page
    When User enters Registrtion Detais
     |Logan|Woverine|logan@gmail.com|wolverinexmen|
    
    Then User Verifies the Succces Message
    Then Quit the Browser
     
