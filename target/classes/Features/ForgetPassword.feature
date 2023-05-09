Feature: User should reset password
  Background: Go to Login page
    Given  Navigate to Website
    When Click on Login button
    And  Click on forget password button

  Scenario: user can reset his password
    And Enter email : "abdosobhy18220@gmail.com" and Click submit button
    And Get the code from email and submit
    Then should navigate to change password page
    And Enter valid password : "Pass1" and confirm password : "Pass2"
    Then Verify that navigate to login page
    And Enter "14563252147856" and "Aa@123456" and Click Login button
    Then Verify that Logged in successfully



