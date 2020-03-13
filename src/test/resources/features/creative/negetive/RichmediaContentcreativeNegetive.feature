
Feature: Verfiy Rich media Content creative feature for Negetive scenario

  Background: 
    When User confirms leave page popup
    Given Close any model poup if displayed

  @check
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
  Scenario Outline: TC-9970 Create flow upto Library - Rich media [Content] With invalid Title for rich media
     1. Create RTM JumpLink creative with Save Btn
     2. With invalid Rich media jump creative title

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
    When User selects langauge as "<language>"
    When User enters content title as "<title>" author as "<author>" bodytext as "<bodyText>" textlink as "<textlink>"  summary as "<summary>"
    When User select tag by tagname as "<tagname>" for rich media with click on adtag button
    Then Added Adtag "<tagname>" should display to create rich media creative page
    When User clicks upload image tooltip button for jumplink richmedia creative
    Then Jumplink richmedia creative toop tip should display with correct text
      | Image format - JPG, JPEG, PNG, GIF. |
      | Image size limit - 2MB.             |
      | Minimum image dimension 200 * 200.  |
    When User clicks Rich Media content Image icon for upload
    When User uploads valid image to Rich Media content creative with name as "valid.png"
    When User select folder name from dropdown as "Default"
    When User Clicks on "Save" button
    Then Validation error should display for title text as "<errormsg>"
    When User clicks on creative nav menu
    When User confirms leave page popup

    Examples: 
      | langauge | title                                                                 | author | bodyText     | textlink         | summary     | tagname | errormsg                                |
      | English  |                                                                       | author | content body | https://test.com | testSummary | dog     | This field is mandatory                 |
      | English  | Length of title of more then  64 character so validation will display | author | content body | https://test.com | testSummary | dog     | Title cannot be more than 64 characters |

  @check
  Scenario Outline: TC-9970 Create flow upto Library - Rich media [Content]
    With No tag with cancel button

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
    When User selects langauge as "<language>"
    When User enters content title as "<title>" author as "<author>" bodytext as "<bodyText>" textlink as "<textlink>"  summary as "<summary>"
    When User select tag by tagname as "<tagname>" for rich media with click on cancel button
    When User clicks upload image tooltip button for jumplink richmedia creative
    Then Jumplink richmedia creative toop tip should display with correct text
      | Image format - JPG, JPEG, PNG, GIF. |
      | Image size limit - 2MB.             |
      | Minimum image dimension 200 * 200.  |
    When User select folder name from dropdown as "Default"
    When User Clicks on "Save" button
    Then Validation error should display for content body text as "<errormsg>"
    When User clicks on creative nav menu
    When User confirms leave page popup

    Examples: 
      | langauge | title        | author | textlink         | summary     | tagname | errormsg                |
      | English  | jumplinktext | author | https://test.com | testSummary | dog     | This field is mandatory |

  Scenario Outline: TC-9970 Create flow upto Library - Rich media [Content]
    With No image upload
    1. Create RTM JumpLink creative with Save Btn
    2. With  No Image upload

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
    When User selects langauge as "<language>"
    When User enters content title as "<title>" author as "<author>" bodytext as "<bodyText>" textlink as "<textlink>"  summary as "<summary>"
    When User select tag by tagname as "<tagname>" for rich media with click on adtag button
    Then Added Adtag "<tagname>" should display to create rich media creative page
    When User clicks upload image tooltip button for jumplink richmedia creative
    Then Jumplink richmedia creative toop tip should display with correct text
      | Image format - JPG, JPEG, PNG, GIF. |
      | Image size limit - 2MB.             |
      | Minimum image dimension 200 * 200.  |
    When User clicks Rich Media content Image icon for upload
    When User uploads valid image to Rich Media content creative with name as "valid.png"
    When User select folder name from dropdown as "Default"
    When User Clicks on "Save" button
    Then Validation error should display for no image upload as "<errormsg>"
    When User clicks on creative nav menu
    When User confirms leave page popup

    Examples: 
      | langauge | title               | author     | textlink         | summary     | tagname | errormsg            |
      | English  | Jumplink Title text | Field text | https://test.com | testSummary | dog     | Please upload image |

  Scenario Outline: TC-9970 Create flow upto Library - Rich media [Content]
    With invalid size image upload
    1. Create RTM JumpLink creative with Save Btn
    2. Diffirent combination of invalid image

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
    When User selects langauge as "<language>"
    When User enters content title as "<title>" author as "<author>" bodytext as "<bodyText>" textlink as "<textlink>"  summary as "<summary>"
    When User select tag by tagname as "<tagname>" for rich media with click on adtag button
    Then Added Adtag "<tagname>" should display to create rich media creative page
    When User clicks upload image tooltip button for jumplink richmedia creative
    Then Jumplink richmedia creative toop tip should display with correct text
      | Image format - JPG, JPEG, PNG, GIF. |
      | Image size limit - 2MB.             |
      | Minimum image dimension 200 * 200.  |  
    When User clicks Rich Media content Image icon for upload
    When User uploads valid image to Rich Media content creative with name as "<imagename>"
    When User uploads invalid image to Rich Media creative with name as "<imagename>"
    Then Save image button should not available with upload popup
    When User select folder name from dropdown as "Default"
    When User Clicks on "Save" button
    Then Validation error should display for no image upload as "<errormsg>"
    When User clicks on creative nav menu
    When User confirms leave page popup

    Examples: 
      | langauge | title               | author     | textlink         | summary     | tagname | imagename    | errormsg            |
      | English  | Jumplink Title text | Field text | https://test.com | testSummary | dog     | invalid.gif  | Please upload image |
      | English  | Jumplink Title text | Field text | https://test.com | testSummary | dog     | invalid.png  | Please upload image |
      | English  | Jumplink Title text | Field text | https://test.com | testSummary | dog     | invalid.jpg  | Please upload image |
      | English  | Jumplink Title text | Field text | https://test.com | testSummary | dog     | invalid.jpeg | Please upload image |
      | English  | Jumplink Title text | Field text | https://test.com | testSummary | dog     | invalid.png  | Please upload image |
      | English  | Jumplink Title text | Field text | https://test.com | testSummary | dog     | big.jpg      | Please upload image |

  Scenario Outline: TC-9970 Create flow upto Library - Rich media [Content]
    With invalid Auther for rich media
    1. Create RTM JumpLink creative with Save Btn
    2. InValid Auther

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
    When User selects langauge as "<language>"
    When User enters content title as "<title>" author as "<author>" bodytext as "<bodyText>" textlink as "<textlink>"  summary as "<summary>"
    When User select tag by tagname as "<tagname>" for rich media with click on adtag button
    Then Added Adtag "<tagname>" should display to create rich media creative page
    When User clicks upload image tooltip button for jumplink richmedia creative
    Then Jumplink richmedia creative toop tip should display with correct text
      | Image format - JPG, JPEG, PNG, GIF. |
      | Image size limit - 2MB.             |
      | Minimum image dimension 200 * 200.  |
    When User clicks Rich Media content Image icon for upload
    When User uploads valid image to Rich Media content creative with name as "valid.png"
    When User uploads valid image to Rich Media creative with name as "valid.png"
    When User select folder name from dropdown as "Default"
    When User Clicks on "Save" button
    Then Validation error should display for author text as "<errormsg>"
    When User clicks on creative nav menu
    When User confirms leave page popup

    Examples: 
      | langauge | title               | author                                   | textlink         | summary     | tagname | errormsg                                 |
      | English  | Jumplink Title text | Field text have length more than 16 char | https://test.com | testSummary | dog     | Author cannot be more than 16 characters |
 
  Scenario Outline: TC-9970 Create flow upto Library - Rich media [Content ]
    With invalid Textlink for rich media
    1. Create RTM JumpLink creative with Save Btn
    2. InValid Textlink

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
    When User selects langauge as "<language>"
    When User enters content title as "<title>" author as "<author>" bodytext as "<bodyText>" textlink as "<textlink>"  summary as "<summary>"
    Then Add tag button should not be enabled on creative page
    When User clicks upload image tooltip button for jumplink richmedia creative
    Then Jumplink richmedia creative toop tip should display with correct text
      | Image format - JPG, JPEG, PNG, GIF. |
      | Image size limit - 2MB.             |
      | Minimum image dimension 200 * 200.  |
    When User clicks Rich Media content Image icon for upload
    When User uploads valid image to Rich Media content creative with name as "valid.png"
    When User uploads valid image to Rich Media creative with name as "valid.png"
    When User select folder name from dropdown as "Default"
    When User Clicks on "Save" button
    Then Validation error should display for textlink as "<errormsg>"
    When User clicks on creative nav menu
    When User confirms leave page popup

    Examples: 
      | langauge | title               | author      | textlink    | summary     | tagname | errormsg    |
      | English  | Jumplink Title text | author name | textlink    | testSummary | dog     | Invalid URL |
      | English  | Jumplink Title text | author name | www         | testSummary | dog     | Invalid URL |
      | English  | Jumplink Title text | author name | http://---  | testSummary | dog     | Invalid URL |
      | English  | Jumplink Title text | author name | http://$$   | testSummary | dog     | Invalid URL |
      | English  | Jumplink Title text | author name | http://www. | testSummary | dog     | Invalid URL |

  #@ignore
  Scenario: LogoutFrom to Wechatify
    When User perform logout from Wechatify
    Then User should see application login page
