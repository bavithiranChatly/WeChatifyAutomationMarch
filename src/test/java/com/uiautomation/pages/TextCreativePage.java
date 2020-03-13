package com.uiautomation.pages;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

//import com.wechatify.enums.LanguageType;
//import com.wechatify.utils.Constants;

//import jline.internal.Log;

import com.uiautomation.utils.CommonUtils;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;

public class TextCreativePage extends CommonPage

{
   public String urlname;

   @FindBy(css = "body > section > section > div.containerTabs.ForExtraMargin > div.row > div > p")
   private WebElement TextContentPageHeader;

   // Text card Title name
   @FindBy(css = "input#Title.form-control.text-box.single-line")
   private WebElement textcardtitle;

   // Text card Message
   @FindBy(xpath = "//div[@id='contenteditableDiv']") //#contenteditableDiv - instead can use this also 
   private WebElement textdescription;

   // Text card Title name_Translated_Content
   @FindBy(css = "#TransTitle.form-control.text-box.single-line")
   private WebElement textcardtitle_t;

   // Text card Message_Translated_Content
   @FindBy(xpath = "//div[@contenteditable='true']")
   private WebElement textdescription_t;

   // Text card Message_Translated_Content
   @FindBy(xpath = "//a[@class='copy-cont']")
   private WebElement useExistingcontent;

   // Add Link in Description
   @FindBy(xpath = "//*[@id='linkAdd']")
   private WebElement addlink;

   // Add Link Translation in Description
   @FindBy(xpath = "//*[@id='linkAddn']")
   private WebElement addlink_t;

   // Add button in url popup
   @FindBy(xpath = "//*[@id='addup']")
   private WebElement addButton;

   // Add button in url popup
   @FindBy(xpath = "//*[@id='addupn']")
   private WebElement addButton_t;

   // Link - url
   @FindBy(xpath = "//*[@id='fr-link-insert-layer-url']")
   private WebElement link;

   @FindBy(xpath = "//*[@id=\"fr-link-insert-layer-text\"]")
   private WebElement linktextcontent;

   // Link - url - Translate
   @FindBy(xpath = "//*[@id='fr-link-insert-layer-urln']")
   private WebElement link_t;

   @FindBy(xpath = "//*[@id='fr-link-insert-layer-textn']")
   private WebElement linktextcontent_t;

   // Text card Folder option
   @FindBy(css = "select#OriginalFolderID.form-control.valid")
   private WebElement folderDropdown;

   // Text card Save button
   @FindBy(xpath = "//div[@class='row']//input[@value='Save']")
   private WebElement saveButton;

   @FindBy(css = "#FormTextId > div > div > div > div > div.col-lg-12 > div > div.col-md-11.col-sm-11 > div > input:nth-child(4)")
   private WebElement saveandcloseBtn;

   @FindBy(xpath = "//*[@id='insertTag']")
   private WebElement insertTag;
   // Translate - Tag for Link
   @FindBy(xpath = "//*[@id='insertTagn']")
   private WebElement insertTag_t;

   // Validaton errors
   @FindBy(css = "#Title-error")
   private WebElement TextTitleValidationError; // Title Error Message

   @FindBy(css = "#TransTitle-error")
   private WebElement TranslateTextTitleValidationError; // TranslateTitle Error Message

   @FindBy(xpath = "//*[@id='FormTextId']/div/div/div/div/div[1]/div/div/div/div/div/div[2]/span")
   private WebElement TextDescValidationError; // Description Error Message

   @FindBy(xpath = "//*[@id='FormTextId']/div/div/div/div[3]/div[2]/div/div[2]/div/div/div/div[2]/span")
   private WebElement TranslateTextDescValidationError; // TranslationDescription Error Message

   @FindBy(xpath = "//*[@id=\"FormTextId\"]/div/div/div/div/div[2]/div/div[2]/div/input[5]")
   private WebElement mvetodraftreview; // Move to Draft

   @FindBy(xpath = "//*[@id=\"PreviewBtnIdn\"]") // div[@class='form-group text-right']//input[@value='Preview']
   private WebElement previewclick; // pr

   @FindBy(css = "//div[contains(@class ,'item-holder')]//span[contains(text(),'IPL')]/../../../..//div[2]//a[@title='Edit']")
   private WebElement editclickk; // Editclick

//   @FindBy(xpath = "//div[@class='form-group text-right']//input[@value='Notify to User']") //// div[@class='row ']//input[@value='Notify to User']
//   private WebElement notifyTOuser; // notifyTOuser Button

   @FindBy(xpath = "//*[@id=\"FormTextId\"]/div/div/div/div/div[2]/div/div[1]/div/a")
   private WebElement backtoList; // BackToList

   @FindBy(css = "//div[contains(@class ,'item-holder')]//span[contains(text(),'chennai')]/../../../../../..//div[1]//a[@title='Delete']") // - Creatives Text
                                                                                                                                           // card delete button
   private WebElement deleteclick; // Deleteclick

   @FindBy(css = "//div[contains(@class ,'item-holder')]//span[contains(text(),'chennai')]/../../../../../..//div[1]//a[@title='Move to drafts review']") // -                                                                                                                                                       // button
   private WebElement movetodraftreview; // MovetoDraftReview

   /** The tag dropdown. */
   @FindBy(css = "#PartialTagId_chosen")
   private WebElement tagDropdown;

   /** The tag search dropdown. */
   @FindBy(css = "#PartialTagId_chosen .chosen-search>input")
   private WebElement tagSearchDropdown;

   /** The tag dropdown options. */
   @FindBy(css = "#PartialTagId_chosen .chosen-results>li")
   private List<WebElement> tagDropdownOptions;

   /** The add tag button. */
   @FindBy(xpath = "//*[@id='SubmitAttributes']")
   private WebElement addTagButton;

   // Create new tag

   /** The add tag category dropdown. */
   @FindBy(css = "div#PartialParentTagId_chosen")
   private WebElement addTagCategoryDropdown;

   /** The ad tag category options. */
   @FindBy(css = "#PartialParentTagId_chosen .chosen-results li")
   private List<WebElement> adTagCategoryOptions;

   /** The ad tag nametx bx. */
   @FindBy(css = "input#PartialchildTagName")
   private WebElement adTagNametxBx;

   /** The partial strength tag. */
   @FindBy(css = "input#PartialStrengthTag")
   private WebElement partialStrengthTag;

   /** The member shipcard chosen dropdown. */
   @FindBy(css = "#PartialMembershipcard_chosen")
   private WebElement memberShipcardChosenDropdown;

   @FindBy(css = "#PartialMembershipcard_chosen .chosen-results li")
   private List<WebElement> membershipCardOptions;

   /** The tag ponits. */
   @FindBy(css = "input#PartialPoints")
   private WebElement tagPonitsTxBx;

   /** The add tag save button. */
   @FindBy(id = "PartialaddTag")
   private WebElement addTagSaveButton;

   /** The category name tx bx. */
   @FindBy(id = "PartialParentTagName")
   private WebElement categoryNameTxBx;

   public boolean isTextContentPageHeaderDisplayed(String textheading)
   {
      waitFor(TextContentPageHeader);
      String titleheader = TextContentPageHeader.getText();
      return titleheader.equals(textheading);
   }

   public void textcontent(final String texttitleuniquename, final String message, String NormOrTrans)
   {
      if (NormOrTrans.equalsIgnoreCase("Normal"))
      {
         textcardtitle.clear();
         textcardtitle.sendKeys(texttitleuniquename);
         textdescription.clear();
         textdescription.sendKeys(message);
      }
      else if (NormOrTrans.equalsIgnoreCase("Trans"))
      {
         textcardtitle_t.clear();
         textcardtitle_t.sendKeys(texttitleuniquename);
         textdescription_t.clear();
         textdescription_t.sendKeys(message);
      }
      else if (NormOrTrans.equalsIgnoreCase("Trans-existingcontent"))
      {
         textcardtitle_t.clear();
         textcardtitle_t.sendKeys(texttitleuniquename);
         textdescription_t.clear();
         useExistingcontent.click();
         String copiedText = textdescription_t.getText();
         String originalText = textdescription.getText();
         assertThat("Verify Original and Translation Text Content:", copiedText, equalTo(originalText));
      }

   }

   public void descLink(final String url, final String urluniquename, String OrigOrTrans)
   {

      if (OrigOrTrans.equalsIgnoreCase("Original"))
      {
         link.clear();
         link.sendKeys(url);
         linktextcontent.clear();
         linktextcontent.sendKeys(urluniquename);
         urlname = urluniquename;
         CommonUtils.waitForSeconds(1);
         addButton.click();
      }
      if (OrigOrTrans.equalsIgnoreCase("Translate"))
      {
         link_t.clear();
         link_t.sendKeys(url);
         linktextcontent_t.clear();
         linktextcontent_t.sendKeys(urluniquename);
         urlname = urluniquename;;
         CommonUtils.waitForSeconds(1);
         addButton_t.click();
      }
   }

   public void navigateToFolderByName(String folderName)
   {
      getDriver().findElement(By.xpath("//span[text()='" + folderName + "']")).click();
      CommonUtils.waitForSeconds(5);
   }

   public boolean isNavigatedToFolder(String folderName)
   {

      return getDriver().findElement(By.xpath("//span[text()='" + folderName + "']//following-sibling::span")).isDisplayed();

   }

   public void selectFolderByName(String folderName)
   {
      ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", folderDropdown);
      folderDropdown.click();
      getDriver().findElement(org.openqa.selenium.By.xpath("//ul[@class='chosen-results']/li[text()='" + folderName + "']")).click();
   }

   // Save Button
   public void clickTextSaveBtn()
   {
      saveButton.click();
   }

   public void clickCreativeSaveandcloseBtn() // New for Save and Close
   {
      saveandcloseBtn.click();
      CommonUtils.waitForSeconds(13);
   }

   public String getTextTitleValidationError()
   {
      waitFor(TextTitleValidationError);
      return TextTitleValidationError.getText();
   }

   public String getTextDescValidationError()
   {
      waitFor(TextDescValidationError);
      return TextDescValidationError.getText();
   }

   public void getTransTextTitleValidationError(String TextTitleErrorMsg, String msgType)
   {
      // waitFor(TextTitleValidationError);
      String a = TranslateTextTitleValidationError.getText();
      assertThat("Verify title validation error:", a, equalTo(TextTitleErrorMsg));
   }

   public String getTransTextDescValidationError(String TextTitleErrorMsg, String msgType)
   {
      waitFor(TextDescValidationError);
      return TranslateTextDescValidationError.getText();
   }

   public void previewclick()
   {
      previewclick.click();
   }

   public void editclickk(String EditTitleName)
   {
      getDriver()
         .findElement(
            org.openqa.selenium.By
               .xpath("//div[@class='item-holder sub grid-item mov-fdr']//span[text()='" + EditTitleName + "']/../../../..//div[1]//a[@title='Edit']"))
         .click();

   }

   public void viewclickk(String texttitleuniquename)
   {
      getDriver()
         .findElement(
            org.openqa.selenium.By
               .xpath("//div[contains(@class ,'item-holder')]//span[contains(text(),'" + texttitleuniquename + "')]/../../../..//div[2]//a[@title='View']"))
         .click();

   }

   public void contextclick(String OrgOrTrans)
   {

      if (OrgOrTrans.equalsIgnoreCase("Org"))
      {
         // Right click the button to launch right click menu options // //div[@contenteditable='true']
         Actions TextPage = new Actions(getDriver());
         TextPage.contextClick(textdescription).perform();
         CommonUtils.waitForSeconds(2);
         addlink.click();
      }
      else if (OrgOrTrans.equalsIgnoreCase("Trans"))
      {
         Actions TextPage = new Actions(getDriver());
         TextPage.contextClick(textdescription_t).perform();
         CommonUtils.waitForSeconds(2);
         addlink_t.click();
      }

   }

   // Move to draft review
   public void movetodraftreview()
   {
      mvetodraftreview.click();
   }

   // bacKtoLoist Button
   public void backtoList()
   {
      backtoList.click();
   }

   // notifyToUser Button
   @Override
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
   public void deleteicon(String texttitleuniquename)
   {
      getDriver()
         .findElement(
            org.openqa.selenium.By
               .xpath("//div[contains(@class ,'item-holder')]//span[contains(text(),'" + texttitleuniquename + "')]/../../../../../div[1]//a[@title='Delete']"))
         .click();
      CommonUtils.waitForSeconds(3);
      getDriver().findElement(org.openqa.selenium.By.xpath("//*[@id=\"deletepopformId\"]/input[7]")).click();
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : raghuram
    */
   public void clickRedirectionText()
   {
      CommonUtils.waitForSeconds(7);
      getDriver().findElement(org.openqa.selenium.By.xpath("//div[@class='emoji-wysiwyg-editor']//a[text()='" + urlname + "']")).click();
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : raghuram
    */
   public void instertagIcon(String OrigOrTrans)
   {
      if (OrigOrTrans.equalsIgnoreCase("Original"))
      {
         insertTag.click();
      }
      else if (OrigOrTrans.equalsIgnoreCase("Translate"))
      {
         insertTag_t.click();
      }
   }

   public void selectTagFromDropdown(String tagName)
   {
      waitFor(tagDropdown);
      tagDropdown.click();
      tagSearchDropdown.clear();
      tagSearchDropdown.sendKeys(tagName);
      CommonUtils.waitForSeconds(3);
      tagDropdownOptions.get(0).click();
      addTagButton.click();
      CommonUtils.waitForSeconds(2);
   }

   public void selectAddNewTagFromDropdown()
   {
      waitFor(tagDropdown);
      tagDropdown.click();
      CommonUtils.waitForSeconds(2);
      tagDropdownOptions.get(1).click();
   }

   public void selectAddNewCategoryFromDropdown()
   {
      waitFor(addTagCategoryDropdown);
      addTagCategoryDropdown.click();
      CommonUtils.waitForSeconds(2);
      adTagCategoryOptions.get(1).click();
   }

   private void createAdTagWithCategory(String tagName, String tagStrength, String memberShip, String points)
   {
      adTagNametxBx.clear();
      adTagNametxBx.sendKeys(tagName);
      partialStrengthTag.clear();
      partialStrengthTag.sendKeys(tagStrength);
      memberShipcardChosenDropdown.click();
      CommonUtils.selectOptionByText(membershipCardOptions, memberShip);
      tagPonitsTxBx.clear();
      tagPonitsTxBx.sendKeys(points);
      addTagSaveButton.click();
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : raghuram
    */
   public void createTagWithNewCategory(String tagCategory, String tagName, String tagStrength, String memberShip, String points)
   {
      // Log.info("Selecting Tag category with Name:" + tagCategory);
      // CommonUtils.selectOptionByText(adTagCategoryOptions, "add new category");
      CommonUtils.waitForSeconds(2);
      categoryNameTxBx.sendKeys(tagCategory);
      // CommonUtils.selectOptionByText(adTagCategoryOptions, tagCategory);
      createAdTagWithCategory(tagName, tagStrength, memberShip, points);
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : raghuram
    */
   public void clickAddTagButton()
   {
      waitFor(addTagButton);
      addTagButton.click();
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : raghuram
    */
   public void createTagWithExistingCategory(String tagCategory, String tagName, String tagStrength, String memberShip, String points)
   {
      // Log.info("Selecting Tag category with Name:" + tagCategory);
      waitFor(addTagCategoryDropdown);
      addTagCategoryDropdown.click();
      CommonUtils.selectOptionByText(adTagCategoryOptions, tagCategory);
      createAdTagWithCategory(tagName, tagStrength, memberShip, points);
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : raghuram
    */
   public void deleteAll()
   {
      List<WebElement> totalcount = getDriver().findElements(By.xpath("//a[@title='Delete']"));
      int ii = totalcount.size();

      for (int i = 1; i <= ii; i++)
      {
         getDriver().findElement(By.xpath("//a[@title='Delete']")).click();
         CommonUtils.waitForSeconds(3);
         getDriver().findElement(org.openqa.selenium.By.xpath("//*[@id='deletepopformId']/input[7]")).click();
         CommonUtils.waitForSeconds(3);
      }
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : raghuram
    */
   public void clickCreativeSaveTextBtn()
   {
      // CommonUtils.waitForSeconds(5);
      saveButton.click();
      CommonUtils.waitForSeconds(3);
   }

   public void selectingForwardtype(String forwardType)
   {
      getDriver()
         .findElement(By.xpath("//div[@class='item-holder sub grid-item mov-fdr']//span[text()='dsds']/../../../..//div//a[@title='" + forwardType + "']"))
         .click();
   }

}
