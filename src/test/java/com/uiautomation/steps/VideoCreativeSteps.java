/*
 * Copyright (C) 2019 Wechatify.com, Inc. All Rights Reserved.
 * Proprietary and confidential.
 */
package com.uiautomation.steps;

import java.util.List;

//import com.uiautomation.actions.RichMediaCreativesActions;
import com.uiautomation.actions.VideoCreativeAction;
import com.uiautomation.utils.CommonUtils;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

/*
 * TODO: 
 * @auther Narottam Singh  
 * @created 29-Apr-2019 2019 11:38:37 am
 */
public class VideoCreativeSteps
{

   // RichMediaCreativesActions creativeActions;
   private String UserPreviewName;
   private String VideoName;
   public String CreatedFolderName;
   @Steps
   VideoCreativeAction VideoCreativeAction;


   @Then("^User should see \"([^\"]*)\" video_creative page$")
   public void user_should_see_video_creative_page(String arg1) throws Exception
   {
      VideoCreativeAction.verifyVideoCreatePageNavigation();
   }

   @When("^User Clicks \"([^\"]*)\" subType Grid$") // selecting Sub media Type
   public void User_Clicks_subType_Grid(String MediaType) throws Exception
   {
      VideoCreativeAction.selectingSubMediaType(MediaType);
   }

   @Then("^get text from active Creative sub tabs$") // to get Active creative sub tab name
   public void get_text_from_active_creative_sub_tabs() throws Exception
   {
      VideoCreativeAction.getTextFormActiveCreativeSub();
   }

   @When("^User clicks edit button of Video creative$") // Video creative edit flow
   public void user_clicks_edit_button_of_Video_creatives() throws Exception
   {
      VideoCreativeAction.clickVideoDraftReviewEditBtn(VideoName);
   }

   @Then("^User selects a card for Moveing the folder Video card$") // selecting a card in move to folder option
   public void User_select_a_Card_for_MoveToFolder_Video_card() throws Exception
   {
      VideoCreativeAction.SelectingVideoMoveToFolder(VideoName);
   }

   @When("^User select the Folder for MoveToFolder$") // selecting folder for moving the selected card
   public void User_select_the_Folder_for_MoveToFolder() throws Exception
   {
      VideoCreativeAction.selectingFolderForMovingCard(CreatedFolderName);
   }

   @Then("^User Click on CancelOrMove \"([^\"]*)\" for moving the card$") // cancel or move option selection
   public void User_clicks_on_CancelOrMove_for_moving_the_card(String CancelOrMove) throws Exception
   {
      VideoCreativeAction.CancelOrMoveBtnClick(CancelOrMove);
   }

   @When("^User clicks view button of Video creative$")
   public void user_clicks_view_button_of_Video_creatives() throws Exception
   {
      VideoCreativeAction.clickVideoDraftReviewViewBtn(VideoName);
   }

   @When("^User clicks Delete button of Video creative$") // Delete Video Btn
   public void user_clicks_Delete_button_of_Video_creatives() throws Exception
   {
      VideoCreativeAction.clickVideoDraftReviewDeleteBtn(VideoName);
   }

   @When("^User Clicks \"([^\"]*)\" Transfer icon$") // Transfer icon functionality
   public void User_Clicks_Transfer_icon(String TransferIcon) throws Exception
   {

      VideoCreativeAction.clickEditIconAction(VideoName, TransferIcon);
   }

   @Then("^User clicks on Delete OK button$") // Delete popup OK Btn
   public void user_clicks_on_Delete_OK_button() throws Exception
   {
      VideoCreativeAction.ClickDeleteOKBtn();
   }

   @When("^User enters video creative title as \"([^\"]*)\" Description as \"([^\"]*)\" and \"([^\"]*)\"$")
   public void User_enters_title_as_Description_as(String Title , String Description, String ClearOrSend)
   {
      
      Title =  Title+CommonUtils.getDateAsUniqueString();
      VideoName =   Title ; 
     
      VideoCreativeAction.enterVideoCreativeInformation(Title,Description,ClearOrSend);
   
      //VideoName =  Title+CommonUtils.getDateAsUniqueString();  
     
   }
   
   @When("^User enters video creative TransTitle as \"([^\"]*)\" TransDescription as \"([^\"]*)\"$")
   public void User_enters_TransTitle_as_TransDescription_as(String TransTitle, String TransDescription)
   {
      TransTitle = TransTitle + CommonUtils.getDateAsUniqueString();

      VideoCreativeAction.enterTransVideoCreativeInformation(TransTitle, TransDescription);
      // VideoName = TransTitle;
   }

   @Then("^Clear TransTitle and TransDescription$")
   public void Clear_TransTitle_and_TransDescriptions()
   {
      VideoCreativeAction.TransFieldClear();
   }

   @When("^User enters TransDescription as \"([^\"]*)\"$")
   public void User_enters_transDescription_as(String TransDescription)
   {
      VideoCreativeAction.enterTransDescription(TransDescription);
   }

   @When("^User clicks upload Video tooltip button for Video creative$") // Click Video tooltip
   public void User_clicks_upload_tooltip_button_for_jumplink_richmedia_creative()
   {
      VideoCreativeAction.clickVideoUploadClickToolTipButton();
   }

   @Then("^Video creative toop tip should display with correct text$") // Video upload Tooltip text check.
   public void Video_creative_toop_tip_should_display_with_correct_text(DataTable dataTable) throws Exception
   {
      List<String> toolTipSet = dataTable.asList(String.class);
      VideoCreativeAction.verifyUploadVideoToolTipText(toolTipSet);
      CommonUtils.waitForSeconds(5);
   }

   @When("^User checks present Folder name$") // verifing the folder name present or not
   public void User_checks_present_Folder_name() throws Exception
   {
      VideoCreativeAction.PresentFolderName();
   }

   @When("^User Click on MoveToFolder Icon$") // Clickin the Moveto folder icon
   public void User_Click_on_MoveToFolder_icon()
   {
      VideoCreativeAction.ClickMoveToFolderIcon();
   }

   @When("^User clicks \"([^\"]*)\" button$") // Add New Folder Click Flow
   public void user_Clicks_AddNewFolder_button(String AddNewFolder) throws Exception
   {
      VideoCreativeAction.clickAddNewFolder(AddNewFolder);
   }

   @When("^User Clicks on \"([^\"]*)\" Folder by name$") // Clicking the folder by name
   public void User_Clicks_on_Folder(String FoldernametoSelected)
   {
      VideoCreativeAction.ClickCreatedFolder(CreatedFolderName);
   }

   @Then("^Check the Pagination in the creative Page$")
   public void Check_the_Pagination_in_the_creative_Page()
   {
      VideoCreativeAction.CheckPagination();
   }

   @Then("^Verify the card by cardName$")
   public void Verify_the_card_by_cardNAme()
   {
      VideoCreativeAction.VerifycardByName(VideoName);
   }

   @Then("^User Clicks on \"([^\"]*)\" in delete folder popup$") // clicking Ok or Cancel in the delete popup
   public void User_Clicks_Ok_or_Cancel_in_Delete_folder(String OkOrCancel)
   {
      VideoCreativeAction.ClickOkOrCancelInDel(OkOrCancel);
   }

   @Then("^User Click on Ok or Cancel \"([^\"]*)\" in transfer Icon popup$") // clickong ok or cancel btn in transfer icon Popup
   public void User_Clicks_on_Ok_Or_Cancel_in_transfer_Icon_popup(String TransferOkOrCancel)
   {
      VideoCreativeAction.TransferOkOrCancelPopupAction(TransferOkOrCancel);
   }

   @Then("^User Click Header CreativeAndLibrary \"([^\"]*)\" in Header Tab$") // click header Tabs Creative or Library
   public void User_Clicks_Header_Tabs_creativesAndLibrary(String HeaderTabs)
   {
      VideoCreativeAction.CreativeHeaderTabsActions(HeaderTabs);
   }

   @Then("^User Clicks on CreativeSubtabs \"([^\"]*)\"$")
   public void User_Clicks_on_CreativeSubTabs(String TabName)
   {
      VideoCreativeAction.CreativeSubTabAction(TabName);
   }

   @When("^Enter Folder name \"([^\"]*)\" and \"([^\"]*)\"$") // Entering folder Name
   public void Enter_Folder_name(String FolderName, String Date) throws Exception
   {
      if (Date.equalsIgnoreCase("date"))
      {
         FolderName = FolderName + CommonUtils.getDateAsUniqueString();
         VideoCreativeAction.EnterFolderName(FolderName);
         CreatedFolderName = FolderName;
      }
      else if (Date.equalsIgnoreCase("Withoutdate"))
      {
         VideoCreativeAction.EnterFolderName(CreatedFolderName);
         // CreatedFolderName = FolderName;
      }
   }

   @Then("^User Clicks on Option button of Folder$") // Option btn click of folder
   public void User_Clicks_on_Option_button_of_Folder() throws Exception
   {
      VideoCreativeAction.OptionFolderBtn();
   }

   @When("^User Clicks on Edit Option of Folder$") // Edit option click in folder
   public void User_Clicks_on_Edit_Option_of_Folder() throws Exception
   {
      VideoCreativeAction.EditOptionFolderBtn();
   }

   @When("^User Clicks on Delete Option of Folder$") // delete option click in folder.
   public void User_Clicks_on_Delete_Option_of_Folder() throws Exception
   {
      VideoCreativeAction.DeleteOptionFolderBtn();
   }

   @Then("^User Click on Submit in Folder Option$") // Folder Submit button
   public void User_Clicks_on_submit() throws Exception
   {
      VideoCreativeAction.clickSubmit();
   }

   @Then("^Check the created folder present or not$") // Created folder verifying
   public void Check_the_created_folder_present_or_not() throws Exception
   {
      VideoCreativeAction.VerifyFolderName(CreatedFolderName);
   }

   @Then("^Validation error should display for Folder Name field as \"([^\"]*)\"$") // common method for Checking validation Error in the Folder Name field
   public void validation_error_should_display_for_Folder_Name_field_as(String FolderFieldErrorMsg) throws Exception
   {
      VideoCreativeAction.verifyFolderFieldValidationError(FolderFieldErrorMsg);
   }

   @Then("^User Click on Cancel in Folder Option$") // Folder Cancel button
   public void User_Clicks_on_cancel() throws Exception
   {
      VideoCreativeAction.clickCancel();
   }

   @When("^User uploads valid image to Video creative with name as \"([^\"]*)\" and \"([^\"]*)\"$")
   public void users_uploads_image_to_Video_creative_type(String Videoname, String Lang) throws Exception
   {
      VideoCreativeAction.uploadVideoWithSaveBtn(Videoname, Lang);
      // VideoCreativeAction.verifyImageUpload();
      CommonUtils.waitForSeconds(10);
   }

   @When("^User Clicks on Preview button for \"([^\"]*)\"$") // Clicking the Preview option in the create/edit Page
   public void User_clicks_on_preview_button(String PreviewOpt)
   {
      VideoCreativeAction.PreviewTofollowerBtnClickAction(PreviewOpt);
   }

   @Then("^USer Clicks Preview to follower or Exit Preview \"([^\"]*)\"$") // Clicking the Preview to follower / Exit Preview option functionality.
   public void User_clicks_Preview_to_follower_Or_Exit_Preview(String PreviewTofollowerOrExit)
   {
      VideoCreativeAction.ClickPreviewTofollowerOrExitPreview(PreviewTofollowerOrExit);

   }

   @Then("^User Clicks on different types of mobile Preview$") // Mobile preview types modal click
   public void User_clicks_on_different_types_of_mobile_preview()
   {
      VideoCreativeAction.MobilePreviewClickAction();
   }

   @Then("^Enter \"([^\"]*)\" for Preview to follower field  and search$")
   public void Enter_USername_For_preview_to_follower_Field_and_search(String Username)
   {
      VideoCreativeAction.EnterUsernameAndSearchInPreviewTofollowerAction(Username);
      UserPreviewName = Username;
   }

   @Then("^Click on checkbox for a User$")
   public void Click_on_checkbox_for_a_User()
   {
      VideoCreativeAction.UsernameCheckBoxSearchActions(UserPreviewName);
   }

   @Then("^Click on SendOrClose \"([^\"]*)\" in PreviewTofollower$")
   public void Click_on_sendOrClose(String SendOrClose)
   {
      VideoCreativeAction.ClickOnSendOrCloseAction(SendOrClose);
   }

   @When("^User select Folder name for Video from dropdown as \"([^\"]*)\" and \"([^\"]*)\"$") // folder selection while creating
   public void user_select_Folder_name_for_Video_from_dropdown(String selectFolderName, String CreateOrSelect) throws Exception
   {
      if (CreateOrSelect.equalsIgnoreCase("Select"))
      {
         VideoCreativeAction.selectFolderVByNamendVerifyNavigation(selectFolderName);
      }
      else if (CreateOrSelect.equalsIgnoreCase("Create"))
      {
         VideoCreativeAction.selectFolderVByNamendVerifyNavigation(CreatedFolderName);
      }
   }

   @When("^User clicks on save Videocreative button$")
   public void user_clicks_on_save_Videocreative_button() throws Exception
   {

      VideoCreativeAction.clickSaveVideoCreativeButton();
   }

   @When("^User clicks on submitForDraftReview Videocreative button$") // submit for draft review
   public void user_clicks_on_submitForDraftReview_Videocreative_button() throws Exception
   {

      VideoCreativeAction.clicksubmitForDraftReviewVideoCreativeButton();
   }

   @When("^User clicks on submitForTranslation button$") // submit for Translation .
   public void user_clicks_on_submitForTranslation_button() throws Exception
   {
      VideoCreativeAction.clicksubmitForTranslationVideoCreativeButton();
   }

   @When("^User clicks on submitForTranslationReview button$") // submit for TranslationReview
   public void user_clicks_on_submitForTranslationReview_button() throws Exception
   {
      VideoCreativeAction.clicksubmitForTranslationReviewVideoCreativeButton();
   }

   @When("^User clicks on Approve&SendToLibrary button$") // approve and send to approval
   public void User_clicks_on_ApproveAndSendTolibrary_button() throws Exception
   {
      VideoCreativeAction.clicksubmitForTranslationReviewVideoCreativeButton();
   }

   @When("^User clicks on submitForApproval button$") // submit for Approval
   public void User_clicks_on_submitForApproval_button() throws Exception
   {
      VideoCreativeAction.clicksubmitForApprovalVideoCreativeButton();
   }

   @When("^User clicks on PreviewToFollower Videocreative button$")
   public void user_clicks_on_PreviewToFollower_Videocreative_button() throws Exception
   {

      VideoCreativeAction.clickPreviewToFollowerVideoCreativeButton();
   }

   @When("^User selects on Users as \"([^\"]*)\"$")
   public void User_selects_On_Users()
   {
      VideoCreativeAction.PreUserSelect();
   }

   @When("^User clicks on \"([^\"]*)\" Videocreative button$")
   public void user_clicks_on_BackToList_Videocreative_button(String BackToList) throws Exception
   {

      VideoCreativeAction.clickBackToListVideoCreativeButton(BackToList);
   }

   @When("^User clicks on SaveAndClose Videocreative button$")
   public void user_clicks_on_SaveAndClose_Videocreative_button() throws Exception
   {

      VideoCreativeAction.clickSaveAndCloseVideoCreativeButton();
   }

   @Then("^Validation error should display for video/Audio creative title text as \"([^\"]*)\"$")
   public void validation_error_should_display_for_title_text_as_video(String titleErrorMsg) throws Exception
   {
      VideoCreativeAction.verifyVideoTitleValidationError(titleErrorMsg);
   }

   // TransTitle
   @Then("^Validation error should display for transtitle text as \"([^\"]*)\"$")
   public void validation_error_should_display_for_transtitle_text_as(String TranstitleErrorMsg) throws Exception
   {
      VideoCreativeAction.verifyTransTitleValidationError(TranstitleErrorMsg);
   }

   @Then("^Validation error should display for Message text as \"([^\"]*)\"$")
   public void Validaton_Error_should_display_for_Message_text(String MessageErrorMsg) throws Exception
   {
      VideoCreativeAction.VerifyMessageValidationError(MessageErrorMsg);
   }

   @Then("^Validation error should display for TransMessage text as \"([^\"]*)\"$")
   public void Validaton_Error_should_display_for_TransMessage_text(String TransMessageErrormsg) throws Exception
   {
      VideoCreativeAction.VerifyTransMessageValidationError(TransMessageErrormsg);
   }

   @Then("^Validation error should display for Invalid Video Upload as \"([^\"]*)\"$") // Please upload video
   public void Validaton_Error_should_display_for_Invalid_Video_Upload(String InvalidVideoErrorMsg) throws Exception
   {
      VideoCreativeAction.VerifyVideoUploadValidationError(InvalidVideoErrorMsg);
   }

   @Then("^User should see the validation as \"([^\"]*)\"$")
   public void User_should_should_see_the_validation_as(String ValidationPopUp) throws Exception
   {
      VideoCreativeAction.VerifyVideoInvalidValidationError(ValidationPopUp);
   }
   
   @Then("^Validation error should display for video creative title text as \"([^\"]*)\"$")
   public void validation_error_should_display_for_title_text_as(String titleErrorMsg) throws Exception
   {
      VideoCreativeAction.verifyVideoTitleValidationError(titleErrorMsg);
   }
}
