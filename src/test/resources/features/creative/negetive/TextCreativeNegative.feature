Feature: TEXT creative Negative Validations

@textinvalids
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
		
@textinvalids
Scenario Outline: Verify Text card creation with invalid and valid datas new
1.Verifed Text Card Title mandatory validation
2.Verifed Text Card Title validation (Valid and Invalid)data
3.Verifed Decription mandatory validation
4.Verifed Text Card Description validation (Valid and Invalid and smiley)data
5.Verfied Save as draft
6.Verified Preview to followers
7.Verfied Notify to User
8.Verified card transfer from Draft to Draft review
Verifed Text Card Title validation (Valid and Invalid)data
Verifed Decription mandatory validation
Verifed Text Card Description validation (Valid and Invalid and smiley)data
Verfied Save as draft
Verified Preview to followers
Verfied Notify to User
9.Verified card transfer from Draft review to Translation
Verifed Text Card Title validation (Valid and Invalid)data
Verifed Decription mandatory validation
Verifed Text Card Description validation (Valid and Invalid and smiley)data
Verfied Save as draft
Verified Preview to followers
Verfied Notify to User
10.Verified card transfer from Translation to Translation review
Verifed Text Card Title validation (Valid and Invalid)data
Verifed Decription mandatory validation
Verifed Text Card Description validation (Valid and Invalid and smiley)data
Verfied Save as draft
Verified Preview to followers
Verfied Notify to User
11.Verified card transfer from Translation review to Approve
Verifed Text Card Title validation (Valid and Invalid)data
Verifed Decription mandatory validation
Verifed Text Card Description validation (Valid and Invalid and smiley)data
Verfied Save as draft
Verified Preview to followers
Verfied Notify to User
12.Verified card transfer from Approve to Library

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
	When User clicks on save creative button 
	Then Textcard Validation error should display for title text as "<TexttitleManErrorMsg>" and "Original" 
	Then Textcard Validation error should display for desc text as "<TextDescManErrorMsg>" 
	When User enters title as "<lmtxtitlename>" Description as "<lmtxmessage>" and "Normal" 
	Then Textcard Validation error should display for title text as "<titlecharlimitexceed>" and "Original" 
	Then Textcard Validation error should display for desc text as "<textDescLimit>" 
	When User clicks on save creative button 
	When User enters title as "<titlename>" Description as "<message>" and "Normal" 
	When User selects smiley character "Original" 
	When User clicks on save text_creative button 
	When User clicks on Notify to User 
	When User chooses a user for email notification "<emailid>" 
	When User clicks on Preview 
	When User Searches and selects follower to send preview "Raghu" 
	When User Clicks on "Submit for Draft Review" button 
	#Draft Review
	When User clicks edit button of textcard 
	When User enters title as "<lmtxtitlename>" Description as "<lmtxmessage>" and "Normal" 
	Then Textcard Validation error should display for title text as "<titlecharlimitexceed_translate>" and "Original" 
	Then Textcard Validation error should display for desc text as "<textDescLimit>" 
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
	When User Clicks on "Submit for Translation" button 
	#Translation
	When User clicks edit button of textcard 
	When User clicks on save text_creative button 
	Then Textcard Validation error should display for title text as "<TransTitleManErrorMsg>" and "Translate" 
	#Then Textcard Validation error should display for desc text as "<TextDescManErrorMsg>"
	When User enters title as "<lmtxtitlename>" Description as "<lmtxmessage>" and "Trans" 
	Then Textcard Validation error should display for title text as "<titlecharlimitexceed_translate>" and "Translate" 
	When User enters title as "<titlename>" Description as "<message>" and "Trans" 
	#When User selects smiley character "Translate"
	When User right clicks "Trans" on the description field 
	When User enters link as "<validlink>" LinkText as "<linktext>" and "Translate" 
	When User adds add tag to the redirection link "Original" 
#	When User select tag by tagname as "dog" for textcard with click on adtag button 
	When User clicks on save text_creative button 
	When User clicks on Notify to User 
	When User chooses a user for email notification "<emailid>" 
	When User clicks on Preview 
	When User Searches and selects follower to send preview "Raghu" 
	When User Clicks on "Submit for Translation Review" button 
	#Translation Review
	When User clicks edit button of textcard 
	When User enters title as "<lmtxtitlename>" Description as "<lmtxmessage>" and "Trans" 
	Then Textcard Validation error should display for title text as "<titlecharlimitexceed_translate>" and "Translate" 
	When User enters title as "<titlename>" Description as "<message>" and "Trans" 
	When User selects smiley character "Translate" 
	When User right clicks "Trans" on the description field 
	When User enters link as "<validlink>" LinkText as "<linktext>" and "Translate" 
	When User adds add tag to the redirection link "Translate" 
	When User select tag by tagname as "dog" for textcard with click on adtag button 
	When User clicks on save text_creative button 
	When User clicks on Notify to User 
	When User chooses a user for email notification "<emailid>" 
	When User clicks on Preview 
	When User Searches and selects follower to send preview "Raghu" 
	When User Clicks on "Submit for Approval" button 
	#Then Card should move to "Approval" page creative - Approval Page
	When User clicks on View Button 
	When User clicks on Notify to User 
	When User chooses a user for email notification "<emailid>" 
	When User clicks on Preview 
	When User Searches and selects follower to send preview "Raghu" 
	When User Clicks on "Approve & Send to Library" button 

Examples: 
	|titlename|message|TexttitleManErrorMsg|TransTitleManErrorMsg|lmtxtitlename|lmtxmessage|titlecharlimitexceed|titlecharlimitexceed_translate|TextDescManErrorMsg|validlink|linktext|textDescLimit|emailid|
	|老人不位眼 - TextTitle|Text Card Description content - 老人不位眼|This field is mandatory|The 标题 field is required.|Text Card Title content - 老人不位眼Text Card Tilte content - 老人不位眼 12|Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼Text Card Description content - 老人不位眼 12|Title cannot be more than 64 characters|标题不能为空且长度不能超过64字|The text field is required.|https://www.google.com|Sample Link|Text limit exceeded.|tmgautomationtesting@gmail.com|
	
#@textinvalids1
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
		
@textinvalidsdone
Scenario Outline: Verify Text card creation with invalid and valid datas old
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
  When User clicks on save creative button
  When User clicks on Preview
  When User Searches and selects follower to send preview "Raghu"

	Examples: 
	  |titlename|message|TexttitleManErrorMsg|lmtxtitlename|lmtxmessage|titlecharlimitexceed|TextDescManErrorMsg|textDescLimit|validlink|linktext|
	 |老人不位眼 - Title |Message - Save and Close - 老人不位眼 | This field is mandatory|5646456454Then Textcard Validation error should display for title|5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title|Title cannot be more than 64 characters|The text field is required.|Text limit exceeded.|http://www.google.com|Sample Link|
				
#@unittests
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
		
@textinvalidsdone
Scenario Outline: Verify Text card creation with invalid and valid datas new 1

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
		
  	When User clicks on the translationreview subtab 
	When User click on mediatype subtab "Text" 
	When User clicks edit button of textcard unittest "老人不位眼 " 
	#Translation Review
	#When User enters title as "<lmtxtitlename>" Description as "<lmtxmessage>" and "Trans"
	#Then Textcard Validation error should display for title text as "<titlecharlimitexceed_translate>" and "Translate"
	When User enters title as "<titlename>" Description as "<message>" and "Trans" 
	When User selects smiley character "Translate" 
	When User clicks on save text_creative button 
	When User clicks on Preview 
  
	Examples: 
	  |titlename|message|TexttitleManErrorMsg|TransTitleManErrorMsg|lmtxtitlename|lmtxmessage|titlecharlimitexceed|titlecharlimitexceed_translate|TextDescManErrorMsg|textDescLimit|validlink|linktext|
	 |老人不位眼 - Title |Message - Save and Close - 老人不位眼 | This field is mandatory|The 标题 field is required.|5646456454Then Textcard Validation error should display for title|5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title5646456454Then Textcard Validation error should display for title|Title cannot be more than 64 characters|标题不能为空且长度不能超过64字|The text field is required.|Text limit exceeded.|http://www.google.com|Sample Link|