/*
 * Copyright (C) 2019 Wechatify.com, Inc. All Rights Reserved.
 * Proprietary and confidential.
 */
package com.uiautomation.actions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.uiautomation.pages.RichMediaCreativePage;
import com.uiautomation.utils.CommonUtils;
import com.wechatify.enums.Creatives;
import com.wechatify.enums.Creatives.CreativeNotificationBaseContent;
import com.wechatify.utils.Constants;
import com.wechatify.utils.EmailUtils;

import jline.internal.Log;
import net.thucydides.core.annotations.Step;

public class RichMediaCreativeActions
{

   RichMediaCreativePage creativePage;

   @Step
   public void clickCreativeMenu()
   {
      creativePage.clickCreativeNavMenu();
   }

   @Step
   public void verifyUserNavigationToCreativePage()
   {
      assertThat("Verify is creative header displaying ", creativePage.isCreativeHeaderDisplayed(), is(equalTo(true)));
      assertThat("Verify isLibrary header displaying ", creativePage.isLibraryHeaderDisplayed(), is(equalTo(true)));
   }

   @Step
   public void verifyTopMenuOptions(List<String> creativeTopMenuOptions)
   {
      boolean match = true;
      for (int i = 0; i < creativeTopMenuOptions.size(); i++)
      {
         if (creativePage.getCreativeTopMenuOptions().get(i).contains(creativeTopMenuOptions.get(i)))
         {
            match = match && true;
         }
         else
         {
            match = false;
         }
      }
      assertThat("Verify Top menu options", match, is(equalTo(true)));
   }

   @Step
   public void verifyCreativeTabs(List<String> creativeTabs)
   {
      assertThat("Verify Top menu options", creativePage.getCreativeTypeTabsAsList(), is(equalTo(creativeTabs)));
   }

   @Step
   public void clickCreativeAddButton()
   {
      creativePage.clickAddEntityButton();
   }

   @Step
   public void verifyCreativeTypeOptions(List<String> options)
   {
      assertThat("Verify Top menu options", CommonUtils.deepCompareList(creativePage.getCreativeTypeAsList(), options), is(equalTo(true)));
   }

   @Step
   public void clickCreativeTypeByName(String creativeName)
   {
      creativePage.selectCreativeTypesByName(creativeName);
   }

   @Step
   public void verifyRTMCreatePageNavigation()
   {
      assertThat("Verify RTM creative create page navigation:", creativePage.isRTMContentPageHeaderDisplayed(), is(equalTo(true)));
   }

   @Step
   public void verifyUserSeeContentAndJumpLink(List<String> creativeType)
   {
      assertThat("Verify User See ContentAndJumpLink:", CommonUtils.deepCompareList(creativePage.validateRichMediaTypeList(), creativeType), is(equalTo(true)));
   }

   @Step
   public void verifyUserOnConetentRichMediaPage()
   {

   }

   @Step
   public void clickContentLink()
   {
      creativePage.clickContentLink();
   }

   @Step
   public void clickJumpLink()
   {
      creativePage.clickJumpLink();
   }

   @Step
   public void selectLanguageByName(String langauge)
   {
      creativePage.selectLanguageByType(langauge);
   }

   @Step
   public void verifyJumpLinkPageNavigation(String pageText)
   {
      assertThat("Verify JumpLink Page Text:", creativePage.getRichMediaJumpLinkPageText().equalsIgnoreCase(pageText), is(equalTo(true)));

   }

   @Step
   public void enterJumpLinkInformation(final String title, final String author, final String textLink, final String summary)
   {
      creativePage.performJumpLinkActivity(title, author, textLink, summary);
   }

   @Step
   public void enterContentInformation(final String title, final String author, final String bodyText, final String textLink, final String summary)
   {
      creativePage.performContentLinkActivity(title, author, bodyText, textLink, summary);
   }

   @Step
   public void uploadJumpLinkImageWithSaveBtn(String imageName)
   {
      creativePage.uploadImage(Constants.TEST_DATA_PATH + imageName);
   }

   @Step
   public void uploadContentImage(String imageName)
   {
      CommonUtils.uploadFile(Constants.TEST_DATA_PATH + imageName);
   }

   @Step
   public void clickUploadContentBodyImage()
   {
      creativePage.clickUploadContentBodyImage();
      CommonUtils.waitForSeconds(5);
   }

   @Step
   public void uploadJumpLinkImage(String imageName)
   {
      Log.info("Image Path:" + Constants.TEST_DATA_PATH + imageName);
      creativePage.uploadWithOutSave(Constants.TEST_DATA_PATH + imageName);
   }

   @Step
   public void clickUploadToolTipButton()
   {
      creativePage.clickUploadImgaeToolTipIcon();
   }

   @Step
   public void verifyUploadImageToolTipText(List<String> tooltiptext)
   {
      for (String tooltip : tooltiptext)
      {
         Log.info("Tooltip text:" + creativePage.getImageToolTipText());
         Log.info("Tool tip: " + tooltip);
         assertThat("Verify upload image tooltip text", creativePage.getImageToolTipText().contains(tooltip), is(equalTo(true)));
      }
   }

   @Step
   public void clickSaveCreativeButton()
   {
      creativePage.clickCreativeSaveBtn();
      Log.info("Clicked Creative Save button");
   }

   @Step
   public void clickSaveAndCloseCreativeButton()
   {
      creativePage.clickSaveAndCloseBtn();
      Log.info("Clicked Creative SaveAndContnue button");
   }

   @Step
   public void clickAddTagButton()
   {
      creativePage.navigateSelectTagWindow();
   }

   @Step
   public void createNewTagWithExistingCategory(String tagCategory, String tagName, String tagStrength, String memberShip, String points)
   {
      creativePage.createTagWithExistingCategory(tagCategory, tagName, tagStrength, memberShip, points);
   }

   @Step
   public void createNewTagWithNewCategory(String tagCategory, String tagName, String tagStrength, String memberShip, String points)
   {
      creativePage.createTagWithNewCategory(tagCategory, tagName, tagStrength, memberShip, points);
   }

   @Step
   public void selectTagByName(String tagName)
   {
      creativePage.navigateSelectTagWindow();
      assertThat("Verify navigation to tag window:", creativePage.isNavigatedToTagWindow(), is(equalTo(true)));
      creativePage.selectTagFromDropdown(tagName);
   }

   @Step
   public void selectTagByName1(String tagName)
   {
      creativePage.navigateSelectTagWindow();
      assertThat("Verify navigation to tag window:", creativePage.isNavigatedToTagWindow(), is(equalTo(true)));
      creativePage.selectTagFromDropdown(tagName);
   }

   @Step
   public void clickAddTagSaveButton()
   {
      creativePage.clickAddTagSaveBtn();
   }

   @Step
   public void clickAddTagCancelButton()
   {
      creativePage.clickTagCancelBtn();
   }

   @Step
   public void verifyAddedAdtagByNameToCraetePage(String adtagname)
   {
      assertThat("Verify added tag rich media create window:", creativePage.addedTagTextToRichMediaToCreatePage().contains(adtagname), is(equalTo(true)));

   }

   @Step
   public void clickCancelTagButton()
   {
      creativePage.clickTagCancelBtn();
   }

   @Step
   public void verifyImageUpload()
   {
      assertThat("Verify RTM creative Image Uploaded:", creativePage.isImageUploaded(), is(equalTo(true)));
   }

   @Step
   public void selectFolderByNamendVerifyNavigation(String folderName)
   {
      creativePage.selectFolderByName(folderName);
      CommonUtils.waitForSeconds(3);

   }

   @Step
   public void verifyCreatedRichMediaCreativeInPage(String pageHeader, String creativeName, String folderName)
   {
      Log.info("Creative Name: " + creativeName);
      CommonUtils.waitForSeconds(2);
      assertThat("Verify page header:", creativePage.getContentInnerPageHeader(), is(equalTo(pageHeader)));
      creativePage.navigateToFolderByName(folderName);
      assertThat("Verify navigation to folder:" + folderName, creativePage.isNavigatedToFolder(folderName), equalTo(true));
      CommonUtils.waitForSeconds(5);
      // assertThat("Verify Created Rich Media Creative:", creativePage.getListOfCreatives().contains(uploadedFileName), equalTo(true));
      assertThat("Verify Created Rich Media Creative:", creativePage.verifyCreatedCreative(creativeName), equalTo(true));
   }

   @Step
   public void navigateToCreatedFolderByName(String folderName)
   {
      creativePage.navigateToFolderByName(folderName);
   }

   @Step
   public void verifyCreatedRichMediaCreativeInPage(String uploadedFileName, String folderName)
   {
      Log.info("Creative Name: " + uploadedFileName);
      creativePage.navigateToFolderByName(folderName);
      assertThat("Verify navigation to folder:" + folderName, creativePage.isNavigatedToFolder(folderName), equalTo(true));
      CommonUtils.waitForSeconds(5);
      assertThat("Verify Created Rich Media Creative:", creativePage.getListOfCreatives().contains(uploadedFileName), equalTo(true));
   }

   @Step
   public void verifyDeletedRichMediaCreativeInPage(String uploadedFileName, String folderName)
   {
      CommonUtils.waitForSeconds(2);
      creativePage.navigateToFolderByName(folderName);
      assertThat("Verify navigation to folder:" + folderName, creativePage.isNavigatedToFolder(folderName), equalTo(true));
      CommonUtils.waitForSeconds(2);
      assertThat("Verify Created Rich Media Creative:", creativePage.getListOfCreativesFirstPage().contains(uploadedFileName), equalTo(false));
   }

   @Step
   public void verifyIsCreativeSubTabActive(String subCreativeTabBName)
   {
      assertThat("Verify navigation to subCreativeTabBName:" + subCreativeTabBName, creativePage.isCreativeSubTabActive(subCreativeTabBName), equalTo(true));

   }

   @Step
   public void verifyCreativeMenuBackgroundColor()
   {
      System.out.println("Background color: " + creativePage.getCreativeNavMenuBackgroundColor());
      assertThat(
         "Verify User Management nav menu background color:",
         CommonUtils.getColorHex(creativePage.getCreativeNavMenuBackgroundColor()),
         is(equalTo(Constants.HEXCOD_RAYMARINE)));
   }

   @Step
   public void verifyUploadError(String uploadErrorMsg)
   {
      assertThat("Verify upload validation error:", creativePage.getNoUploadValidationError(), equalTo(uploadErrorMsg));

   }

   @Step
   public void verifyTitleValidationError(String titleErrorMsg)
   {
      assertThat("Verify title validation error:", creativePage.getTitleTextValidationError(), equalTo(titleErrorMsg));

   }

   @Step
   public void verifyAuthorValidationError(String authorErrorMsg)
   {
      assertThat("Verify Author validation error:", creativePage.getAutherFieldValidatorError(), equalTo(authorErrorMsg));

   }

   @Step
   public void verifyAdTagValidationError(String tagvalidationError)
   {
      assertThat("Verify AdTag validation error:", creativePage.getAdTagValidatorError(), equalTo(tagvalidationError));

   }

   @Step
   public void verifyNoImageError(String imageError)
   {
      assertThat("Verify No Image validation error:", creativePage.getNoUploadValidationError(), equalTo(imageError));

   }

   @Step
   public void verifySaveButtonWithUploadPopup(boolean isSavebtn)
   {
      // assertThat("Verify upload Image validation error:", creativePage.getUploadFileValidation(), equalTo(imageError));
      assertThat("Verify upload Image validation error:", creativePage.isSaveImagaeButtonDisplayed(), equalTo(isSavebtn));
   }

   @Step
   public void confirmLeaveBrowserAlert()
   {
      creativePage.confirmLeaveBrowserPopup();

   }

   @Step
   public void clickCancelModelButtonIfDisplayed()

   {
      if (creativePage.isSearchMenuTextBoxDisplayed())
      {
         creativePage.clickModelCancelButton();
      }

   }

   @Step
   public void verifyTextLinkValidationError(String textlinkErrorMsg)
   {
      assertThat("Verify TextLink validation error:", creativePage.getTagLinkValidatorError(), equalTo(textlinkErrorMsg));

   }

   @Step
   public void verifyAddTabButtonDisability(boolean isDisabled)
   {
      assertThat("Verify add tag button disability:", creativePage.isAddTagButtonDisabled(), equalTo(isDisabled));

   }

   @Step
   public void verifyIsDraftReviewPageDisplayed(boolean isDisabled)
   {
      assertThat("Verify Draft review page:", creativePage.isDraftReviewPageDisplayed(), equalTo(isDisabled));

   }

   @Step
   public void verifyIsNotifyUserBtnDisplayed(boolean isDisabled)
   {
      assertThat("Verify notify user button displayed:", creativePage.isNotifyUserBtnDisplayed(), equalTo(isDisabled));

   }

   @Step
   public void verifyIsSubmitForDraftReviewBtnDisplayed(boolean isDisabled)
   {
      assertThat("Verify notify user button displayed:", creativePage.isSubmitForDraftReviewBtnDisplayed(), equalTo(isDisabled));

   }

   @Step
   public void isSubmitForTransalationBtnDisplayed(boolean isDisabled)
   {
      assertThat("Verify submit for transalation:", creativePage.isNavigationOptionsDisplayed("Submit for Translation"), equalTo(isDisabled));
   }

   @Step
   public void isSubmitForApprovalBtnDisplayed(boolean isDisabled)
   {
      assertThat("Verify submit for Approval:", creativePage.isNavigationOptionsDisplayed("Submit for Approval"), equalTo(isDisabled));
   }

   @Step
   public void clickDraftReviewEditBtn(String creativeName)
   {
      creativePage.clickDraftReviewEditBtn(creativeName);
   }

   @Step
   public void clickDraftReviewDeleteBtn(String creativeName)
   {
      creativePage.clickDraftReviewDeleteBtn(creativeName);
   }

   @Step
   public void clickMoveToLibraryIcon(String creativeName, String titleName)
   {
      if (titleName.equalsIgnoreCase("Move to drafts review"))
      {
         creativePage.clickMoveToLibraryIconLink(creativeName, Creatives.MoveToSubTabs.MOVETODRAFTSREVIEW.toString());
      }
      else if (titleName.equalsIgnoreCase("Move to translation"))
      {
         creativePage.clickMoveToLibraryIconLink(creativeName, Creatives.MoveToSubTabs.MOVETOTRANSLATION.toString());

      }
      else if (titleName.equalsIgnoreCase("Move to translation review"))
      {
         creativePage.clickMoveToLibraryIconLink(creativeName, Creatives.MoveToSubTabs.MOVETOTRANSALATIONREVIEW.toString());

      }

      else if (titleName.equalsIgnoreCase("Move to approval"))
      {
         creativePage.clickMoveToLibraryIconLink(creativeName, Creatives.MoveToSubTabs.MOVETOAPPROVAL.toString());

      }

      else if (titleName.equalsIgnoreCase("Move to library"))
      {
         creativePage.clickMoveToLibraryIconLink(creativeName, Creatives.MoveToSubTabs.MOVETOLIBRARY.toString());

      }
   }

   @Step
   public void clickViewIconOnCreativePage(String creativeName)
   {
      creativePage.clickApprovePageViewIconLink(creativeName);
   }

   @Step
   public void clickMoveToDraftReviewBtn()
   {
      creativePage.clickSubmitForDraftReview();
   }

   @Step
   public void clickSubmitForTransalationButton()
   {
      creativePage.clickSubmitForTransalationBtn();
   }

   @Step
   public void verifyTranslateOrginalPageHeader(boolean isDisabled)
   {
      assertThat(
         "verifyTranslatedorginalPageHeader:",
         creativePage.getOrginalTranslationPageHeader().contentEquals("Original Content: Rich Media"),
         equalTo(isDisabled));
   }

   @Step
   public void verifyIsContentTranslated(String creativeName, boolean isTranslated)
   {
      assertThat("verifyTranslatedorginalPageHeader:", creativePage.isCreativeContentTranslated(creativeName), equalTo(isTranslated));
   }

   @Step
   public void verifyTranslateTranslatedPageHeader(boolean isDisabled)
   {
      assertThat(
         "verifyTranslatedorginalPageHeader:",
         creativePage.getTranslatedlTranslationPageHeader().contentEquals("Enter Translation: Rich Media"),
         equalTo(isDisabled));
   }

   @Step
   public void verifyTranslationOrginalPageFieldsForDisability()
   {
      assertThat("verifyTranslatedorginalPageHeader:", creativePage.isTranslationOrginalPageFieldDisabled(), equalTo(true));
   }

   @Step
   public void verifyTranslationTranslatedPageFieldsForBlank()
   {
      assertThat("verifyTranslatedorginalPageHeader:", creativePage.isTranslationTranslatedPageFieldBlank(), equalTo(true));
   }

   @Step
   public void fillTransaltionPageDetails(String title, String textlink, String summary)
   {
      creativePage.enterTranslationPageDetails(title, textlink, summary);
   }

   @Step
   public void clickSaveNavigationByButtonText(String buttonText)
   {
      creativePage.clickSaveNavigationByButtonText(buttonText);
      CommonUtils.waitForSeconds(5);
   }

   @Step
   public void clickPreviewButton()
   {
      creativePage.clickPreviewBtn();
   }

   @Step
   public void ClickModelOkButton()
   {
      creativePage.clickModelOKButton();
   }

   @Step
   public void ClickModelCancelButton()
   {
      creativePage.clickModelCancelButton();
   }

   @Step
   public void verifyIsSaveNavigationByButtonTextDisplayed(String buttonText)
   {
      Log.info("Verify Save Navigation Button with buttonText:" + buttonText);
      assertThat("verifyTranslatedorginalPageHeader:", creativePage.isSaveNavigationByButtonTextDisplayed(buttonText), equalTo(true));
   }

   @Step
   public void clickRichMediaLibraryMenu()
   {
      CommonUtils.waitForSeconds(5);
      creativePage.clickLibraryRichMediaMenu();
   }

   @Step
   public void navigateToRichMediaCreativeTypeTab(String linkText)
   {
      creativePage.clickSubTabByRichMediaType(linkText);
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : narot
    */
   @Step
   public void clickReassignButton()
   {
      creativePage.clickReassignButton();

   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : narot
    */
   @Step
   public void clickReassignModelPopupButton()
   {
      creativePage.clickReassignModelPoppButton();

   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : narot
    */
   @Step
   public void verifyReassignToDraftMenuOptionVisiblity()
   {
      assertThat("Verifying resasign button visiblity:", creativePage.isReassignToDraftOptionVisible(), equalTo(true));

   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : narot
    */
   @Step
   public void verifyReassignToTranslationMenuOptionVisiblity()
   {
      assertThat("Verifying resasign button visiblity:", creativePage.isReassignToDraftTranslationVisible(), equalTo(true));

   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : narot
    */
   @Step
   public void clickReassignToDraftMenuOption()
   {
      creativePage.clickReassignToDraftMenuOption();

   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : narot
    */
   @Step
   public void clickReassignToTranslationMenuOption()
   {
      creativePage.clickReassignToTranslationMenuOption();

   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : narot
    */
   @Step
   public void verifyAssignUserPopupVisiblity()
   {
      assertThat("Verifying resasign button visiblity:", creativePage.isAssignUserPopUpVisible(), equalTo(true));

   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : narot
    */
   @Step
   public void selectAnyUserEmail()
   {
      creativePage.selectAnyUserEmail();

   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : narot
    */
   @Step
   public void selectNotifyUserByEmail()
   {
      creativePage.selectNotifyUserByEmail(Constants.FIRST_NOTIFY_USERNAME);
      assertThat("Verifying isNotify user selected:", creativePage.isNotifyUserEmailIdSelected(Constants.FIRST_NOTIFY_USERNAME), equalTo(true));
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : narot
    */
   @Step
   public void verifySelectAllNotifyUserByEmail()
   {
      assertThat("Verifying is all notify user checked:", creativePage.isAllNotifyUserCheckBoxSelected(), equalTo(true));
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : narot
    */
   @Step
   public void verifyUnSelectAllNotifyUserByEmail()
   {
      assertThat("Verifying is all notify user unchecked:", creativePage.isAllNotifyUserCheckBoxUnSelected(), equalTo(true));
   }

   /**
    * @Description:
    * @param tabName
    * @return : void
    * @exception :
    * @Created_by : narot
    */
   @Step
   public void clickCreativeTabByName(String tabName)
   {
      CommonUtils.waitForSeconds(3);
      creativePage.clickCreativeTabByTabName(tabName);

   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : narot
    */
   @Step
   public void clickNotifyUserModelPopupOKButton()
   {
      creativePage.clickNotifyModelOkButton();

   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : narot
    */
   @Step
   public void verifyEmailNotification()
   {
      assertThat(
         "Verifying Email notification:",
         EmailUtils.isNotificationEmailReceivedOnGmailBySubject(Constants.FIRST_NOTIFY_USERNAME, Constants.NOTIFY_USER_PASSWORD, "TMG Gallery", "TMG Gallery"),
         equalTo(true));

   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : narot
    */
   @Step
   public void verifyPreviewModelExitButton()
   {
      assertThat("Verifying Exit button in Preview model:", creativePage.isExitButtonDisplayedInPreviewModel(), equalTo(true));
   }

   @Step
   public void clickPreviewModelExitButton()
   {
      creativePage.clickPreviewModelExitButton();
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : narot
    */
   @Step
   public void checkAllNotifyUserCheckBox()
   {
      creativePage.checkAllCheckBoxForNotifyUser();
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : narot
    */
   @Step
   public void unCheckAllNotifyUsers()
   {
      creativePage.unCheckcheckAllCheckBoxForNotifyUser();

   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : narot
    */
   @Step
   public void verifyclickPreviewModelDescLink(String description)
   {
      assertThat("Verifying Exit button in Preview model:", creativePage.getPreviewModelTextLink(), equalTo(description));

      creativePage.clickPreviewModelTextLink();

   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : narot
    */
   @Step
   public void verifyNewlyOpenPreviewDescTab()
   {
      Set<String> handles = creativePage.getDriver().getWindowHandles();
      List<String> list = new ArrayList<String>(handles);
      creativePage.getDriver().switchTo().window(list.get(1));
      System.out.println(creativePage.getDriver().getTitle());
      creativePage.getDriver().switchTo().window(list.get(0));
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : narot
    */
   @Step
   public void verifyEmailNotification(String creativeName, String type, boolean isNotification)
   {
      assertThat(
         "Verifying Email notification:",
         EmailUtils.isNotificationEmailReceivedOnGmailBySubject(
            Constants.FIRST_NOTIFY_USERNAME,
            Constants.NOTIFY_USER_PASSWORD,
            CreativeNotificationBaseContent.NOTIFICATION_RICHMEDIA_SUBJECT.getLabel(),
            CommonUtils.getRichMediaEmailContentByType(CreativeNotificationBaseContent.RICHMEDIA.getLabel(), creativeName, type)),
         equalTo(isNotification));

   }

   @Step
   public void selectDeviceByName(String deviceName)
   {
      creativePage.selectDeviceOptionsByName(deviceName);
   }

   @Step
   public void verifySelectedDeviceName(String className)
   {
      assertThat("Verifying selected Device:", creativePage.getDeviceAttributeName(), equalTo(className));

   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : narot
    */
   @Step
   public void clickAddNewFolderButton()
   {
      creativePage.clickAddNewFolderButton();

   }

   @Step
   public void verifyNavigationToAddNewFolderPopup()
   {
      assertThat("Verifying selected Device:", creativePage.getCreateFolderHeaderText(), equalTo("Media Folder Information"));

   }

   @Step
   public void enterFolderName(String folderName)
   {
      creativePage.enterFolderName(folderName);
   }

   @Step
   public int getCreativeCountInFolder()
   {
      return creativePage.getListOfCreatives().size();
   }

   @Step
   public void verifyCreativeCountInFolder(int count)
   {
      assertThat("Verifying selected Device:", creativePage.getListOfCreatives().size(), equalTo(count));

   }
   
   @Step
   public void verifyCreativeCountInFolderLabel(String folderName, int count)
   {
      assertThat("Verifying selected Device:", Integer.parseInt(creativePage.getCreativeCreativeCountInFolderNameByName(folderName)), equalTo(count));

   }
   
   @Step
   public void clickCreativeMoveButtonByName(String folder, String creativeName)
   {
      creativePage.clickCreativeNavMenu();
      creativePage.clickMoveToFolderButtonAndSelectFolderForMove(folder);
      creativePage.selectCreativeForMove(creativeName);
      creativePage.clickMoveFolderButton();
      CommonUtils.waitForSeconds(5);
   }
   
   @Step
   public void clickCreateFolderSubmitBtn()
   {
      creativePage.clickCreateFolderSubmitBtn();
   }
   
   @Step
   public void clickEditFolderIconsByName(String folderName)
   {
      creativePage.clickEditFolderIconsByName(folderName);
   }
   
   @Step
   public void clickCreateDeleteFolderButton()
   {
      creativePage.clickDeleteFolderButton();
      creativePage.clickDeleteFolderOkButton();
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : narot
    */
   @Step
   public void verifyIsFolderExists(String folderName, boolean b)
   {
      assertThat("Verifying selected Device:", creativePage.isCreatedFolderDisplayed(folderName), equalTo(b));

   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : narot
    */
   @Step
   public void verifyContentRichMediaPageNavigation(String pageText)
   {
      assertThat("Verifying selected Device:", creativePage.getContentInnerPageHeader(), equalTo(pageText));

   }

   /**
    * @Description: 
    * @param
    * @return : void
    * @exception :
    * @Created_by : narot
   */
   @Step
   public void verifyContentBodyValidationError(String titleErrorMsg)
   {
      assertThat("Verifying selected Device:", creativePage.getRichMediaBodyValidationError(), equalTo(titleErrorMsg));
      
   }

   /**
    * @Description: 
    * @param
    * @return : void
    * @exception :
    * @Created_by : narot
   */
   @Step
   public void clickUploadContentImageTranslation()
   {
      creativePage.clickTransUploadContentBodyImage();
      
   }

   /**
    * @Description: 
    * @param
    * @return : void
    * @exception :
    * @Created_by : narot
   */
   public void selectingSubMediaTypeAction(String mediaType)
   {
      creativePage.selectingSubMediaTypeAction(mediaType);      
   }
}
