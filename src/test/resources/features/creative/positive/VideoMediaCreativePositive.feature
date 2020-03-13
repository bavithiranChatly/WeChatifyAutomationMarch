Feature: Verify Video Type Creative feature Positive Flow

  @validpos
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

  @validpos
  Scenario Outline: 
     Verifying the BackToList option in the Video Creative [Positive Flow]   - working (done) (*)
     1,Creating a new folder
     2,Selecting Video Create page.
     3,Creating a Video creative card with Selecting folder.
     4,Editing the created card.
     5,Entering Title,Description,Video Upload and selecting the newly Created folder.
     6,Save the edited content
     7,Clicking on Back to list 
     8,Verifing the Creative and Library Lable.

    When User clicks on creative nav menu
    Then User should navigate to creative page
    When User clicks "Add New Folder" button
    Then Enter Folder name "<ValidFolderName>" and "date"
    Then User Click on Submit in Folder Option
    When User clicks Add Creative Button
    Then User should see Creative type as following
      | Rich Media |
      | Text       |
      | Video      |
      | Audio      |
      | Image      |
    When User selects "Video" creative from dropdown
    Then User should see "Video" video_creative page
    Then get text from active Creative sub tabs
    When User enters video creative title as "<Title>" Description as "<Description>" and "Send"
    # Chinese or English
    When User uploads valid image to Video creative with name as "Video.mp4" and "English"
    When User select Folder name for Video from dropdown as "<ToselectfolderName>" and "Select"
    When User Clicks on "Save & Close" button
    # Edit flow on Draft Page.
    When User clicks edit button of Video creative
    When User enters video creative title as "<Title>" Description as "<Description>" and "Send"
    # Chinese or English
    When User uploads valid image to Video creative with name as "Video.mp4" and "English"
    # selecting afolder by using the already created folder
    When User select Folder name for Video from dropdown as "<ToselectfolderName>" and "Create"
    When User clicks on save Videocreative button
    When User clicks on "Back to list" Videocreative button
    Then Creative page should have following sections
      | CREATIVES |
      | LIBRARY   |

    Examples: 
      | Title       | Description                                    | ToselectfolderName | ValidFolderName |
      | Video type7 | 55testing Video Creative Card - default folder | Default            | new007          |

  @validpos
  Scenario Outline: 
    Verifying Video card - Transfering using Transfer icon and Video Creative save Functionality - Done Working (*)
    1.Entering into Video creative page
    2.Entering Title and Description in the Video Creative creation page
    3.Verifing the Video Upload ToolTip Text in the Original Content
    4.Uploading Video in the video creative page
    5.Selecting the folder 
    6.Transfering the Video Card to Draft Review Page using transfer icon
    7.Transfering the Video Card to Translation Page using transfer icon
    8.Transfering the Video Card to Translation Review Page using transfer icon
    9.Transfering the Video Card to Approval Page using transfer icon
    10.Transfering the Video Card to Library Page using transfer icon
    11.Verifying the Save functionality
    12.Verifying the Save & Close Functionality
    13.Verifing the created card using the card name

    When User clicks on creative nav menu
    Then User should navigate to creative page
    When User clicks Add Creative Button
    Then User should see Creative type as following
      | Rich Media |
      | Text       |
      | Video      |
      | Audio      |
      | Image      |
    When User selects "Video" creative from dropdown
    Then User should see "Video" video_creative page
    When User enters video creative title as "<Title>" Description as "<Description>" and "Send"
    When User uploads valid image to Video creative with name as "Video.mp4" and "English"
    When User clicks upload Video tooltip button for Video creative
    Then Video creative toop tip should display with correct text
      | Video format MP4.      |
      | Video size limit 10MB. |
    # Chinese or English
    #When User uploads valid image to Video creative with name as "Video.mp4" and "English"
    # Select folder using name
    When User select Folder name for Video from dropdown as "<ToselectfolderName>" and "Select"
    When User Clicks on "Save" button
    When User Clicks on "Save & Close" button
    #Pls use "Move to drafts review","Move to translation","Move to translation review","Move to approval","Move to library"
    When User Clicks "Move to drafts review" Transfer icon
    Then User Click on Ok or Cancel "ok" in transfer Icon popup
    #Pls use "Drafts","Drafts Review","Translation","Translation Review","Approve"
    Then User Clicks on CreativeSubtabs "Drafts Review"
    When User Clicks "Move to translation" Transfer icon
    Then User Click on Ok or Cancel "ok" in transfer Icon popup
    Then User Clicks on CreativeSubtabs "Translation"
    When User clicks edit button of Video creative
    When User enters video creative TransTitle as "<TransTitle>" TransDescription as "<TransDescription>"
    # Chinese or English
    When User uploads valid image to Video creative with name as "Video.mp4" and "Chinese"
    When User Clicks on "Save & Close" button
    When User Clicks "Move to translation review" Transfer icon
    Then User Click on Ok or Cancel "ok" in transfer Icon popup
    Then User Clicks on CreativeSubtabs "Translation Review"
    When User Clicks "Move to approval" Transfer icon
    Then User Click on Ok or Cancel "ok" in transfer Icon popup
    Then User Clicks on CreativeSubtabs "Approve"
    When User Clicks "Move to library" Transfer icon
    Then User Click on Ok or Cancel "ok" in transfer Icon popup
    Then User Click Header CreativeAndLibrary "Library" in Header Tab
    Then Verify the card by cardName

    #Then User should navigate to creative page
    Examples: 
      | Title  | Description                                  | ToselectfolderName | TransTitle | TransDescription                                   |
      | Card14 | testing Video Creative Card - default folder | Default            | 1ard20     | 1esting Trans Video Creative Card - default folder |

  @validpos
  Scenario Outline: Verify Cancel flow in the Add New folder and verify the addedfolder - working - now testing - (*)
    1.Clicking the Add New Folder button
    2.Clicking the Cancel Option in the Folder Creation Popup.

    When User clicks on creative nav menu
    Then User should navigate to creative page
    When User clicks "Add New Folder" button
    Then Enter Folder name "<FolderName>" and "date"
    Then User Click on Submit in Folder Option
    When User Clicks on "<FolderName>" Folder by name
    # using foldername checking the folder is present or not
    Then Check the created folder present or not
    #When User clicks "Add New Folder" button
    When User clicks on creative nav menu
    Then User should navigate to creative page
    When User clicks Add Creative Button
    Then User should see Creative type as following
      | Rich Media |
      | Text       |
      | Video      |
      | Audio      |
      | Image      |
    When User selects "Video" creative from dropdown
    Then User should see "Video" video_creative page
    When User enters video creative title as "<Title>" Description as "<Description>" and "Send"
    # Chinese or English
    When User uploads valid image to Video creative with name as "Video.mp4" and "English"
    When User select Folder name for Video from dropdown as "<selectFolderName>" and "Select"
    When User Clicks on "Save & Close" button
    When User Clicks "Video" subType Grid
    When User Click on MoveToFolder Icon
    Then User selects a card for Moveing the folder Video card
    # selecting folder to move the Video card
    When User select the Folder for MoveToFolder
    # choosing cancel or move button
    Then User Click on CancelOrMove "Move" for moving the card
    When User Clicks on "<FolderName>" Folder by name
    Then Verify the card by cardName

    Examples: 
      | FolderName | Title         | Description | selectFolderName |
      | maygood2   | maygood8Title | mayday18des | Default          |

  @validpos
  Scenario Outline: 
    Verify the folder edit , delete  and Rename the folder - Working
    1.Clicking the already created folder
    2.Clicking edit of that folder
    3.Rename the Folder 
    4.Clicking the cancel button in the delete folder popup.
    5.Clicking the Ok button in the delete folder popup.

    When User clicks on creative nav menu
    Then User should navigate to creative page
    When User clicks "Add New Folder" button
    Then Enter Folder name "<FolderName>" and "date"
    Then User Click on Submit in Folder Option
    When User Clicks on "<FoldernametoSelected>" Folder by name
    # Clicking the option in a particular Folder aganist Folder Name.
    Then User Clicks on Option button of Folder
    # Clicking the Edit button in folder option
    When User Clicks on Edit Option of Folder
    Then Enter Folder name "<FolderName>" and "date"
    Then User Click on Submit in Folder Option
    When User Clicks on "<FolderName>" Folder by name
    Then User Clicks on Option button of Folder
    # Clicking the Delete button in folder option
    When User Clicks on Delete Option of Folder
    # Clicking Ok or Cancel button in the Delete folder popup
    # Change Ok or Cancel to process the ok or cancel option.
    Then User Clicks on "Cancel" in delete folder popup
    When User Clicks on "<FolderName>" Folder by name
    Then User Clicks on Option button of Folder
    When User Clicks on Delete Option of Folder
    Then User Clicks on "Ok" in delete folder popup

    Examples: 
      | FoldernametoSelected | FolderName |
      | New29                | june10     |
