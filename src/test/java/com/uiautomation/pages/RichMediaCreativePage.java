/*
 * Copyright (C) 2019 Wechatify.com, Inc. All Rights Reserved.
 * Proprietary and confidential.
 */

package com.uiautomation.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.uiautomation.utils.CommonUtils;
import com.wechatify.enums.LanguageType;

import jline.internal.Log;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;

// TODO: Auto-generated Javadoc
/**
 * The Class RichMediaCreativesPage.
 */
public class RichMediaCreativePage extends CommonPage
{

   /** The creativepage top menus. */
   @FindBy(css = "li#Broadcastcreatives>a, #BroadcastLibrary a")
   private List<WebElement> creativepageTopMenus;

   /** The creative header. */
   @FindBy(css = "li#Broadcastcreatives>a")
   private WebElement creativeHeader;

   /** The library header. */
   @FindBy(css = "#BroadcastLibrary a")
   private WebElement libraryHeader;

   /** The creative sub tabs. */
   // @FindBy(css = "#creativeDivSubId > li.creativeSub > a")
   @FindBy(xpath = "//*[@id='creativeDivSubId']/li/a")
   private List<WebElement> creativeSubTabs;

   /** The creative types. */
   @FindBy(css = ".add-msg li a")
   private List<WebElement> creativeTypes;

   /** The rtm types. */
   @FindBy(css = "#rtmType>label")
   private List<WebElement> rtmTypes;

   /** The rtm content page header. */
   @FindBy(css = "div.DraftFormColumn p.content")
   private WebElement rtmContentPageHeader;

   /** The rtm content name tx bx. */
   @FindBy(css = "div.form-title input#Title")
   private WebElement rtmContentNameTxBx;

   /** The rtm author name tx bx. */
   @FindBy(css = "input#Author")
   private WebElement rtmAuthorNameTxBx;

   /** The rtm body content tx bx. */
   @FindBy(css = "#edui415_content")
   private WebElement rtmBodyContentTxBx;

   /** The language chinese radio. */
   @FindBy(css = "input#LanguageChinese")
   private WebElement languageChineseRadio;

   /** The language english radio. */
   @FindBy(css = ".custom_radio:nth-child(2) > .radio_on_off")
   private WebElement languageEnglishRadio;

   @FindBy(css = "#TextLink_checkbox")
   private WebElement textLinkCheckbox;

   @FindBy(css = "body > p")
   // @FindBy(css =".body-mask")
   private WebElement contentBodyText;

   @FindBy(xpath = "//*[@id='ImgModal']/div/div/div[3]/button[1]")
   private WebElement uploadRichMediaContentButton;
   
   @FindBy(xpath = "//*[@id='ImgModalone']/div/div/div[3]/button[1]")
   private WebElement uploadRichMediaContentButtonTranslationPage;
   
   
   
   @FindBy(css = "button#origSetImage")
   private WebElement contentBodyImageIcon;
   
   @FindBy(css = "button#transSetImage")
   private WebElement translateContentBodyImageIcon;
   
   @FindBy(css = "button#transSetVideo")
   private WebElement translateContentBodyVideoIcon;
   
   @FindBy(css = "button#transVideo")
   private WebElement translateContentBodyQRCodeIcon;

   @FindBy(xpath = "(//*[@id=\"origSetVideo\"])[1]")
   private WebElement contentBodyVideoIcon;

   @FindBy(css = "(//*[@id=\"origSetVideo\"])[1]")
   private WebElement contentBodyQRCodeIcon;

   /** The rtm title tx bx. */
   @FindBy(css = "input#Title[type='text']")
   private WebElement rtmTitleTxBx;

   /** The rtm text link tx bx. */
   @FindBy(css = "input#TextLink")
   private WebElement rtmTextLinkTxBx;

   /** The content page note text. */
   @FindBy(css = "p.warningTxt")
   private WebElement contentPageNoteText;

   /** The rich media type list. */
   @FindBy(css = "#rtmType>label")
   private List<WebElement> richMediaTypeList;

   /** The rtm body. */
   @FindBy(id = "edui1_iframeholder > div.body-mask")
   private WebElement rtmBody;

   /** The rtm summary. */
   @FindBy(css = "textarea#Description")
   private WebElement rtmSummary;

   /** The rtm image. */
   @FindBy(css = "button#origSetImage")
   private WebElement rtmImage;

   /** The rtm video. */
   @FindBy(css = "button#origSetVideo[data-target=\"#VideoUrlModal\"]")
   private WebElement rtmVideo;

   /** The rtm static QR code. */
   @FindBy(css = "button#origSetVideo[data-target=\"#ImgModal\"]")
   private WebElement rtmStaticQRCode;

   /** The rtm upload button. */
   @FindBy(id = "CoverImagePicDropZone")
   private WebElement rtmUploadButton;

   /** The login btn. */
   @FindBy(css = "[onclick='validateForm()']")
   private WebElement loginBtn;

   /** The save btn. */
   @FindBy(css = "input[value='Save']")
   private WebElement saveBtn;

   /** The jump link btn. */
   @FindBy(css = "#rtmType>label[for=\"JumpLinkRTM\"]")
   private WebElement jumpLinkBtn;

   /** The content btn. */
   @FindBy(css = "#rtmType>label[for=\"ContentRTM\"]")
   private WebElement contentBtn;

   /** The jump link content present. */
   @FindBy(css = "div.selJumpLinkContent h3")
   private WebElement jumpLinkContentPresent;

   @FindBy(css = "#FormDraftId p.content")
   private WebElement contentTextPresent;

   /** The user email tx bx. */
   @FindBy(id = "Email")
   private WebElement userEmailTxBx;

   /** The user password tx bx. */
   @FindBy(id = "Password")
   private WebElement userPasswordTxBx;

   /** The upload button. */
   @FindBy(css = "#CoverImagePicDropZone > button")
   private WebElement uploadButton;

   /** The jump link upload image. */
   @FindBy(css = "img#CoverImageId")
   private WebElement jumpLinkUploadImage;

   /** The save imagae button. */
   @FindBy(css = "[onclick=\"saveCroppedImg()\"]")
   private WebElement saveImagaeButton;

   /** The uploaded image icon. */
   @FindBy(css = "img#CoverImageId")
   private WebElement uploadedImageIcon;

   /** The upload iamge tool tip btn. */
   @FindBy(xpath = "//*[@id=\"CoverImagePicDropZone\"]/span[1]/em[2]")
   private WebElement uploadIamgeToolTipBtn;

   /** The upload image tool tip text. */
   @FindBy(xpath = "*//div[contains(@id,'popover')]")
   private WebElement uploadImageToolTipText;

   /** The creative list. */
   @FindBy(css = "div.item-holder h3")
   private List<WebElement> creativeList;

   /** The move to next page. */
   @FindBy(css = ".PagedList-skipToNext a")
   private WebElement moveToNextPage;

   /** The parent of move to next page. */
   @FindBy(xpath = "//*[contains(@class,'PagedList-skipToLast')]/a/..")
   private WebElement parentOfMoveToNextPage;

   /** The content inner page header. */
   @FindBy(css = ".containerTabs p.content")
   private WebElement contentInnerPageHeader;

   /** The folder dropdown. */
   @FindBy(id = "Message_FolderId_chosen")
   private WebElement folderDropdown;

   /** The back to creative list page. */
   @FindBy(xpath = "//a[text()='Back to list']")
   private WebElement backToCreativeListPage;

   /** The add tag button. */
   // create tag
   @FindBy(css = "input#assignTag")
   private WebElement addTagButton;

   /** The tag dropdwon label. */
   @FindBy(xpath = "//*[@id=\"PartialdivTagMenu\"]/div/label")
   private WebElement tagDropdwonLabel;

   /** The tag dropdown. */
   @FindBy(css = "#PartialTagId_chosen")
   private WebElement tagDropdown;

   /** The tag search dropdown. */
   @FindBy(css = "#PartialTagId_chosen .chosen-search>input")
   private WebElement tagSearchDropdown;

   /** The tag dropdown options. */
   @FindBy(css = "#PartialTagId_chosen .chosen-results>li")
   private List<WebElement> tagDropdownOptions;

   /** The cancel tag button. */
   @FindBy(css = "#AddDataAttribute #DeleteCancelButtonUrl")
   private WebElement cancelTagButton;

   /** The save tag button. */
   @FindBy(css = "input#SubmitAttributes")
   private WebElement saveTagButton;

   /** The addedtag position to rich media. */
   @FindBy(css = "span#TextLinkTagIdSpan")
   private WebElement addedtagPositionToRichMedia;

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

   /** The membership card options. */
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

   @FindBy(css = "span#htmlBodyValid")
   private WebElement richMediaContentBodyValidationError;

   public String getRichMediaBodyValidationError()
   {
      return richMediaContentBodyValidationError.getText();
   }

   /**
    * Creates the tag with existing category.
    *
    * @param tagCategory
    *           the tag category
    * @param tagName
    *           the tag name
    * @param tagStrength
    *           the tag strength
    * @param memberShip
    *           the member ship
    * @param points
    *           the points
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public void createTagWithExistingCategory(String tagCategory, String tagName, String tagStrength, String memberShip, String points)
   {
      Log.info("Selecting Tag category with Name:" + tagCategory);
      waitFor(addTagCategoryDropdown);
      addTagCategoryDropdown.click();
      CommonUtils.selectOptionByText(adTagCategoryOptions, tagCategory);
      createAdTagWithCategory(tagName, tagStrength, memberShip, points);
   }

   /**
    * Creates the tag with new category.
    *
    * @param tagCategory
    *           the tag category
    * @param tagName
    *           the tag name
    * @param tagStrength
    *           the tag strength
    * @param memberShip
    *           the member ship
    * @param points
    *           the points
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public void createTagWithNewCategory(String tagCategory, String tagName, String tagStrength, String memberShip, String points)
   {
      Log.info("Selecting Tag category with Name:" + tagCategory);
      waitFor(addTagCategoryDropdown);
      addTagCategoryDropdown.click();
      adTagCategoryOptions.get(1).click();
      // CommonUtils.selectOptionByText(adTagCategoryOptions, "add new category");
      CommonUtils.waitForSeconds(2);
      categoryNameTxBx.sendKeys(tagCategory);
      createAdTagWithCategory(tagName, tagStrength, memberShip, points);
   }

   /**
    * Creates the ad tag with category.
    *
    * @param tagName
    *           the tag name
    * @param tagStrength
    *           the tag strength
    * @param memberShip
    *           the member ship
    * @param points
    *           the points
    * @created_by : narot
    * @created_on: 10 May, 2019 10:18:17 PM
    */
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

   /** The title validation error. */
   // Validator errors
   @FindBy(css = "#Title-error")
   private WebElement titleValidationError;

   /** The text link validation error. */
   @FindBy(id = "TextLink-error")
   private WebElement textLinkValidationError;

   /** The add tag validation error. */
   @FindBy(css = "p#textlinkValid")
   private WebElement addTagValidationError;

   /** The upload no image validation error. */
   @FindBy(css = "p#CoverImageValidationId")
   private WebElement uploadNoImageValidationError;

   /** The upload image validation error. */
   @FindBy(css = "#AlertInfo")
   private WebElement uploadImageValidationError;

   /** The auther tx bx validator error. */
   @FindBy(css = "#Author-error")
   private WebElement autherTxBxValidatorError;

   /** The save and close btn. */
   @FindBy(css = "[value='Save & Close']")
   private WebElement saveAndCloseBtn;

   /** The notify to user btn. */
   @FindBy(css = "[value='Notify to User']")
   private WebElement notifyToUserBtn;

   /** The submit for draft review btn. */
   @FindBy(css = "[value='Submit for Draft Review']")
   private WebElement submitForDraftReviewBtn;

   /** The submit for transalation btn. */
   @FindBy(css = "[value='Submit for Translation']")
   private WebElement submitForTransalationBtn;

   /** The preview btn. */
   @FindBy(xpath = "(//input[@value=\"Preview\"])[2]")
   private WebElement previewBtn;

   /** The draf review page header. */
   @FindBy(xpath = "//*[@id='FormDraftReviewId']/div[1]/div[2]/div/p")
   private WebElement drafReviewPageHeader;

   /** The translation page header list. */
   @FindBy(css = "#FormTranslateId > div p.content")
   private List<WebElement> translationPageHeaderList;

   /** The translation page title tx bxs. */
   // Rich media translation page
   @FindBy(css = "div.form-title input")
   private List<WebElement> translationPageTitleTxBxs;

   /** The text link orginal txt. */
   @FindBy(css = "input#TextLink")
   private WebElement textLinkOrginalTxt;

   /** The content descrption orginal txt. */
   @FindBy(css = "textarea#Description")
   private WebElement contentDescrptionOrginalTxt;

   /** The content descrption translated txt. */
   @FindBy(css = "textarea#TransDescription")
   private WebElement contentDescrptionTranslatedTxt;

   /** The translation orginal page upload btn. */
   @FindBy(css = "div#CoverImagePicDropZone span.profileFileUpload")
   private WebElement translationOrginalPageUploadBtn;

   /** The translation translated page upload btn. */
   @FindBy(css = "div#TransCoverImagePicDropZone button.profileFileUpload")
   private WebElement translationTranslatedPageUploadBtn;

   /** The translation link ad url button. */
   @FindBy(css = "#linkAddn")
   private WebElement translationLinkAdUrlButton;

   /** The translation url tx bx. */
   @FindBy(css = "#fr-link-insert-layer-urln")
   private WebElement translationUrlTxBx;

   /** The translation url text tx bx. */
   @FindBy(css = "#fr-link-insert-layer-textn")
   private WebElement translationUrlTextTxBx;

   /** The translation url save btn. */
   @FindBy(css = ".fr-command.fr-submit.addn")
   private WebElement translationUrlSaveBtn;

   /** The text link translated txt. */
   @FindBy(css = "input#TransTextLink")
   private WebElement textLinkTranslatedTxt;

   /** The aded translation page url text. */
   @FindBy(css = "#contenteditableDiv a")
   private WebElement adedTranslationPageUrlText;

   /**
    * Select creative types by name.
    *
    * @param creativeName
    *           the creative name
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public void selectCreativeTypesByName(String creativeName)
   {
      waitFor(creativeTypes.get(0));
      for (WebElement creative : creativeTypes)
      {
         if (creative.getText().toLowerCase().contains(creativeName.toLowerCase()))
         {
            creative.click();
            break;
         }
      }
   }

   /**
    * Checks if is creative header displayed.
    *
    * @return true, if is creative header displayed
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public boolean isCreativeHeaderDisplayed()
   {
      waitFor(creativeHeader);
      CommonUtils.waitForSeconds(2);
      return creativeHeader.isDisplayed();
   }

   /**
    * Navigate to creative list page.
    *
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public void navigateToCreativeListPage()
   {
      clickCreativeNavMenu();
   }

   /**
    * Checks if is library header displayed.
    *
    * @return true, if is library header displayed
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public boolean isLibraryHeaderDisplayed()
   {
      waitFor(libraryHeader);
      return libraryHeader.isDisplayed();
   }

   /**
    * Gets the creative top menu options.
    *
    * @return the creative top menu options
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public List<String> getCreativeTopMenuOptions()
   {
      List<String> options = new ArrayList<>();
      for (WebElement creative : creativepageTopMenus)
      {
         options.add(creative.getText().trim());
      }
      return options;
   }

   /**
    * Gets the creative type tabs as list.
    *
    * @return the creative type tabs as list
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public List<String> getCreativeTypeTabsAsList()
   {
      List<String> creativeList = new ArrayList<>();
      for (WebElement creative : creativeSubTabs)
      {
         creativeList.add(creative.getText());
      }
      return creativeList;
   }

   /**
    * Click creative tab by tab name.
    *
    * @param tabName
    *           the tab name
    * @created_by : narot
    * @created_on: 12 May, 2019 10:44:14 AM
    */
   public void clickCreativeTabByTabName(String tabName)
   {
      for (WebElement creative : creativeSubTabs)
      {
         Log.info("Creative TabNames: " + creative.getText());
         if (creative.getText().equalsIgnoreCase(tabName))
         {
            Log.info("Clicked Tab by TabName: " + tabName);
            creative.click();
            break;
         }
      }
   }

   /**
    * Gets the creative type as list.
    *
    * @return the creative type as list
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public List<String> getCreativeTypeAsList()
   {
      List<String> creativeList = new ArrayList<>();
      for (WebElement creative : creativeTypes)
      {
         creativeList.add(creative.getText());
      }
      return creativeList;
   }

   /**
    * Checks if is RTM content page header displayed.
    *
    * @return true, if is RTM content page header displayed
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public boolean isRTMContentPageHeaderDisplayed()
   {
      waitFor(rtmContentPageHeader);
      return rtmContentPageHeader.isDisplayed();
   }

   /**
    * Validate rich media type list.
    *
    * @return the list
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public List<String> validateRichMediaTypeList()
   {
      List<String> richMediaList = new ArrayList<>();
      for (WebElement creative : richMediaTypeList)
      {
         richMediaList.add(creative.getText());
      }
      return richMediaList;
   }

   /**
    * Click jump link.
    *
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public void clickJumpLink()
   {
      waitFor(jumpLinkBtn).waitUntilVisible();
      jumpLinkBtn.click();
   }

   /**
    * Gets the rich media jump link page text.
    *
    * @return the rich media jump link page text
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public String getRichMediaJumpLinkPageText()
   {
      return jumpLinkContentPresent.getText();
   }

   public String getRichMediaContentPageText()
   {
      return contentTextPresent.getText();
   }

   /**
    * Select language by type.
    *
    * @param langauge
    *           the langauge
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public void selectLanguageByType(String langauge)
   {
      if (langauge.equalsIgnoreCase(LanguageType.CHINESSE.toString()))
      {
         languageChineseRadio.click();
      }
      else
      {
         languageEnglishRadio.click();
      }
   }

   /**
    * Perform jump link activity.
    *
    * @param title
    *           the title
    * @param author
    *           the author
    * @param textLink
    *           the text link
    * @param summary
    *           the summary
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public void performJumpLinkActivity(final String title, final String author, final String textLink, final String summary)
   {
      enterRichMediaCreationDetails(title, author, textLink, summary);
   }

   public void performContentLinkActivity(final String title, final String author, final String bodyText, final String textLink, final String summary)
   {
      textLinkCheckbox.click();
      enterRichMediaCreationDetails(title, author, textLink, summary);
   }
   
   public void clickTransUploadContentBodyImage()
   {
      translateContentBodyImageIcon.click();
      CommonUtils.waitForSeconds(2);
      uploadRichMediaContentButtonTranslationPage.click();
   }

   public void uploadTransContentBodyVideo()
   {
      
      translateContentBodyVideoIcon.click();
      uploadRichMediaContentButton.click();
   }

   public void uploadTransContentBodyQRCode()
   {
      translateContentBodyQRCodeIcon.click();
      uploadRichMediaContentButton.click();
   }

   public void clickUploadContentBodyImage()
   {
      contentBodyImageIcon.click();
      CommonUtils.waitForSeconds(4);
      uploadRichMediaContentButton.click();
   }

   public void uploadContentBodyVideo()
   {
      
      contentBodyVideoIcon.click();
      uploadRichMediaContentButton.click();
   }

   public void uploadContentBodyQRCode()
   {
      contentBodyQRCodeIcon.click();
      uploadRichMediaContentButton.click();
   }

   public void enterRichMediaCreationDetails(final String title, final String author, final String textLink, final String summary)
   {
      rtmTitleTxBx.clear();
      rtmTitleTxBx.sendKeys(title);
      rtmAuthorNameTxBx.clear();
      rtmAuthorNameTxBx.sendKeys(author);
      rtmTextLinkTxBx.clear();
      rtmTextLinkTxBx.sendKeys(textLink);
      rtmSummary.clear();
      rtmSummary.sendKeys(summary);
   }

   /**
    * Click content link.
    *
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public void clickContentLink()
   {
      contentBtn.click();
   }

   /**
    * Upload image.
    *
    * @param path
    *           the path
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public void uploadImage(String path)
   {
      CommonUtils.waitForSeconds(3);
      ((JavascriptExecutor) getDriver()).executeScript("javascript:window.scrollBy(0,300)");
      ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", uploadButton);
      uploadButton.click();
    //  CommonUtils.waitForSeconds(1);
      CommonUtils.uploadFile(path);
      CommonUtils.waitForSeconds(4);
      saveImagaeButton.click();
   }

   /**
    * Upload with out save.
    *
    * @param path
    *           the path
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public void uploadWithOutSave(String path)
   {
      CommonUtils.waitForSeconds(3);
      uploadButton.click();
      CommonUtils.uploadFile(path);
   }

   /**
    * Checks if is image uploaded.
    *
    * @return true, if is image uploaded
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public boolean isImageUploaded()
   {
      waitFor(uploadedImageIcon).waitUntilVisible();
      return uploadedImageIcon.isDisplayed();
   }

   /**
    * Click creative save btn.
    *
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public void clickCreativeSaveBtn()
   {
      saveBtn.click();
   }

   
   public List<String> getListOfCreatives()
   {
      List<String> creatives = new ArrayList<>();
      Log.info("Creatices list size: " + creativeList.size());

      boolean isDisabled = true;
      do
      {
         if (!isDisabled)
         {
            moveToNextPage.click();
         }

         for (WebElement element : creativeList)
         {

            String creative = element.getText();
            Log.info("Creative Name: " + creative);
            creatives.add(creative);

         }

         isDisabled = isElementHaveAttribute(parentOfMoveToNextPage, "class", "disabled", true);

      }
      while (!isDisabled);

      return creatives;

   }
   
   public List<String> getListOfCreativesFirstPage()
   {
      List<String> creatives = new ArrayList<>();
      Log.info("Creatices list size: " + creativeList.size());
  
         for (WebElement element : creativeList)
         {
            String creative = element.getText();
            Log.info("Creative Name: " + creative);
            creatives.add(creative);
         }

      return creatives;
   }
   
  
   /**
    * Gets the list of creatives.
    *
    * @param creativeName
    *           the creative name
    * @return the list of creatives
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public boolean verifyCreatedCreative(String creativeName)
   {
      List<String> creatives = new ArrayList<>();
      Log.info("Creatices list size: " + creativeList.size());

      boolean isDisabled = true;
      boolean isCreativeExist = false;
      do
      {
         if (!isDisabled)
         {
            moveToNextPage.click();
         }

         for (WebElement element : creativeList)
         {

            String creative = element.getText();
            Log.info("Creative Name: " + creative);
            if (creative.equalsIgnoreCase(creativeName) | creative.contains(creativeName))
            {
               isCreativeExist = true;
               break;
            }

         }

         isDisabled = isElementHaveAttribute(parentOfMoveToNextPage, "class", "disabled", true);

      }
      while (!isDisabled && !isCreativeExist);

      return isCreativeExist;

   }

   /**
    * Navigate to folder by name.
    *
    * @param folderName
    *           the folder name
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public void navigateToFolderByName(String folderName)
   {
      CommonUtils.waitForSeconds(3);
      getDriver().findElement(By.xpath("//span[text()='" + folderName + "']")).click();
      CommonUtils.waitForSeconds(5);
   }

   /**
    * Checks if is created folder displayed.
    *
    * @param folderName
    *           the folder name
    * @return true, if is created folder displayed
    * @created_by : narot
    * @created_on: 5 Jun, 2019 8:05:57 PM
    */
   public boolean isCreatedFolderDisplayed(String folderName)
   {
      try
      {
         return CommonUtils.isElementDisplayed(getDriver().findElement(By.xpath("//span[text()='" + folderName + "']")));
      }
      catch (Exception e)
      {
         return false;
      }

   }

   /**
    * Gets the creative creative count in folder name by name.
    *
    * @param folderName
    *           the folder name
    * @return the creative creative count in folder name by name
    * @created_by : narot
    * @created_on: 5 Jun, 2019 8:05:57 PM
    */
   public String getCreativeCreativeCountInFolderNameByName(String folderName)
   {
      return getDriver().findElement(By.xpath("//span[text()='" + folderName + "']//following-sibling::span")).getText();
   }

   /**
    * Checks if is navigated to folder.
    *
    * @param folderName
    *           the folder name
    * @return true, if is navigated to folder
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public boolean isNavigatedToFolder(String folderName)
   {

      return getDriver().findElement(By.xpath("//span[text()='" + folderName + "']//following-sibling::span")).isDisplayed();

   }

   /**
    * Gets the content inner page header.
    *
    * @return the content inner page header
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public String getContentInnerPageHeader()
   {
      waitFor(contentInnerPageHeader);
      return contentInnerPageHeader.getText();
   }

   /**
    * Select folder by name.
    *
    * @param folderName
    *           the folder name
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public void selectFolderByName(String folderName)
   {
      CommonUtils.waitForSeconds(3);
      ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", folderDropdown);
      folderDropdown.click();
      getDriver().findElement(org.openqa.selenium.By.xpath("//ul[@class='chosen-results']/li[text()='" + folderName + "']")).click();
   }

   /**
    * Navigate select tag window.
    *
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public void navigateSelectTagWindow()
   {
      waitFor(addTagButton);
      addTagButton.click();
   }

   /**
    * Checks if is adds the tag button disabled.
    *
    * @return true, if is adds the tag button disabled
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public boolean isAddTagButtonDisabled()
   {
      try
      {
         return addTagButton.getAttribute("disabled") != null;
      }
      catch (Exception e)
      {
         e.printStackTrace();
         return true;
      }
   }

   /**
    * Checks if is navigated to tag window.
    *
    * @return true, if is navigated to tag window
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public boolean isNavigatedToTagWindow()
   {
      waitFor(tagDropdwonLabel);
      return tagDropdwonLabel.isDisplayed();
   }

   /**
    * Select tag from dropdown.
    *
    * @param tagName
    *           the tag name
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public void selectTagFromDropdown(String tagName)
   {
      waitFor(tagDropdown);
      tagDropdown.click();
      tagSearchDropdown.clear();
      tagSearchDropdown.sendKeys(tagName);
      CommonUtils.waitForSeconds(3);
      tagDropdownOptions.get(0).click();

      // CommonUtils.selectOptionByText(tagDropdownOptions, tagName);
   }

   /**
    * Click add tag save btn.
    *
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public void clickAddTagSaveBtn()
   {
      waitFor(saveTagButton);
      saveTagButton.click();
   }

   /**
    * Click tag cancel btn.
    *
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public void clickTagCancelBtn()
   {
      cancelTagButton.click();
   }

   /**
    * Added tag text to rich media to create page.
    *
    * @return the string
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public String addedTagTextToRichMediaToCreatePage()
   {
      waitFor(addedtagPositionToRichMedia);
      return addedtagPositionToRichMedia.getText().toLowerCase();
   }

   /**
    * Click upload imgae tool tip icon.
    *
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public void clickUploadImgaeToolTipIcon()
   {
      waitFor(uploadIamgeToolTipBtn);
      uploadIamgeToolTipBtn.click();
   }

   /**
    * Gets the image tool tip text.
    *
    * @return the image tool tip text
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public String getImageToolTipText()
   {
      return uploadImageToolTipText.getText();
   }

   /**
    * Gets the no upload validation error.
    *
    * @return the no upload validation error
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public String getNoUploadValidationError()
   {
      try
      {
         CommonUtils.waitForSeconds(3);
         ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", uploadNoImageValidationError);
         return uploadNoImageValidationError.getText();
      }
      catch (Exception e)
      {
         e.printStackTrace();
         return "";
      }
   }

   /**
    * Gets the upload file validation.
    *
    * @return the upload file validation
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public String getUploadFileValidation()
   {
      return uploadImageValidationError.getText();
   }

   /**
    * Checks if is save imagae button displayed.
    *
    * @return true, if is save imagae button displayed
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public boolean isSaveImagaeButtonDisplayed()
   {
      try
      {
         return saveImagaeButton.isDisplayed();
      }
      catch (Exception e)
      {
         return false;
      }
   }

   /**
    * Gets the title text validation error.
    *
    * @return the title text validation error
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public String getTitleTextValidationError()
   {
      waitFor(titleValidationError);
      return titleValidationError.getText();
   }

   /**
    * Gets the tag link validator error.
    *
    * @return the tag link validator error
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public String getTagLinkValidatorError()
   {
      return textLinkValidationError.getText();
   }

   /**
    * Gets the auther field validator error.
    *
    * @return the auther field validator error
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public String getAutherFieldValidatorError()
   {
      return autherTxBxValidatorError.getText();
   }

   /**
    * Gets the ad tag validator error.
    *
    * @return the ad tag validator error
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public String getAdTagValidatorError()
   {
      waitFor(addTagValidationError);
      return addTagValidationError.getText();
   }

   /**
    * Click draft review edit btn.
    *
    * @param creativeName
    *           the creative name
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public void clickDraftReviewEditBtn(String creativeName)
   {
      CommonUtils.waitForSeconds(5);
      Log.info("Clicking edit card button by cardName: " + creativeName);
      WebElement draftReviewEditBtn = getDriver()
         .findElement(By.xpath("//div[contains(@class ,'item-holder')]/h3[text()='" + creativeName + "']//following-sibling::div//a[@title='Edit']"));
      draftReviewEditBtn.click();
   }

   public boolean isCreativeContentTranslated(String creativeName)
   {
      WebElement draftReviewEditBtn = getDriver()
         .findElement(By.xpath("//div[contains(@class ,'item-holder')]/h3[text()='" + creativeName + "']//following-sibling::figure[2]"));
      return !CommonUtils.isElementHaveAttribute(draftReviewEditBtn, "style", "TranslatedContentNotAvailable.png");
   }

   /**
    * Click draft review edit btn.
    *
    * @param creativeName
    *           the creative name
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public void selectCreativeForMove(String creativeName)
   {
      CommonUtils.waitForSeconds(5);
      Log.info("Clicking movecreative button: " + creativeName);
      WebElement draftReviewEditBtn = getDriver()
         .findElement(By.xpath("//div[contains(@class ,'item-holder')]/h3[text()='" + creativeName + "']/../div[2]//i"));
      draftReviewEditBtn.click();
   }

   /**
    * Click draft review edit btn.
    *
    * @param creativeName
    *           the creative name
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public void clickDraftReviewDeleteBtn(String creativeName)
   {
      CommonUtils.waitForSeconds(5);
      WebElement draftReviewEditBtn = getDriver()
         .findElement(By.xpath("//div[contains(@class ,'item-holder')]/h3[text()='" + creativeName + "']//following-sibling::div//a[@title='Delete']"));
      draftReviewEditBtn.click();
   }

   /**
    * Click move to library icon link.
    *
    * @param creativeName
    *           the creative name
    * @param iconTitle
    *           the icon title
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public void clickMoveToLibraryIconLink(String creativeName, String iconTitle)
   {
      CommonUtils.waitForSeconds(5);
      WebElement draftReviewEditBtn = getDriver().findElement(
         By.xpath("//div[contains(@class ,'item-holder')]/h3[text()='" + creativeName + "']//following-sibling::div//a[@title='" + iconTitle + "']"));
      draftReviewEditBtn.click();
   }

   /**
    * Click approve page view icon link.
    *
    * @param creativeName
    *           the creative name
    * @created_by : narot
    * @created_on: 10 May, 2019 10:18:17 PM
    */
   public void clickApprovePageViewIconLink(String creativeName)
   {
      CommonUtils.waitForSeconds(5);
      WebElement draftReviewEditBtn = getDriver()
         .findElement(By.xpath("//div[contains(@class ,'item-holder')]/h3[text()='" + creativeName + "']//following-sibling::div//a[@title='View']"));
      draftReviewEditBtn.click();
   }

   /**
    * Click save and close btn.
    *
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public void clickSaveAndCloseBtn()
   {
      CommonUtils.waitForSeconds(5);
      waitFor(saveAndCloseBtn);
      saveAndCloseBtn.click();
   }

   /**
    * Checks if is creative sub tab active.
    *
    * @param subCreativeTabBName
    *           the sub creative tab B name
    * @return true, if is creative sub tab active
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public boolean isCreativeSubTabActive(String subCreativeTabBName)
   {
      try
      {
         CommonUtils.waitForSeconds(3);
         WebElement draftReviewEditBtn = getDriver().findElement(By.xpath(" //ul[@id='creativeDivSubId']/li/a[text()='" + subCreativeTabBName + "']/.."));
         Log.info("Class attribute: " + draftReviewEditBtn.getAttribute("class"));
         return draftReviewEditBtn.getAttribute("class").contains("active");
      }
      catch (Exception e)
      {
         return false;
      }
   }

   /**
    * Click submit for draft review.
    *
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public void clickSubmitForDraftReview()
   {
      CommonUtils.waitForSeconds(5);
      waitFor(submitForDraftReviewBtn);
      submitForDraftReviewBtn.click();
   }

   /**
    * Click preview btn.
    *
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public void clickPreviewBtn()
   {
      CommonUtils.waitForSeconds(5);
      waitFor(previewBtn);
      previewBtn.click();
   }

   /**
    * Checks if is draft review page displayed.
    *
    * @return true, if is draft review page displayed
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public boolean isDraftReviewPageDisplayed()
   {
      return drafReviewPageHeader.isDisplayed();
   }

   /**
    * Click submit for draft review btn.
    *
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public void clickSubmitForDraftReviewBtn()
   {
      submitForDraftReviewBtn.click();
   }

   /**
    * Click notify user btn.
    *
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public void clickNotifyUserBtn()
   {
      notifyToUserBtn.click();
   }

   /**
    * Checks if is submit for draft review btn displayed.
    *
    * @return true, if is submit for draft review btn displayed
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public boolean isSubmitForDraftReviewBtnDisplayed()
   {
      return submitForDraftReviewBtn.isDisplayed();
   }

   /**
    * Checks if is notify user btn displayed.
    *
    * @return true, if is notify user btn displayed
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public boolean isNotifyUserBtnDisplayed()
   {
      return notifyToUserBtn.isDisplayed();
   }

   /**
    * Click submit for transalation btn.
    *
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public void clickSubmitForTransalationBtn()
   {
      submitForTransalationBtn.click();
   }

   /**
    * Checks if is navigation options displayed.
    *
    * @param option
    *           the option
    * @return true, if is navigation options displayed
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public boolean isNavigationOptionsDisplayed(String option)
   {
      return getDriver().findElement(By.cssSelector("[value='" + option + "']")).isDisplayed();
   }

   /**
    * Gets the orginal translation page header.
    *
    * @return the orginal translation page header
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public String getOrginalTranslationPageHeader()
   {
      return translationPageHeaderList.get(0).getText();
   }

   /**
    * Gets the translatedl translation page header.
    *
    * @return the translatedl translation page header
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public String getTranslatedlTranslationPageHeader()
   {
      return translationPageHeaderList.get(1).getText();
   }

   /**
    * Checks if is translation orginal page field disabled.
    *
    * @return true, if is translation orginal page field disabled
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public boolean isTranslationOrginalPageFieldDisabled()
   {
      boolean isDisabled = true;
      isDisabled = isDisabled && CommonUtils.isElementHaveAttribute(contentDescrptionOrginalTxt, "class", "disableCopy");
      return isDisabled;
   }

   /**
    * Checks if is translation translated page field blank.
    *
    * @return true, if is translation translated page field blank
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public boolean isTranslationTranslatedPageFieldBlank()
   {
      boolean isDisabled = true;
      isDisabled = isDisabled && isElementAttributeBlank(contentDescrptionTranslatedTxt, "value");
      return isDisabled;
   }

   /**
    * Checks if is element have attribute.
    *
    * @param element
    *           the element
    * @param attribute
    *           the attribute
    * @param value
    *           the value
    * @param defaultvalue
    *           the defaultvalue
    * @return true, if is element have attribute
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public boolean isElementHaveAttribute(WebElement element, String attribute, String value, boolean defaultvalue)
   {
      try
      {
         return element.getAttribute(attribute).contains(value);
      }
      catch (Exception e)
      {
         return defaultvalue;
      }

   }

   /**
    * Checks if is element attribute blank.
    *
    * @param element
    *           the element
    * @param attribute
    *           the attribute
    * @return true, if is element attribute blank
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public boolean isElementAttributeBlank(WebElement element, String attribute)
   {
      return element.getAttribute(attribute).isEmpty();

   }

   /**
    * Enter translation page details.
    *
    * @param title
    *           the title
    * @param textlink
    *           the textlink
    * @param desc
    *           the desc
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public void enterTranslationPageDetails(String title, String textlink, String desc)
   {
      translationPageTitleTxBxs.get(1).clear();
      translationPageTitleTxBxs.get(1).sendKeys(title);
      textLinkTranslatedTxt.clear();
      textLinkTranslatedTxt.sendKeys(textlink);
      contentDescrptionTranslatedTxt.clear();
      contentDescrptionTranslatedTxt.sendKeys(desc);
   }

   /**
    * Adds the translatio URL on translation page.
    *
    * @param url
    *           the url
    * @param urlText
    *           the url text
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public void addTranslatioURLOnTranslationPage(String url, String urlText)
   {
      JavascriptExecutor js = (JavascriptExecutor) getDriver();
      js.executeScript("arguments[0].click();", translationLinkAdUrlButton);
      translationUrlTextTxBx.clear();
      translationUrlTxBx.clear();
      translationUrlTxBx.sendKeys(url);
      translationUrlTextTxBx.sendKeys(urlText);
      translationUrlSaveBtn.click();
   }

   /**
    * Gets the translation URL text.
    *
    * @return the translation URL text
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public String getTranslationURLText()
   {
      return adedTranslationPageUrlText.getText();
   }

   /**
    * Click library rich media menu.
    *
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public void clickLibraryRichMediaMenu()
   {

      waitFor(creativepageTopMenus.get(1));
      creativepageTopMenus.get(1).click();
   }

   /**
    * Click sub tab by rich media type.
    *
    * @param linkText
    *           the link text
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public void clickSubTabByRichMediaType(String linkText)
   {
      CommonUtils.waitForSeconds(3);
      getDriver().findElement(org.openqa.selenium.By.partialLinkText(linkText)).click();
   }

   /** The reassign model poup button. */
   @FindBy(css = "input#ReassignTouserBtnId")
   private WebElement reassignModelPoupButton;

   /** The reassign button. */
   @FindBy(css = "button.UE_FormButtons")
   private WebElement reassignButton;

   /** The reassign menu options. */
   @FindBy(css = ".dropdown-menu a")
   private List<WebElement> reassignMenuOptions;

   /** The assign user model title. */
   @FindBy(css = "#ModelTitleId")
   private WebElement assignUserModelTitle;

   /** The notify user model title. */
   @FindBy(css = "#NotifyUserTitleId")
   private WebElement notifyUserModelTitle;

   /** The select user check box list. */
   @FindBy(css = "input.ReassignUserDetailsCheckBox")
   private List<WebElement> selectUserCheckBoxList;

   /** The notify user check box list. */
   @FindBy(css = "input.UserDetailsCheckBox")
   private List<WebElement> notifyUserCheckBoxList;

   /** The notify user model OK button. */
   @FindBy(css = "[onclick=\"getUserID();\"]")
   private WebElement notifyUserModelOKButton;

   /** The select all notify user check box. */
   @FindBy(css = "#checkAll")
   private WebElement selectAllNotifyUserCheckBox;

   /** The device options. */
   @FindBy(css = "body > div.messageCardpreviewpage > div > div.mobileTypeContainer > select option")
   private List<WebElement> deviceOptions;

   /** The device dropdown. */
   @FindBy(css = "body > div.messageCardpreviewpage > div > div.mobileTypeContainer > select")
   private WebElement deviceDropdown;

   /** The selected device. */
   @FindBy(xpath = "(//*[@id='mobileContainer'])[2]")
   private WebElement selectedDevice;

   /**
    * Click reassign button.
    *
    * @return : void
    * @Description:
    * @Created_by : narot
    */
   public void clickReassignButton()
   {
      reassignButton.click();

   }

   /**
    * Click reassign model popp button.
    *
    * @return : void
    * @Description:
    * @Created_by : narot
    */
   public void clickReassignModelPoppButton()
   {
      reassignModelPoupButton.click();

   }

   /**
    * Checks if is reassign to draft option visible.
    *
    * @return : Object
    * @Description:
    * @Created_by : narot
    */
   public Object isReassignToDraftOptionVisible()
   {
      return reassignMenuOptions.get(0).isDisplayed();
   }

   /**
    * Checks if is reassign to draft translation visible.
    *
    * @return : Object
    * @Description:
    * @Created_by : narot
    */
   public Object isReassignToDraftTranslationVisible()
   {
      return reassignMenuOptions.get(1).isDisplayed();

   }

   /**
    * Click reassign to draft menu option.
    *
    * @return : void
    * @Description:
    * @Created_by : narot
    */
   public void clickReassignToDraftMenuOption()
   {
      reassignMenuOptions.get(0).click();

   }

   /**
    * Click reassign to translation menu option.
    *
    * @return : void
    * @Description:
    * @Created_by : narot
    */
   public void clickReassignToTranslationMenuOption()
   {
      reassignMenuOptions.get(1).click();

   }

   /**
    * Checks if is assign user pop up visible.
    *
    * @return : Object
    * @Description:
    * @Created_by : narot
    */
   public Object isAssignUserPopUpVisible()
   {
      if (CommonUtils.isElementDisplayed(assignUserModelTitle))
      {
         return assignUserModelTitle.isDisplayed();
      }
      else
      {
         return notifyUserModelTitle.isDisplayed();
      }

   }

   /**
    * Select any user email.
    *
    * @return : void
    * @Description:
    * @Created_by : narot
    */
   public void selectAnyUserEmail()
   {
      selectUserCheckBoxList.get(0).click();

   }

   /**
    * Select any user email.
    *
    * @param userEmail
    *           the user email
    * @return : void
    * @Description:
    * @Created_by : narot
    */
   public void selectNotifyUserByEmail(String userEmail)
   {

      getDriver()
         .findElement(org.openqa.selenium.By.xpath("//*[@id='notifyUserId']//td[contains(text(),'" + userEmail + "')]//preceding::td[1]/input[1]"))
         .click();
      Log.info("SELECTED USER WITH EMAIL:" + userEmail);
   }

   /**
    * Checks if is notify user email id selected.
    *
    * @param userEmail
    *           the user email
    * @return true, if is notify user email id selected
    * @created_by : narot
    * @created_on: 19 May, 2019 6:24:42 PM
    */
   public boolean isNotifyUserEmailIdSelected(String userEmail)
   {
      return getDriver()
         .findElement(org.openqa.selenium.By.xpath("//*[@id='notifyUserId']//td[contains(text(),'" + userEmail + "')]//preceding::td[1]/input[1]"))
         .isSelected();

   }

   /**
    * Click notify model ok button.
    *
    * @return : void
    * @Description:
    * @Created_by : narot
    */
   public void clickNotifyModelOkButton()
   {
      notifyUserModelOKButton.click();

   }

   /**
    * Click select all check box for notify user.
    *
    * @created_by : narot
    * @created_on: 20 May, 2019 10:31:54 PM
    */
   public void checkAllCheckBoxForNotifyUser()
   {
      if (!selectAllNotifyUserCheckBox.isSelected())
      {
         selectAllNotifyUserCheckBox.click();
      }
   }

   /**
    * Click unselect all check box for notify user.
    *
    * @created_by : narot
    * @created_on: 20 May, 2019 10:31:54 PM
    */
   public void unCheckcheckAllCheckBoxForNotifyUser()
   {
      if (selectAllNotifyUserCheckBox.isSelected())
      {
         selectAllNotifyUserCheckBox.click();
      }
   }

   /**
    * Checks if is all notify user check box selected.
    *
    * @return true, if is all notify user check box selected
    * @created_by : narot
    * @created_on: 20 May, 2019 10:31:54 PM
    */
   public boolean isAllNotifyUserCheckBoxSelected()
   {
      for (WebElement webElement : notifyUserCheckBoxList)
      {
         if (!webElement.isSelected())
         {
            return false;
         }
      }
      return true;
   }

   /**
    * Checks if is all notify user check box un selected.
    *
    * @return true, if is all notify user check box un selected
    * @created_by : narot
    * @created_on: 20 May, 2019 10:31:54 PM
    */
   public boolean isAllNotifyUserCheckBoxUnSelected()
   {
      for (WebElement webElement : notifyUserCheckBoxList)
      {
         if (webElement.isSelected())
         {
            return false;
         }
      }
      return true;
   }

   /** The preview model text link. */
   @FindBy(xpath = "//*[@id=\"mobileContainer\"]//a/div/p")
   private WebElement previewModelTextLink;

   /** The preview model exit button. */
   @FindBy(id = "MessageCardviewClose")
   private WebElement previewModelExitButton;

   /**
    * Checks if is exit button displayed in preview model.
    *
    * @return : boolean
    * @Description:
    * @Created_by : narot
    */
   public boolean isExitButtonDisplayedInPreviewModel()
   {
      waitFor(previewModelExitButton).waitUntilClickable();
      return previewModelExitButton.isDisplayed();
   }

   /**
    * Click preview model exit button.
    *
    * @created_by : narot
    * @created_on: 5 Jun, 2019 8:05:57 PM
    */
   public void clickPreviewModelExitButton()
   {
      waitFor(previewModelExitButton).waitUntilClickable();
      previewModelExitButton.click();

   }

   /**
    * Click preview model text link.
    *
    * @created_by : narot
    * @created_on: 5 Jun, 2019 8:05:57 PM
    */
   public void clickPreviewModelTextLink()
   {
      previewModelTextLink.click();
   }

   /**
    * Gets the preview model text link.
    *
    * @return the preview model text link
    * @created_by : narot
    * @created_on: 5 Jun, 2019 8:05:57 PM
    */
   public String getPreviewModelTextLink()
   {
      return previewModelTextLink.getText();
   }

   /**
    * Select device options by name.
    *
    * @param deviceName
    *           the device name
    * @created_by : narot
    * @created_on: 5 Jun, 2019 8:05:57 PM
    */
   public void selectDeviceOptionsByName(String deviceName)
   {
      deviceDropdown.click();
      CommonUtils.selectOptionByFullText(deviceOptions, deviceName);
   }

   /**
    * Gets the device attribute name.
    *
    * @return the device attribute name
    * @created_by : narot
    * @created_on: 5 Jun, 2019 8:05:57 PM
    */
   public String getDeviceAttributeName()
   {
      return selectedDevice.getAttribute("class");
   }

   /** The add new folder button. */
   // Create and Move folder
   @FindBy(css = "#addNewFolder span")
   private WebElement addNewFolderButton;

   /** The move to folder button. */
   @FindBy(css = "button#FdrMove")
   private WebElement moveToFolderButton;

   /** The folder name tx bx. */
   @FindBy(css = "input#FolderName")
   private WebElement folderNameTxBx;

   /** The create folder name header. */
   @FindBy(css = "h4#ModelTitleId")
   private WebElement createFolderNameHeader;

   /** The create folder submit btn. */
   @FindBy(css = "#folderSubmitbtn")
   private WebElement createFolderSubmitBtn;

   /** The select folder for move dropdown. */
   @FindBy(css = "#fdr-select")
   private WebElement selectFolderForMoveDropdown;

   /** The folder dropdown options. */
   @FindBy(css = "#fdr-select option")
   private List<WebElement> folderDropdownOptions;

   /** The delete folder button. */
   @FindBy(css = "[onclick=\"FdrDelete()\"]")
   private WebElement deleteFolderButton;

   /** The move folder sub button. */
   @FindBy(css = "#MoveFolderSub")
   private WebElement moveFolderSubButton;

   /** The delete folder OK button. */
   @FindBy(css = "a#FolderDelOk")
   private WebElement deleteFolderOKButton;

   /**
    * Click add new folder button.
    *
    * @created_by : narot
    * @created_on: 5 Jun, 2019 8:05:57 PM
    */
   public void clickAddNewFolderButton()
   {
      addNewFolderButton.click();
   }

   /**
    * Click edit folder icons by name.
    *
    * @param folderName
    *           the folder name
    * @created_by : narot
    * @created_on: 5 Jun, 2019 8:05:57 PM
    */
   public void clickEditFolderIconsByName(String folderName)
   {
      getDriver().findElement(net.thucydides.core.annotations.findby.By.xpath("//span[text()='" + folderName + "']/../preceding-sibling::span")).click();
   }

   /**
    * Click delete folder button.
    *
    * @created_by : narot
    * @created_on: 5 Jun, 2019 8:05:57 PM
    */
   public void clickDeleteFolderButton()
   {
      deleteFolderButton.click();
   }

   /**
    * Gets the creates the folder header text.
    *
    * @return the creates the folder header text
    * @created_by : narot
    * @created_on: 5 Jun, 2019 8:05:57 PM
    */
   public String getCreateFolderHeaderText()
   {
      return createFolderNameHeader.getText();
   }

   /**
    * Click create folder submit btn.
    *
    * @created_by : narot
    * @created_on: 5 Jun, 2019 8:05:57 PM
    */
   public void clickCreateFolderSubmitBtn()
   {
      createFolderSubmitBtn.click();
   }

   /**
    * Enter folder name.
    *
    * @param folderName
    *           the folder name
    * @created_by : narot
    * @created_on: 5 Jun, 2019 8:05:57 PM
    */
   public void enterFolderName(String folderName)
   {
      folderNameTxBx.clear();
      folderNameTxBx.sendKeys(folderName);
   }

   /**
    * Click delete folder ok button.
    *
    * @return : void
    * @Description:
    * @Created_by : narot
    */
   public void clickDeleteFolderOkButton()
   {
      deleteFolderOKButton.click();
   }

   /**
    * Click move to folder button and select folder for move.
    *
    * @param folder
    *           the folder
    * @created_by : narot
    * @created_on: 5 Jun, 2019 8:05:57 PM
    */
   public void clickMoveToFolderButtonAndSelectFolderForMove(String folder)
   {
      moveToFolderButton.click();
      selectFolderForMoveDropdown.click();
      CommonUtils.selectOptionByFullText(folderDropdownOptions, folder);
   }

   /**
    * Click move folder button.
    *
    * @created_by : narot
    * @created_on: 5 Jun, 2019 8:05:57 PM
    */
   public void clickMoveFolderButton()
   {
      moveFolderSubButton.click();
   }

}
