@HomePage
Feature: Home Page Scenarios

  @Login
  Scenario: 1.Login successful
    Given I login as a registered user

  @Search
  Scenario: 1.NGSP-491/I should be able to search by clicking on search icon or pressing enter key
    Given I login as a registered user
    Then I validate the Search Functionality

  @SearchAhead
  Scenario: 2.NGSP/103-I should see type-ahead suggestions as I key-in search characters in the search box, so that I can complete my search more effectively and quickly
    Given I login as a registered user
    Then I validate type-ahead suggestions

  @HeaderFooter
  Scenario: 3.NGSP-615/I should be able to view Header and footer components on all pages
    Given I login as a registered user
    Then I validate the header and footer components

  @MultipleAccount
  Scenario: 4.NGSP-143/As a user I should have an ability to be part of multiple accounts
    Given I login as a registered user
    Then I validate the dropdown with list of account that user have access

  @ViewUsers
  Scenario: 5.NGSP-72/As a user I should be able to search & view other users of the accounts that I belong to
    Given I login as a registered user
    Then I validate the search and view users

  @CreateUsers
  Scenario: 6.NGSP-26/As Customer Admin, I should be able to create users of my org, so that user's details and access are appropriate at all times
    Given I login as a registered user
    Then I validate the create user functionality

  @UserMenu
  Scenario: 7.NGSP-32/Backend | As a new Entree storefront user, I should be able to view User Menu
    Given I login as a registered user
    Then I validate the User Menu Functionality

  @SearchPage
  Scenario: 1.NGSP-133/I should be able to add selected products on search result page to my cart, so that I can place order for the selected products
    Given I login as a registered user
    Then I validate the multiple product select and add individual product to cart
