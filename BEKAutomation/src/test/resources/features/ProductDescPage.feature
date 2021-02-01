@ProductDescriptionPage
Feature: BEK Scenarios

  @PDPdetails
  Scenario: 1.NGSP-38/I should be able to view the product details so that I can use the product knowledge to make purchasing decision
    Given I login as a registered user
    Then I go to PDP and validate the product details

  @PDPmediasection
  Scenario: 1.NGSP-43/As a customer, I should be able to view product media assets so that I can see what a product looks like
    Given I login as a registered user
    Then I validate the product media assets
