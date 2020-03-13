Feature: QNA creation #These description lines are ignored by Cucumber at runtime, but are available for reporting (They are included by default in html reports).

  Background: Verify Navigation to AutoResponder page
    Given User navigated to Wechatify login page
    When User logins as usertype "Admin" with valid credentials

  @faq
  Scenario Outline: 
  When User navigates to module "<moduleName>"
    
    Examples: 
    |moduleName|
    |Event Management|
      
