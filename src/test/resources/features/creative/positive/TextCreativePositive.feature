Feature: Verify TEXT creative feature

@withouttrans
Scenario: Verify Navigation to creative page 
	Given User navigated to Wechatify login page 
	When User logins as usertype "Admin" with valid credentials 
	Then User should see User Management module Home Page 
	When User clicks on creative nav menu 
	Then User should navigate to creative page 
	And Creative page should have following sections 
		|CREATIVES|
		|LIBRARY|
	And Creative page should have following tabs 
		|DRAFTS|
		|DRAFTS REVIEW|
		|TRANSLATION|
		|TRANSLATION REVIEW|
		|APPROVE|
	When User clicks Add Creative Button 
	Then User should see Creative type as following 
		|Rich Media|
		|Text|
		|Video|
		|Audio|
		|Image|
		
@check
Scenario Outline: Verify Text card creation with invalid and valid datas 
1.Text card creation
2.Verified card transfer from Draft to Draft review
3.Verified card transfer from Draft review to Translation
4.Verified card transfer from Translation to Translation review
5.Verified card transfer from Translation review to Approve
6.Verified card transfer from Approve to Library

	When User clicks on creative nav menu 
	Then User should navigate to creative page 
	When User click on mediatype subtab "Text"
	When User clicks Add Creative Button 
	Then User should see Creative type as following 
		|Rich Media|
		|Text|
		|Video|
		|Audio|
		|Image|
  	When User selects "TEXT" creative from dropdown 
	When User enters title as "<titlename>" Description as "<message>" and "Normal" 
	When User selects smiley character "Original" 
	When User right clicks "Org" on the description field 
	When User enters link as "<validlink>" LinkText as "<linktext>" and "Original" 
	When User adds add tag to the redirection link "Original" 
	When User select tag by tagname as "dog" for textcard with click on adtag button 
	When User clicks on save text_creative button 
	When User clicks on Notify to User 
	When User chooses a user for email notification "<emailid>" 
	When User clicks on Preview 
	When User Searches and selects follower to send preview "Raghu" 
	When User Clicks on "Submit for Draft Review" button 
	When User clicks edit button of textcard 
	When User Clicks on "Submit for Translation" button 
	When User clicks edit button of textcard 
	When User enters title as "<titlename>" Description as "<message>" and "Trans" 
	When User selects smiley character "Translate" 
	When User right clicks "Trans" on the description field 
	When User enters link as "<validlink>" LinkText as "<linktext>" and "Translate" 
#	When User adds add tag to the redirection link "Translate" 
	When User select tag by tagname as "dog" for textcard with click on adtag button 
	When User clicks on save text_creative button 
	When User clicks on Notify to User 
	When User chooses a user for email notification "<emailid>" 
	When User clicks on Preview 
	When User Searches and selects follower to send preview "Raghu" 
	When User Clicks on "Submit for Translation Review" button 
	#Translation Review
	When User clicks edit button of textcard 
	When User Clicks on "Submit for Approval" button 
	#Then Card should move to "Approval" page creative - Approval Page
	When User clicks on View Button 
	When User Clicks on "Approve & Send to Library" button 


Examples: 
	|titlename|message|TexttitleManErrorMsg|TransTitleManErrorMsg|lmtxtitlename|lmtxmessage|titlecharlimitexceed|titlecharlimitexceed_translate|TextDescManErrorMsg|validlink|linktext|textDescLimit|emailid|
	|老人不位眼 - TextTitle|Text Card Description content - 老人不位眼|This field is mandatory|The 标题 field is required.|Text Card Title content - 老人不位眼Text Card Tilte content - 老人不位眼 12|Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼 12|Title cannot be more than 64 characters|标题不能为空且长度不能超过64字|The text field is required.|https://www.google.com|Sample Link|Text limit exceeded.|tmgautomationtesting@gmail.com|

#@deleteall
#Scenario: Verify Navigation to creative page 
#	Given User navigated to Wechatify login page 
#	When User logins as usertype "Admin" with valid credentials 
#	Then User should see User Management module Home Page 
#	When User clicks on creative nav menu 
#	Then User should navigate to creative page 
#	And Creative page should have following sections 
#		|CREATIVES|
#		|LIBRARY|
#	And Creative page should have following tabs 
#		|DRAFTS|
#		|DRAFTS REVIEW|
#		|TRANSLATION|
#		|TRANSLATION REVIEW|
#		|APPROVE|
#	When User clicks Add Creative Button 
#	Then User should see Creative type as following 
#		|Rich Media|
#		|Text|
#		|Video|
#		|Audio|
#		|Image|
		
	@check
  	Scenario Outline: Delete cards 
	When User clicks on creative nav menu 
	Then User should navigate to creative page 
	When User click on mediatype subtab "Text" 
	When multiple deletes in a single page 
	Examples: 
	  |titlename|message|validlink|linktext|emailid|
		|老人不位眼 - Title |Message - Save and Close - 老人不位眼|http://www.google.com|Redirecting to google|adityaseshadri@tmgworldwide.com|

#@withouttrans
#Scenario: Verify Navigation to creative page 
#	Given User navigated to Wechatify login page 
#	When User logins as usertype "Admin" with valid credentials 
#	Then User should see User Management module Home Page 
#	When User clicks on creative nav menu 
#	Then User should navigate to creative page 
#	And Creative page should have following sections 
#		|CREATIVES|
#		|LIBRARY|
#	And Creative page should have following tabs 
#		|DRAFTS|
#		|DRAFTS REVIEW|
#		|TRANSLATION|
#		|TRANSLATION REVIEW|
#		|APPROVE|
#	When User clicks Add Creative Button 
#	Then User should see Creative type as following 
#		|Rich Media|
#		|Text|
#		|Video|
#		|Audio|
#		|Image|
		
@withouttrans		
Scenario Outline: Verify Text card creation with invalid and valid datas 
1.Text card creation
2.Verified card transfer from Draft to Draft review
3.Verified card transfer from Draft review to Translation
4.Verified card transfer from Translation to Translation review
5.Verified card transfer from Translation review to Approve
6.Verified card transfer from Approve to Library

	When User clicks on creative nav menu 
	Then User should navigate to creative page 
	When User click on mediatype subtab "Text"
	When User clicks Add Creative Button 
	Then User should see Creative type as following 
		|Rich Media|
		|Text|
		|Video|
		|Audio|
		|Image|
  	When User selects "TEXT" creative from dropdown 
	When User enters title as "<titlename>" Description as "<message>" and "Normal" 
	When User selects smiley character "Original" 
	When User right clicks "Org" on the description field 
	When User enters link as "<validlink>" LinkText as "<linktext>" and "Original" 
	When User adds add tag to the redirection link "Original" 
	When User select tag by tagname as "dog" for textcard with click on adtag button 
	When User clicks on save text_creative button 
	#When User clicks on Preview
	#When User Searches and selects follower to send preview "Raghu"
	When User Clicks on "Submit for Draft Review" button 
	#Draft Review
	When User clicks edit button of textcard 
	When User Clicks on "Submit for Approval" button 
	#Then Card should move to "Approval" page creative - Approval Page
	When User clicks on View Button 
	When User Clicks on "Approve & Send to Library" button 


Examples: 
	|titlename|message|TexttitleManErrorMsg|TransTitleManErrorMsg|lmtxtitlename|lmtxmessage|titlecharlimitexceed|titlecharlimitexceed_translate|TextDescManErrorMsg|validlink|linktext|textDescLimit|emailid|
	|老人不位眼 - TextTitle|Text Card Description content - 老人不位眼|This field is mandatory|The 标题 field is required.|Text Card Title content - 老人不位眼Text Card Tilte content - 老人不位眼 12|Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼 12|Title cannot be more than 64 characters|标题不能为空且长度不能超过64字|The text field is required.|https://www.google.com|Sample Link|Text limit exceeded.|tmgautomationtesting@gmail.com|
