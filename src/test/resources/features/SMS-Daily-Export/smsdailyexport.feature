Feature: SMS daily Check

  Scenario: SMS daily check Export

  Scenario Outline: Read Input from Excel Sheet
    Given read user input "<filePath>" and "<fileName>" and "<sheetName>"
   #Given user reads input from "<filePath>" and "<fileName>" and "<sheetName>"
    Examples: 
      | filePath | fileName                 | sheetName |
      | filepath | FAQ-AutomationSheet.xlsx | Sheet1    |