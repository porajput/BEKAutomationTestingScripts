@ProductListPage
Feature: Product List Page Scenarios

  @PLPListview
  Scenario: 1.NGSP-160/As a user on new entree platform, I should have the ability to browse product catalog
    Given I login as a registered user
    Then I go to the PLP List view and validate all product list page catalogue
