Feature: Verify Video Type Creative feature Negative Flow

  @check
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
      
  
  @checkdone
  Scenario Outline: Verify Video Creative Field validation and Creating a Video Creative Card ,Negative Flow
    1.Verifing the validation of Title Field.
    2.Verifing the validation of Description field.
    3.Verifing the validation for Video Upload
    4.Verifing the Video upload tooltip
    5.Selecting a Already created folder
    6.Creating a card with valid Data

    When User clicks on creative nav menu
    Then User should navigate to creative page
    When User clicks "Add New Folder" button
    Then User Click on Submit in Folder Option
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
    When User clicks on save Videocreative button
    Then Validation error should display for video/Audio creative title text as "<errormsg>" 
    Then Validation error should display for Message text as "<errormsg1>"
    Then Validation error should display for Invalid Video Upload as "<errormsg2>"
    When User enters video creative title as "<TitleLong>" Description as "<DescriptionLong>" and "Send"
    When User uploads valid image to Video creative with name as "valid.png" and "English"
    Then Validation error should display for video/Audio creative title text as "<errormsg11>"
    Then Validation error should display for Message text as "<errormsg12>"
    Then Validation error should display for Invalid Video Upload as "<errormsg13>"
    When User enters video creative title as "<Title>" Description as "<Description>" and "Send"
    When User clicks upload Video tooltip button for Video creative
    Then Video creative toop tip should display with correct text
      | Video format MP4.      |
      | Video size limit 10MB. |
    # Chinese or English
    When User uploads valid image to Video creative with name as "Video.mp4" and "English"
    # Create Or Select
    When User select Folder name for Video from dropdown as "<ToselectfolderName>" and "Select"
    When User Clicks on "Save" button
    
    

    Examples: 
      | ValidFolderName | errormsg                | errormsg1               | errormsg2           | Title | Description | TitleLong                                                         | DescriptionLong                                                                                                                                                                                                  | errormsg11                              | errormsg12                                                           | errormsg13          | Title1     | Description1       | ToselectfolderName |
      | foldername1     | This field is mandatory | This field is mandatory | Please upload video | Title | Description | 12345678901234567890123456789012345678901234567890123456789012345 | 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 | Title cannot be more than 64 characters | This field description must be a string with a maximum length of 200 | Please upload video | validTitle | Valid Description1 | Default            |
      

  @checkdone
  Scenario Outline: Adding the Folder and verifying various validation text -  Working
    1.Clicking the Add New Folder button
    2.Validating the "The folder name is required." validation text.
    3.Validating the "Folder name already added" validation text.
    4.Validating the "The folder name can not exceed 50 characters." validation text.
    5.Creating a valid folder name.

    When User clicks on creative nav menu
    Then User should navigate to creative page
    When User clicks "Add New Folder" button
    Then User Click on Submit in Folder Option
    # validating the "The folder name is required." validation text
    When Validation error should display for Folder Name field as "<errormsg>"
    Then Enter Folder name "<FolderName>" and "date"
    Then User Click on Submit in Folder Option
    When User clicks "Add New Folder" button
    Then Enter Folder name "<FolderName>" and "Withoutdate"
    Then User Click on Submit in Folder Option
    # validating the "Folder name already added" validation text
    When Validation error should display for Folder Name field as "<errormsg1>"
    Then Enter Folder name "<FolderNameLong>" and "date"
    Then User Click on Submit in Folder Option
    # validating the "The folder name can not exceed 50 characters." validation text
    When Validation error should display for Folder Name field as "<errormsg2>"
    Then Enter Folder name "<FolderName>" and "date"
    Then User Click on Submit in Folder Option
    
    Examples: 
      | FoldernametoSelected | FolderName  | errormsg                     | errormsg1                 | FolderNameLong                                               | errormsg2                                     | ValidFolderName |
      | FolderNAmeR          | FolderNAmep | The folder name is required. | Folder name already added | 123456789012345678901234567890123456789012345678901234567890 | The folder name can not exceed 50 characters. | newOne2         |
  
  @check
  Scenario Outline: Verify Create,Transfering the created card upto Library & Delete functionality in Library Page. - Done Working (*)
    1 .Entering into Video creative page.
    2 .Entering and validating Title and Description in the Video Creative creation page.
    3 .Verifing the Video Upload ToolTip Text.
    4 .Uploading Video in Original content .
    5 .Verifying the Save & Close Functionality.
    6 .Sending Preview to follower to a particular user
    7 .Transfering the Video card to Draft Review using Edit page button and Sending Preview to follower.
    8 .Validating the Title and descriptions field.
    9 .Transfering the Video card to Translation using Edit page button and Sending Preview to follower. 
    10.Validating the title and description field.
    11.Entering the Title , Descriptions in the Translation content and Uploading Video in the Chinese Content
    12.validating the Title and description field.
    13.Transfering the Video card to Translation Review using Edit page button and Sending Preview to follower. 
    14.Transfering the Video card to Approval using Edit page button and Sending Preview to follower. 
    15.Transfering the Video card to Library using Edit page button and Sending Preview to follower. 
    16.validating the Original content and translation content title and description field.
    17.Deleting the Created Card.

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
    #Validation check Draft
    When User clicks on save Videocreative button
    Then Validation error should display for video creative title text as "<errormsg>" 
    Then Validation error should display for Message text as "<errormsg1>" 
    Then Validation error should display for Invalid Video Upload as "<errormsg2>" 
    # Clear or Send
    When User enters title as "<TitleLong>" Description as "<DescriptionLong>" and "Send"
    # When User uploads valid image to Video creative with name as "valid.png"
    Then Validation error should display for title text as "<errormsg1>"
    Then Validation error should display for Message text as "<errormsg1>"
    Then Validation error should display for Invalid Video Upload as "<errormsg13>"
    When User enters title as "<Title>" Description as "<Description>" and "Send"
    Then Validation error should display for video/Audio creative title text as "<errormsg>" 
    Then Validation error should display for Message text as "<errormsg1>" 
    Then Validation error should display for Invalid Video Upload as "<errormsg2>" 
    # Clear or Send
    When User enters video creative title as "<TitleLong>" Description as "<DescriptionLong>" and "Send"
    # When User uploads valid image to Video creative with name as "valid.png"
    Then Validation error should display for video/Audio creative title text as "<errormsg11>" 
    Then Validation error should display for Message text as "<errormsg12>" 
    Then Validation error should display for Invalid Video Upload as "<errormsg13>" 
    When User enters video creative title as "<Title>" Description as "<Description>" and "Send"
    # Chinese or English
    When User uploads valid image to Video creative with name as "Video.mp4" and "English"
    When User Clicks on "Save & Close" button
    # Edit flow on Draft Page.
    When User clicks edit button of Video creative
    # Submit for Draft Review
    # Clicking the Preview button for "Creatives" or "Library"
    When User Clicks on Preview button for "Creatives"
    #Then User Clicks on different types of mobile Preview
    # Use PreviewTofollower Or Exit
    Then USer Clicks Preview to follower or Exit Preview "PreviewTofollower"
    Then Enter "<Username>" for Preview to follower field  and search
    Then Click on checkbox for a User
    Then Click on SendOrClose "Send" in PreviewTofollower
    Then USer Clicks Preview to follower or Exit Preview "Exit"
    #upto preview to follower for Draft Page.
    When User Clicks on "Submit for Draft Review" button
    #Draft Review Page Edit
    When User clicks edit button of Video creative
    When User enters title as "<Title>" Description as "<Description>" and "Clear"
    #When User uploads valid image to Video creative with name as "valid.mp4" and "English"
    When User Clicks on "Save" button
    #Validation check in Draft Review
    #Then Validation error should display for title text as "<errormsg>"
    #Then Validation error should display for Message text as "<errormsg1>"
    #Then Validation error should display for Invalid Video Upload as "<errormsg2>"
    # Clear or Send
    When User enters title as "<TitleLong>" Description as "<DescriptionLong>" and "Send"
    # When User uploads valid image to Video creative with name as "valid.png"
    #Then Validation error should display for title text as "<errormsg11>"
    #Then Validation error should display for Message text as "<errormsg12>"
    #Then Validation error should display for Invalid Video Upload as "<errormsg13>"
    When User enters title as "<Title>" Description as "<Description>" and "Send"
    When User enters video creative title as "<Title>" Description as "<Description>" and "Clear"
    #When User uploads valid image to Video creative with name as "valid.mp4" and "English"
    When User Clicks on "Save" button
    #Validation check in Draft Review
    #Then Validation error should display for video/Audio creative title text as "<errormsg>"
    #Then Validation error should display for Message text as "<errormsg1>"
    #Then Validation error should display for Invalid Video Upload as "<errormsg2>"
    # Clear or Send
    When User enters video creative title as "<TitleLong>" Description as "<DescriptionLong>" and "Send"
    # When User uploads valid image to Video creative with name as "valid.png"
    #Then Validation error should display for video/Audio creative title text as "<errormsg11>"
    #Then Validation error should display for Message text as "<errormsg12>"
    #Then Validation error should display for Invalid Video Upload as "<errormsg13>"
    When User enters video creative title as "<Title>" Description as "<Description>" and "Send"
    When User Clicks on "Save" button
    # Submit for Translation
    When User Clicks on Preview button for "Creatives"
    #Then User Clicks on different types of mobile Preview
    # Use PreviewTofollower Or Exit
    Then USer Clicks Preview to follower or Exit Preview "PreviewTofollower"
    Then Enter "<Username>" for Preview to follower field  and search
    Then Click on checkbox for a User
    Then Click on SendOrClose "Send" in PreviewTofollower
    Then USer Clicks Preview to follower or Exit Preview "Exit"
    #upto draft review validation check
    When User Clicks on "Submit for Translation" button
    When User clicks edit button of Video creative
    When User Clicks on "Save" button
    Then Validation error should display for TransMessage text as "<TransMessageErrormsg>"
    When User enters TransDescription as "<TransDescription>"
    When User Clicks on "Save" button
    Then Validation error should display for transtitle text as "<TransTitleErrormsg>"
    When User enters video creative TransTitle as "<TitleLong>" TransDescription as "<DescriptionLong>"
    Then Validation error should display for transtitle text as "<TransTitleErrormsglong>"
    Then Validation error should display for TransMessage text as "<errormsg12>"
    # Chinese or English
    When User uploads valid image to Video creative with name as "Video.mp4" and "Chinese"
    When User enters video creative TransTitle as "<TransTitle>" TransDescription as "<TransDescription>" 
    #Then Clear TransTitle and TransDescription
    When User Clicks on "Save" button
    # Submit for Translation Review
    When User Clicks on Preview button for "Creatives"
    #Then User Clicks on different types of mobile Preview
    # Use PreviewTofollower Or Exit
    Then USer Clicks Preview to follower or Exit Preview "PreviewTofollower"
    Then Enter "<Username>" for Preview to follower field  and search
    Then Click on checkbox for a User
    Then Click on SendOrClose "Send" in PreviewTofollower
    Then USer Clicks Preview to follower or Exit Preview "Exit"
    When User Clicks on "Submit for Translation Review" button
    When User clicks edit button of Video creative
    Then Clear TransTitle and TransDescription
    When User Clicks on "Save" button
    Then Validation error should display for TransMessage text as "<TransMessageErrormsg>"
    When User enters TransDescription as "<TransDescription>"
    When User Clicks on "Save" button
    Then Validation error should display for transtitle text as "<TransTitleErrormsg>"
    Then Validation error should display for transtitle text as "<TransTitleErrormsglong>"
    Then Validation error should display for TransMessage text as "<errormsg12>"
    When User uploads valid image to Video creative with name as "Video.mp4" and "Chinese"
    When User enters video creative TransTitle as "<TitleLong>" TransDescription as "<DescriptionLong>" 
    Then Validation error should display for transtitle text as "<TransTitleErrormsglong>"
    Then Validation error should display for TransMessage text as "<errormsg12>"
    When User uploads valid image to Video creative with name as "Video.mp4" and "Chinese"
    When User enters video creative TransTitle as "<TransTitle>" TransDescription as "<TransDescription>" 
    When User Clicks on "Save" button
    When User Clicks on Preview button for "Creatives"
    #Then User Clicks on different types of mobile Preview
    # Use PreviewTofollower Or Exit
    Then USer Clicks Preview to follower or Exit Preview "PreviewTofollower"
    Then Enter "<Username>" for Preview to follower field  and search
    Then Click on checkbox for a User
    Then Click on SendOrClose "Send" in PreviewTofollower
    Then USer Clicks Preview to follower or Exit Preview "Exit"
    # submit for Approval
    When User Clicks on "Submit for Approval" button
    When User clicks view button of Video creative
    # Submit for Approve & Send to Library
    When User Clicks on Preview button for "Creatives"
    #Then User Clicks on different types of mobile Preview
    # Use PreviewTofollower Or Exit
    Then USer Clicks Preview to follower or Exit Preview "PreviewTofollower"
    Then Enter "<Username>" for Preview to follower field  and search
    Then Click on checkbox for a User
    Then Click on SendOrClose "Send" in PreviewTofollower
    Then USer Clicks Preview to follower or Exit Preview "Exit"
    When User Clicks on "Approve & Send to Library" button
    Then User Click Header CreativeAndLibrary "Library" in Header Tab
    When User Clicks "Video" subType Grid
    When User clicks view button of Video creative
    When User Clicks on Preview button for "Library"
    #Then User Clicks on different types of mobile Preview
    # Use PreviewTofollower Or Exit
    Then USer Clicks Preview to follower or Exit Preview "PreviewTofollower"
    Then Enter "<Username>" for Preview to follower field  and search
    Then Click on checkbox for a User
    Then Click on SendOrClose "Send" in PreviewTofollower
    Then USer Clicks Preview to follower or Exit Preview "Exit"
    When User clicks on "Back to list" Videocreative button
    When User clicks edit button of Video creative
    When User enters title as "<TitleLong>" Description as "<DescriptionLong>" and "Clear"
    Then Clear TransTitle and TransDescription
    When User Clicks on "Save" button
    Then Validation error should display for title text as "<errormsg>"
    Then Validation error should display for Message text as "<errormsg1>"
    Then Validation error should display for transtitle text as "<TransTitleErrormsg>"
    Then Validation error should display for TransMessage text as "<TransMessageErrormsg>"
    When User enters title as "<TitleLong>" Description as "<DescriptionLong>" and "Send"
    When User Clicks on "Save" button
    Then Validation error should display for title text as "<errormsg11>"
    Then Validation error should display for Message text as "<errormsg12>"
    Then Validation error should display for transtitle text as "<TransTitleErrormsglong>"
    Then Validation error should display for TransMessage text as "<errormsg12>"
    When User enters title as "<Title>" Description as "<Description>" and "Send"
    When User enters video creative title as "<TitleLong>" Description as "<DescriptionLong>" and "Clear"
    Then Clear TransTitle and TransDescription
    When User Clicks on "Save" button
    Then Validation error should display for video/Audio creative title text as "<errormsg>" 
    Then Validation error should display for Message text as "<errormsg1>" 
    Then Validation error should display for transtitle text as "<TransTitleErrormsg>" 
    Then Validation error should display for TransMessage text as "<TransMessageErrormsg>" 
    When User enters video creative title as "<TitleLong>" Description as "<DescriptionLong>" and "Send"
    When User enters video creative TransTitle as "<TitleLong>" TransDescription as "<DescriptionLong>" 
    When User Clicks on "Save" button
    Then Validation error should display for video/Audio creative title text as "<errormsg11>"
    Then Validation error should display for Message text as "<errormsg12>"
    Then Validation error should display for transtitle text as "<TransTitleErrormsglong>"
    Then Validation error should display for TransMessage text as "<errormsg12>"
    When User enters video creative title as "<Title>" Description as "<Description>" and "Send"
    When User enters video creative TransTitle as "<TransTitle>" TransDescription as "<TransDescription>" 
    When User uploads valid image to Video creative with name as "Video.mp4" and "Chinese"
    When User uploads valid image to Video creative with name as "Video.mp4" and "English"
    When User Clicks on "Save" button
    When User Clicks on Preview button for "Creatives"
    #Then User Clicks on different types of mobile Preview
    # Use PreviewTofollower Or Exit
    Then USer Clicks Preview to follower or Exit Preview "PreviewTofollower"
    Then Enter "<Username>" for Preview to follower field  and search
    Then Click on checkbox for a User
    Then Click on SendOrClose "Send" in PreviewTofollower
    Then USer Clicks Preview to follower or Exit Preview "Exit"
    When User clicks on "Back to list" Videocreative button
    #When User Clicks "Move to drafts review" Transfer icon
    When User clicks Delete button of Video creative
    Then User clicks on Delete OK button

    Examples: 
      | errormsg                | errormsg1               | errormsg2            | TitleLong                                                         | DescriptionLong                                                                                                                                                                                                  | errormsg11                              | TransTitleErrormsglong       | errormsg12                                                           | errormsg13          | Title   | Description            | Username | TransTitle | TransDescription                                   | TransTitleErrormsg          | TransMessageErrormsg    |
      | This field is mandatory | This field is mandatory | Please upload video  | 12345678901234567890123456789012345678901234567890123456789012345 | 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 | Title cannot be more than 64 characters | 标题不能为空且长度不能超过64字 | This field description must be a string with a maximum length of 200 | Please upload video | Orginal | 93rdDelete1Description | Bavi     | Trans      | 93sting Trans Video Creative Card - default folder | The 标题 field is required. | This field is mandatory |

  
  @checkdone
  Scenario Outline: Adding the Folder and verifying various validation text -  Working
    1.Clicking the Add New Folder button
    2.Validating the "The folder name is required." validation text.
    3.Validating the "Folder name already added" validation text.
    4.Validating the "The folder name can not exceed 50 characters." validation text.
    5.Creating a valid folder name.
  
    When User clicks on creative nav menu
    Then User should navigate to creative page
    When User clicks "Add New Folder" button
    Then User Click on Submit in Folder Option
    # validating the "The folder name is required." validation text
    When Validation error should display for Folder Name field as "<errormsg>"
    Then Enter Folder name "<FolderName>" and "date"
    Then User Click on Submit in Folder Option
    When User clicks "Add New Folder" button
    Then Enter Folder name "<FolderName>" and "Withoutdate"
    Then User Click on Submit in Folder Option
    # validating the "Folder name already added" validation text
    When Validation error should display for Folder Name field as "<errormsg1>"
    Then Enter Folder name "<FolderNameLong>" and "date"
    Then User Click on Submit in Folder Option
    # validating the "The folder name can not exceed 50 characters." validation text
    When Validation error should display for Folder Name field as "<errormsg2>"
    Then Enter Folder name "<FolderName>" and "date"
    Then User Click on Submit in Folder Option
    Examples: 
      | FoldernametoSelected | FolderName  | errormsg                     | errormsg1                 | FolderNameLong                                               | errormsg2                                     | ValidFolderName |
      | FolderNAmeR          | FolderNAmep | The folder name is required. | Folder name already added | 123456789012345678901234567890123456789012345678901234567890 | The folder name can not exceed 50 characters. | newOne2         |

  @checkdone
  Scenario Outline: Verify Video Creative Field validation and Creating a Video Creative Card ,Negative Flow
    1.Verifing the validation of Title Field.
    2.Verifing the validation of Description field.
    3.Verifing the validation for Video Upload
    4.Verifing the Video upload tooltip
    5.Selecting a Already created folder
    6.Creating a card with valid Data

    When User clicks on creative nav menu
    Then User should navigate to creative page
    When User clicks "Add New Folder" button
    Then User Click on Submit in Folder Option
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
    When User clicks on save Videocreative button
    Then Validation error should display for title text as "<errormsg>"
    Then Validation error should display for Message text as "<errormsg1>"
    Then Validation error should display for Invalid Video Upload as "<errormsg2>"
    When User enters title as "<TitleLong>" Description as "<DescriptionLong>" and "Send"
    When User uploads valid image to Video creative with name as "valid.png" and "English"
    Then Validation error should display for title text as "<errormsg>"
    Then Validation error should display for Message text as "<errormsg>"
    Then Validation error should display for Invalid Video Upload as "<errormsg13>"
    When User enters title as "<Title>" Description as "<Description>" and "Send"
    When User clicks upload Video tooltip button for Video creative
    #Then Video creative toop tip should display with correct text
      #| Video format MP4.      |
      #| Video size limit 10MB. |
    # Chinese or English
    When User uploads valid image to Video creative with name as "Video.mp4" and "English"
    # Create Or Select
    When User select Folder name for Video from dropdown as "<ToselectfolderName>" and "Select"
    When User Clicks on "Save" button
    When User Clicks on "Save & Close" button

    Examples: 
      | ValidFolderName | errormsg                | errormsg1               | errormsg2           | Title | Description | TitleLong                                                         | DescriptionLong                                                                                                                                                                                                  | errormsg11                              | errormsg12                                                           | errormsg13          | Title1     | Description1       | ToselectfolderName |
      | foldername1     | This field is mandatory | This field is mandatory | Please upload video | Title | Description | 12345678901234567890123456789012345678901234567890123456789012345 | 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 | Title cannot be more than 64 characters | This field description must be a string with a maximum length of 200 | Please upload video | validTitle | Valid Description1 | Default            |
#      | errormsg                | errormsg1               | errormsg2            | TitleLong                                                         | DescriptionLong                                                                                                                                                                                                  | errormsg11                              | TransTitleErrormsglong       | errormsg12                                                           | errormsg13          | Title   | Description            | Username | TransTitle | TransDescription                                   | TransTitleErrormsg          | TransMessageErrormsg    |
#      | This field is mandatory | This field is mandatory | Please upload video  | 12345678901234567890123456789012345678901234567890123456789012345 | 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 1234567890 | Title cannot be more than 64 characters | 标题不能为空且长度不能超过64字 | This field description must be a string with a maximum length of 200 | Please upload video | Orginal | 93rdDelete1Description | Bavi     | Trans      | 93sting Trans Video Creative Card - default folder | The field is required. | This field is mandatory |
