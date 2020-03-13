Feature: IMAGE creative Negative Validations

  @imagevalids
  Scenario: Verify Navigation to creative page
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

  @imagevalids
  Scenario Outline: Verify Image card creation with valid datas
    When User clicks on creative nav menu
    Then User should navigate to creative page
    When User click on mediatype subtab "Image"
    When User clicks Add Creative Button
    Then User should see Creative type as following
      | Rich Media |
      | Text       |
      | Video      |
      | Audio      |
      | Image      |
    When User selects "IMAGE" creative from dropdown
    When User enters Image card title as "<imageTitle>" as "Normal"
    When User uploads Cover image to Image creative with name as "valid.png" and "Original"
    When User clicks on save Image_creative button "Save"
    When User clicks on Notify to User
    When User chooses a user for email notification "<emailid>"
    When User clicks on Preview
    When User Searches and selects follower to send preview "Raghu"
    #When User clicks on save Image_creative button "Save and Close"
    When User Clicks on "Submit for Draft Review" button
    #Draft Review
    When User clicks edit button of imageCard
    When User enters Image card title as "<imageTitle>" as "Normal"
    When User uploads Cover image to Image creative with name as "valid.png" and "Original"
    When User clicks on save Image_creative button "Save"
    When User clicks on Notify to User
    When User chooses a user for email notification "<emailid>"
    When User clicks on Preview
    When User Searches and selects follower to send preview "Raghu"
    When User Clicks on "Submit for Translation" button
    #Translation
    When User clicks edit button of imageCard
    When User enters Image card title as "<imageTitle>" as "Trans"
    When User uploads Cover image to Image creative with name as "valid.png" and "Translate"
    When User clicks on save Image_creative button "Save"
    When User clicks on Notify to User
    When User chooses a user for email notification "<emailid>"
    When User clicks on Preview
    When User Searches and selects follower to send preview "Raghu"
    When User Clicks on "Submit for Translation Review" button
    #Translation Review
    When User clicks edit button of imageCard
    When User enters Image card title as "<imageTitle>" as "Trans"
    When User uploads Cover image to Image creative with name as "valid.png" and "Translate"
    When User clicks on save Image_creative button "Save"
    When User clicks on Notify to User
    When User chooses a user for email notification "<emailid>"
    When User clicks on Preview
    When User Searches and selects follower to send preview "Raghu"
    When User Clicks on "Submit for Approval" button

    Examples: 
      | imageTitle      | emailid                        |
      | Image Card no : | tmgautomationtesting@gmail.com |

#  @imagevalids1
#  Scenario: Verify Navigation to creative page
#    Given User navigated to Wechatify login page
#    When User logins as usertype "Admin" with valid credentials
#    Then User should see User Management module Home Page
#    When User clicks on creative nav menu
#    Then User should navigate to creative page
#    And Creative page should have following sections
#      | CREATIVES |
#      | LIBRARY   |
#    And Creative page should have following tabs
#      | DRAFTS             |
#      | DRAFTS REVIEW      |
#      | TRANSLATION        |
#      | TRANSLATION REVIEW |
#      | APPROVE            |
#    When User clicks Add Creative Button
#    Then User should see Creative type as following
#      | Rich Media |
#      | Text       |
#      | Video      |
#      | Audio      |
#      | Image      |

#  @imagevalids1
#  Scenario Outline: Verify Image card creation with valid datas
#    When User clicks on creative nav menu
#    Then User should navigate to creative page
#    When User click on mediatype subtab "Image"
#    When User clicks Add Creative Button
#    Then User should see Creative type as following
#      | Rich Media |
#      | Text       |
#      | Video      |
#      | Audio      |
#      | Image      |
#    When User selects "IMAGE" creative from dropdown
#    When User enters Image card title as "<imageTitle>" as "Normal"
#    When User uploads Cover image to Image creative with name as "valid.png" and "Original"
#    When User clicks on save Image_creative button "Save"
#    When User Clicks on "Submit for Draft Review" button
#    #Draft Review
#    When User clicks edit button of imageCard
#    When User enters Image card title as "<imageTitle>" as "Normal"
#    When User Clicks on "Submit for Translation" button
#    #Translation
#    When User clicks edit button of imageCard
#    When User enters Image card title as "<imageTitle>" as "Trans"
#    When User uploads Cover image to Image creative with name as "valid.png" and "Translate"
#    When User clicks on save Image_creative button "Save"
#    When User Clicks on "Submit for Translation Review" button
#    #Translation Review
#    When User clicks edit button of imageCard
#    When User enters Image card title as "<imageTitle>" as "Trans"
#    When User uploads Cover image to Image creative with name as "valid.png" and "Translate"
#    When User clicks on save Image_creative button "Save"
#    When User Clicks on "Submit for Approval" button
#    #Then Card should move to "Approval" page creative - Approval Page
#    When User clicks on Image card View Button
#    When User Clicks on "Approve & Send to Library" button
#
#    Examples: 
#      | imageTitle      | emailid                        |
#      | Image Card no : | tmgautomationtesting@gmail.com |

#  @imagevalids2
#  Scenario: Verify Navigation to creative page
#    Given User navigated to Wechatify login page
#    When User logins as usertype "Admin" with valid credentials
#    Then User should see User Management module Home Page
#    When User clicks on creative nav menu
#    Then User should navigate to creative page
#    And Creative page should have following sections
#      | CREATIVES |
#      | LIBRARY   |
#    And Creative page should have following tabs
#      | DRAFTS             |
#      | DRAFTS REVIEW      |
#      | TRANSLATION        |
#      | TRANSLATION REVIEW |
#      | APPROVE            |

  @imagevalids2
  Scenario Outline: Verify Image card creation with valid datas
    When User clicks on creative nav menu
    Then User should navigate to creative page
    When User click on mediatype subtab "Image"
    When User clicks Add Creative Button
    Then User should see Creative type as following
      | Rich Media |
      | Text       |
      | Video      |
      | Audio      |
      | Image      |
    When User selects "IMAGE" creative from dropdown
    When User enters Image card title as "<imageTitle>" as "Normal"
    When User uploads Cover image to Image creative with name as "valid.png" and "Original"
    When User clicks on save Image_creative button "Save"
    When User Clicks on "Submit for Draft Review" button
    #Draft Review
    When User clicks edit button of imageCard
    When User Clicks on "Submit for Approval" button
    #Then Card should move to "Approval" page creative - Approval Page
    When User clicks on Image card View Button
    When User Clicks on "Approve & Send to Library" button
    #Library
    Then Check whether the created image card is available in the Library

    Examples: 
      | imageTitle      | emailid                        |
      | Image Card no : | tmgautomationtesting@gmail.com |
