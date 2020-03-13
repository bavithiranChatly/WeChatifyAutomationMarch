package com.uiautomation.pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebElement;

import com.uiautomation.utils.CommonUtils;

import jline.internal.Log;
import net.serenitybdd.core.annotations.findby.FindBy;

public class PageAutoResponderFAQ extends CommonPage

{
   // Autoresponder top menus
   @FindBy(xpath = "//*[@id='faqResponder']/li[1]/a, //*[@id='faqResponder']/li[2]/a")
   private List<WebElement> getautoResponderTopMenuOptions;

   // FAQ configuration page
   @FindBy(xpath = "//ul[@id='faqResponder']//li//a[text()='FAQ Configuration']")
   private WebElement faqConfigurationPage;

   // Add Question and Answer Button
   @FindBy(xpath = "//a[@class='btn btn-default btn-circle pull-left fdr-add-btn']")
   private WebElement addQNAbutton;

   // Question type toggle
   @FindBy(xpath = "//span[@class='slider round']")
   private WebElement typeToggle;

   // Question Field
   @FindBy(xpath = "//textarea[@id='Question']")
   private WebElement questionField;

   // Keyword Field
   @FindBy(xpath = "//input[@id='Keyword']")
   private WebElement keywordField;

   // Answer Field for Text Response Only
   @FindBy(xpath = "//div[@id='contenteditableDiv']")
   private WebElement answerField;

   // Select Tag dropDown
   @FindBy(xpath = "//div[@id='SystemTags_chosen']//b")
   private WebElement selectTag;

   // Select Tag dropDown Search
   @FindBy(xpath = "//div[@class='col-sm-8']//div[@class='chosen-search']//input[@type='text']")
   private WebElement selectTagDropdown;

   // Select Add new tag option
   @FindBy(xpath = "//div[@class='chosen-drop']//ul[@class='chosen-results']//li[@data-option-array-index=1]")
   private WebElement selectAddNewTag;

   // New Tag Name field
   @FindBy(xpath = "//input[@id='TagName']")
   private WebElement tagName;

   // System Tag Strength field
   @FindBy(xpath = "//input[@id='Strength']")
   private WebElement tagStrength;

   // Create Tag button
   @FindBy(xpath = "//button[@id='CreateTag']")
   private WebElement createSysTagbutton;

   // Add Tag button
   @FindBy(xpath = "//input[@id='addTagBtn']")
   private WebElement addTagButton;

   // QNA save button
   @FindBy(xpath = "//input[@id='saveQnA']")
   private WebElement qnaSaveButton;

   // QNA cancel button
   @FindBy(xpath = "//input[@id='resetBtn']")
   private WebElement qnaCancelButton;

   // Back to List button
   @FindBy(xpath = "//div[@class='button-group DraftBacklist']")
   private WebElement backToList;

   // Publish All button
   @FindBy(xpath = "//button[@class='btn qnaPubBtn pull-left ']")
   private WebElement publishAll;

   // Publish Input field
   @FindBy(xpath = "//input[@id='confirmPublish']")
   private WebElement publishInput;

   // Single Publish Input Field
   @FindBy(xpath = "//input[@id='singleConfirmAction']")
   private WebElement singlePublishInput;

   // Publish Confirmation Button
   @FindBy(xpath = "//input[@id='publishActionBtn']")
   private WebElement publishConfirmationBtn;

   // Single Publish COnfirmation Button
   @FindBy(xpath = "//input[@id='singlePublishActionBtn']")
   private WebElement singlePublishConfirmBtn;

   // Delete Confirmation Input field
   @FindBy(xpath = "//input[@id='confirmAction']")
   private WebElement deleteInput;

   // Delete Confirmation Button
   @FindBy(xpath = "//input[@id='deleteActionBtn']")
   private WebElement deleteConfirmationBtn;

   // QNA Configuration setting save button
   @FindBy(xpath = "//input[@id='qnaConfEdit']")
   private WebElement saveConfigBtn;

   // QNA Configuration setting save button
   @FindBy(xpath = "//input[@id='qnaConfCancel']")
   private WebElement cancelConfigBtn;

   // CS toggle button disabled - OFF
   @FindBy(xpath = "//div[@class='lcs_switch lcs_off lcs_disabled lcs_checkbox_switch']//div[@class='lcs_label lcs_label_off']")
   private WebElement csToggleDisabled;

   // CS toggle button enabled - OFF
   @FindBy(xpath = "//div[@class='lcs_switch lcs_off lcs_checkbox_switch']//div[@class='lcs_label lcs_label_off']")
   private WebElement csToggleEnabledOFF;

   // CS toggle button enabled - ON
   @FindBy(xpath = "//div[@class='lcs_switch lcs_on lcs_checkbox_switch']//div[@class='lcs_label lcs_label_on']")
   private WebElement csToggleEnabledON;

   // CS support keyword
   @FindBy(xpath = "//input[@id='CustomerSupportKeyword']")
   private WebElement csKeywordInputField;

   // Help Message decription
   @FindBy(xpath = "//div[@id='writingtxtDiv']//div[@id='contenteditableDiv']")
   private WebElement helpMessageDescription;

   // Keyword already exists error message
   @FindBy(xpath = "//span[@class='text-danger csErrSpan']//b")
   private WebElement keyExists;

   /**
    * @Description: Question and Answer Button
    * @param
    * @return : void
    * @exception :
    * @Created_by : raghuram
    */
   public void AddQnaButton()
   {
      waitFor(addQNAbutton);
      addQNAbutton.click();
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : raghuram
    */
   public void QnATextinputs(String question, String questionType)
   {
      if (questionType.equalsIgnoreCase("Question"))
      {
         questionField.clear(); 
         CommonUtils.waitForSeconds(1);
         questionField.sendKeys(question);
      }
      else if (questionType.equalsIgnoreCase("Keyword"))
      {
         //typeToggle.click();
         keywordField.clear();
         keywordField.sendKeys(question);
      }
      CommonUtils.waitForSeconds(2);
   }

   public void readExcelData(String filePath, String fileName, String sheetName) throws IOException
   {

      Sheet PageSheet = CommonUtils.readExcel(filePath, fileName, sheetName);

      // Find number of rows in excel file
      // int rowCount = faQSheet.getLastRowNum()-faQSheet.getFirstRowNum();
      int rowCount = PageSheet.getLastRowNum();

      // Create a loop over all the rows of excel file to read it
      for (int i = 0; i < rowCount + 1; i++)
      {
         Row row = PageSheet.getRow(i);

         boolean isQuestion = true;

         // Create a loop to print cell values in a row
         for (int j = 0; j < row.getLastCellNum(); j++)
         {
            // Print Excel data in console
            System.out.print(row.getCell(j).getStringCellValue() + "|| ");

            if (isQuestion)
            {
               questionField.clear();
               questionField.sendKeys(row.getCell(j).getStringCellValue());
            }
            else
            {
               answerField.clear();
               answerField.sendKeys(row.getCell(j).getStringCellValue());
            }
            isQuestion = false;
         }
         qnaSaveButton.click();
         CommonUtils.waitForSeconds(2);
         System.out.println();
      }
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : Raghuram
    */
   public void faqActions(String editQuestion, String actionType)
   {
      switch (actionType)
      {

      case "Edit":
         getDriver()
            .findElement(
               org.openqa.selenium.By
                  .xpath("//tbody[@class='ng-scope']//div[1][text()='" + editQuestion + "']//..//..//..//..//i[@data-original-title='Edit']"))
            .click();
         break;

      case "Delete":
         getDriver()
            .findElement(
               org.openqa.selenium.By
                  .xpath("//tbody[@class='ng-scope']//div[1][text()='" + editQuestion + "']//..//..//..//..//i[@data-original-title='Delete']"))
            .click();
         CommonUtils.waitForSeconds(2);

         Boolean deleteDisabled = deleteConfirmationBtn.isEnabled();
         System.out.print("\n Delete Button Enabled Before Delete Keyword :");
         System.out.print(deleteDisabled);

         deleteInput.sendKeys("delete");
         CommonUtils.waitForSeconds(2);

         Boolean deleteEnabled = deleteConfirmationBtn.isEnabled();
         System.out.print("\n Delete Button Enabled After Delete Keyword : ");
         System.out.print(deleteEnabled);
         CommonUtils.waitForSeconds(2);

         deleteConfirmationBtn.click();
         break;

      case "Publish":
         getDriver()
            .findElement(
               org.openqa.selenium.By
                  .xpath("//tbody[@class='ng-scope']//div[1][text()='" + editQuestion + "']//..//..//..//..//i[@data-original-title='Publish']"))
            .click();
         CommonUtils.waitForSeconds(2);

         Boolean singlepublishDisabled = singlePublishConfirmBtn.isEnabled();
         System.out.print("\n Publish Button Enabled Before Publish Keyword :");
         System.out.print(singlepublishDisabled);

         singlePublishInput.sendKeys("publish");
         CommonUtils.waitForSeconds(2);

         Boolean singlepublishEnabled = singlePublishConfirmBtn.isEnabled();
         System.out.print("\n Publish Button Enabled After Publish Keyword : ");
         System.out.print(singlepublishEnabled);

         singlePublishConfirmBtn.click();

      }

   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : Raghuram
    */
   public void sysTag(String sysTagname, String strength)
   {
      selectTag.click();
      selectAddNewTag.click();
      CommonUtils.waitForSeconds(2);
      // waitFor(tagName);
      // tagName.clear();
      tagName.sendKeys(sysTagname);
      tagStrength.clear();
      tagStrength.sendKeys(strength);
      // createSysTagbutton.click();
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : Raghuram
    */

   public void existingsysTag(String exSysTagname)
   {
      selectTag.click();
      CommonUtils.waitForSeconds(2);
      // selectTagDropdown.sendKeys(exSysTagname);
      getDriver()
         .findElement(org.openqa.selenium.By.xpath("//div[@class='chosen-drop']//ul[@class='chosen-results']//li[text()='" + exSysTagname + "']"))
         .click();
      CommonUtils.waitForSeconds(2);
      addTagButton.click();
      CommonUtils.waitForSeconds(2);
      qnaSaveButton.click();
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : Raghuram
    */
   public void qNaSave(String buttonChoice)
   {
      switch (buttonChoice)
      {
      case "Save":
         qnaSaveButton.click();
         CommonUtils.waitForSeconds(2);
         break;

      case "Back to List":
         backToList.click();
         break;

      case "Cancel":
         qnaCancelButton.click();
         break;

      case "Publish All":
         publishAll.click();
         CommonUtils.waitForSeconds(2);

         Boolean publishDisabled = publishConfirmationBtn.isEnabled();
         System.out.print("\n Publish Button Enabled Before Publish Keyword :");
         System.out.print(publishDisabled);

         publishInput.sendKeys("publish");
         CommonUtils.waitForSeconds(2);

         Boolean publishEnabled = publishConfirmationBtn.isEnabled();
         System.out.print("\n Publish Button Enabled After Publish Keyword : ");
         System.out.print(publishEnabled);

         publishConfirmationBtn.click();
         break;
      }

   }

   /**
    * @Description:
    * @param
    * @return : List<String>
    * @exception :
    * @Created_by : Raghuram
    */
   public List<String> getautoResponderTopMenuOptions()
   {
      List<String> autoresponderoptions = new ArrayList<>();
      for (WebElement faqMenu : getautoResponderTopMenuOptions)
      {
         autoresponderoptions.add(faqMenu.getText().trim());
      }
      return autoresponderoptions;
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : Raghuram
    */
   public void autoSubmenuChoose(String subMenu)
   {
      getDriver().findElement(org.openqa.selenium.By.xpath("//ul[@id='faqResponder']//li//a[text()='" + subMenu + "']")).click();
   }

   /**
    * @Description: faqConfigSettings
    * @param
    * @return : void
    * @exception :
    * @Created_by : Raghuram
    */
   public void faqConfigSettings(String subPage, String configSetting, String responseType, String cardName)
   {
      responseType(configSetting, responseType, cardName, subPage);
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : Raghuram
    */
   public void responseSelection(String textmessage, String responseType, String cardName, String moduleName)
   {
      responseType(textmessage, responseType, cardName, moduleName);
      CommonUtils.waitForSeconds(2);
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : Raghuram
    */
   public void qnaConfigActionButton(String configButtonChoice)
   {
      if (configButtonChoice.equalsIgnoreCase("Save"))
      {
         saveConfigBtn.click();
      }
      else if (configButtonChoice.equalsIgnoreCase("Cancel"))
      {
         cancelConfigBtn.click();
      }
   }

   /**
    * @Description: Removing FAQ configuration response
    * @param
    * @return : void
    * @exception :
    * @Created_by : Raghuram
    */
   public void qnaConfigDelete(String configSetting)
   {
      if (configSetting.equalsIgnoreCase("FAQconfiguration-WelcomeMessage"))
      {
         String responseMediaType = getDriver()
            .findElement(org.openqa.selenium.By.xpath("//ul[@class='mediaInfo mediaInfo_1']//a[contains(@class,'active')]"))
            .getText();

         String resultText = CommonUtils.removeSpacesInbetweenString(responseMediaType);

         int elementValue = faqConfigurationElement(configSetting);

         if (responseMediaType.equalsIgnoreCase("Text"))
         {
            getDriver().findElement(org.openqa.selenium.By.xpath("//div[@class='emoji-wysiwyg-editor emoji-wysiwyg-editor_" + elementValue + "']")).clear();
         }
         else
         {
            getDriver()
               .findElement(org.openqa.selenium.By.xpath("//div[@class='" + resultText + "ChoosenData_" + elementValue + "']//input[@id='deleteButtonPopup']"))
               .click();
         }

      }
      else if (configSetting.equalsIgnoreCase("FAQconfiguration-GlobalFallbackMessage"))
      {
         String responseMediaType = getDriver()
            .findElement(org.openqa.selenium.By.xpath("//ul[@class='mediaInfo mediaInfo_1']//a[contains(@class,'active')]"))
            .getText();

         String resultText = CommonUtils.removeSpacesInbetweenString(responseMediaType);

         int elementValue = faqConfigurationElement(configSetting);

         if (responseMediaType.equalsIgnoreCase("Text"))
         {
            getDriver().findElement(org.openqa.selenium.By.xpath("//div[@class='emoji-wysiwyg-editor emoji-wysiwyg-editor_" + elementValue + "']")).clear();
         }
         else
         {
            getDriver()
               .findElement(org.openqa.selenium.By.xpath("//div[@class='" + resultText + "ChoosenData_" + elementValue + "']//input[@id='deleteButtonPopup']"))
               .click();
         }

      }
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : Raghuram
    */
   public void csTransferToggleState(String csStatus)
   {
      switch (csStatus)
      {
      case "Disabled":
         Boolean csToggleDisabledOFFvalue = csToggleDisabled.isDisplayed();
         Log.info("CS transfer button disabled - OFF as Global Fallback message is not configured ", csToggleDisabledOFFvalue);
         break;
      case "Enabled-OFF":
         Boolean csToggleEnabledOFFvalue = csToggleEnabledOFF.isDisplayed();
         Log.info("CS transfer button enabled - OFF  as Global Fallback message is configured ", csToggleEnabledOFFvalue);
         csToggleEnabledOFF.click();
         break;
      case "Enabled-ON":
         Boolean csToggleEnabledONvalue = csToggleEnabledON.isDisplayed();
         Log.info("CS transfer button enabled - ON as Global Fallback message is configured with redirection keyword ", csToggleEnabledONvalue);
         csToggleEnabledON.click();
         break;
      }
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : Raghuram
    */
   public void csTransferInputs(String csKeyword)
   {
      csKeywordInputField.clear();
      csKeywordInputField.sendKeys(csKeyword);
      CommonUtils.waitForSeconds(2);
      if (keyExists.isDisplayed())
      {
         String num = csKeyword + CommonUtils.randomNumberwithinLimit(50);
         csKeywordInputField.clear();
         csKeywordInputField.sendKeys(num);
         helpMessageDescription.click();
         CommonUtils.waitForSeconds(2);
         Log.info(helpMessageDescription.getText().contentEquals("Enter \"" + num + "\" for human support, else continue with another question."));
         CommonUtils.waitForSeconds(10);
      }
      else
      {
         helpMessageDescription.click();
         CommonUtils.waitForSeconds(2);
         Log.info(helpMessageDescription.getText().contentEquals("Enter \"" + csKeyword + "\" for human support, else continue with another question."));
         CommonUtils.waitForSeconds(10);
      }
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : Raghuram
    */
   public void faqErrorMessages(String errorMSgType, String errmsg)
   {
      if (errorMSgType.equalsIgnoreCase("QuestionMandatory"))
      {
         boolean questionManErrMsg = getDriver().findElement(org.openqa.selenium.By.xpath("//span[@id='qnaquesErr']")).getText().contentEquals(errmsg);
         Log.info(errmsg," is : ",questionManErrMsg);
      }
      if (errorMSgType.equalsIgnoreCase("ResponseMandatory"))
      {
         boolean questionManErrMsg = getDriver().findElement(org.openqa.selenium.By.xpath("//span[@id='mappedErrorMsg']")).getText().contentEquals(errmsg);
         Log.info(errmsg," is : ",questionManErrMsg);
      }
      if (errorMSgType.equalsIgnoreCase("QuestionTextLimt"))
      {
         String questionManErrMsg123 = getDriver().findElement(org.openqa.selenium.By.xpath("//span[@class='text-danger validCountErr']")).getText();
         Log.info(questionManErrMsg123);
         boolean questionManErrMsg = getDriver().findElement(org.openqa.selenium.By.xpath("//span[@class='text-danger validCountErr']")).getText().contentEquals(errmsg);
         Log.info(errmsg," is : ",questionManErrMsg);
      }
   }

}
