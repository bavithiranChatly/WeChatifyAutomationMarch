Feature: Home Page Search and navigation faeture
	1.Search Module and verify navigation

Scenario: Login to Wechatify with valid details
	Given User navigated to Wechatify login page 
	When User logins as usertype "Admin" with valid credentials 
	Then User should see User Management module Home Page 
	And User Management background colour should be Red 
	
Scenario Outline: TC-8164 Module search and navigation 
	When Click on search icon in the Left corner 
	Then It should open the search field 
	When User enter search by module name "<MouduleName>" 
	Then User should automatically search the module name under list "<MouduleName>" 
	When User clicks module name underlist  "<MouduleName>" 
	Then User should automatically navigate to module name page "<MouduleName>" 
	Examples: 
		|MouduleName|
		|CREATIVES|
		|USER MANAGEMENT|
		
Scenario: LogoutFrom to Wechatify 
	When User perform logout from Wechatify 
	Then User should see application login page 
