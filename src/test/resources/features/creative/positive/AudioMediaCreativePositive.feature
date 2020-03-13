Feature: Verify Audio Type Creative feature Positive Flow

  @Audio
  Scenario: Verify navigation to creative Page
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

  @Audio
  Scenario Outline: Moving the audio card to Library using transfer button in the Edit Page
    1 ,Creating the audio card 
    2 ,Validating the Audio card
    3 ,Give valid data and save the audio card
    4 ,Transfer the audio card to draft review Page
    5 ,Transfer the audio card to the translation Page
    6 ,Enter translation data and save the following card
    7 ,Transfer the audio card to the translation Review page
    8 ,Transfer the audio card to the Approaval page
    9 ,Transfer the audio card to the Library Page
    10,Verify the audio card in available in the Library page or not

    When User clicks on creative nav menu
    Then User should navigate to creative page
    When User clicks Add Creative Button
    Then User should see Creative type as following
      | Rich Media |
      | Text       |
      | Video      |
      | Audio      |
      | Image      |
    When User selects "Audio" creative from dropdown
    Then User should see "Audio" video_creative page
    When User Clicks on "Save" button
    Then Validation error should display for video/Audio creative title text as "<AudioTitleValidation>"
    Then Validation error should display for Invalid Audio Upload as "<AudioUploadValidation>"
    When USer enters Audio Creative "<Audio64Charc>" and "Send"
    When User uploads valid image to Audio creative with name as "Video.mp4" and "English"
    When User Clicks on "Save" button
    Then Validation error should display for video/Audio creative title text as "<AudioMaximumCharacValidation>"
    Then Validation error should display for Invalid Audio Upload as "<AudioUploadValidation>"
    When USer enters Audio Creative "<Title>" and "Send"
    When User uploads valid image to Audio creative with name as "Audio.mp3" and "English"
    When User Clicks on "Save" button
    When User Clicks on "Submit for Draft Review" button
    When User clicks edit button of Audio creative
    When USer enters Audio Creative "<Title>" and "Clear"
    When User Clicks on "Save" button
    Then Validation error should display for video/Audio creative title text as "<AudioTitleValidation>"
    When USer enters Audio Creative "<Audio64Charc>" and "Send"
    When User Clicks on "Save" button
    Then Validation error should display for video/Audio creative title text as "<AudioMaximumCharacValidation>"
    When USer enters Audio Creative "<Title>" and "Send"
    When User uploads valid image to Audio creative with name as "Audio.mp3" and "English"
    When User Clicks on "Save" button
    When User Clicks on "Submit for Translation" button
    When User clicks edit button of Audio creative
    When USer enters Audio TransCreative "<TransTitle>" and "Send"
    When User uploads valid image to Audio creative with name as "Audio.mp3" and "Chinese"
    When User Clicks on "Save" button
    When User Clicks on "Submit for Translation Review" button
    When User clicks edit button of Audio creative
    When User Clicks on "Submit for Approval" button
    When User clicks View button of Audio creative
    When User Clicks on "Approve & Send to Library" button
    Then Verify the Created Audio card is available or not

    Examples: 
    | Title | TransTitle | AudioTitleValidation    | Audio64Charc                                                           | AudioMaximumCharacValidation            | AudioUploadValidation |
    | Audio | TransTitle | This field is mandatory | 2234567890123456789012345678901234567890123456789012345678901234567890 | Title cannot be more than 64 characters | Please upload audio   |

  @Audio
  Scenario Outline: Verifing the Audio Creation Flow and transfering the audio card using Transfer icon
    1 ,Enter into Audio Creative Page
    2 ,Upload Audio File
    3 ,Save the Audio creative Card
    4 ,Transfering the Audio card to draft Review by Transfer Icon
    5 ,Transfering the Audio card to translation by Transfer Icon
    6 ,Editing the Particular Audio card and Updating the Translation Content
    7 ,Transfering the Audio card to Translation Review by Transfer Icon
    8 ,Transfering the Audio Card to Approval Page by Transfer Icon
    9 ,Transfering the Audio card to Library by Transfer Icon
    10,Verifying the Created audio card is available or not

    When User clicks on creative nav menu
    Then User should navigate to creative page
    When User clicks Add Creative Button
    Then User should see Creative type as following
      | Rich Media |
      | Text       |
      | Video      |
      | Audio      |
      | Image      |
    When User selects "Audio" creative from dropdown
    Then User should see "Audio" video_creative page
    When User Clicks on "Save" button
    Then Validation error should display for video/Audio creative title text as "<AudioTitleValidation>"
    Then Validation error should display for Invalid Audio Upload as "<AudioUploadValidation>"
    When USer enters Audio Creative "<Audio64Charc>" and "Send"
    When User uploads valid image to Audio creative with name as "Video.mp4" and "English"
    When User Clicks on "Save" button
    Then Validation error should display for video/Audio creative title text as "<AudioMaximumCharacValidation>"
    Then Validation error should display for Invalid Audio Upload as "<AudioUploadValidation>"
    When USer enters Audio Creative "<Title>" and "Send"
    When User uploads valid image to Audio creative with name as "Audio.mp3" and "English"
    When User Clicks on "Save" button
    When User Clicks on "Save & Close" button
    When User Clicks Audio "Move to drafts review" Transfer icon
    Then User Click on Ok or Cancel "ok" in transfer Icon popup
    Then User Clicks on CreativeSubtabs "Drafts Review"
    When User Clicks Audio "Move to translation" Transfer icon
    Then User Click on Ok or Cancel "ok" in transfer Icon popup
    Then User Clicks on CreativeSubtabs "Translation"
    When User clicks edit button of Audio creative
    When USer enters Audio TransCreative "<TransTitle>" and "Send"
    When User uploads valid image to Audio creative with name as "Audio.mp3" and "Chinese"
    When User Clicks on "Save & Close" button
    When User Clicks Audio "Move to translation review" Transfer icon
    Then User Click on Ok or Cancel "ok" in transfer Icon popup
    Then User Clicks on CreativeSubtabs "Translation Review"
    When User Clicks Audio "Move to approval" Transfer icon
    Then User Click on Ok or Cancel "ok" in transfer Icon popup
    Then User Clicks on CreativeSubtabs "Approve"
    When User Clicks Audio "Move to library" Transfer icon
    Then User Click on Ok or Cancel "ok" in transfer Icon popup
    Then User Click Header CreativeAndLibrary "Library" in Header Tab
    When User Clicks "Audio" subType Grid
    Then Verify the Created Audio card is available or not

    Examples: 
      | Title | TransTitle | AudioTitleValidation    | Audio64Charc                                                           | AudioMaximumCharacValidation            | AudioUploadValidation |
      | Audio | TransTitle | This field is mandatory | 1234567890123456789012345678901234567890123456789012345678901234567890 | Title cannot be more than 64 characters | Please upload audio   |
