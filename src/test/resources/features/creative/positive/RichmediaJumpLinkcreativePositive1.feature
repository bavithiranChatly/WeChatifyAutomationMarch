Feature: Verfiy Rich media jump link creativce feature for positive scenario

  Background: 
    When User confirms leave page popup
    Given Close any model poup if displayed

  @smoke
    Scenario: TC-9759 Observe the Creatives Page navigation
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
  
    @check
  Scenario Outline: TC-9970 Create flow upto Library - Rich media [ Jump Link ]
    with valid dataset and With Save Btn
    1. Create RTM JumpLink creative with Save Btn
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
    When User clicks JumpLink Rich media creative
    Then it should display the jump link card create Page with description as "Jump link Selected"
    When User selects langauge as "English"
    When User enters title as "<title>" author as "<author>" textlink as "<textlink>"  summary as "<summary>"
    When User select tag by tagname as "dog" for rich media with click on adtag button
    Then Added Adtag "dog" should display to create rich media creative page
    When User clicks upload image tooltip button for jumplink richmedia creative
    Then Jumplink richmedia creative toop tip should display with correct text
      | Image format - JPG, JPEG, PNG, GIF. |
      | Image size limit - 2MB.             |
      | Minimum image dimension 200 * 200.  |
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

  Scenario Outline: TC-9970 Create flow upto Library - Rich media [ Jump Link ] with new tag and new category
    with valid dataset and Save & Close Btn
    1. Create RTM JumpLink creative with new tag and new category
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
    When User clicks JumpLink Rich media creative
    Then it should display the jump link card create Page with description as "Jump link Selected"
    When User selects langauge as "English"
    When User enters title as "<title>" author as "<author>" textlink as "<textlink>"  summary as "<summary>"
    When User creates new tag "mytag" with new category as "mycat" & strength number as "10" & membership card as "J" and point as "50"
    Then Added Adtag should display to create rich media creative page
    When User clicks upload image tooltip button for jumplink richmedia creative
    Then Jumplink richmedia creative toop tip should display with correct text
      | Image format - JPG, JPEG, PNG, GIF. |
      | Image size limit - 2MB.             |
      | Minimum image dimension 200 * 200.  |
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

  Scenario Outline: TC-9970 Create flow upto Library - Rich media [ Jump Link ] with new tag and existing category
    with valid dataset and Save & Close Btn  
    1. Create RTM JumpLink creative with new tag and existing category
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
    When User clicks JumpLink Rich media creative
    Then it should display the jump link card create Page with description as "Jump link Selected"
    When User selects langauge as "English"
    When User enters title as "<title>" author as "<author>" textlink as "<textlink>"  summary as "<summary>"
    When User creates new tag "myag" with existing category as "WeChat App" & strength number as "10" & membership card as "J" and point as "50"
    Then Added Adtag should display to create rich media creative page
    When User clicks upload image tooltip button for jumplink richmedia creative
    Then Jumplink richmedia creative toop tip should display with correct text
      | Image format - JPG, JPEG, PNG, GIF. |
      | Image size limit - 2MB.             |
      | Minimum image dimension 200 * 200.  |
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

 @check
  Scenario Outline: TC-9970 Create flow upto Library - Rich media [ Jump Link ] when user click move to libray icon on approve page
    1. Create RTM JumpLink creative with existing tag
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
    When User clicks JumpLink Rich media creative
    Then it should display the jump link card create Page with description as "Jump link Selected"
    When User selects langauge as "English"
    When User enters title as "<title>" author as "<author>" textlink as "<textlink>"  summary as "<summary>"
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
    #|Preview|
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
    # When User click on Move to Library Icon Link on approve creative page
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

  Scenario Outline: TC-9970 Create flow upto Library - Rich media [ Jump Link ] when user click view and Approve & Send to libray icon on approve page
    1. Create RTM JumpLink creative
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
    When User clicks JumpLink Rich media creative
    Then it should display the jump link card create Page with description as "Jump link Selected"
    When User selects langauge as "English"
    When User enters title as "<title>" author as "<author>" textlink as "<textlink>"  summary as "<summary>"
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
    #|Preview|
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
    When User clicks edit button of rich media creative
    Then Rich media edit page should display with Orginal and Translated content
    Then Rich media edit translation page should have below fields as empty
      | title |
      |       |
    Then Rich media edit orginal fields should not be editable
    When User filles Rich media edit page Translated fields page with "<title>" , "<author>" , "<textlink>" and "<summary>"
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

  Scenario Outline: TC-8619 Rich media card - Reassign to Draft flow from Translation Page
    1. Create RTM JumpLink creative
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
    When User clicks JumpLink Rich media creative
    Then it should display the jump link card create Page with description as "Jump link Selected"
    When User selects langauge as "English"
    When User enters title as "<title>" author as "<author>" textlink as "<textlink>"  summary as "<summary>"
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
    #|Preview|
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
    When User clicks edit button of rich media creative
    Then Rich media edit page should display with Orginal and Translated content
    Then Rich media edit translation page should have below fields as empty
      | title |
      |       |
    Then Rich media edit orginal fields should not be editable
    When User filles Rich media edit page Translated fields page with "<title>" , "<author>" , "<textlink>" and "<summary>"
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

  @smoke
  Scenario Outline: TC-8619 Rich media card - Reassign to Translation flow from Approval Page
     1. Create RTM JumpLink creative
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
    When User clicks JumpLink Rich media creative
    Then it should display the jump link card create Page with description as "Jump link Selected"
    When User selects langauge as "English"
    When User enters title as "<title>" author as "<author>" textlink as "<textlink>"  summary as "<summary>"
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
    #|Preview|
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
    Then Card should move to Transalation page creative in "Default" folder
    When User clicks edit button of rich media creative
    Then Rich media edit page should display with Orginal and Translated content
    Then Rich media edit translation page should have below fields as empty
      | title |
      |       |
    Then Rich media edit orginal fields should not be editable
    When User filles Rich media edit page Translated fields page with "<title>" , "<author>" , "<textlink>" and "<summary>"
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

  #@ignore
  Scenario: LogoutFrom to Wechatify
    When User perform logout from Wechatify
    Then User should see application login page
