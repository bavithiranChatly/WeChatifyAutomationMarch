/*
 * Copyright (C) 2019 Wechatify.com, Inc. All Rights Reserved.
 * Proprietary and confidential.
 */
package com.uiautomation.steps;


import java.util.List;
import java.util.Map;

import com.uiautomation.actions.RichMediaCreativeActions;
import com.uiautomation.utils.CommonUtils;
import com.wechatify.enums.Creatives;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jline.internal.Log;
import net.thucydides.core.annotations.Steps;


public class RichMediaCreativePageSteps
{

   @Steps
   RichMediaCreativeActions creativeActions;
   private static String creativeName;
   private static String adtagname;
   private static String catName;
   private static String description;

   @When("^User clicks on creative nav menu$")
   public void user_clicks_on_creative_nav_menu() throws Exception
   {
      creativeActions.clickCreativeMenu();
   }

   @Then("^User should navigate to creative page$")
   public void user_should_navigate_to_creative_page() throws Exception
   {
      creativeActions.verifyUserNavigationToCreativePage();
   }

   @Then("^Creative page should have following sections$")
   public void creative_page_should_have_following_sections(List<String> creativeTopMenuOptions) throws Exception
   {
      creativeActions.verifyTopMenuOptions(creativeTopMenuOptions);
   }

   @Then("^Creative page should have following tabs$")
   public void creative_page_should_have_following_tabs(List<String> creativeTabs) throws Exception
   {
      creativeActions.verifyCreativeTabs(creativeTabs);
   }

   @When("^User clicks Add Creative Button$")
   public void user_clicks_Add_Creative_Button() throws Exception
   {
      creativeActions.clickCreativeAddButton();
   }

   @Then("^User should see Creative type as following$")
   public void user_should_see_Creative_type_as_following(List<String> creativeType) throws Exception
   {
      creativeActions.verifyCreativeTypeOptions(creativeType);
   }

   @When("^User selects \"([^\"]*)\" creative from dropdown$")
   public void user_selects_creative_from_dropdown(String creativeName) throws Exception
   {
      creativeActions.clickCreativeTypeByName(creativeName);
   }

   @Then("^User should see \"([^\"]*)\" creative page$")
   public void user_should_see_creative_page(String arg1) throws Exception
   {
      creativeActions.verifyRTMCreatePageNavigation();
   }

   @Then("^User should see Content and JumpLink$")
   public void user_should_see_Content_and_JumpLink(final List<String> creativeType) throws Exception
   {
      creativeActions.verifyUserSeeContentAndJumpLink(creativeType);
   }

   @Then("^Content Should be highlighted default$")
   public void content_Should_be_highlighted_default() throws Exception
   {
      creativeActions.verifyUserOnConetentRichMediaPage();
   }

   @When("^User clicks JumpLink Rich media creative$")
   public void user_should_click_JumpLink() throws Exception
   {
      creativeActions.clickJumpLink();
   }

   @When("^User clicks Content Rich media creative$")
   public void user_should_click_ContentLink() throws Exception
   {
      creativeActions.clickContentLink();
   }

   @Then("^it should display the jump link card create Page with description as \"([^\"]*)\"$")
   public void it_should_display_the_jump_link_card_create_Page_with_description_as(String pageText) throws Exception
   {
      creativeActions.verifyJumpLinkPageNavigation(pageText);
   }

   @Then("^it should display the content card create Page with headertext as \"([^\"]*)\"$")
   public void it_should_display_the_content_card_create_Page_with_description_as(String pageText) throws Exception
   {
      creativeActions.verifyContentRichMediaPageNavigation(pageText);
   }

   @Then("^User selects langauge as \"([^\"]*)\"$")
   public void user_selects_langauge_as(String langauge) throws Exception
   {
      creativeActions.selectLanguageByName(langauge);
   }

   @When("^User clicks content link$")
   public void user_should_click_contentLink() throws Exception
   {
      creativeActions.clickContentLink();
   }

   @Then("^User enters title as \"([^\"]*)\" author as \"([^\"]*)\" textlink as \"([^\"]*)\"  summary as \"([^\"]*)\"$")
   public void user_should_enter_title_as_author_as_textlink_as_summary_as_and_other_relevant_information_related_to_content(
      String title,
      String author,
      String textLink,
      String summary)
      throws Exception
   {
      if (title.isEmpty())
      {
         creativeActions.enterJumpLinkInformation(title, author, textLink, summary);

      }
      else
      {
         creativeName = title + CommonUtils.getDateAsUniqueString();
         this.description = summary;
         creativeActions.enterJumpLinkInformation(creativeName, author, textLink, summary);
      }
   }

   @Then("^User enters content title as \"([^\"]*)\" author as \"([^\"]*)\" bodytext as \"([^\\\"]*)\" textlink as \"([^\"]*)\"  summary as \"([^\"]*)\"$")
   public void user_should_enter_content_title_as_author_as_textlink_as_summary_as_and_other_relevant_information_related_to_content(
      String title,
      String author,
      String bodyText,
      String textLink,
      String summary)
      throws Exception
   {
      if (title.isEmpty())
      {
         creativeActions.enterContentInformation(title, author, bodyText, textLink, summary);

      }
      else
      {
         creativeName = title + CommonUtils.getDateAsUniqueString();
         this.description = summary;
         creativeActions.enterContentInformation(creativeName, author, bodyText, textLink, summary);
      }
   }

   @When("^User uploads valid image to Rich Media creative with name as \"([^\\\"]*)\"$")
   public void users_uploads_image_to_jump_RTM_creative_type(String imagename) throws Exception
   {
      creativeActions.uploadJumpLinkImageWithSaveBtn(imagename);
      creativeActions.verifyImageUpload();
   }
   
   @When("^User uploads valid image to Rich Media content creative with name as \"([^\\\"]*)\"$")
   public void users_uploads_image_content_creative_type(String imagename) throws Exception
   {
      creativeActions.uploadContentImage(imagename);
   }
   
//   @When("^User uploads valid image to Rich Media content creative with name as \"([^\\\"]*)\" on translation page$")
//   public void users_uploads_image_content_creative_type_on_translation_page(String imagename) throws Exception
//   {
//      creativeActions.uploadContentImage(imagename);
//   }
   
   
   @When("^User clicks on translation page Rich Media content Image icon")
   public void user_clicks_Rich_Media_content_Image_icon_for_upload_on_translation_page() throws Exception
   {
      creativeActions.clickUploadContentImageTranslation();
   }

   @When("^User clicks Rich Media content Image icon for upload")
   public void user_clicks_Rich_Media_content_Image_icon_for_upload() throws Exception
   {
      creativeActions.clickUploadContentBodyImage();
   }
  
   @When("^User uploads invalid image to Rich Media creative with name as \"([^\\\"]*)\"$")
   public void users_uploads_invalid_image_to_jump_RTM_creative_type(String imagename) throws Exception
   {
      creativeActions.uploadJumpLinkImage(imagename);
   }

   @When("^Add tag button should not be enabled on creative page$")
   public void add_tag_button_should_be_disabled()
   {
      creativeActions.verifyAddTabButtonDisability(true);
   }

   @When("^User clicks upload image tooltip button for jumplink richmedia creative$")
   public void user_clicks_upload_image_tooltip_button_for_jumplink_richmedia_creative() throws Exception
   {
      creativeActions.clickUploadToolTipButton();
   }

   @Then("^Jumplink richmedia creative toop tip should display with correct text$")
   public void jumplink_richmedia_creative_toop_tip_should_display_with_correct_text(DataTable dataTable) throws Exception
   {
      List<String> toolTipSet = dataTable.asList(String.class);
      creativeActions.verifyUploadImageToolTipText(toolTipSet);
   }

   @When("^User select tag by tagname as \"([^\"]*)\" for rich media with click on adtag button$")
   public void user_select_tag_by_tagname_as_for_rich_media_with_click_on_adtag_button(String tagName) throws Exception
   {
      creativeActions.selectTagByName(tagName);
      creativeActions.clickAddTagSaveButton();
   }

   @When("^User select tag by tagname as \"([^\"]*)\" for rich media with click on cancel button$")
   public void user_select_tag_by_tagname_as_for_rich_media_with_click_on_cancel_button(String tagName) throws Exception
   {
      creativeActions.selectTagByName(tagName);
      creativeActions.clickAddTagCancelButton();
   }

   @When("^User clicks on save creative button$")
   public void user_clicks_on_save_creative_button() throws Exception
   {
      creativeActions.clickSaveCreativeButton();
   }

   @When("^User clicks on saveAndClose creative button$")
   public void user_clicks_on_saveAndClose_creative_button() throws Exception
   {
      creativeActions.clickSaveAndCloseCreativeButton();
   }

   @When("^User select folder name from dropdown as \"([^\"]*)\"$")
   public void user_select_folder_name_from_dropdown_as(String folderName) throws Exception
   {
      creativeActions.selectFolderByNamendVerifyNavigation(folderName);
   }

   @Then("^Added Adtag \"([^\"]*)\" should display to create rich media creative page$")
   public void added_Adtag_should_display_to_create_rich_media_creative_page(String adtagname) throws Exception
   {
      creativeActions.verifyAddedAdtagByNameToCraetePage(adtagname);
   }

   @Then("^Added Adtag should display to create rich media creative page$")
   public void added_Adtag_should_display_on_create_rich_media_creative_page() throws Exception
   {
      creativeActions.verifyAddedAdtagByNameToCraetePage(adtagname);
   }

   @Then("^Rich media creative should saved succesfully in \"([^\"]*)\" folder$")
   public void rich_media_creative_should_saved_succesfully_in_folder(String folderName) throws Exception
   {
      creativeActions.clickCreativeMenu();
      creativeActions.verifyCreatedRichMediaCreativeInPage(Creatives.CreaiveInnerPageHeaderText.DRAFT.toString(), creativeName, folderName);

   }

   @Then("^Card should move to Transalation page creative in \"([^\"]*)\" folder$")
   public void card_should_move_to_Transalation_page_creative_in_folder(String folderName) throws Exception
   {

      creativeActions.verifyIsCreativeSubTabActive(Creatives.CreativesSubTabs.TRANSLATION.toString());
      creativeActions.verifyCreatedRichMediaCreativeInPage(Creatives.CreaiveInnerPageHeaderText.TRANSLATION.toString(), creativeName, folderName);
   }

   @When("^User clicks on \"([^\"]*)\" creative tab$")
   public void user_clicks_on_tab(String tabName) throws Exception
   {

      creativeActions.clickCreativeTabByName(tabName);
   }

   @Then("^The following card should get transfered to the Translation Review in \"([^\"]*)\" folder$")
   public void the_following_card_should_get_transfered_to_the_Translation_Review_in_folder(String folderName) throws Exception
   {
      creativeActions.verifyIsCreativeSubTabActive(Creatives.CreativesSubTabs.TRANSLATIONREVIEW.toString());
      creativeActions.verifyCreatedRichMediaCreativeInPage(Creatives.CreaiveInnerPageHeaderText.TRANSLATIONREVIEW.toString(), creativeName, folderName);
   }

   @Then("^Rich media creative should deleted succesfully from \"([^\"]*)\" folder$")
   public void rich_media_creative_should_deleted_succesfully_from_folder(String folderName) throws Exception
   {
      creativeActions.clickCreativeMenu();
      creativeActions.verifyDeletedRichMediaCreativeInPage(creativeName, folderName);

   }

   @Then("^Rich media creative should deleted succesfully from \"([^\"]*)\" folder in any tab$")
   public void rich_media_creative_should_deleted_succesfully_from_folder_any_tab(String folderName) throws Exception
   {
      creativeActions.verifyDeletedRichMediaCreativeInPage(creativeName, folderName);

   }

   @Then("^\"([^\"]*)\" creative should moved succesfully in \"([^\"]*)\" folder in any tab$")
   public void type_creative_should_moved_succesfully_from_folder_any_tab(String creativeType, String folderName) throws Exception
   {
      creativeActions.navigateToRichMediaCreativeTypeTab(creativeType);
      creativeActions.verifyCreatedRichMediaCreativeInPage(creativeName, folderName);

   }

   @Then("^Validation error should display for content body text as \"([^\"]*)\"$")
   public void validation_error_should_display_for_content_text_as(String titleErrorMsg) throws Exception
   {
      creativeActions.verifyContentBodyValidationError(titleErrorMsg);
   }
   
   @Then("^Validation error should display for title text as \"([^\"]*)\"$")
   public void validation_error_should_display_for_title_text_as(String titleErrorMsg) throws Exception
   {
      creativeActions.verifyTitleValidationError(titleErrorMsg);
   }
   

   @Then("^Validation error should display for author text as \"([^\"]*)\"$")
   public void validation_error_should_display_for_author_text_as(String authorErrorMsg) throws Exception
   {
      creativeActions.verifyAuthorValidationError(authorErrorMsg);
   }

   @Then("^Validation error should display for textlink as \"([^\"]*)\"$")
   public void validation_error_should_display_for_textlink_as(String textlinkErrorMsg) throws Exception
   {
      creativeActions.verifyTextLinkValidationError(textlinkErrorMsg);
   }

   @Then("^Validation error should display for adtag text as \"([^\"]*)\"$")
   public void validation_error_should_display_for_adtagtext_as(String adtagvalidationerror) throws Exception
   {
      creativeActions.verifyAdTagValidationError(adtagvalidationerror);
   }

   @Then("^Validation error should display for no image upload as \"([^\"]*)\"$")
   public void validation_error_should_display_for_no_image_upload_as(String imageupload) throws Exception
   {
      creativeActions.verifyNoImageError(imageupload);
   }

   @Then("^Save image button should not available with upload popup$")
   public void validation_error_should_display_for_image_upload_as() throws Exception
   {
      creativeActions.verifySaveButtonWithUploadPopup(false);
   }

   @When("^User confirms leave page popup$")
   public void user_confirms_leave_page_popup() throws Exception
   {
      creativeActions.confirmLeaveBrowserAlert();
   }

   @When("^Close any model poup if displayed$")
   public void close_model_popups_if_displayed() throws Exception
   {
      creativeActions.clickCancelModelButtonIfDisplayed();
   }

   @When("^User clicks edit button of rich media creative$")
   public void user_clicks_edit_button_of_rich_media_creative() throws Exception
   {
      creativeActions.clickDraftReviewEditBtn(creativeName);
   }

   @When("^User clicks delete button of rich media creative$")
   public void user_clicks_delete_button_of_rich_media_creative() throws Exception
   {
      creativeActions.clickDraftReviewDeleteBtn(creativeName);
   }

   @Then("^Create creative page should display for richmedia creative$")
   public void create_creative_page_should_display_for_richmedia_creative() throws Exception
   {
      creativeActions.verifyUserNavigationToCreativePage();
   }

   @When("^User clicks on Submit for draft review$")
   public void user_clicks_on_Submit_for_draft_review() throws Exception
   {
      creativeActions.clickMoveToDraftReviewBtn();
   }

   @Then("^Card should moved to DraftReview and user should moved to Draft review tab in \"([^\"]*)\" folder$")
   public void card_should_moved_to_DraftReview_and_user_should_moved_to_Draft_review_tab_in_folder(String folderName) throws Exception
   {
      creativeActions.verifyIsCreativeSubTabActive(Creatives.CreativesSubTabs.DRAFTSREVIEW.toString());
      creativeActions.verifyCreatedRichMediaCreativeInPage(Creatives.CreaiveInnerPageHeaderText.DRAFTREVIEW.toString(), creativeName, folderName);

   }

   @Then("^Create page of draft review should display$")
   public void create_page_of_draft_review_should_display() throws Exception
   {
      creativeActions.verifyIsDraftReviewPageDisplayed(true);
   }

   @Then("^Draft Review page should have below options$")
   public void draft_Review_page_should_have_below_options(DataTable arg1) throws Exception
   {
      creativeActions.verifyIsNotifyUserBtnDisplayed(true);
      creativeActions.isSubmitForTransalationBtnDisplayed(true);
      creativeActions.isSubmitForApprovalBtnDisplayed(true);
   }

   @When("^User clicks on \"([^\"]*)\" on draft review create page$")
   public void user_clicks_on_on_draft_review_create_page(String arg1) throws Exception
   {
      creativeActions.clickSubmitForTransalationButton();
   }

   @Then("^Card should move to Transalation page creative$")
   public void card_should_move_to_Transalation_page_creative() throws Exception
   {
      creativeActions.verifyCreatedRichMediaCreativeInPage(Creatives.CreaiveInnerPageHeaderText.TRANSLATION.toString(), creativeName, "Default");
   }

   @Then("^Rich media edit page should display with Orginal and Translated content$")
   public void rich_media_edit_page_should_display_with_Orginal_and_Translated_content() throws Exception
   {
      creativeActions.verifyTranslateOrginalPageHeader(true);
      creativeActions.verifyTranslateOrginalPageHeader(true);
   }

   @Then("^Rich media edit translation page should have below fields as empty$")
   public void rich_media_edit_translation_page_should_have_below_fields_as_empty(DataTable arg1) throws Exception
   {
      creativeActions.verifyTranslationTranslatedPageFieldsForBlank();
   }

   @Then("^Rich media edit orginal fields should not be editable$")
   public void rich_media_edit_orginal_fields_should_not_be_editable() throws Exception
   {
      creativeActions.verifyTranslationOrginalPageFieldsForDisability();
   }

   @When("^User filles Rich media edit page Translated fields page with \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" and \"([^\"]*)\"$")
   public void user_filles_Rich_media_edit_page_Translated_fields_page_with_and(String title, String author, String textlink, String summary) throws Exception
   {
      creativeActions.fillTransaltionPageDetails(creativeName, textlink, summary);
   }

   @Then("^The following card should get transfered to the Translation Review$")
   public void the_following_card_should_get_transfered_to_the_Translation_Review() throws Exception
   {
      creativeActions.verifyIsCreativeSubTabActive(Creatives.CreativesSubTabs.TRANSLATIONREVIEW.toString());
      creativeActions.verifyCreatedRichMediaCreativeInPage(Creatives.CreaiveInnerPageHeaderText.TRANSLATIONREVIEW.toString(), creativeName, "Default");
   }

   @Then("^User should navigate to \"([^\"]*)\" page$")
   public void user_should_navigate_to_page(String arg1) throws Exception
   {
      creativeActions.verifyIsCreativeSubTabActive(Creatives.CreativesSubTabs.TRANSLATIONREVIEW.toString());
   }

   @Then("^Card should move to \"([^\"]*)\" page creative$")
   public void card_should_move_to_page_creative(String page) throws Exception
   {
      creativeActions.verifyCreatedRichMediaCreativeInPage(Creatives.CreaiveInnerPageHeaderText.APPROVE.toString(), creativeName, "Default");
   }

   @When("^User click on Move to Library Icon Link on approve creative page$")
   public void user_click_on_Move_to_Library_Icon_Link_on_approve_creative_page() throws Exception
   {
      creativeActions.clickMoveToLibraryIcon(creativeName, "");
      // will be removed
   }

   @When("^User click on \"([^\"]*)\" Icon Link on creative list page$")
   public void user_click_on_Move_to__creative_list_page(String iconLinkTitle) throws Exception
   {
      creativeActions.clickMoveToLibraryIcon(creativeName, iconLinkTitle);

   }

   @When("^User click on View Icon Link on approve creative page$")
   public void user_click_on_View_Icon_Link_on_approve_creative_page() throws Exception
   {
      creativeActions.clickViewIconOnCreativePage(creativeName);
   }

   @When("^User Clicks on OK Model button$")
   public void user_Clicks_on_OK_Model_button() throws Exception
   {
      creativeActions.ClickModelOkButton();
   }

   @Then("^Model popup with below buttons should display$")
   public void model_popup_with_below_buttons_should_display(DataTable dataTable) throws Exception
   {
      List<String> list = dataTable.asList(String.class);
      list.forEach(buttonText -> creativeActions.verifyIsSaveNavigationByButtonTextDisplayed(buttonText));
   }

   @Then("^Page should have following Save and Navigation options$")
   public void page_should_have_following_Save_and_Navigation_options(DataTable dataTable) throws Exception
   {
      CommonUtils.waitForSeconds(3);
      List<String> list = dataTable.asList(String.class);
      list.forEach(buttonText -> creativeActions.verifyIsSaveNavigationByButtonTextDisplayed(buttonText));
   }

   @Then("^Card should move to Library of \"([^\"]*)\" in \"([^\"]*)\" Folder$")
   public void card_should_move_to_Library_of_in_Folder(String creativeType, String folderName) throws Exception
   {
      creativeActions.clickRichMediaLibraryMenu();
      creativeActions.navigateToRichMediaCreativeTypeTab(creativeType);
      creativeActions.verifyCreatedRichMediaCreativeInPage(Creatives.CreaiveInnerPageHeaderText.LIBRARY.toString(), creativeName, folderName);
   }

   @When("^User creates new tag \"([^\"]*)\" with existing category as \"([^\"]*)\" & strength number as \"([^\"]*)\" & membership card as \"([^\"]*)\" and point as \"([^\"]*)\"$")
   public void user_creates_new_tag_with_existing_category_as_strength_number_as_membership_card_as_and_point_as(
      String tagName,
      String tagCategory,
      String tagStrength,
      String memberShip,
      String points)
      throws Exception
   {
      creativeActions.selectTagByName1("add");
      adtagname = tagName + CommonUtils.getDateAsUniqueString();
      creativeActions.createNewTagWithExistingCategory(tagCategory, adtagname, tagStrength, memberShip, points);

   }

   @When("^User creates new tag \"([^\"]*)\" with new category as \"([^\"]*)\" & strength number as \"([^\"]*)\" & membership card as \"([^\"]*)\" and point as \"([^\"]*)\"$")
   public void user_creates_new_tag_with_new_category_as_strength_number_as_membership_card_as_and_point_as(
      String tagName,
      String tagCategory,
      String tagStrength,
      String memberShip,
      String points)
      throws Exception
   {
      creativeActions.selectTagByName1("add");
      adtagname = tagName + CommonUtils.getDateAsUniqueString();
      catName = tagCategory + CommonUtils.getDateAsUniqueString();
      creativeActions.createNewTagWithNewCategory(catName, adtagname, tagStrength, memberShip, points);

   }

   @When("^User clicks on Resassign button$")
   public void user_clicks_on_Resassign_button() throws Exception
   {
      creativeActions.clickReassignButton();
      creativeActions.clickReassignButton();
   }

   @Then("^User should see Reassign to draft menu option$")
   public void user_should_see_Reassign_to_draft_menu_option() throws Exception
   {
      creativeActions.verifyReassignToDraftMenuOptionVisiblity();
   }

   @Then("^User should see Reassign to Translation menu option$")
   public void user_should_see_Reassign_to_Translation_menu_option() throws Exception
   {
      creativeActions.verifyReassignToTranslationMenuOptionVisiblity();

   }

   @When("^User clicks on Reassign to draft menu option$")
   public void user_clicks_on_Reassign_to_draft_menu_option() throws Exception
   {
      creativeActions.clickReassignToDraftMenuOption();
   }

   @When("^User clicks on Reassign to Translation menu option$")
   public void user_clicks_on_Reassign_to_Translation_menu_option() throws Exception
   {
      creativeActions.clickReassignToTranslationMenuOption();
   }

   @Then("^User should see the popup of \"([^\"]*)\" with email Id's which is registere in the user management module$")
   public void user_should_see_the_popup_of_with_email_Id_s_which_is_registere_in_the_user_management_module(String title) throws Exception
   {
      creativeActions.verifyAssignUserPopupVisiblity();
   }

   @When("^User selects all checkBox on NotifyUser popup$")
   public void user_selects_all_checkBox_on_NotifyUser_popup() throws Exception
   {
      creativeActions.checkAllNotifyUserCheckBox();
   }

   @Then("^All Notify User checkbox should checked for Notification$")
   public void all_Notify_User_checkbox_should_checked_for_Notification() throws Exception
   {
      creativeActions.verifySelectAllNotifyUserByEmail();
   }

   @When("^User Un-checks all checkbox on NotifyUser popup$")
   public void user_Un_checks_all_checkbox_on_NotifyUser_popup() throws Exception
   {
      creativeActions.unCheckAllNotifyUsers();
   }

   @Then("^All checkbox should un-checked for Notify User$")
   public void all_checkbox_should_un_checked_for_Notify_User() throws Exception
   {
      creativeActions.verifyUnSelectAllNotifyUserByEmail();

   }

   @When("^User clicks on OK button notify User model$")
   public void user_clicks_on_OK_button_notify_User_model() throws Exception
   {
      creativeActions.clickNotifyUserModelPopupOKButton();
   }

   @Then("^All selected Users should receive notification$")
   public void all_selected_Users_should_receive_notification() throws Exception
   {
      // creativeActions.verifyEmailNotification();
      // creativeActions.verifyEmailNotification();

   }

   @When("^User selects any of the email id$")
   public void user_selects_any_of_the_email_id() throws Exception
   {
      creativeActions.selectAnyUserEmail();
      creativeActions.clickReassignModelPopupButton();
   }

   @When("^User selects notify user by email id$")
   public void user_selects_notify_user_by_the_email_id() throws Exception
   {
      creativeActions.selectNotifyUserByEmail();
      creativeActions.clickNotifyUserModelPopupOKButton();
   }

   @Then("^User should receive notfication for creative$")
   public void user_should_receive_notfication_for_creative() throws Exception
   {
      CommonUtils.waitForSeconds(5);
      creativeActions.verifyEmailNotification();
   }

   @Then("^User should receive notfication for RichMedia creative for \"([^\"]*)\"$")
   public void user_should_receive_notfication_for_creative_for_type(String type) throws Exception
   {
      CommonUtils.waitForSeconds(5);
      creativeActions.verifyEmailNotification(creativeName, type, true);
   }

   @Then("^Preview model should display with exit button$")
   public void preview_model_should_display_with_exit_button() throws Exception
   {
      creativeActions.verifyPreviewModelExitButton();
   }

   @Then("^Preview model should display properly for differnt devices$")
   public void preview_model_should_display_properly_for_different_devices(DataTable dt) throws Exception
   {
      List<Map<String, String>> list = dt.asMaps(String.class, String.class);

      for (int i = 0; i < list.size(); i++)
      {

         Log.info("Device: " + list.get(i).get("Device"));
         Log.info("Class: " + list.get(i).get("Class"));

         creativeActions.selectDeviceByName(list.get(i).get("Device"));
         creativeActions.verifySelectedDeviceName(list.get(i).get("Class"));
      }

   }

   @Then("^Preview model should display link with creative description$")
   public void preview_model_should_display_link_with_creative_description() throws Exception
   {
      creativeActions.verifyPreviewModelExitButton();
   }

   @When("^User clicks on description link in preview model$")
   public void user_clicks_on_description_link_in_preview_model() throws Exception
   {
      creativeActions.verifyclickPreviewModelDescLink(description);
   }

   @Then("^User should navigate to new descrption window$")
   public void user_should_navigate_to_new_descrption_window() throws Exception
   {
      creativeActions.verifyNewlyOpenPreviewDescTab();
   }

   @Then("^User close preview Model by clicking exit button$")
   public void user_close_preview_Model_by_clicking_exit_button() throws Exception
   {
      creativeActions.clickPreviewModelExitButton();
   }

   @When("^User clicks on Add New folder button$")
   public void user_clicks_on_Add_New_folder_button() throws Exception
   {
      creativeActions.clickAddNewFolderButton();
   }

   @Then("^User should see add create new folder popup$")
   public void user_should_see_add_create_new_folder_popup() throws Exception
   {
      creativeActions.verifyNavigationToAddNewFolderPopup();
   }

   String newfolderName;

   @When("^User enter folder name as \"([^\"]*)\"$")
   public void user_enter_folder_name_as(String folderName) throws Exception
   {
      creativeActions.enterFolderName(folderName);
      this.newfolderName = folderName;
   }

   @When("^User clicks on create folder submit button$")
   public void user_clicks_on_create_folder_submit_button() throws Exception
   {
      creativeActions.clickCreateFolderSubmitBtn();
   }

   @Then("^New folder should be created as \"([^\"]*)\"$")
   public void new_folder_should_be_created_as(String arg1) throws Exception
   {
      creativeActions.verifyIsFolderExists(newfolderName, true);
   }

   @When("^User clicks on delete folder button$")
   public void user_clicks_on_delete_folder_button() throws Exception
   {
      creativeActions.navigateToCreatedFolderByName(newfolderName);
      creativeActions.clickEditFolderIconsByName(newfolderName);
      creativeActions.clickCreateDeleteFolderButton();
   }

   @Then("^Folder should be deleted successfully$")
   public void folder_should_be_deleted_successfully() throws Exception
   {
      CommonUtils.waitForSeconds(4);
      creativeActions.verifyIsFolderExists(newfolderName, false);
   }

   int countInFolder;

   @When("^User clicks on creative move button by creative name$")
   public void user_clicks_on_creative_move_button() throws Exception
   {
      countInFolder = creativeActions.getCreativeCountInFolder();
      Log.info("Creative count: " + countInFolder);
      creativeActions.clickCreativeMoveButtonByName(newfolderName, creativeName);
   }

   @Then("^Crerative should moved succefully in \"([^\"]*)\"$")
   public void crerative_should_moved_succefully_in(String newfolderName) throws Exception
   {
      creativeActions.clickCreativeMenu();
      creativeActions.verifyCreatedRichMediaCreativeInPage(Creatives.CreaiveInnerPageHeaderText.DRAFT.toString(), creativeName, newfolderName);

   }

   @Then("^Count should increased by (\\d+) in \"([^\"]*)\" folder and in label$")
   public void count_should_increased_by_in_folder_and_in_label(int count, String newfolderName) throws Exception
   {
      creativeActions.verifyCreativeCountInFolder(1);
      creativeActions.verifyCreativeCountInFolderLabel(newfolderName, count);
   }

   @Then("^Count should decresed by (\\d+) in \"([^\"]*)\" folder and in label$")
   public void count_should_decresed_by_in_folder_and_in_label(int arg1, String folderName) throws Exception
   {
      creativeActions.verifyDeletedRichMediaCreativeInPage(creativeName, folderName);
      creativeActions.verifyCreativeCountInFolderLabel(folderName, countInFolder - 1);

   }

   @Then("^Rich Media creative card content should not translated$")
   public void richMediaCreativeCardContentShouldNotTranslated() throws Throwable
   {
      creativeActions.verifyIsContentTranslated(creativeName, false);
   }

   @Then("^Rich Media creative card content should translated$")
   public void richMediaCreativeCardContentShouldTranslated() throws Throwable
   {
      creativeActions.verifyIsContentTranslated(creativeName, true);

   }
}
