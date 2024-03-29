Feature: Registraition functionality scenarios

  @Register @One
  Scenario: Verify whether the user is able to register into the application by providing all the fields
    Given Launch the application
    And Navigate to Account Registration page
    When Provide all the below valid details
      | FirstName | Ravi                   |
      | LastName  | Nihal                  |
      | Email     | Ravi.Nihal21@gmail.com |
      | Telephone |             9212095678 |
      | Password  | rkiran                 |
    And Select the Privacy Policy
    And Click on Continue button
    Then Should see that the User Account has successfully created

  @Register @Two
  Scenario: Verify whether the user is not allowed to register on skipping mandatory fields
    Given Launch the application
    And Navigate to Account Registration page
    When Click on Continue button
    Then Should see that the User Account is not created
    And Should see the error messages informing the user to fill the mandatory fields

  @Register @Three
  Scenario: Verify whether the user is able to register into the application by opting for Newsletter subscription
    Given Launch the application
    And Navigate to Account Registration page
    When Provide all the below valid details
      | FirstName | Ravi                   |
      | LastName  | Nihal                  |
      | Email     | Ravi.Nihal21@gmail.com |
      | Telephone |             9212095678 |
      | Password  | rkiran                 |
    And Select the Privacy Policy
    And subscribe to Newsletter
    And Click on Continue button
    Then Should see that the User Account has successfully created

 