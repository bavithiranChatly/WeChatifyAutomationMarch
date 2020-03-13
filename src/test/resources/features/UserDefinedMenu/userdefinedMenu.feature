Feature: UserDefineMenu

  @test1
  Scenario: Verify Navigation to AutoResponder page
    Given User navigated to Wechatify login page
    When User logins as usertype "Admin" with valid credentials

  @test1
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    #And Creative page should have following sections
    #| DEFAULT MENU   |
    #| ALTERNATE MENU | defaultMenu
    Then User chooses "<MenuType>" tab
    Then User creates a new alternate menu with name "<menuName>"

    Examples: 
      | ModuleName         | MenuType | menuName       |
      | User- Defined Menu | altMenu  | Auto Menu Test |
