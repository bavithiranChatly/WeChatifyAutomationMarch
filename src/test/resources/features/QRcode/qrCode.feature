Feature: QRcode

  @unitTest
  Scenario: Verify Navigation to AutoResponder page
    Given User navigated to Wechatify login page
    When User logins as usertype "Admin" with valid credentials

  @unitTest
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    #Then User clicks on the ADD button
    Then QRcode Excel data insert "<filePath>" and "<fileName>" and "<sheetName>"

    Examples: 
      | ModuleName | filePath | fileName | sheetName |
      | QR Code    | filePath | 123.xlsx | Sheet1    |

  @tagTest
  Scenario: Verify Navigation to AutoResponder page
    Given User navigated to Wechatify login page
    When User logins as usertype "Admin" with valid credentials

  @tagTest
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    Then User clicks on the ADD button
    #Then User clicks on the MapTag Button
    When User creates new tag "12" with new category as "21" & strength number as "1"

    Examples: 
      | ModuleName | filePath | fileName     | sheetName |
      | QR Code    | filePath | QrcodeS.xlsx | Sheet1    |

  @autoQRcode
  Scenario: Verify Navigation to AutoResponder page
    Given User navigated to Wechatify login page
    When User logins as usertype "Admin" with valid credentials

  @autoQRcode
  Scenario Outline: QNA creation
    When User selects the respective module "<ModuleName>"
    #Then User clicks on the ADD button
    Then QRcode Excel data insert "<filePath>" and "<fileName>" and "<sheetName>"

    Examples: 
      | ModuleName | filePath | fileName | sheetName |
      | QR Code    | filePath | MJN.xlsx | Sheet1    |
