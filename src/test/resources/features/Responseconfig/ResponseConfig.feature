Feature: Create new text Response card

Scenario: Verify Navigation to Response Configuration page

Given User navigated to Wechatify login page
When User logins as usertype "Admin" with valid credentials
Then User should see User Management module Home Page
When User clicks on  configuration nav menu
Then User should navigate to response configuration page

Scenario: Verify 
Given User is in Response Configuration page
When User clicks Add button 
Then User should select text media type

