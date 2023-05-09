Feature: User should be Login
  Background: Go to Login page
    Given  Navigate to Website
    When Click on Login button


  Scenario: user login with invalid ID
    And Enter "65485962" and "Aa@123456" and Click Login button
    Then Verify error message

  Scenario: user login with invalid Password
    And Enter "14563252147856" and "aaaaaa" and Click Login button
    Then Verify password error message

  Scenario: user can navigate to Register page
    And Click on Register button
    Then Verify that navigate to register page successfully

  Scenario : user can navigate to forget password page
    And Click on forget password button
    Then Verify that navigate to forget password page successfully



