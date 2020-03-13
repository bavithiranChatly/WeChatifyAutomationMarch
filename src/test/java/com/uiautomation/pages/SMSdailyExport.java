/**
 * 
 */
package com.uiautomation.pages;

import org.openqa.selenium.WebElement;

import com.uiautomation.utils.CommonUtils;
import com.wechatify.utils.Constants;

import net.serenitybdd.core.annotations.findby.FindBy;

/**
 * 
 * @version $Id$
 */
public class SMSdailyExport
{
   static CommonPage cmnPage;

   // SMS Export Button
   @FindBy(xpath = "//div[@class='col-md-8']//div[@class='col-md-12 col-lg-12']//button[@title='Export']")
   private static WebElement SMSExportButton;

   // SMS based Export Button
   @FindBy(xpath = "// ul[@role='tablist']//li[@class='nav-item']//a[text()='SMS based Export']")
   private static WebElement SMSbasedExp;

   // Select Date
   @FindBy(xpath = "//input[@id='chooseDateRange']")
   private static WebElement dateSelection;

   // Select Date
   @FindBy(xpath = "// div[@class='range_inputs']//button[text()='Apply']")
   private static WebElement applyButton;

   // Search and choose Emailid to export data
   @FindBy(xpath = "// div[@class='modal-body clearfix']//div[@class='dropdown-toggle']//input[@type='search']")
   private static WebElement searchEmailId;
   

   public static void inputProcess(String filePath, String fileName, String sheetName)
   {
      // module Selection
      cmnPage.UserSelectsModule("SMS");
      CommonUtils.waitForSeconds(2);

      SMSExportButton.click();
      CommonUtils.waitForSeconds(1);

      dateSelection.click();
      dateSelection.clear();
      dateSelection.sendKeys("2020-01-07 - 2020-01-07");
      
      searchEmailId.click();
      searchEmailId.clear();
      searchEmailId.sendKeys();

   }

   public static void main(String[] args)
   {
      String inputSheetFilePath = CommonUtils.getAbsolutePathPath(Constants.EXCEL_SHEET_DATA_FAQ_PATH);
      String inputSheetFileName = "detailsforExport.xlsx";
      String inputSheetName = "Sheet1";
      inputProcess(inputSheetFilePath, inputSheetFileName, inputSheetName);
   }
}
