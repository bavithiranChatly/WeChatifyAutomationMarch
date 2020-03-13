package com.uiautomation.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;

import com.uiautomation.utils.CommonUtils;

import jline.internal.Log;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.findby.By;

@SuppressWarnings("deprecation")
public class CommonPage extends PageObject
{
   // @FindBy(css = "#WechatifyNavigation [title=\"Creatives\"]")
   @FindBy(xpath = "//*[@id=\"menuThree\"]/a/em")
   private WebElement creativeNavMenu;

   @FindBy(css = ".userManagement.Submenu")
   private WebElement userManagemenetMenu;

   @FindBy(css = "div >a.logoutButton,#logoutForm a#hrefID.logoutButton")
   private WebElement logoutBtn;

   @FindBy(css = "a.fdr-add-btn")
   private WebElement addEnityButton;

   @FindBy(css = "li#userManagentBothsuperAdmin>a,li#roleManagentBothsuperAdmin>a")
   private List<WebElement> userRoleManagementTopHeadersLists;

   // Text card Title name
   @FindBy(css = "input#Title.form-control.text-box.single-line")
   private WebElement textcardtitle;

   @FindBy(css = "li#userManagentBothsuperAdmin")
   private WebElement userManagementTopHeaderName;

   @FindBy(css = "li#roleManagentBothsuperAdmin")
   private WebElement roleManagementTopHeaderName;

   @FindBy(id = "searchMenuControl")
   private WebElement searchMenuTextBox;

   // @FindBy(css = "#WechatifyNavigation a span")
   @FindBy(xpath = "//*[contains(@id,'menu')][not(contains(@class,'hide'))]")
   private List<WebElement> wechatModuleList;

   @FindBy(css = "li#menubarCtrl")
   private WebElement menuExpandCollaspe;

   @FindBy(css = "#searchMenuWrap > span")
   private WebElement wechatifySearchMenu;

   @FindBy(css = "a[onclick=\"modalClose()\"]")
   private WebElement modelCloseButton;

   @FindBy(css = ".modal-footer input[value='OK']")
   private WebElement modelOKButton;

   @FindBy(css = "#deletepopformId > input.btn.btn-primary.PopOkbtn")
   private WebElement modelOKButton2;

   @FindBy(css = "#deletepopformId > input.btn.btn-primary.PopOkbtn")
   private WebElement modelOKButton1;

   @FindBy(css = "button[onclick=\"modalClose()\"]")
   private WebElement modelCloseButton2;

   @FindBy(css = "[onclick='cancelImgCropper()']")
   private WebElement modelCloseButton3;

   // Smiley button
   @FindBy(css = "#writingtxtDiv > a")
   private WebElement smiley;

   // Smiley button
   @FindBy(css = "#writingTranstxtDiv > a")
   private WebElement smiley_t;

   // Preview
   @FindBy(xpath = "//div[@class='form-group text-right']//input[@value='Preview']") // *[@id='PreviewBtnIdn']
   private WebElement previewtoFollower;

   // Preview to follower button
   @FindBy(xpath = "//*[@id='previewForFollowerNew']")
   private WebElement previewtoFollowerbtn;

   // Preview to follower button
   @FindBy(xpath = "//div[@class='messageCardpreviewpage']//select[@class='form-control text-center previewMobile']")
   private WebElement MobilePreviewClick;

   // Preview to follower button
   @FindBy(xpath = "//*[@id='btnPreview']")
   private WebElement finalprbtn;

   // Preview to follower button
   @FindBy(xpath = "//*[@class='btn btn-default']")
   private WebElement closebtn;

   // Follower input search field
   @FindBy(css = "#followerData > div.modal-body > div.tableblk > div > div.row > div > div > div > input")
   private WebElement followeinput;

   // Follower Search Button
   @FindBy(css = "#followerData > div.modal-body > div.tableblk > div > div.row > div > div > div > span > button")
   private WebElement followersearchbtn;

   @FindBy(xpath = "//*[@id='btnPreview']")
   private WebElement prw;

   @FindBy(xpath = "//*[@id='MessageCardviewClose']")
   private WebElement ExitPreview;

   @FindBy(xpath = "//*[@id=\"NotifyTouserBtnId\"]")
   private WebElement notifyOkbutton; // "OK" notify to user button

   @FindBy(xpath = "//p[text()='No records found']")
   private WebElement noRec; // "OK" notify to user button

   @FindBy(xpath = "//div[@class='form-group text-right']//input[@value='Notify to User']") //// div[@class='row ']//input[@value='Notify to User']
   protected WebElement notifyTOuser; // notifyTOuser Button

   // Answer Field for Text Response Only
   @FindBy(xpath = "//div[@class='emoji-wysiwyg-editor']")
   private WebElement answerField;

   // QR Field for Text Response Only
   @FindBy(xpath = "//div[@id='writingtxtDiv']//div[@id='contenteditableDiv']")
   private WebElement qrTextResponseField;

   // Confiramtion add item in Photo News response card pick pop-up
   @FindBy(xpath = "//input[@id='ConfirmAddBtnId']")
   private WebElement photoNewsAddItem;

   // Confiramtion add item in Photo Message response card pick pop-up
   @FindBy(xpath = "//input[@id='MessageConfirmAddBtnId']")
   private WebElement photoMessageAddItem;

   // Confiramtion add item in Image response card pick pop-up
   @FindBy(xpath = "//input[@id='ConfirmImageAddBtnId']")
   private WebElement imageAddItem;

   // Confiramtion add item in Audio response card pick pop-up
   @FindBy(xpath = "//input[@id='ConfirmAudioAddBtnId']")
   private WebElement audioAddItem;

   // Confiramtion add item in VIdeo response card pick pop-up
   @FindBy(xpath = "//input[@id='ConfirmVideoAddBtnId']")
   private WebElement videoAddItem;

   // text
   @FindBy(xpath = "//a[contains(text(),'')]")
   private List<WebElement> element;

   // Response Editor
   @FindBy(xpath = "//div[starts-with(@class,'menu-mediaContent')]")

   public int cardsAvailableCounts;

   public void logoutFromWeChatify()
   {
      waitFor(logoutBtn);
      logoutBtn.click();
   }

   public boolean isLogoutBtnDisplayed()
   {
      try
      {
         waitFor(logoutBtn);
         return logoutBtn.isDisplayed();
      }
      catch (Exception e)
      {
         return false;
      }
   }

   public void clickCreativeNavMenu()
   {
      creativeNavMenu.click();
   }

   public void clickAddEntityButton()
   {
      waitFor(addEnityButton);
      addEnityButton.click();
   }

   public String getUserManagementMenuBackgroundColor()
   {
      waitFor(userManagemenetMenu);
      return userManagemenetMenu.getCssValue("background-color");
   }

   public String getCreativeNavMenuBackgroundColor()
   {
      waitFor(creativeNavMenu);
      return creativeNavMenu.getCssValue("background-color");
   }

   public List<String> getUserManagementTopHeadersLists()
   {
      List<String> userHeaders = new ArrayList<>();
      for (WebElement header : userRoleManagementTopHeadersLists)
      {
         String headerText = CommonUtils.removeJunkFromString(header.getText());

         userHeaders.add(headerText);

      }
      return userHeaders;
   }

   public boolean isUserManagementTopTabDisplayed()
   {
      return userManagementTopHeaderName.isDisplayed();
   }

   public boolean isUserRoleTopTabDisplayed()
   {
      return roleManagementTopHeaderName.isDisplayed();
   }

   public void searchModuleByName(String searchModule)
   {
      waitFor(searchMenuTextBox);
      searchMenuTextBox.clear();
      searchMenuTextBox.sendKeys(searchModule);

   }

   public boolean isSearchMenuTextBoxDisplayed()
   {
      return CommonUtils.isElementDisplayed(searchMenuTextBox);

   }

   public List<String> getModuleList()
   {
      List<String> moduleNameList = new ArrayList<>();
      CommonUtils.waitForSeconds(5);
      Log.info(wechatModuleList.size());
      int i = 0;
      while (i < wechatModuleList.size())
      {
         try
         {
            String elelemntText = wechatModuleList.get(i).getText();
            moduleNameList.add(CommonUtils.removeJunkFromString(elelemntText));
            i++;
         }
         catch (Exception e)
         {
            i++;
            continue;
         }
      }
      return moduleNameList;

   }

   public void SelectModuleByName(String searchModule)
   {
      for (WebElement moduleName : wechatModuleList)
      {
         if (searchModule.equalsIgnoreCase(CommonUtils.removeJunkFromString(moduleName.getText())))
         {
            Log.info("Selecting module name:" + searchModule);
            moduleName.click();
            break;
         }
      }
   }

   public boolean isSearchTextBoxVisible()
   {
      waitFor(searchMenuTextBox);
      return searchMenuTextBox.isDisplayed();
   }

   public void clickSearchMenuIconIfVisilble()
   {
      try
      {
         // wechatifySearchMenu.click();
         menuExpandCollaspe.click();
      }
      catch (Exception e)
      {
         Log.info("SEARCH MENU ICON NOT VISIBLE");
      }

   }

   public void confirmLeaveBrowserPopup()
   {

      try
      {
         creativeNavMenu.isDisplayed();
      }
      catch (Exception e)
      {

         Robot r;
         CommonUtils.waitForSeconds(5);
         try
         {
            r = new Robot();
            r.keyPress(KeyEvent.VK_ENTER);
            r.keyRelease(KeyEvent.VK_ENTER);
         }
         catch (AWTException ex)
         {
            ex.printStackTrace();
         }
         CommonUtils.waitForSeconds(5);

         /**
          * String JS_DISABLE_UNLOAD_DIALOG = "Object.defineProperty(BeforeUnloadEvent.prototype, 'returnValue', { get:function(){}, set:function(){} });";
          * ((JavascriptExecutor)getDriver()).executeScript(JS_DISABLE_UNLOAD_DIALOG); ((JavascriptExecutor)getDriver()).executeScript("window.onbeforeunload =
          * null;"); ((JavascriptExecutor)getDriver()).executeScript("window.beforeunload = null;");
          **/

      }
   }

   /**
    * public void confirmLeaveBrowserPopup() { org.openqa.selenium.JavascriptExecutor js = (org.openqa.selenium.JavascriptExecutor )getDriver();
    * js.executeScript( "window.onbeforeunload = function(e){};" ); CommonUtils.waitForSeconds(5); }
    **/

   public void clickModelCancelButton()
   {
      if (CommonUtils.isElementDisplayed(modelCloseButton))
      {
         modelCloseButton.click();

      }
      else if (CommonUtils.isElementDisplayed(modelCloseButton2))
      {
         modelCloseButton2.click();
      }
      else
      {
         modelCloseButton3.click();
      }

   }

   public void clickSaveNavigationByButtonText(String buttonText)
   {
      Log.info("Clicking Button with button Text as: " + buttonText);
      WebElement buttonNav = getDriver().findElement(By.cssSelector("[value='" + buttonText + "']"));
      waitFor(buttonNav);
      buttonNav.click();
      Log.info("Clicked Button with button Text as: " + buttonText);
   }

   public boolean isSaveNavigationByButtonTextDisplayed(String buttonText)
   {
      CommonUtils.scrollToPosition(getDriver(), 0, 0);
      CommonUtils.waitForSeconds(5);
      Log.info("Checking Button with button Text is displayed or not: " + buttonText);
      WebElement buttonNav = getDriver().findElement(By.cssSelector("[value='" + buttonText + "']"));
      waitFor(buttonNav);
      Log.info("Button is display with: " + buttonText);
      return buttonNav.isDisplayed();
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : raghuram
    */

   public void smileyicon(String OrigOrTrans)
   {

      if (OrigOrTrans.equalsIgnoreCase("Original"))
      {
         smiley.click();
         List<WebElement> totalEmoji = getDriver().findElements(By.xpath("//div[@class =\"emoji-menu\"]//a"));
         int limitSize = totalEmoji.size();

         // Random Number within limit
         int rand_number = CommonUtils.randomNumberwithinLimit(limitSize);

         if (rand_number == 0)
         {
            rand_number++;
         }
         getDriver().findElement(By.xpath("/html/body/div[38]/div/a[" + rand_number + "]")).click();

         /**
          * for (int Emoji = 1; Emoji<totalEmojiCount; Emoji++) { getDriver().findElement(By.xpath("/html/body/div[38]/div/a["+ Emoji +"]")).click();
          * smiley.click(); }
          **/

         textcardtitle.click();
      }
      else if (OrigOrTrans.equalsIgnoreCase("Translate"))
      {
         smiley_t.click();
         List<WebElement> totalEmoji = getDriver().findElements(By.xpath("//div[@class =\"emoji-menu\"]//a"));
         int limitSize = totalEmoji.size();

         // Random Number within limit
         int rand_number = CommonUtils.randomNumberwithinLimit(limitSize);
         if (rand_number == 0)
         {
            rand_number++;
         }
         getDriver().findElement(By.xpath("/html/body/div[38]/div/a[" + rand_number + "]")).click();

         /**
          * for (int Emoji = 1; Emoji<totalEmojiCount; Emoji++) { getDriver().findElement(By.xpath("/html/body/div[38]/div/a["+ Emoji +"]")).click();
          * smiley_t.click(); }
          **/
         textcardtitle.click();
      }
   }

   // notifyToUser Button
   public void notifyToUSer()
   {
      CommonUtils.waitForSeconds(5);
      notifyTOuser.click();
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : raghuram
    */

   public void previewtoFollowers()
   {
      CommonUtils.waitForSeconds(4);
      previewtoFollower.click();
      CommonUtils.waitForSeconds(4);
      previewtoFollowerbtn.click();
      CommonUtils.waitForSeconds(4);
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : raghuram
    */

   public void chooseFollower(String followerName)
   {
      followeinput.clear();
      followeinput.sendKeys(followerName);
      CommonUtils.waitForSeconds(2);
      followersearchbtn.click();
      CommonUtils.waitForSeconds(5);
      getDriver()
         .findElement(
            By
               .xpath(
                  "//*[@class='text-center table-responsive choosefollwers']//..//td[contains(text(),'" + followerName
                     + "')]//..//input[@class='ng-pristine ng-untouched ng-valid ng-empty']"))
         .click();
      CommonUtils.waitForSeconds(5);
      finalprbtn.click();
      CommonUtils.waitForSeconds(5);
      ExitPreview.click();

   }

   public void selectUserstoNotify(String emailid)
   {
      getDriver()
         .findElement(By.xpath("//div[@class='notifyUserListWrap']//tr//input[@value='" + emailid + "']//..//input[@class='UserDetailsCheckBox']"))
         .click();
      CommonUtils.waitForSeconds(3);
      notifyOkbutton.click();
   }

   public void selectingSubMediaTypeAction(String mediaType)
   {
      getDriver().findElement(By.xpath("//div[@class='fltr-wrap']//a[contains(text(),'" + mediaType + "')]")).click();
   }

   public void clickModelOKButton()
   {
      try
      {
         modelOKButton.click();
      }
      catch (Exception e)
      {
         modelOKButton2.click();
      }
   }

   /**
    * @Description: Choosing Module form the Navigation Menu
    * @param
    * @return : void
    * @exception :
    * @Created_by : raghuram
    */
   public void UserSelectsModule(String moduleName)
   {
      getDriver().findElement(By.xpath("//ul[@id='WechatifyNavigation']//a[@title='" + moduleName + "']")).click();
   }

   public void responseType(String textmessage, String responseType, String cardName, String moduleName)
   {
      if (moduleName.contentEquals("QRExceptional"))
         {
      // To identify the media-type sub-tabs in the response editor
         moduleMediasubTab(moduleName, responseType);
         }
      else if(moduleName != "QRExceptional")
      {
      // To identify the media-type sub-tabs in the response editor
      moduleMediasubTab(moduleName, responseType);

      // To identity the response add click element based on modules (QR
      // code,FAQ,FAQconfiguration,Tag Response configuration)
      moduleResponseSplit(moduleName, responseType, textmessage);
      CommonUtils.waitForSeconds(3);

      // To choose the response card from the pop-up based on media type
      chooseResponsecards(responseType, cardName);
      CommonUtils.waitForSeconds(3);
      }
   }

   public void moduleMediasubTab(String moduleName, String responseType)
   {
      if (moduleName.equalsIgnoreCase("FAQ") || moduleName.equalsIgnoreCase("QRcode") || moduleName.equalsIgnoreCase("QRExceptional"))
      {
         getDriver().findElement(org.openqa.selenium.By.xpath("//ul[@class='mediaInfo']//a[@onclick=\"ChangeMediaData('" + responseType + "')\"]")).click();
      }
     /**else if (moduleName.contains("FAQconfiguration"))
      {
         int elementValue = faqConfigurationElement(moduleName);
         getDriver()
            .findElement(
               org.openqa.selenium.By
                  .xpath(
                     "//ul[@class='mediaInfo mediaInfo_" + elementValue + "']//a[@onclick=\"ChangeMediaData('" + responseType + "','" + elementValue
                        + "',this)\"]"))
            .click();
      }**/
   }

   public void moduleResponseSplit(String moduleName, String responseType, String textmessage)
   {

      switch (responseType)
      {
      case "Text":
         if (moduleName.equalsIgnoreCase("FAQ"))
         {
            answerField.clear();
            answerField.sendKeys(textmessage);
            CommonUtils.waitForSeconds(1);
         }
         else if (moduleName.contains("FAQconfiguration"))
         {
            int elementValue = faqConfigurationElement(moduleName);
            getDriver().findElement(org.openqa.selenium.By.xpath("//div[@class='emoji-wysiwyg-editor emoji-wysiwyg-editor_" + elementValue + "']")).clear();
            getDriver()
               .findElement(org.openqa.selenium.By.xpath("//div[@class='emoji-wysiwyg-editor emoji-wysiwyg-editor_" + elementValue + "']"))
               .sendKeys(textmessage);
            CommonUtils.waitForSeconds(1);
         }
         else if (moduleName.equalsIgnoreCase("FAQ"))
         {
            qrTextResponseField.sendKeys(textmessage);
            CommonUtils.waitForSeconds(1);
         }
         break;

      case "RichTextMessage":
         if (moduleName.equalsIgnoreCase("FAQ"))
         {
            getDriver()
               .findElement(
                  org.openqa.selenium.By.xpath("//div[starts-with(@class,'menu-mediaContent')]//div[@class='innerContent']//a[@id='SelectBroadcastDivID']"))
               .click();
         }
         else if (moduleName.contains("FAQconfiguration"))
         {
            int elementValue = faqConfigurationElement(moduleName);
            getDriver()
               .findElement(
                  org.openqa.selenium.By
                     .xpath("//div[starts-with(@class,'menu-mediaContent')]//div[@class='innerContent']//a[@id='SelectBroadcastDivID_" + elementValue + "']"))
               .click();
         }
         break;

      case "Message":
         if (moduleName.equalsIgnoreCase("FAQ"))
         {
            getDriver()
               .findElement(
                  org.openqa.selenium.By.xpath("//div[starts-with(@class,'menu-mediaContent')]//div[@class='innerContent']//a[@id='SelectMessageDivID']"))
               .click();
         }
         else if (moduleName.contains("FAQconfiguration"))
         {
            int elementValue = faqConfigurationElement(moduleName);
            getDriver()
               .findElement(
                  org.openqa.selenium.By
                     .xpath("//div[starts-with(@class,'menu-mediaContent')]//div[@class='innerContent']//a[@id='SelectMessageDivID_" + elementValue + "']"))
               .click();
         }
         break;

      case "Image":
         if (moduleName.equalsIgnoreCase("FAQ"))
         {
            getDriver()
               .findElement(
                  org.openqa.selenium.By.xpath("//div[starts-with(@class,'menu-mediaContent')]//div[@class='innerContent']//a[@id='SelectImageDivID']"))
               .click();
         }
         else if (moduleName.contains("FAQconfiguration"))
         {
            int elementValue = faqConfigurationElement(moduleName);
            getDriver()
               .findElement(
                  org.openqa.selenium.By
                     .xpath("//div[starts-with(@class,'menu-mediaContent')]//div[@class='innerContent']//a[@id='SelectImageDivID_" + elementValue + "']"))
               .click();
         }
         break;

      case "Audio":
         if (moduleName.equalsIgnoreCase("FAQ"))
         {
            getDriver()
               .findElement(
                  org.openqa.selenium.By.xpath("//div[starts-with(@class,'menu-mediaContent')]//div[@class='innerContent']//a[@id='SelectAudioDivID']"))
               .click();
         }
         else if (moduleName.contains("FAQconfiguration"))
         {
            int elementValue = faqConfigurationElement(moduleName);
            getDriver()
               .findElement(
                  org.openqa.selenium.By
                     .xpath("//div[starts-with(@class,'menu-mediaContent')]//div[@class='innerContent']//a[@id='SelectAudioDivID_" + elementValue + "']"))
               .click();
         }
         break;

      case "Video":
         if (moduleName.equalsIgnoreCase("FAQ"))
         {
            getDriver()
               .findElement(
                  org.openqa.selenium.By.xpath("//div[starts-with(@class,'menu-mediaContent')]//div[@class='innerContent']//a[@id='SelectVideoDivID']"))
               .click();
         }
         else if (moduleName.contains("FAQconfiguration"))
         {
            int elementValue = faqConfigurationElement(moduleName);
            getDriver()
               .findElement(
                  org.openqa.selenium.By
                     .xpath("//div[starts-with(@class,'menu-mediaContent')]//div[@class='innerContent']//a[@id='SelectVideoDivID_" + elementValue + "']"))
               .click();
         }
         break;
      }

   }

   /**
    * @Description:Element Values based on modules
    * @param
    * @return : void
    * @exception :
    * @Created_by : Raghuram
    */
   public int faqConfigurationElement(String moduleName)
   {
      int elementValue = 0;

      if (moduleName.equalsIgnoreCase("FAQconfiguration-WelcomeMessage"))
      {
         elementValue = 1;
      }
      else if (moduleName.equalsIgnoreCase("FAQconfiguration-GlobalFallbackMessage"))
      {
         elementValue = 2;
      }
      return elementValue;
   }

   public void chooseResponsecards(String responseType, String cardName)
   {
      switch (responseType)
      {
      case "RichTextMessage":
         getDriver()
            .findElement(
               org.openqa.selenium.By
                  .xpath(
                     "//div[@class='col-sm-8 draft-rev grid']//input[@name='addmessageCardId']//..//div[@class='item-holder cover grid-item']//h3[text()='"
                        + cardName + "']//..//div[@class='col-sm-12 text-center']"))
            .click();
         break;

      case "Message":
         getDriver()
            .findElement(
               org.openqa.selenium.By
                  .xpath(
                     "//div[@class='col-sm-8 draft-rev grid']//input[@name='addmessageId']//..//div[@class='item-holder cover grid-item']//h3[text()='"
                        + cardName + "']//..//div[@class='col-sm-12 text-center']"))
            .click();
         break;

      case "Image":
         getDriver()
            .findElement(
               org.openqa.selenium.By
                  .xpath(
                     "//div[@class='col-sm-8 draft-rev grid']//input[@name='addImageMessageId']//..//div[@class='item-holder cover grid-item']//h3[text()='"
                        + cardName + "']//..//div[@class='col-sm-12 text-center']"))
            .click();
         break;

      case "Audio":
         getDriver()
            .findElement(
               org.openqa.selenium.By
                  .xpath(
                     "//div[@class='col-sm-8 draft-rev grid']//input[@name='addAudioMessageId']//..//div[@class='col-xs-8']//h3[text()='" + cardName
                        + "']//..//..//..//div[@class='col-sm-12 text-center']"))
            .click();
         break;

      case "Video":
         getDriver()
            .findElement(
               org.openqa.selenium.By
                  .xpath(
                     "//div[@class='col-sm-9 draft-rev grid BroadcastCardHold']//input[@name='addVideoMessageId']//..//div[@class='item-holder cover grid-item mov-fdr']//h3[text()='"
                        + cardName + "']//..//div[@class='col-sm-12 text-center']"))
            .click();
         break;
      }
      String responseAddItembtn = chooseResponsecardsADDbtn(responseType);
      getDriver().findElement(org.openqa.selenium.By.xpath("//input[@id='" + responseAddItembtn + "']")).click();
   }

   public String chooseResponsecardsADDbtn(String responseType)
   {
      String responseTypeid = "123";
      if (responseType.equalsIgnoreCase("RichTextMessage"))
      {
         responseTypeid = "ConfirmAddBtnId";
      }
      else if (responseType.equalsIgnoreCase("Message"))
      {
         responseTypeid = "" + responseType + "ConfirmAddBtnId";
      }
      else if (responseType.equalsIgnoreCase("Image") || responseType.equalsIgnoreCase("Video") || responseType.equalsIgnoreCase("Audio"))
      {
         responseTypeid = "Confirm" + responseType + "AddBtnId";
      }
      return responseTypeid;
   }

   /**
    * public void textCountUNit() { CommonUtils.waitForSeconds(5);
    * 
    * int aft = element.size(); Log.info(aft); for(int i=0; i<=aft; i++) { String aft1 = element.get(i).getText(); if(aft1.length() != 0) { Log.info(aft1); } }
    * CommonUtils.waitForSeconds(30); }
    **/

   public void newExFile(String fileNamesample) throws IOException
   {
      // Blank Workbook
      XSSFWorkbook workbook = new XSSFWorkbook();

      // Create a new File
      FileOutputStream newFile = new FileOutputStream(new File(fileNamesample));

      // Create a New Sheet
      XSSFSheet pageSheet = workbook.createSheet("AutoPage1");
      // workbook.write(newFile);

      // Getting the lsit Size
      List<WebElement> ListSize = getDriver().findElements(By.xpath("//*[contains(.,.)]"));
      int Size = ListSize.size();
      Log.info(Size);

      // Getting the list text
      WebElement TextContains = getDriver().findElement(By.xpath("//*[contains(.,.)]"));
      String TextName = TextContains.getText();
      Log.info(TextName);

      // String[][] data = new String[Size][2];
      String[] splitted = TextName.split("\\s+");

      int i = 1;
      int j = 1;
      Log.info("Splitted =", splitted.length);

      for (String p : splitted)
      {
         Row row = pageSheet.createRow(i);
         Cell cell = row.createCell(j);
         // Set value into cell
         if (p.length() > 1)
         {
            cell.setCellValue(p);
         }
         i++;
      }
      workbook.write(newFile);
      System.out.println("SSS");

      //

      getDriver().findElement(org.openqa.selenium.By.xpath("//a[@class='English']")).click();
      CommonUtils.waitForSeconds(3);
      getDriver().findElement(org.openqa.selenium.By.xpath("//a[@class='Chinese ']")).click();

      // Create a New Sheet
      XSSFSheet pageSheet1 = workbook.createSheet("AutoPage2");

      // Getting the lsit Size
      List<WebElement> ListSize2 = getDriver().findElements(By.xpath("//*[contains(.,.)]"));
      int Size2 = ListSize2.size();
      Log.info(Size2);

      // Getting the list text
      WebElement TextContains2 = getDriver().findElement(By.xpath("//*[contains(.,.)]"));
      String TextName2 = TextContains2.getText();
      Log.info(TextName2);

      // String[][] data = new String[Size][2];
      String[] splitted2 = TextName2.split("\\s+");

      int i2 = 1;
      int j2 = 2;
      Log.info("Splitted =", splitted2.length);

      for (String p2 : splitted2)
      {
         Row row = pageSheet1.createRow(i2);
         Cell cell = row.createCell(j2);
         // Set value into cell
         if (p2.length() > 1)
         {
            cell.setCellValue(p2);
         }
         i2++;
      }
      FileOutputStream newFile1 = new FileOutputStream(new File(fileNamesample));
      workbook.write(newFile1);
      System.out.println("RRR");

   }

   /////////////////////////////////////////////////////////////////////
   /**
    * public void textCountUNit(String fileNamesample) throws IOException { // Blank Workbook @SuppressWarnings("resource") XSSFWorkbook workbook = new
    * XSSFWorkbook(); // OutputStream os = new FileOutputStream("Localization.xlsx");
    * 
    * // Create Blank Sheet XSSFSheet sheet = workbook.createSheet("PageDetails");
    * 
    * List<WebElement> ListSize = getDriver().findElements(By.xpath("//p[contains(.,.)]")); int Size = ListSize.size(); Log.info(Size);
    * 
    * WebElement TextContains = getDriver().findElement(By.xpath("//p[contains(.,.)]"));
    * 
    * //WebElement TextContains = List; String TextName = TextContains.getText();
    * 
    * //String[][] data = new String[Size][2]; String[] splitted = TextName.split("\\s+");
    * 
    * int j = 1; int i = 1; Log.info("Splitted =", splitted.length);
    * 
    * for (String p : splitted) { Row row = sheet.createRow(i); Cell cell = row.createCell(j); // Set value into cell if (p.length() > 1) {
    * cell.setCellValue(p); } i++; } try { // this Writes the workbook gfgcontribute FileOutputStream out = new FileOutputStream(new File(fileNamesample));
    * workbook.write(out); out.close(); System.out.println("july24.xlsx written successfully on disk."); } catch (Exception e) { e.printStackTrace(); }
    * 
    * 
    * 
    * }
    **/
   /////////////////////////////////////////////////////////////////////////////
}
