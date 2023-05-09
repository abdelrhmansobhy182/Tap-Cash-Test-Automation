Feature: User should be Register
  Background: User Signup
    Given  Navigate to Website
    When Click on Sign in button

  Scenario: Register User with new email as a parent
    And Enter valid data for parent
    Then Verify that ACCOUNT CREATED

  Scenario Outline: Register User with invalid email
    And Enter valid data and invalid email : "<email>"
    Then Verify error message for email
    Examples:
      | email             |
      # already exsit
      | abdosobhy18220@gmail.com |
      #invalid format
      | abdo123com |
      | a@gmail.com |
  Scenario Outline: Register User with invalid national id
    And Click on Parent button
    And Enter valid data and invalid ID : "<ID>"
    Then Verify error message for ID
    Examples:
      | ID             |
      # already exsit9
      | 12345678912345 |
      #invalid format
      | 123456 |
      | 123456789thred |
      | 1234567891234@ |
  Scenario Outline: Register User with invalid name
    And Click on Parent button
    And Enter valid data and invalid "<FristName>" and "<LastName>"
    Then Verify error message for Name
    Examples:
      | FristName  | LastName |
      | Abdo#  | Sobhy  |
      | Abdo   | Sobhy# |
      | Abdo2  | Sobhy  |
      | Abdo   | Sobhy3 |
      | Ab do  | Sob hy |
  Scenario Outline: Register User with invalid mobile
    And Click on Parent button
    And Enter valid data and invalid mobile : "<mobile>"
    Then Verify error message for mobile
    Examples:
      | mobile          |
      # already exsit9
      | 01224542365 |
      #invalid format
      | 123456 |
      | 012456782gh |
      | 012456782g@ |
  Scenario Outline: Register User with invalid password
    And Click on Parent button
    And Enter valid data and invalid password: "<password>" and "<repassword>"
    Then Verify error message for password
    Examples:
      | password  | repassword |
      #password less than 8 character
      | 123456 |123456 |
      #password doesn't contain space
      | Aa@12 34 |Aa@12 34 |
     #password doesn't contain at least one lower case
      | A@123456 |A@123456 |
    #password doesn't contain at least one upper case
      | a@123456 |a@123456 |
    #password doesn't contain at least one special character
      | Aa123456 |Aa123456 |
    #password doesn't contain at least one number
      | AaFRTa@f |AaFRTa@f |
    #password not the same
      | Aa@123456 |Aa@12345 |



  Scenario: Register User with new email as a child
    And Click on child button
    And Enter valid data for child
    Then Verify that ACCOUNT CREATED


  Scenario: child signin without his parent han an account
    And Click on child button
    And Enter valid data for child and invalid parent id
    Then Verify error message for parent id


  Scenario: user can navigate to login page from register page

    #Enter FirstName "Abdelrhman", LastName "Sobhy", Mobile "01224542365", ID "12345678912547", Email "abdosobhy18220@gmailcom"








