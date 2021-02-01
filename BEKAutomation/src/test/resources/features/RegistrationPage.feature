@RegistrationPage
Feature: Registration Page Scenarios

  @RegisterPage
  Scenario: 1.Registration on Page     
    Given I enter the user data for the registration
    Then I validate the user Registration
   
  @ValidateErrorMessagesRegistration
  Scenario: 2. Validation of error messages on registration page
      Given I click on the register button by passing empty fields 
      Then I validate the corresponding error messages 
  
    
  
   
   
   
   