Feature: QNA creation #These description lines are ignored by Cucumber at runtime, but are available for reporting (They are included by default in html reports).

  Background: Verify Navigation to AutoResponder page
    Given User navigated to Wechatify login page
    When User logins as usertype "Admin" with valid credentials

  @faq
  Scenario Outline: QNA creation #You can write anything you like, as long as no line starts with a keyword.
    When User selects the respective module "<ModuleName>"
    When User clicks on the Add QNA button
    When User creates Question as "<Question>" in "<qtype>"
    When User creates Response as "<textmessage>" and "<responseType>" - card name "<cardName>" in module "FAQ"
    When User clicks on FAQ Action "Save" Button
    When User clicks on FAQ Action "Back to List" Button
    When user performs "Edit" action in the respective FAQ
    When User creates Question as "<Question>" in "<qtype>"
    When User creates Response as "<textmessage>" and "<responseTypeE>" - card name "<cardName>" in module "FAQ"
    When User clicks on FAQ Action "Save" Button

    Examples: 
      | ModuleName     | Question | textmessage | qtype    | responseType | responseTypeE | cardName                             |
      | Auto Responder | Auto New | Auto Answer | Question | Text         | Message       | Automation Testing RTM response card |

  @all
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    When User clicks on the Add QNA button
    When User creates Question as "<Question>" in "<qtype>"
    When User creates Response as "<textmessage>" and "<responseType>" - card name "<cardName>" in module "FAQ"
    When User clicks on FAQ Action "Save" Button
    When User creates Question as "<Question>" in "<qtype>"
    When User creates Response as "<textmessage>" and "<responseType>" - card name "<cardName>" in module "FAQ"
    When User clicks on FAQ Action "Save" Button
    When User creates Question as "<Question>" in "<qtype>"
    When User creates Response as "<textmessage>" and "<responseType>" - card name "<cardName>" in module "FAQ"
    When User clicks on FAQ Action "Save" Button
    When User creates Question as "<Question>" in "<qtype>"
    When User creates Response as "<textmessage>" and "<responseType>" - card name "<cardName>" in module "FAQ"
    When User clicks on FAQ Action "Save" Button
    When User creates Question as "<Question>" in "<qtype>"
    When User creates Response as "<textmessage>" and "<responseType>" - card name "<cardName>" in module "FAQ"
    When User clicks on FAQ Action "Save" Button
    When User creates Question as "<Question>" in "<qtype>"
    When User creates Response as "<textmessage>" and "<responseType>" - card name "<cardName>" in module "FAQ"
    When User clicks on FAQ Action "Save" Button
    When User clicks on FAQ Action "Back to List" Button

    Examples: 
      | ModuleName     | Question | textmessage | qtype    | responseType |
      | Auto Responder | Auto New | Auto Answer | Question | Audio        |

  @keyword
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    When User clicks on the Add QNA button
    When User creates Question as "<Question>" in "<qtype>"
    When User creates Response as "<textmessage>" and "<responseType>" - card name "Automation Testing RTM response card" in module "FAQ"
    #When User right clicks "Org" on the description field
    #When User enters link as "<validlink>" LinkText as "<linktext>" and "Original"
    #When User adds add tag to the redirection link "Original"
    #When User select tag by tagname as "dog" for textcard with click on adtag button
    #When User selects smiley character "Original"
    When User clicks on FAQ Action "Save" Button

    Examples: 
      | ModuleName     | Question | textmessage | qtype   | responseType | validlink             | linktext    |
      | Auto Responder | Auto New | Auto Answer | Keyword | Text         | http://www.google.com | GOogle Link |

  @qq
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    When User clicks on the Add QNA button
    When User creates Question as "<Question>" in "<qtype>"
    When User creates Response as "<textmessage>" and "<responseType>" - card name "<cardName>" in module "FAQ"
    When User right clicks "Org" on the description field
    When User enters link as "<validlink>" LinkText as "<linktext>" and "Original"
    #When User adds add tag to the redirection link "Original"
    #When User select tag by tagname as "dog" for textcard with click on adtag button
    When User selects smiley character "Original"
    When User clicks on FAQ Action "Save" Button

    Examples: 
      | ModuleName     | Question | textmessage | qtype    | responseType | validlink             | linktext    |
      | Auto Responder | Auto New | Auto Answer | Question | Text         | http://www.google.com | GOogle Link |

  @unit
  Scenario Outline: QNA bulk data Creation through Excel sheet (Question : Answer - TEXT format only) without tags and membership cards mapped
    When User selects the respective module "<ModuleName>"
    When User clicks on the Add QNA button
    When Bulk data insert "<filePath>" and "<fileName>" and "<sheetName>"

    Examples: 
      | ModuleName     | Question | textmessage       | filePath | fileName                 | sheetName |
      | Auto Responder | auto new | 45612378954561231 | filepath | FAQ-AutomationSheet.xlsx | Sheet1    |

  @cre
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    When User clicks on the Add QNA button
    When User creates Question as "<Question>" in "<qtype>"
    When User creates Response as "<textmessage>" and "<responseType>" - card name "<cardName>" in module "FAQ"

    Examples: 
      | ModuleName     | Question | textmessage | qtype    | responseType |
      | Auto Responder | Auto New | Auto Answer | Question | Text         |

  @photoNewsResponse
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    When User clicks on the Add QNA button
    When User creates Question as "<Question>" in "<qtype>"
    When User creates Response as "<textmessage>" and "<responseType>" - card name "<cardName>" in module "FAQ"

    Examples: 
      | ModuleName     | Question | textmessage | qtype    | responseType    | cardName |
      | Auto Responder | Auto New | Auto Answer | Question | RichTextMessage | menu 1   |

  @photoMessageResponse
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    When User clicks on the Add QNA button
    When User creates Question as "<Question>" in "<qtype>"
    When User creates Response as "<textmessage>" and "<responseType>" - card name "<cardName>" in module "FAQ"

    Examples: 
      | ModuleName     | Question | textmessage | qtype    | responseType |
      | Auto Responder | Auto New | Auto Answer | Question | Message      |

  @imageResponse
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    When User clicks on the Add QNA button
    When User creates Question as "<Question>" in "<qtype>"
    When User creates Response as "<textmessage>" and "<responseType>" - card name "<cardName>" in module "FAQ"

    Examples: 
      | ModuleName     | Question | textmessage | qtype    | responseType |
      | Auto Responder | Auto New | Auto Answer | Question | Image        |

  @audioresponse
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    When User clicks on the Add QNA button
    When User creates Question as "<Question>" in "<qtype>"
    When User creates Response as "<textmessage>" and "<responseType>" - card name "<cardName>" in module "FAQ"

    Examples: 
      | ModuleName     | Question | textmessage | qtype    | responseType |
      | Auto Responder | Auto New | Auto Answer | Question | Audio        |

  @videoResponse
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    When User creates Question as "<Question>" in "<qtype>"
    When User creates Response as "<textmessage>" and "<responseType>" - card name "<cardName>" in module "FAQ"

    Examples: 
      | ModuleName     | Question | textmessage | qtype    | responseType |
      | Auto Responder | Auto New | Auto Answer | Question | Video        |

  @tt
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    When User clicks on the Add QNA button
    When User creates and selects a new system tag "SysTag" and strength "2"
    When User selects an existing tag "Basic Flow"

    Examples: 
      | ModuleName     | Question | textmessage | qtype    | responseType |
      | Auto Responder | Auto New | Auto Answer | Question | Text         |

  @exist
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    When User clicks on the Add QNA button
    When User creates Question as "<Question>" in "<qtype>"
    When User creates Response as "<textmessage>" and "<responseType>" - card name "<cardName>" in module "FAQ"
    When User selects an existing tag "Basic Flow"
    When User clicks on FAQ Action "Save" Button

    Examples: 
      | ModuleName     | Question | textmessage | qtype    | responseType |
      | Auto Responder | Auto New | Auto Answer | Question | Text         |

  @publishALLunit
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    When User clicks on FAQ Action "Publish All" Button

    Examples: 
      | ModuleName     | Question | textmessage | qtype    | responseType |
      | Auto Responder | Auto New | Auto Answer | Question | Text         |

  @count_unit
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    When User clicks on the Add QNA button
    When User creates Question as "<Question>" in "<qtype>"
    When User creates Response as "<textmessage>" and "<responseType>" - card name "<cardName>" in module "FAQ"

    Examples: 
      | ModuleName     | Question | textmessage | qtype    | responseType |
      | Auto Responder | Auto New | Auto Answer | Question | Text         |

  @delete_Unpublished
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    When User clicks on the Add QNA button
    When User creates Question as "<Question>" in "<qtype>"
    When User creates Response as "<textmessage>" and "<responseType>" - card name "<cardName>" in module "FAQ"
    When User clicks on FAQ Action "Save" Button
    When User clicks on FAQ Action "Back to List" Button
    When user performs "Delete" action in the respective FAQ
    When User creates Question as "<Question>" in "<qtype>"
    When User creates Response as "<textmessage>" and "<responseType>" - card name "<cardName>" in module "FAQ"
    When User clicks on FAQ Action "Save" Button

    Examples: 
      | ModuleName     | Question | textmessage | qtype    | responseType | responseTypeE | cardName                             |
      | Auto Responder | Auto New | Auto Answer | Question | Text         | Message       | Automation Testing RTM response card |

  @delete_Published
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    When User clicks on the Add QNA button
    When User creates Question as "<Question>" in "<qtype>"
    When User creates Response as "<textmessage>" and "<responseType>" - card name "<cardName>" in module "FAQ"
    When User clicks on FAQ Action "Save" Button
    When User clicks on FAQ Action "Back to List" Button
    When user performs "Publish" action in the respective FAQ
    When user performs "Delete" action in the respective FAQ

    #When User creates Question as "<Question>" and Answer as "<Answer>" in "<qtype>" and "<responseTypeE>" - card name "<cardName>"
    #When User clicks on FAQ Action "Save" Button
    Examples: 
      | ModuleName     | Question | textmessage | qtype    | responseType | responseTypeE | cardName                             |
      | Auto Responder | Auto New | Auto Answer | Question | Text         | Message       | Automation Testing RTM response card |

  @t_menu
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    And Autoresponder page should have following sections
      | FAQ knowledge base |
      | FAQ Configuration  |
    When User clicks on the Add QNA button

    Examples: 
      | ModuleName     | Question | textmessage | qtype    | responseType | responseTypeE | cardName                             |
      | Auto Responder | Auto New | Auto Answer | Question | Text         | Message       | Automation Testing RTM response card |

  @faq_Config_empty
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    When user selects "FAQ Configuration" sub-menu tab
    When User creates FAQ configuration setting "FAQconfiguration-WelcomeMessage" as "WelcomeMessage" and "<responseType>" - card name "<cardName>"
    When User creates FAQ configuration setting "FAQconfiguration-GlobalFallbackMessage" as "GlobalFalbackMessage" and "<responseType>" - card name "<cardName>"

    #When User clicks on "Save" FAQ configuration Button
    Examples: 
      | ModuleName     | Question | textmessage | qtype    | responseType | responseTypeE | cardName                             |
      | Auto Responder | Auto New | Auto Answer | Question | Message      | Message       | Automation Testing RTM response card |

  @all_media_check
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    When user selects "FAQ Configuration" sub-menu tab
    When User creates FAQ configuration setting "FAQconfiguration-WelcomeMessage" as "WelcomeMessage" and "Text" - card name "<cardName>"
    When User creates FAQ configuration setting "FAQconfiguration-GlobalFallbackMessage" as "GlobalFalbackMessage" and "Text" - card name "<cardName>"
    When User deletes FAQ configuration setting "FAQconfiguration-WelcomeMessage"
    When User deletes FAQ configuration setting "FAQconfiguration-GlobalFallbackMessage"
    When User creates FAQ configuration setting "FAQconfiguration-WelcomeMessage" as "WelcomeMessage" and "RichTextMessage" - card name "Automation Testing RTM response card"
    When User creates FAQ configuration setting "FAQconfiguration-GlobalFallbackMessage" as "GlobalFalbackMessage" and "RichTextMessage" - card name "Automation Testing RTM response card"
    When User deletes FAQ configuration setting "FAQconfiguration-WelcomeMessage"
    When User deletes FAQ configuration setting "FAQconfiguration-GlobalFallbackMessage"
    #When User creates FAQ configuration setting "FAQconfiguration-WelcomeMessage" as "WelcomeMessage" and "Message" - card name "Automation Testing RTM response card"
    #When User creates FAQ configuration setting "FAQconfiguration-GlobalFallbackMessage" as "GlobalFalbackMessage" and "Message" - card name "Automation Testing RTM response card"
    #When User deletes FAQ configuration setting "FAQconfiguration-WelcomeMessage"
    #When User deletes FAQ configuration setting "FAQconfiguration-GlobalFallbackMessage"
    When User creates FAQ configuration setting "FAQconfiguration-WelcomeMessage" as "WelcomeMessage" and "Image" - card name "Automation Testing Response card"
    When User creates FAQ configuration setting "FAQconfiguration-GlobalFallbackMessage" as "GlobalFalbackMessage" and "Image" - card name "Automation Testing Response card"
    When User deletes FAQ configuration setting "FAQconfiguration-WelcomeMessage"
    When User deletes FAQ configuration setting "FAQconfiguration-GlobalFallbackMessage"
    When User creates FAQ configuration setting "FAQconfiguration-WelcomeMessage" as "WelcomeMessage" and "Audio" - card name "Audio1"
    When User creates FAQ configuration setting "FAQconfiguration-GlobalFallbackMessage" as "GlobalFalbackMessage" and "Audio" - card name "Audio1"
    When User deletes FAQ configuration setting "FAQconfiguration-WelcomeMessage"
    When User deletes FAQ configuration setting "FAQconfiguration-GlobalFallbackMessage"
    When User creates FAQ configuration setting "FAQconfiguration-WelcomeMessage" as "WelcomeMessage" and "Video" - card name "Automation Testing Response card"
    When User creates FAQ configuration setting "FAQconfiguration-GlobalFallbackMessage" as "GlobalFalbackMessage" and "Video" - card name "Automation Testing Response card"
    When User deletes FAQ configuration setting "FAQconfiguration-WelcomeMessage"
    When User deletes FAQ configuration setting "FAQconfiguration-GlobalFallbackMessage"

    #When User clicks on "Save" FAQ configuration Button
    Examples: 
      | ModuleName     | Question | textmessage | qtype    | responseType | responseTypeE | cardName                             |
      | Auto Responder | Auto New | Auto Answer | Question | Message      | Message       | Automation Testing RTM response card |

  @delete1_check
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    When user selects "FAQ Configuration" sub-menu tab
    #When User deletes FAQ configuration setting "FAQconfiguration-WelcomeMessage"
    #Then Customer Support Transfer toggle should be in "Disabled"
    Then Customer Support Transfer toggle should be in "Enabled-OFF"
    #Then Customer Support Transfer toggle should be in "Enabled-ON"
    When User enter Customer Support Keyword "<csKeyword>"

    Examples: 
      | ModuleName     | Question | textmessage | qtype    | responseType | responseTypeE | cardName                             | csKeyword |
      | Auto Responder | Auto New | Auto Answer | Question | Message      | Message       | Automation Testing RTM response card | test      |

  @onlyWelcomeMessage
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    When user selects "FAQ Configuration" sub-menu tab
    When User deletes FAQ configuration setting "FAQconfiguration-WelcomeMessage"
    When User deletes FAQ configuration setting "FAQconfiguration-GlobalFallbackMessage"
    When User creates FAQ configuration setting "FAQconfiguration-WelcomeMessage" as "WelcomeMessage" and "Text" - card name "<cardName>"
    Then Customer Support Transfer toggle should be in "Disabled"
    When User clicks on "Save" FAQ configuration Button

    Examples: 
      | ModuleName     | Question | textmessage | qtype    | responseType | responseTypeE | cardName                             | csKeyword |
      | Auto Responder | Auto New | Auto Answer | Question | Message      | Message       | Automation Testing RTM response card | test145   |

  @onlyGlobalFallbackMessage
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    When user selects "FAQ Configuration" sub-menu tab
    When User deletes FAQ configuration setting "FAQconfiguration-WelcomeMessage"
    When User creates FAQ configuration setting "FAQconfiguration-GlobalFallbackMessage" as "GlobalFalbackMessage" and "Text" - card name "<cardName>"
    Then Customer Support Transfer toggle should be in "Enabled-OFF"
    When User clicks on "Save" FAQ configuration Button

    Examples: 
      | ModuleName     | Question | textmessage | qtype    | responseType | responseTypeE | cardName                             | csKeyword |
      | Auto Responder | Auto New | Auto Answer | Question | Message      | Message       | Automation Testing RTM response card | test145   |

  @welcomeANDglobalfallbackMessage
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    When user selects "FAQ Configuration" sub-menu tab
    When User deletes FAQ configuration setting "FAQconfiguration-WelcomeMessage"
    When User creates FAQ configuration setting "FAQconfiguration-WelcomeMessage" as "WelcomeMessage" and "Text" - card name "<cardName>"
    When User creates FAQ configuration setting "FAQconfiguration-GlobalFallbackMessage" as "GlobalFalbackMessage" and "Text" - card name "<cardName>"
    Then Customer Support Transfer toggle should be in "Enabled-OFF"
    When User clicks on "Save" FAQ configuration Button

    Examples: 
      | ModuleName     | Question | textmessage | qtype    | responseType | responseTypeE | cardName                             | csKeyword |
      | Auto Responder | Auto New | Auto Answer | Question | Message      | Message       | Automation Testing RTM response card | test145   |

  @welcomeANDglobalfallbackMessageWITHcs
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    When user selects "FAQ Configuration" sub-menu tab
    When User deletes FAQ configuration setting "FAQconfiguration-WelcomeMessage"
    When User deletes FAQ configuration setting "FAQconfiguration-GlobalFallbackMessage"
    When User creates FAQ configuration setting "FAQconfiguration-WelcomeMessage" as "Welcome Message - to TMG Gallery" and "Text" - card name "<cardName>"
    When User creates FAQ configuration setting "FAQconfiguration-GlobalFallbackMessage" as "GlobalFalbackMessage" and "Text" - card name "<cardName>"
    Then Customer Support Transfer toggle should be in "Enabled-OFF"
    When User enter Customer Support Keyword "<csKeyword>"
    When User clicks on "Save" FAQ configuration Button

    Examples: 
      | ModuleName     | Question | textmessage | qtype    | responseType | responseTypeE | cardName                             | csKeyword |
      | Auto Responder | Auto New | Auto Answer | Question | Message      | Message       | Automation Testing RTM response card | test145   |

  @textt
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    Then Get the total text form thr page

    Examples: 
      | ModuleName     | Question | textmessage | qtype    | responseType | responseTypeE | cardName                             | csKeyword |
      | Auto Responder | Auto New | Auto Answer | Question | Message      | Message       | Automation Testing RTM response card | test145   |

  @limitq
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    When User clicks on the Add QNA button
    When User creates Question as "<Question>" in "<qtype>"
    #When User creates Response as "<textmessage>" and "<responseType>" - card name "<cardName>" in module "FAQ"
    When User clicks on FAQ Action "Save" Button

    Examples: 
      | ModuleName     | textmessage | qtype    | responseType | responseTypeE | cardName                             | Question                                                                                                                                                                                                                                                                                                                                                                                                          |
      | Auto Responder | Auto Answer | Question | Text         | Message       | Automation Testing RTM response card | Auto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto New1 |

  @quesmandatory
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    When User clicks on the Add QNA button
    When User clicks on FAQ Action "Save" Button
    Then check for the FAQ "QuestionMandatory" error message as "Question field is required"
    When User creates Question as "<Question>" in "<qtype>"
    When User clicks on FAQ Action "Save" Button
    Then check for the FAQ "ResponseMandatory" error message as "This Field is required"

    Examples: 
      | ModuleName     | textmessage | qtype    | responseType | responseTypeE | cardName                             | Question | Question-limitexceed                                                                                                                                                                                                                                                                                                                                                                                              |
      | Auto Responder | Auto Answer | Question | Text         | Message       | Automation Testing RTM response card |     2131 | Auto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto New1 |

  @limit
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    When User clicks on the Add QNA button
    When User creates Question as "<Question-limitexceed>" in "<qtype>"
    When User clicks on FAQ Action "Save" Button
    Then check for the FAQ "QuestionTextLimt" error message as "Text limit exceeded."

    Examples: 
      | ModuleName | textmessage | qtype    | responseType | responseTypeE | cardName                             | Question | Question-limitexceed                                                                                                                                                                                                                                                                                                                                                                                              |
      | QR Code    | Auto Answer | Question | Text         | Message       | Automation Testing RTM response card |     2131 | Auto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto NewAuto New1 |
