Feature: Verfiy Rich media content creativce feature for positive scenario

  Background: 
    When User confirms leave page popup
    Given Close any model poup if displayed
@check1
  Scenario: TC-9759 Observe the Creatives Page navigation with RichMedia content Creative
    Given User navigated to Wechatify login page
    When User logins as usertype "Admin" with valid credentials
    Then User should see User Management module Home Page
    When User clicks on creative nav menu
    Then User should navigate to creative page
    And Creative page should have following sections
      | CREATIVES |
      | LIBRARY   |
    And Creative page should have following tabs
      | DRAFTS             |
      | DRAFTS REVIEW      |
      | TRANSLATION        |
      | TRANSLATION REVIEW |
      | APPROVE            |
    When User clicks Add Creative Button
    Then User should see Creative type as following
      | Rich Media |
      | Text       |
      | Video      |
      | Audio      |
      | Image      |
      
  Scenario Outline: TC-9970 Create flow upto Library - Rich media [ Content ]
    with valid dataset and With Save Btn
    1. Create RTM Content creative with Save Btn
    2. Valid valid.png File
    3. Validate all the available navigation on different Pages
    4. Verify card availablity in list page during navigation
    5. Finally Delete Created Rich Media Card from Draft Page

    When User clicks on creative nav menu
    Then User should navigate to creative page
    When User clicks Add Creative Button
    Then User should see Creative type as following
      | Rich Media |
      | Text       |
      | Video      |
      | Audio      |
      | Image      |
    When User selects "Rich Media" creative from dropdown
    Then User should see "Rich Media" creative page
    Then User should see Content and JumpLink
      | Content   |
      | Jump link |
    And Content Should be highlighted default
    When User clicks Content Rich media creative
    Then it should display the content card create Page with headertext as "Create New Message Card: Rich Media"
    When User selects langauge as "English"
    When User enters content title as "<title>" author as "<author>" bodytext as "<bodyText>" textlink as "<textlink>"  summary as "<summary>"
    When User select tag by tagname as "dog" for rich media with click on adtag button
    Then Added Adtag "dog" should display to create rich media creative page
    When User clicks upload image tooltip button for jumplink richmedia creative
    Then Jumplink richmedia creative toop tip should display with correct text
      | Image format - JPG, JPEG, PNG, GIF. |
      | Image size limit - 2MB.             |
      | Minimum image dimension 200 * 200.  |
    When User clicks Rich Media content Image icon for upload
    When User uploads valid image to Rich Media content creative with name as "valid.png"
    When User uploads valid image to Rich Media creative with name as "<imagename>"
    When User select folder name from dropdown as "Default"
    When User Clicks on "Save" button
    Then User should navigate to creative page
    Then Rich media creative should saved succesfully in "Default" folder
    When User clicks delete button of rich media creative
    When User Clicks on OK Model button
    Then Rich media creative should deleted succesfully from "Default" folder

    Examples: 
      | title              | author | textlink         | summary     | imagename |
      | richmedia-content1 | author | https://test.com | testSummary | valid.png |
   Scenario Outline: TC-9970 Create flow upto Library - Rich media [ Content ] with new tag and new category
    with valid dataset and Save & Close Btn
    1. Create RTM Content creative with new tag and new category
    2. Valid valid.png File
    3. With Use of Save and Save & Close
    4. Validate all the available navigation on different Pages
    5. Verify card availablity in list page during navigation
    6. Finally Delete Created Rich Media Card from Draft Page

    When User clicks on creative nav menu
    Then User should navigate to creative page
    When User clicks Add Creative Button
    Then User should see Creative type as following
      | Rich Media |
      | Text       |
      | Video      |
      | Audio      |
      | Image      |
    When User selects "Rich Media" creative from dropdown
    Then User should see "Rich Media" creative page
    Then User should see Content and JumpLink
      | Content   |
      | Jump link |
    And Content Should be highlighted default
     When User clicks Content Rich media creative
    Then it should display the content card create Page with headertext as "Create New Message Card: Rich Media"
    When User selects langauge as "English"
    When User enters content title as "<title>" author as "<author>" bodytext as "<bodyText>" textlink as "<textlink>"  summary as "<summary>"
    When User creates new tag "mytag" with new category as "mycat" & strength number as "10" & membership card as "J" and point as "50"
    Then Added Adtag should display to create rich media creative page
    When User clicks upload image tooltip button for jumplink richmedia creative
    Then Jumplink richmedia creative toop tip should display with correct text
      | Image format - JPG, JPEG, PNG, GIF. |
      | Image size limit - 2MB.             |
      | Minimum image dimension 200 * 200.  |  
    When User clicks Rich Media content Image icon for upload
    When User uploads valid image to Rich Media content creative with name as "valid.png"
    When User uploads valid image to Rich Media creative with name as "<imagename>"
    When User select folder name from dropdown as "Default"
    When User Clicks on "Save" button
    Then User should navigate to creative page
    Then Rich media creative should saved succesfully in "Default" folder
    When User clicks delete button of rich media creative
    When User Clicks on OK Model button
    Then Rich media creative should deleted succesfully from "Default" folder

    Examples: 
      | title              | author | textlink         | summary     | imagename |
      | richmedia-content1 | author | https://test.com | testSummary | valid.png |

  Scenario Outline: TC-9970 Create flow upto Library - Rich media [ Content ] with new tag and existing category
    with valid dataset and Save & Close Btn  
    1. Create RTM Content creative with new tag and existing category
    2. Valid valid.png File
    3. With Use of Save and Save & Close
    4. Validate all the available navigation on different Pages
    5. Verify card availablity in list page during navigation
    6. Finally Delete Created Rich Media Card from Draft Page

    When User clicks on creative nav menu
    Then User should navigate to creative page
    When User clicks Add Creative Button
    Then User should see Creative type as following
      | Rich Media |
      | Text       |
      | Video      |
      | Audio      |
      | Image      |
    When User selects "Rich Media" creative from dropdown
    Then User should see "Rich Media" creative page
    Then User should see Content and JumpLink
      | Content   |
      | Jump link |
    And Content Should be highlighted default
    When User clicks Content Rich media creative
    Then it should display the content card create Page with headertext as "Create New Message Card: Rich Media"
    When User selects langauge as "English"
    When User enters content title as "<title>" author as "<author>" bodytext as "<bodyText>" textlink as "<textlink>"  summary as "<summary>"
    When User creates new tag "myag" with existing category as "WeChat App" & strength number as "10" & membership card as "J" and point as "50"
    Then Added Adtag should display to create rich media creative page
    When User clicks upload image tooltip button for jumplink richmedia creative
    Then Jumplink richmedia creative toop tip should display with correct text
      | Image format - JPG, JPEG, PNG, GIF. |
      | Image size limit - 2MB.             |
      | Minimum image dimension 200 * 200.  |
    When User clicks Rich Media content Image icon for upload
    When User uploads valid image to Rich Media content creative with name as "valid.png"
    When User uploads valid image to Rich Media creative with name as "<imagename>"
    When User select folder name from dropdown as "Default"
    When User Clicks on "Save" button
    Then User should navigate to creative page
    Then Rich media creative should saved succesfully in "Default" folder
    When User clicks delete button of rich media creative
    When User Clicks on OK Model button
    Then Rich media creative should deleted succesfully from "Default" folder

    Examples: 
      | title              | author | textlink         | summary     | imagename |
      | richmedia-content1 | author | https://test.com | testSummary | valid.png |
      
  Scenario Outline: TC-9970 Create flow upto Library - Rich media [ Content ] when user click move to libray icon on approve page
    1. Create RTM Content creative with existing tag
    2. Valid gif File
    3. With Use of Save and Save & Close
    4. Validate all the available navigation on different Pages
    5. Moving card from Translation Review To Translation and Finally to Approve
    6. Move Card from Approve to Library using Move to Libray Icon on approve page
    7. Veriy card navigation to all pages using Edit button
    8. Verify card availablity in list page during navigation
    8. Finally Delete Created Rich Media Card from Library

    When User clicks on creative nav menu
    Then User should navigate to creative page
    When User clicks Add Creative Button
    Then User should see Creative type as following
      | Rich Media |
      | Text       |
      | Video      |
      | Audio      |
      | Image      |
    When User selects "Rich Media" creative from dropdown
    Then User should see "Rich Media" creative page
    Then User should see Content and JumpLink
      | Content   |
      | Jump link |
    And Content Should be highlighted default
     When User clicks Content Rich media creative
    Then it should display the content card create Page with headertext as "Create New Message Card: Rich Media"
    When User enters content title as "<title>" author as "<author>" bodytext as "<bodyText>" textlink as "<textlink>"  summary as "<summary>"    
    When User clicks Rich Media content Image icon for upload
    When User uploads valid image to Rich Media content creative with name as "valid.png"
    When User uploads valid image to Rich Media creative with name as "valid.gif"
    When User select folder name from dropdown as "Default"
    Then Page should have following Save and Navigation options
      | Notify to User |
      | Save           |
      | Save & Close   |
    When User Clicks on "Save" button
    Then Page should have following Save and Navigation options
      | Notify to User |
      | Save           |
      | Save & Close   |
     # |Preview|
    When User Clicks on "Save & Close" button
    Then User should navigate to creative page
    Then Rich media creative should saved succesfully in "Default" folder
    #Then Create creative page should display for richmedia creative
    When User clicks edit button of rich media creative
    Then Page should have following Save and Navigation options
      | Notify to User          |
      | Save                    |
      | Save & Close            |
      | Submit for Draft Review |
      #|Preview|
    When User Clicks on "Submit for Draft Review" button
    Then Card should moved to DraftReview and user should moved to Draft review tab in "Default" folder
    When User clicks edit button of rich media creative
    Then Create page of draft review should display
    Then Page should have following Save and Navigation options
      | Notify to User         |
      | Save                   |
      | Save & Close           |
      | Submit for Approval    |
      | Submit for Translation |
    When User Clicks on "Submit for Translation" button
    Then Card should move to Transalation page creative
    Then Rich Media creative card content should not translated
    When User clicks edit button of rich media creative
    Then Rich media edit page should display with Orginal and Translated content
    Then Rich media edit translation page should have below fields as empty
      | title |
      |       |
    Then Rich media edit orginal fields should not be editable
    When User filles Rich media edit page Translated fields page with "<title>" , "<author>" , "<textlink>" and "<summary>"
    When User clicks on translation page Rich Media content Image icon for upload
    When User uploads valid image to Rich Media content creative with name as "valid.png"
    Then Page should have following Save and Navigation options
      | Notify to User                |
      | Save                          |
      | Save & Close                  |
      | Submit for Translation Review |
    When User Clicks on "Submit for Translation Review" button
    Then The following card should get transfered to the Translation Review
    Then Rich Media creative card content should translated
    When User clicks edit button of rich media creative
    Then User should navigate to "Translation Review" page
    Then Page should have following Save and Navigation options
      | Notify to User      |
      | Save                |
      | Save & Close        |
      | Submit for Approval |
    When User Clicks on "Submit for Approval" button
    Then Card should move to "Approval" page creative
     When User click on Move to Library Icon Link on approve creative page
    When User click on "Move to library" Icon Link on creative list page
    Then Model popup with below buttons should display
      | Notify to User |
    When User Clicks on OK Model button
    Then Card should move to Library of "Rich Media" in "Default" Folder
    When User clicks delete button of rich media creative
    When User Clicks on OK Model button
    Then Rich media creative should deleted succesfully from "Default" folder

    Examples: 
      | title             | author | textlink         | summary     |
      | richmedia-content | author | https://test.com | testSummary |
   
  @check   
  Scenario Outline: TC-9970 Create flow upto Library - Rich media [ Content] when user click view and Approve & Send to libray icon on approve page

    1. Create RTM Content creative
    2. Valid jpg File
    3. With Use of Save and Save & Close
    4. Validate all the available navigation on different Pages
    5. Moving card from Translation Review To Translation and Finally to Approve
    6. Move Card from Approve to Library using Send to Libray Icon on approve page
    7. Veriy card navigation to all pages using Edit button
    8. Verify card availablity in list page during navigation
    8. Finally Delete Created Rich Media Card from Library

    When User clicks on creative nav menu
    Then User should navigate to creative page
    When User clicks Add Creative Button
    Then User should see Creative type as following
      | Rich Media |
      | Text       |
      | Video      |
      | Audio      |
      | Image      |
    When User selects "Rich Media" creative from dropdown
    Then User should see "Rich Media" creative page
    Then User should see Content and JumpLink
      | Content   |
      | Jump link |
    And Content Should be highlighted default
    When User clicks Content Rich media creative
    Then it should display the content card create Page with headertext as "Create New Message Card: Rich Media"
    When User enters content title as "<title>" author as "<author>" bodytext as "<bodyText>" textlink as "<textlink>"  summary as "<summary>"
    When User clicks Rich Media content Image icon for upload
    When User uploads valid image to Rich Media content creative with name as "valid.png"
    When User uploads valid image to Rich Media creative with name as "valid.jpg"
    When User select folder name from dropdown as "Default"
    Then Page should have following Save and Navigation options
      | Notify to User |
      | Save           |
      | Save & Close   |
    When User Clicks on "Save" button
    Then Page should have following Save and Navigation options
      | Notify to User |
      | Save           |
      | Save & Close   |
    When User Clicks on "Save & Close" button
    Then User should navigate to creative page
    Then Rich media creative should saved succesfully in "Default" folder
    When User clicks edit button of rich media creative
    Then Create creative page should display for richmedia creative
    Then Page should have following Save and Navigation options
      | Notify to User          |
      | Save                    |
      | Save & Close            |
      | Submit for Draft Review |
    When User Clicks on "Submit for Draft Review" button
    Then Card should moved to DraftReview and user should moved to Draft review tab in "Default" folder
    When User clicks edit button of rich media creative
    Then Create page of draft review should display
    Then Page should have following Save and Navigation options
      | Notify to User         |
      | Save                   |
      | Save & Close           |
      | Submit for Approval    |
      | Submit for Translation |
    When User Clicks on "Submit for Translation" button
    Then Card should move to Transalation page creative
    When User clicks edit button of rich media creative
    Then Rich media edit page should display with Orginal and Translated content
    Then Rich media edit translation page should have below fields as empty
      | title |
      |       |
    Then Rich media edit orginal fields should not be editable
    When User filles Rich media edit page Translated fields page with "<title>" , "<author>" , "<textlink>" and "<summary>"
    When User clicks on translation page Rich Media content Image icon for upload
    When User uploads valid image to Rich Media content creative with name as "valid.png"
    Then Page should have following Save and Navigation options
      | Notify to User                |
      | Save                          |
      | Save & Close                  |
      | Submit for Translation Review |
    When User Clicks on "Submit for Translation Review" button
    Then The following card should get transfered to the Translation Review
    When User clicks edit button of rich media creative
    Then User should navigate to "Translation Review" page
    Then Page should have following Save and Navigation options
      | Notify to User      |
      | Save                |
      | Save & Close        |
      | Submit for Approval |
    When User Clicks on "Submit for Approval" button
    Then Card should move to "Approval" page creative
    When User click on View Icon Link on approve creative page
    Then Page should have following Save and Navigation options
      | Notify to User            |
      | Approve & Send to Library |
    When User Clicks on "Approve & Send to Library" button
    Then Card should move to Library of "Rich Media" in "Default" Folder
    When User clicks delete button of rich media creative
    When User Clicks on OK Model button
    Then Rich media creative should deleted succesfully from "Default" folder

    Examples: 
      | title             | author | textlink         | summary     |
      | richmedia-content | author | https://test.com | testSummary |

  Scenario Outline: TC-8619 Rich media content card - Reassign to Draft flow from Translation Page
    1. Create RTM Content creative
    2. Valid PNG File
    3. With Use of Save and Save & Close
    4. Validate all the available navigation on different Pages
    5. Moving card from Translation Review To Translation
    6. Verifying succeful move of card from Translation Page to Draft flow from (Reassign)
    7. Move card from Translation to Library using Move Icon on Respective list pages
    8. Finally Delete Created Rich Media Card

    When User clicks on creative nav menu
    Then User should navigate to creative page
    When User clicks Add Creative Button
    Then User should see Creative type as following
      | Rich Media |
      | Text       |
      | Video      |
      | Audio      |
      | Image      |
    When User selects "Rich Media" creative from dropdown
    Then User should see "Rich Media" creative page
    Then User should see Content and JumpLink
      | Content   |
      | Jump link |
    And Content Should be highlighted default
    When User clicks Content Rich media creative
    Then it should display the content card create Page with headertext as "Create New Message Card: Rich Media"
    When User enters content title as "<title>" author as "<author>" bodytext as "<bodyText>" textlink as "<textlink>"  summary as "<summary>"
    When User clicks Rich Media content Image icon for upload
    When User uploads valid image to Rich Media content creative with name as "valid.png"
    When User uploads valid image to Rich Media creative with name as "valid.png"
    When User select folder name from dropdown as "Default"
    Then Page should have following Save and Navigation options
      | Notify to User |
      | Save           |
      | Save & Close   |
    When User Clicks on "Save" button
    Then Page should have following Save and Navigation options
      | Notify to User |
      | Save           |
      | Save & Close   |
    When User Clicks on "Save & Close" button
    Then User should navigate to creative page
    Then Rich media creative should saved succesfully in "Default" folder
    When User clicks edit button of rich media creative
    Then Create creative page should display for richmedia creative
    Then Page should have following Save and Navigation options
      | Notify to User          |
      | Save                    |
      | Save & Close            |
      | Submit for Draft Review |
    When User Clicks on "Submit for Draft Review" button
    Then Card should moved to DraftReview and user should moved to Draft review tab in "Default" folder
    When User clicks edit button of rich media creative
    Then Create page of draft review should display
    Then Page should have following Save and Navigation options
      | Notify to User         |
      | Save                   |
      | Save & Close           |
      | Submit for Approval    |
      | Submit for Translation |
    When User Clicks on "Submit for Translation" button
    Then Card should move to Transalation page creative
    When User clicks edit button of rich media creative
    Then Rich media edit page should display with Orginal and Translated content
    Then Rich media edit translation page should have below fields as empty
      | title |
      |       |
    Then Rich media edit orginal fields should not be editable
    When User filles Rich media edit page Translated fields page with "<title>" , "<author>" , "<textlink>" and "<summary>"
    When User clicks on translation page Rich Media content Image icon for upload
    When User uploads valid image to Rich Media content creative with name as "valid.png"
    Then Page should have following Save and Navigation options
      | Notify to User                |
      | Save                          |
      | Save & Close                  |
      | Submit for Translation Review |
    When User Clicks on "Submit for Translation Review" button
    Then The following card should get transfered to the Translation Review
    When User clicks edit button of rich media creative
    Then User should navigate to "Translation Review" page
    Then Page should have following Save and Navigation options
      | Notify to User      |
      | Save                |
      | Save & Close        |
      | Submit for Approval |
    When User clicks on Resassign button
    Then User should see Reassign to draft menu option
    Then User should see Reassign to Translation menu option
    When User clicks on Reassign to draft menu option
    Then User should see the popup of "Please select user to notify" with email Id's which is registere in the user management module
    When User selects any of the email id
    Then User should navigate to creative page
    Then Rich media creative should saved succesfully in "Default" folder
    When User clicks delete button of rich media creative
    When User Clicks on OK Model button
    Then Rich media creative should deleted succesfully from "Default" folder

    Examples: 
      | title             | author | textlink         | summary     |
      | richmedia-content | author | https://test.com | testSummary |
      
  Scenario Outline: TC-8619 Rich media content card - Reassign to Translation flow from Approval Page
     1. Create RTM Content creative
     2. Valid JPEG File
     3. With Use of Save and Save & Close
     4. Validate all the available navigation on different Pages
     5. Moving card from Translation Review To Translation
     6. Verifying succeful move of card from Translation Review To Translation
     7. Move card from Translation to Library using Move Icon on Respective list pages
     8. Finally Delete Created Rich Media Card

    When User clicks on creative nav menu
    Then User should navigate to creative page
    When User clicks Add Creative Button
    Then User should see Creative type as following
      | Rich Media |
      | Text       |
      | Video      |
      | Audio      |
      | Image      |
    When User selects "Rich Media" creative from dropdown
    Then User should see "Rich Media" creative page
    Then User should see Content and JumpLink
      | Content   |
      | Jump link |
    And Content Should be highlighted default    
    When User clicks Content Rich media creative
    Then it should display the content card create Page with headertext as "Create New Message Card: Rich Media"
    When User enters content title as "<title>" author as "<author>" bodytext as "<bodyText>" textlink as "<textlink>"  summary as "<summary>"
    When User clicks Rich Media content Image icon for upload
    When User uploads valid image to Rich Media content creative with name as "valid.png"
    When User uploads valid image to Rich Media creative with name as "valid.jpeg"
    When User select folder name from dropdown as "Default"
    Then Page should have following Save and Navigation options
      | Notify to User |
      | Save           |
      | Save & Close   |
    When User Clicks on "Save" button
    Then Page should have following Save and Navigation options
      | Notify to User |
      | Save           |
      | Save & Close   |
    When User Clicks on "Save & Close" button
    Then User should navigate to creative page
    Then Rich media creative should saved succesfully in "Default" folder
    When User clicks edit button of rich media creative
    Then Create creative page should display for richmedia creative
    Then Page should have following Save and Navigation options
      | Notify to User          |
      | Save                    |
      | Save & Close            |
      | Submit for Draft Review |
    When User Clicks on "Submit for Draft Review" button
    Then Card should moved to DraftReview and user should moved to Draft review tab in "Default" folder
    When User clicks edit button of rich media creative
    Then Create page of draft review should display
    Then Page should have following Save and Navigation options
      | Notify to User         |
      | Save                   |
      | Save & Close           |
      | Submit for Approval    |
      | Submit for Translation |
    When User Clicks on "Submit for Translation" button
    Then Card should move to Transalation page creative in "Default" folder
    When User clicks edit button of rich media creative
    Then Rich media edit page should display with Orginal and Translated content
    Then Rich media edit translation page should have below fields as empty
      | title |
      |       |
    Then Rich media edit orginal fields should not be editable
    When User filles Rich media edit page Translated fields page with "<title>" , "<author>" , "<textlink>" and "<summary>"
    When User clicks on translation page Rich Media content Image icon for upload
    When User uploads valid image to Rich Media content creative with name as "valid.png"
    Then Page should have following Save and Navigation options
      | Notify to User                |
      | Save                          |
      | Save & Close                  |
      | Submit for Translation Review |
    When User Clicks on "Submit for Translation Review" button
    Then The following card should get transfered to the Translation Review in "Default" folder
    When User clicks edit button of rich media creative
    Then User should navigate to "Translation Review" page
    Then Page should have following Save and Navigation options
      | Notify to User      |
      | Save                |
      | Save & Close        |
      | Submit for Approval |
    When User clicks on Resassign button
    Then User should see Reassign to draft menu option
    Then User should see Reassign to Translation menu option
    When User clicks on Reassign to Translation menu option
    Then User should see the popup of "Please select user to notify" with email Id's which is registere in the user management module
    When User selects any of the email id
    Then Rich media creative should deleted succesfully from "Default" folder in any tab
    When User clicks on "Translation" creative tab
    Then Card should move to Transalation page creative in "Default" folder
    When User click on "Move to translation review" Icon Link on creative list page
    Then Model popup with below buttons should display
      | Notify to User |
    When User Clicks on OK Model button
    When User clicks on "Translation Review" creative tab
    Then The following card should get transfered to the Translation Review in "Default" folder
    When User click on "Move to approval" Icon Link on creative list page
    Then Model popup with below buttons should display
      | Notify to User |
    When User Clicks on OK Model button
    When User clicks on "Approve" creative tab
    Then Card should move to "Approve" page creative
    When User click on "Move to library" Icon Link on creative list page
    Then Model popup with below buttons should display
      | Notify to User |
    When User Clicks on OK Model button
    Then Card should move to Library of "Rich Media" in "Default" Folder
    When User clicks delete button of rich media creative
    When User Clicks on OK Model button
    Then Rich media creative should deleted succesfully from "Default" folder in any tab

    Examples: 
      | title             | author | textlink         | summary     |
      | richmedia-content | author | https://test.com | testSummary |

  Scenario Outline: TC-8689 Rich media content card - "Notify to User" check for "Approve & Send to Library" - Rich Media Card
      1. Create RTM Content creative
      2. Valid JPEG File
      3. With Use of Save and Save & Close
      4. Validate all the available navigation on different Pages
      5. Verify Navigation to Approve view page
      6. Select single user for notification
      7  Verify Notify User on Approve page and Approve & Send to Library
      8. Verify User received notification

    When User clicks on creative nav menu
    Then User should navigate to creative page
    When User clicks Add Creative Button
    Then User should see Creative type as following
      | Rich Media |
      | Text       |
      | Video      |
      | Audio      |
      | Image      |
    When User selects "Rich Media" creative from dropdown
    Then User should see "Rich Media" creative page
    Then User should see Content and JumpLink
      | Content   |
      | Jump link |
    And Content Should be highlighted default
    When User clicks Content Rich media creative
    Then it should display the content card create Page with headertext as "Create New Message Card: Rich Media"
    When User enters content title as "<title>" author as "<author>" bodytext as "<bodyText>" textlink as "<textlink>"  summary as "<summary>"
    When User clicks Rich Media content Image icon for upload
    When User uploads valid image to Rich Media content creative with name as "valid.png"
    When User uploads valid image to Rich Media creative with name as "valid.jpg"
    When User select folder name from dropdown as "Default"
    Then Page should have following Save and Navigation options
      | Notify to User |
      | Save           |
      | Save & Close   |
    When User Clicks on "Save" button
    Then Page should have following Save and Navigation options
      | Notify to User |
      | Save           |
      | Save & Close   |
    When User Clicks on "Save & Close" button
    Then User should navigate to creative page
    Then Rich media creative should saved succesfully in "Default" folder
    When User clicks edit button of rich media creative
    Then Create creative page should display for richmedia creative
    Then Page should have following Save and Navigation options
      | Notify to User          |
      | Save                    |
      | Save & Close            |
      | Submit for Draft Review |
    When User Clicks on "Submit for Draft Review" button
    Then Card should moved to DraftReview and user should moved to Draft review tab in "Default" folder
    When User clicks edit button of rich media creative
    Then Create page of draft review should display
    Then Page should have following Save and Navigation options
      | Notify to User         |
      | Save                   |
      | Save & Close           |
      | Submit for Approval    |
      | Submit for Translation |
    When User Clicks on "Submit for Translation" button
    Then Card should move to Transalation page creative
    When User clicks edit button of rich media creative
    Then Rich media edit page should display with Orginal and Translated content
    Then Rich media edit translation page should have below fields as empty
      | title |
      |       |
    Then Rich media edit orginal fields should not be editable
    When User filles Rich media edit page Translated fields page with "<title>" , "<author>" , "<textlink>" and "<summary>"
    When User clicks on translation page Rich Media content Image icon for upload
    When User uploads valid image to Rich Media content creative with name as "valid.png"
    Then Page should have following Save and Navigation options
      | Notify to User                |
      | Save                          |
      | Save & Close                  |
      | Submit for Translation Review |
    When User Clicks on "Submit for Translation Review" button
    Then The following card should get transfered to the Translation Review
    When User clicks edit button of rich media creative
    Then User should navigate to "Translation Review" page
    Then Page should have following Save and Navigation options
      | Notify to User      |
      | Save                |
      | Save & Close        |
      | Submit for Approval |
    When User Clicks on "Submit for Approval" button
    Then Card should move to "Approval" page creative
    When User click on View Icon Link on approve creative page
    Then Page should have following Save and Navigation options
      | Notify to User            |
      | Approve & Send to Library |
    When User Clicks on "Notify to User" button
    Then User should see the popup of "Please select user to notify" with email Id's which is registere in the user management module
    When User selects notify user by email id
    When User Clicks on "Approve & Send to Library" button
    Then Card should move to Library of "Rich Media" in "Default" Folder
    Then User should receive notfication for RichMedia creative for "LIBRARY"
    When User clicks delete button of rich media creative
    When User Clicks on OK Model button
    Then Rich media creative should deleted succesfully from "Default" folder

    Examples: 
      | title             | author | textlink         | summary     |
      | richmedia-content | author | https://test.com | testSummary |

@check1
  Scenario Outline: TC-8689 Rich media content card - "Notify to User" on Draft page - Rich Media Card
      1. Create RTM Content creative
      2. Valid JPEG File
      3. With Use of Save and Save & Close
      4. Validate all the available navigation on different Pages
      5. Select multiple user for notification on Draft page
      6  Verify Notify User on Approve page and Approve & Send to Library
      7. Verify User received notification
      8. Finally Delete created rich Media from Draft RichMedia Page

    When User clicks on creative nav menu
    Then User should navigate to creative page
    When User clicks Add Creative Button
    Then User should see Creative type as following
      | Rich Media |
      | Text       |
      | Video      |
      | Audio      |
      | Image      |
    When User selects "Rich Media" creative from dropdown
    Then User should see "Rich Media" creative page
    Then User should see Content and JumpLink
      | Content   |
      | Jump link |
    And Content Should be highlighted default    
    When User clicks Content Rich media creative
    Then it should display the content card create Page with headertext as "Create New Message Card: Rich Media"
    When User enters content title as "<title>" author as "<author>" bodytext as "<bodyText>" textlink as "<textlink>"  summary as "<summary>"
    When User clicks Rich Media content Image icon for upload
    When User uploads valid image to Rich Media content creative with name as "valid.png"
    When User uploads valid image to Rich Media creative with name as "valid.jpg"
    When User select folder name from dropdown as "Default"
    Then Page should have following Save and Navigation options
      | Notify to User |
      | Save           |
      | Save & Close   |
    When User Clicks on "Save" button
    Then Page should have following Save and Navigation options
      | Notify to User |
      | Save           |
      | Save & Close   |
    When User Clicks on "Save & Close" button
    Then User should navigate to creative page
    Then Rich media creative should saved succesfully in "Default" folder
    When User clicks edit button of rich media creative
    Then Create creative page should display for richmedia creative
    Then Page should have following Save and Navigation options
      | Notify to User          |
      | Save                    |
      | Save & Close            |
      | Submit for Draft Review |
    When User Clicks on "Notify to User" button
    Then User should see the popup of "Please select user to notify" with email Id's which is registere in the user management module
    When User selects notify user by email id
     Then User should receive notfication for creative
    When User Clicks on "Save & Close" button
    Then Rich media creative should saved succesfully in "Default" folder
    Then User should receive notfication for RichMedia creative for "DRAFT"
    When User clicks delete button of rich media creative
    When User Clicks on OK Model button
    Then Rich media creative should deleted succesfully from "Default" folder

    Examples: 
      | title             | author | textlink         | summary     |
      | richmedia-content | author | https://test.com | testSummary |
   
  Scenario Outline: TC-8689 Rich media content card - "Notify to User" on Translation page - Rich Media Card
      1. Create RTM Content creative
      2. Valid JPEG File
      3. With Use of Save and Save & Close
      4. Validate all the available navigation on different Pages
      6. Select multiple user for notification on Translation page
      7  Verify Notify User for Translation
      8. Verify User received notification

    When User clicks on creative nav menu
    Then User should navigate to creative page
    When User clicks Add Creative Button
    Then User should see Creative type as following
      | Rich Media |
      | Text       |
      | Video      |
      | Audio      |
      | Image      |
    When User selects "Rich Media" creative from dropdown
    Then User should see "Rich Media" creative page
    Then User should see Content and JumpLink
      | Content   |
      | Jump link |
    And Content Should be highlighted default
    When User clicks Content Rich media creative
    Then it should display the content card create Page with headertext as "Create New Message Card: Rich Media"    
    When User enters content title as "<title>" author as "<author>" bodytext as "<bodyText>" textlink as "<textlink>"  summary as "<summary>"
    When User clicks Rich Media content Image icon for upload
    When User uploads valid image to Rich Media content creative with name as "valid.png"
    
    When User uploads valid image to Rich Media creative with name as "valid.jpg"
    When User select folder name from dropdown as "Default"
    Then Page should have following Save and Navigation options
      | Notify to User |
      | Save           |
      | Save & Close   |
    When User Clicks on "Save" button
    Then Page should have following Save and Navigation options
      | Notify to User |
      | Save           |
      | Save & Close   |
    When User Clicks on "Save & Close" button
    Then User should navigate to creative page
    Then Rich media creative should saved succesfully in "Default" folder
    When User clicks edit button of rich media creative
    Then Create creative page should display for richmedia creative
    Then Page should have following Save and Navigation options
      | Notify to User          |
      | Save                    |
      | Save & Close            |
      | Submit for Draft Review |
    When User Clicks on "Submit for Draft Review" button
    Then Card should moved to DraftReview and user should moved to Draft review tab in "Default" folder
    When User clicks edit button of rich media creative
    Then Create page of draft review should display
    Then Page should have following Save and Navigation options
      | Notify to User         |
      | Save                   |
      | Save & Close           |
      | Submit for Approval    |
      | Submit for Translation |
    When User Clicks on "Notify to User" button
    Then User should see the popup of "Please select user to notify" with email Id's which is registere in the user management module
    When User selects notify user by email id
    When User Clicks on "Submit for Translation" button
    Then Card should move to Transalation page creative
    Then User should receive notfication for RichMedia creative for "TRANSLATION"
    When User clicks edit button of rich media creative
    Then Rich media edit page should display with Orginal and Translated content
    Then Rich media edit translation page should have below fields as empty
      | title |
      |       |
    Then Rich media edit orginal fields should not be editable
    When User filles Rich media edit page Translated fields page with "<title>" , "<author>" , "<textlink>" and "<summary>"
    When User clicks on translation page Rich Media content Image icon for upload
    When User uploads valid image to Rich Media content creative with name as "valid.png"
    Then Page should have following Save and Navigation options
      | Notify to User                |
      | Save                          |
      | Save & Close                  |
      | Submit for Translation Review |
    When User Clicks on "Submit for Translation Review" button
    Then The following card should get transfered to the Translation Review
    When User clicks edit button of rich media creative
    Then User should navigate to "Translation Review" page
    Then Page should have following Save and Navigation options
      | Notify to User      |
      | Save                |
      | Save & Close        |
      | Submit for Approval |
    When User Clicks on "Submit for Approval" button
    Then Card should move to "Approval" page creative
    When User click on View Icon Link on approve creative page
    Then Page should have following Save and Navigation options
      | Notify to User            |
      | Approve & Send to Library |
    When User Clicks on "Approve & Send to Library" button
    Then Card should move to Library of "Rich Media" in "Default" Folder
    When User clicks delete button of rich media creative
    When User Clicks on OK Model button
    Then Rich media creative should deleted succesfully from "Default" folder

    Examples: 
      | title             | author | textlink         | summary     |
      | richmedia-content | author | https://test.com | testSummary |

  Scenario Outline: TC-8689 Rich media content card - "Notify to User" on Translation Review page - Rich Media Card
    1. Create RTM Content creative
    2. Valid JPEG File
    3. With Use of Save and Save & Close
    4. Validate all the available navigation on different Pages
    6. Select multiple user for notification on Translation Review page
    7  Verify Notify User on Translation Review
    8. Verify User received notification

    When User clicks on creative nav menu
    Then User should navigate to creative page
    When User clicks Add Creative Button
    Then User should see Creative type as following
      | Rich Media |
      | Text       |
      | Video      |
      | Audio      |
      | Image      |
    When User selects "Rich Media" creative from dropdown
    Then User should see "Rich Media" creative page
    Then User should see Content and JumpLink
      | Content   |
      | Jump link |
    And Content Should be highlighted default
    When User clicks Content Rich media creative
    Then it should display the content card create Page with headertext as "Create New Message Card: Rich Media"
    When User enters content title as "<title>" author as "<author>" bodytext as "<bodyText>" textlink as "<textlink>"  summary as "<summary>"
    When User clicks Rich Media content Image icon for upload
    When User uploads valid image to Rich Media content creative with name as "valid.png"
    When User uploads valid image to Rich Media creative with name as "valid.jpg"
    When User select folder name from dropdown as "Default"
    Then Page should have following Save and Navigation options
      | Notify to User |
      | Save           |
      | Save & Close   |
    When User Clicks on "Save" button
    Then Page should have following Save and Navigation options
      | Notify to User |
      | Save           |
      | Save & Close   |
    When User Clicks on "Save & Close" button
    Then User should navigate to creative page
    Then Rich media creative should saved succesfully in "Default" folder
    When User clicks edit button of rich media creative
    Then Create creative page should display for richmedia creative
    Then Page should have following Save and Navigation options
      | Notify to User          |
      | Save                    |
      | Save & Close            |
      | Submit for Draft Review |
    When User Clicks on "Submit for Draft Review" button
    Then Card should moved to DraftReview and user should moved to Draft review tab in "Default" folder
    When User clicks edit button of rich media creative
    Then Create page of draft review should display
    Then Page should have following Save and Navigation options
      | Notify to User         |
      | Save                   |
      | Save & Close           |
      | Submit for Approval    |
      | Submit for Translation |
    When User Clicks on "Submit for Translation" button
    Then Card should move to Transalation page creative
    When User clicks edit button of rich media creative
    Then Rich media edit page should display with Orginal and Translated content
    Then Rich media edit translation page should have below fields as empty
      | title |
      |       |
    Then Rich media edit orginal fields should not be editable
    When User filles Rich media edit page Translated fields page with "<title>" , "<author>" , "<textlink>" and "<summary>"
    When User clicks on translation page Rich Media content Image icon for upload
    When User uploads valid image to Rich Media content creative with name as "valid.png"
    Then Page should have following Save and Navigation options
      | Notify to User                |
      | Save                          |
      | Save & Close                  |
      | Submit for Translation Review |
    When User Clicks on "Notify to User" button
    Then User should see the popup of "Please select user to notify" with email Id's which is registere in the user management module
    When User selects notify user by email id
    When User Clicks on "Submit for Translation Review" button
    Then The following card should get transfered to the Translation Review
    Then User should receive notfication for RichMedia creative for "TRANSLATIONREVIEW"
    Then User should navigate to "Translation Review" page
    When User clicks edit button of rich media creative
    Then Page should have following Save and Navigation options
      | Notify to User      |
      | Save                |
      | Save & Close        |
      | Submit for Approval |
    When User Clicks on "Submit for Approval" button
    Then Card should move to "Approval" page creative
    When User click on View Icon Link on approve creative page
    Then Page should have following Save and Navigation options
      | Notify to User            |
      | Approve & Send to Library |
    When User Clicks on "Approve & Send to Library" button
    Then Card should move to Library of "Rich Media" in "Default" Folder
    When User clicks delete button of rich media creative
    When User Clicks on OK Model button
    Then Rich media creative should deleted succesfully from "Default" folder

    Examples: 
      | title             | author | textlink         | summary     |
      | richmedia-content | author | https://test.com | testSummary |

  Scenario Outline: TC-8689 Rich media content card - "Notify to User" on Approve page - Rich Media Card
      1. Create RTM Content creative
      2. Valid JPEG File
      3. With Use of Save and Save & Close
      4. Validate all the available navigation on different Pages
      6. Select multiple user for notification on Approve page
      7  Verify Notify User on Approve page and Approve & Send to Library
      8. Verify User received notification for Approve

    When User clicks on creative nav menu
    Then User should navigate to creative page
    When User clicks Add Creative Button
    Then User should see Creative type as following
      | Rich Media |
      | Text       |
      | Video      |
      | Audio      |
      | Image      |
    When User selects "Rich Media" creative from dropdown
    Then User should see "Rich Media" creative page
    Then User should see Content and JumpLink
      | Content   |
      | Jump link |
    And Content Should be highlighted default
    When User clicks Content Rich media creative
    Then it should display the content card create Page with headertext as "Create New Message Card: Rich Media"
    When User enters content title as "<title>" author as "<author>" bodytext as "<bodyText>" textlink as "<textlink>"  summary as "<summary>"
    When User clicks Rich Media content Image icon for upload
    When User uploads valid image to Rich Media content creative with name as "valid.png"
    When User uploads valid image to Rich Media creative with name as "valid.jpg"
    When User select folder name from dropdown as "Default"
    Then Page should have following Save and Navigation options
      | Notify to User |
      | Save           |
      | Save & Close   |
    When User Clicks on "Save" button
    Then Page should have following Save and Navigation options
      | Notify to User |
      | Save           |
      | Save & Close   |
    When User Clicks on "Save & Close" button
    Then User should navigate to creative page
    Then Rich media creative should saved succesfully in "Default" folder
    When User clicks edit button of rich media creative
    Then Create creative page should display for richmedia creative
    Then Page should have following Save and Navigation options
      | Notify to User          |
      | Save                    |
      | Save & Close            |
      | Submit for Draft Review |
    When User Clicks on "Submit for Draft Review" button
    Then Card should moved to DraftReview and user should moved to Draft review tab in "Default" folder
    When User clicks edit button of rich media creative
    Then Create page of draft review should display
    Then Page should have following Save and Navigation options
      | Notify to User         |
      | Save                   |
      | Save & Close           |
      | Submit for Approval    |
      | Submit for Translation |
    When User Clicks on "Submit for Translation" button
    Then Card should move to Transalation page creative
    When User clicks edit button of rich media creative
    Then Rich media edit page should display with Orginal and Translated content
    Then Rich media edit translation page should have below fields as empty
      | title |
      |       |
    Then Rich media edit orginal fields should not be editable
    When User filles Rich media edit page Translated fields page with "<title>" , "<author>" , "<textlink>" and "<summary>"
    When User clicks on translation page Rich Media content Image icon for upload
    When User uploads valid image to Rich Media content creative with name as "valid.png"
    Then Page should have following Save and Navigation options
      | Notify to User                |
      | Save                          |
      | Save & Close                  |
      | Submit for Translation Review |
    When User Clicks on "Submit for Translation Review" button
    Then The following card should get transfered to the Translation Review
    When User clicks edit button of rich media creative
    Then User should navigate to "Translation Review" page
    Then Page should have following Save and Navigation options
      | Notify to User      |
      | Save                |
      | Save & Close        |
      | Submit for Approval |
    When User Clicks on "Notify to User" button
    Then User should see the popup of "Please select user to notify" with email Id's which is registere in the user management module
    When User selects notify user by email id
    When User Clicks on preview button
    Then Preview model should display with exit button
    Then Preview model should display link with creative description
    When User clicks on description link in preview model
    Then User should navigate to new descrption window
    Then User close preview Model by clicking exit button
    When User Clicks on "Submit for Approval" button
    Then Card should move to "Approval" page creative
    Then User should receive notfication for RichMedia creative for "APPROVE"
    When User click on View Icon Link on approve creative page
    Then Page should have following Save and Navigation options
      | Notify to User            |
      | Approve & Send to Library |
    When User Clicks on "Approve & Send to Library" button
    Then Card should move to Library of "Rich Media" in "Default" Folder
    When User clicks delete button of rich media creative
    When User Clicks on OK Model button
    Then Rich media creative should deleted succesfully from "Default" folder

    Examples: 
      | title             | author | textlink         | summary     |
      | richmedia-content | author | https://test.com | testSummary |

@check1
  Scenario Outline: TC-8689 Rich media-Content card - "Notify to User" on Draft review page - Rich Media Card
      1. Create RTM Content creative
      2. Valid JPEG File
      3. With Use of Save and Save & Close
      4. Validate all the available navigation on different Pages
      6. Select multiple user for notification on Draft Review page
      7  Verify Notify User on Approve page and Approve & Send to Library
      8. Verify User received notification for Draft Review Phase
      9. Verify Creative Preview functionality
      10. Preview with all device types
      11. Create New Folder
      12. Move created creative to new Folder
      13. Delete newly created Folder

    When User clicks on creative nav menu
    Then User should navigate to creative page
    When User clicks Add Creative Button
    Then User should see Creative type as following
      | Rich Media |
      | Text       |
      | Video      |
      | Audio      |
      | Image      |
    When User selects "Rich Media" creative from dropdown
    Then User should see "Rich Media" creative page
    Then User should see Content and JumpLink
      | Content   |
      | Jump link |
    And Content Should be highlighted default
    When User clicks Content Rich media creative
    Then it should display the content card create Page with headertext as "Create New Message Card: Rich Media"
    When User enters content title as "<title>" author as "<author>" bodytext as "<bodyText>" textlink as "<textlink>"  summary as "<summary>"
    When User clicks Rich Media content Image icon for upload
    When User uploads valid image to Rich Media content creative with name as "valid.png"
    When User uploads valid image to Rich Media creative with name as "valid.jpg"
    When User select folder name from dropdown as "Default"
    Then Page should have following Save and Navigation options
      | Notify to User |
      | Save           |
      | Save & Close   |
    When User Clicks on "Save" button
    Then Page should have following Save and Navigation options
      | Notify to User |
      | Save           |
      | Save & Close   |
    When User Clicks on "Save & Close" button
    Then User should navigate to creative page
    When User clicks on Add New folder button
    Then User should see add create new folder popup
    When User enter folder name as "autofolder1"
    When User clicks on create folder submit button
    Then New folder should be created as "autofolder1"
    When User clicks on creative move button by creative name
    Then Crerative should moved succefully in "autofolder1"
    Then Count should increased by 1 in "autofolder1" folder and in label
    Then Count should decresed by 1 in "Default" folder and in label
    When User clicks on delete folder button
    Then Folder should be deleted successfully
    Then Rich media creative should saved succesfully in "Default" folder
    When User clicks edit button of rich media creative
    Then Create creative page should display for richmedia creative
    Then Page should have following Save and Navigation options
      | Notify to User          |
      | Save                    |
      | Save & Close            |
      | Submit for Draft Review |
    When User Clicks on "Notify to User" button
    Then User should see the popup of "Please select user to notify" with email Id's which is registere in the user management module
    When User selects all checkBox on NotifyUser popup
    Then All Notify User checkbox should checked for Notification
    When User Un-checks all checkbox on NotifyUser popup
    Then All checkbox should un-checked for Notify User
    When User selects notify user by email id
    When User Clicks on preview button
    Then Preview model should display with exit button
    Then Preview model should display properly for differnt devices
      | Device       | Class    |
      | iPhone 6/7/8 | iphone6  |
      | iPhone 5/5SE | iphone5  |
      | iPhone X     | iphoneX  |
      | iPad Pro     | ipadPro  |
      | iPad         | ipad     |
      | Pixel 2      | pixel2   |
      | Galaxy S9    | galaxyS9 |
    Then Preview model should display link with creative description
    When User clicks on description link in preview model
    Then User should navigate to new descrption window
    Then User close preview Model by clicking exit button
    When User Clicks on "Submit for Draft Review" button
    Then Card should moved to DraftReview and user should moved to Draft review tab in "Default" folder
    Then User should receive notfication for RichMedia creative for "DRAFTREVIEW"
    When User clicks edit button of rich media creative
    Then Create page of draft review should display
    Then Page should have following Save and Navigation options
      | Notify to User         |
      | Save                   |
      | Save & Close           |
      | Submit for Approval    |
      | Submit for Translation |
    When User Clicks on "Submit for Translation" button
    Then Card should move to Transalation page creative
    When User clicks edit button of rich media creative
    Then Rich media edit page should display with Orginal and Translated content
    Then Rich media edit translation page should have below fields as empty
      | title |
      |       |
    Then Rich media edit orginal fields should not be editable
    When User filles Rich media edit page Translated fields page with "<title>" , "<author>" , "<textlink>" and "<summary>"
    When User clicks on translation page Rich Media content Image icon for upload
    When User uploads valid image to Rich Media content creative with name as "valid.png"
    Then Page should have following Save and Navigation options
      | Notify to User                |
      | Save                          |
      | Save & Close                  |
      | Submit for Translation Review |
    When User Clicks on "Submit for Translation Review" button
    Then The following card should get transfered to the Translation Review
    When User clicks edit button of rich media creative
    Then User should navigate to "Translation Review" page
    Then Page should have following Save and Navigation options
      | Notify to User      |
      | Save                |
      | Save & Close        |
      | Submit for Approval |
    When User Clicks on "Submit for Approval" button
    Then Card should move to "Approval" page creative
    When User click on View Icon Link on approve creative page
    Then Page should have following Save and Navigation options
      | Notify to User            |
      | Approve & Send to Library |
    When User Clicks on "Approve & Send to Library" button
    Then Card should move to Library of "Rich Media" in "Default" Folder
    When User clicks delete button of rich media creative
    When User Clicks on OK Model button
    Then Rich media creative should deleted succesfully from "Default" folder
    Examples: 
      | title             | author | textlink                  | summary     |
      | richmedia-content | author | https://www.wechatify.com | testSummary |

  #@ignore
  Scenario: LogoutFrom to Wechatify
    When User perform logout from Wechatify
    Then User should see application login page
