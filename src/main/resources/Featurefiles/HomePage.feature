Feature:Homepage feature

  @HomePage
    Scenario: To check the Login button is clickable in the Homepage
     Given user is in the Homepage
     When user clciks on Login button
     Then the text "Welcome to Kapiva!" should be on the login page

  @HomePage
    Scenario: To check the Get App button is clickable in the Homepage
     Given user is in the Homepage
     When user clciks on Get App button
     Then user gets the title of the page should be "Kapiva - Apps on Google Play"

  @HomePage
  Scenario: To check the Trackorder button is clickable in the Homepage
    Given user is in the Homepage
    When user clicks on trackorder button
    Then the user checks the title of the page should be "Track Order"

  @HomePage
  Scenario: To check the login button is clickable in the Hamberger menu
    Given user is in the Homepage
    When user clciks on Hamberger menu button
    And user clicks on the login button in the Hamerger menu
    Then the user checks the current url of the page should be "https://kapiva.in/login.php"

  @HomePage
  Scenario Outline: To verify that View all particular concern na View all link is working in the homepage
    Given user is in the Homepage
    When user clicks on Each concerns with <concernNum>
    And user scrolls down
    When user clicks on the View all paticular "<Concern>" in the homepage
    Then user will verify the "<title>" of the particular concern
    And user navigate to home page
    And user clciks on the View all link of particular "<concernurl>" in the homepage
    Then user will verify the "<title>" of the particular concern
    Examples:
      | Concern | title | concernNum|concernurl |
      |  Men's Health          |   Explore Men's Health Care Products           |1 | mens-health|
      |  Weight Management     |   Buy Ayurvedic Products for Weight Management      |2 | solution/weight-management         |
      |  Lifestyle Diseases    |   Herbal Solutions for Lifestyle Diseases           |3 | solution/lifestyle-diseases           |
      |  Skin Care             |   Solution - Skin Care - Page 1 - Kapiva            |4 | solution/skin          |
      |  Hair Care             |   Solution - Hair Care - Page 1 - Kapiva            |5 | solution/hair           |
      |  Daily Wellness        |   Solution - Daily Wellness - Page 1 - Kapiva       |6 | solution/daily-wellness           |
      |  Women's Health        |   Explore Women Healthcare Products                 |7 |  womens-health          |

  @HomePage
  Scenario Outline: To verify that all Select concerns are clickable
    Given user is in the Homepage
    When user clicks on Each concerns with sheetname "<Sheetname>" and rownumber <Rownumber>
    And user scrolls down
    And user should see the product with the "<Sheetname>" and <Rownumber>

     Examples:
      |Sheetname | Rownumber |
      | HomePage | 0         |
      | HomePage | 1         |
      | HomePage | 2         |
      | HomePage | 3         |
      | HomePage | 4         |
      | HomePage | 5         |
      | HomePage | 6         |


