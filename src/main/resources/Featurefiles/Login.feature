Feature:Login feature

  @Login
  Scenario:Validate Login page title
    Given user on the login page
    When user gets the title of the page
    Then page title should be "Kapiva - Sign in"

  @Login
  Scenario: Validate Login with correct OTP & Number
    Given  user on the login page
    When user enters the phonenumber "9999999999"
    And user clciks on submit button
    And user enters the otp "999999"
    And user clciks on otp submit button
    And user moves the mouse pointer on the MY Account section
    Then the user name should be "Hi, Satyam Sinha!" in the my acount section

