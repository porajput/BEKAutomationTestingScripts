@MyAccountPage
Feature: Account Page Scenario

  @DeleteUser
  Scenario: NGSP-811/Backend-As a user I should be able to delete another user from the account
    Given I login as a registered user
    Then I validate delete another user from the account

  @EditUserDetails
  Scenario: NGSP-222/Backend | As a Customer Admin/DSR, I should be able to edit user details of my org from the storefront
    Given I login as a registered user
    Then I validate the edit user details

  @UserProfile
  Scenario: NGSP-153/Backend | As a logged in user, I should be able to update my personal details(first name, last name, ph No)
    Given I login as a registered user
    Then I validate the my account user profile details
