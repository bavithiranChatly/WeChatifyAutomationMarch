Feature: Verfiy Login and logout Wechatify with valid and invalid credentials

  Scenario Outline: Verify Login to Wechatify with Invalid credentials
    Given User navigated to Wechatify login page
    When User enters login details of users with userid as "<userid>" and password as "<password>"
    And User clicks login button of Wechatify
    Then User should not able to see Home page
    Then User should see validation message on login page as "<errorMsg>"

    Examples: 
      | usertype | userid | password | errorMsg                                 |
      | Admin    | user   | password | The e-mail is not a valid e-mail address |

  Scenario: Verify Login and Logout with valid credentials and UserType
    Given User navigated to Wechatify login page
    When User logins as usertype "Admin" with valid credentials
    Then User should see User Management module Home Page
    And User Management background colour should be Red
    When User perform logout from Wechatify
    Then User should see application login page
