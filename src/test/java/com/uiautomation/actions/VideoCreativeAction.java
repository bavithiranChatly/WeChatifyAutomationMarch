package com.uiautomation.actions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.endsWith;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import java.util.List;

//import com.uiautomation.pages.RichMediaCreativesPage;
import com.uiautomation.pages.VideoCreativePages;
import com.uiautomation.utils.CommonUtils;
import com.wechatify.utils.Constants;

import jline.internal.Log;
import net.thucydides.core.annotations.Step;

public class VideoCreativeAction 
{
   
 //  RichMediaCreativesPage RichMediaCreativesPage;
   VideoCreativePages VideoCreativePages;
   
  
   @Step
   public void VerifyFolderName(String FolderName)
   {
      //assertThat("Verify Folder name", VideoCreativePages.VerifyFolderName(), is(equalTo(FolderName)));
      VideoCreativePages.VerifyFolderName(FolderName);
      
   }
   
   @Step
   public void verifyVideoCreatePageNavigation()   // to check the "Create New Message Card: Video"
   {
      assertThat("Verify Video creative create page navigation:", VideoCreativePages.isVideoPageHeaderDisplayed(), is(equalTo(true)));
   }
   
   @Step  // selecting Subtype Media type
   public void selectingSubMediaType(String MediaType)
   {
      VideoCreativePages.selectingSubMediaTypeAction(MediaType);
   }
   
   @Step
   public void getTextFormActiveCreativeSub()
   {
      VideoCreativePages.getTextFromCreativeSubTabPages();
   }
   
   @Step
   public void enterVideoCreativeInformation(final String title,final String Description,final String ClearOrSend)
   {
      VideoCreativePages.VideoCreativeActivity(title,Description,ClearOrSend);
   }
   
   @Step
   public void enterTransVideoCreativeInformation(final String Transtitle,final String TransDescription)
   {
      VideoCreativePages.TransVideoCreativeActivity(Transtitle,TransDescription);
   }
   
   @Step
   public void TransFieldClear()
   {
      VideoCreativePages.TransFieldClearActivity();
   }
   
   @Step
   public void enterTransDescription(String TransDescription) 
   {
      VideoCreativePages.EnterTransDescriptionActivity(TransDescription); 
   }
   
   @Step
   public void verifyUploadImageToolTipText(List<String> tooltiptext)   // video tooltip 
   {
      for (String tooltip : tooltiptext)
      {
         Log.info("Tooltip text:" + VideoCreativePages.getVideoToolTipText());
         Log.info("Tool tip: " + tooltip);
         assertThat("Verify upload image tooltip text", VideoCreativePages.getVideoToolTipText().contains(tooltip), is(equalTo(true)));
      }
   }
   
   @Step
   public void uploadVideoWithSaveBtn(String Videoname,String Lang)
   {
      VideoCreativePages.uploadVideoNew(Constants.TEST_DATA_PATH + Videoname,Lang);
   }
   
   @Step  //Clicking the Preview option in the create/edit Page
   public void PreviewTofollowerBtnClickAction(String PreviewOpt)
   {
      VideoCreativePages.PreviewTofollowerBtnClick(PreviewOpt);
   }
   
   @Step // Clicking the Preview to follower / Exit Preview  option functionality.
   public void ClickPreviewTofollowerOrExitPreview(String PreviewTofollowerOrExit)
   {
      VideoCreativePages.ClickPreviewTofollowerOrExitPreview(PreviewTofollowerOrExit);
   }
   
   @Step   // Mobile preview types modal click
   public void MobilePreviewClickAction()
   {
      VideoCreativePages.mobilePreviewModalClick();
   }
   
   @Step // Entering Username to send Preview to follower and click on Search
   public void EnterUsernameAndSearchInPreviewTofollowerAction(String Username)
   {
      VideoCreativePages.EnterUsernameAndSearchInPreviewTofollower(Username);
   }
   
   @Step // To click the checkboc in Preview to follower
   public void UsernameCheckBoxSearchActions(String UserPreviewName) 
   {
      VideoCreativePages.UsernameCheckBoxSearch(UserPreviewName);
   }
   
   @Step
   public void ClickOnSendOrCloseAction(String SendOrClose) 
   {
      VideoCreativePages.ClickOnSendOrClosePage(SendOrClose);
   }
   
   @Step  // folder selection
   public void selectFolderVByNamendVerifyNavigation(String selectFolderName)
   {
      VideoCreativePages.selectFolderVByName(selectFolderName);
      CommonUtils.waitForSeconds(1);

   }
   
   @Step    // video edit creative button 
   public void clickVideoDraftReviewEditBtn(String VideoName)
   {
      VideoCreativePages.clickVideoDraftReviewEditBtn(VideoName);
   }
   
   @Step // Selecting card for moveing to another folder 
   public void SelectingVideoMoveToFolder(String VideoName)
   {
      VideoCreativePages.SelectingVideoMoveToFolderAction(VideoName);
   }
   
   @Step
   public void selectingFolderForMovingCard(String CreatedFolderName)
   {
      VideoCreativePages.selectFolderInMoveToFolder(CreatedFolderName);
   }
   
   @Step
   public void CancelOrMoveBtnClick(String CancelOrMove) 
   {
      VideoCreativePages.CancelOrMoveActionInMoveToFolder(CancelOrMove);
   }
   
   @Step   //Video Edit creative button
   public void clickVideoDraftReviewViewBtn(String VideoName)
   {
      VideoCreativePages.clickVideoDraftReviewViewBtn(VideoName);
   }
   
   @Step  // delete Video Card 
   public void clickVideoDraftReviewDeleteBtn(String VideoName)
   {
      VideoCreativePages.clickVideoDraftReviewDeleteBtn(VideoName);
   }
   
   @Step // Transfer Edit Icon
   public void clickEditIconAction(String VideoName,String TransferIcon)
   {
      VideoCreativePages.clickTransferIcon(VideoName, TransferIcon);
   }
   
   @Step // Delete OK BTN
   public void ClickDeleteOKBtn()
   {
      VideoCreativePages.ClickDeleteOKBtn();
   }
   //@Step
   //public void clickUploadVideoToolTipButton()
   //{
   //   VideoCreativePages.clickUploadVideoToolTipIcon();     // To validate the tooltip text
  // }
   
   @Step
   public void clickVideoUploadClickToolTipButton()   //Video tooltip click
   {
      VideoCreativePages.clickUploadVideo1ClickToolTipIcon();
   }
   
   @Step
   public void verifyUploadVideoToolTipText(List<String> tooltiptext)
   {
      for (String tooltip : tooltiptext)
      {
         Log.info("Tooltip text:" + VideoCreativePages.getVideoToolTipText());
         Log.info("Tool tip: "+tooltip);
         assertThat("Verify upload video tooltip text", VideoCreativePages.getVideoToolTipText().contains(tooltip), is(equalTo(true)));
         CommonUtils.waitForSeconds(5);
      }
   }
   
   @Step
   public void PresentFolderName()
   {
      VideoCreativePages.CreatedFolderNameCheck();
   }
   
   @Step
   public void ClickMoveToFolderIcon()
   {
      VideoCreativePages.VideoCreativePagesActions();
   }
   
   @Step
   public void clickAddNewFolder(String AddNewFolder)  // Add New Folder Flow
   {
      VideoCreativePages.ClickCreatedFolderAction(AddNewFolder);
   }
   
   @Step
   public void ClickCreatedFolder(String FoldernametoSelected)
   {
      VideoCreativePages.clickOnAddNewFolder(FoldernametoSelected);
   }
   
   @Step
   public void CheckPagination()
   {
      VideoCreativePages.CheckPaginationAction();
   }
   
   @Step
   public void VerifycardByName(String VideoName)
   {
      VideoCreativePages.VerifyCardInFolder(VideoName);
   }
   
   @Step // Ok or Cancel button in delete popup
   public void ClickOkOrCancelInDel(String OkOrCancel)
   {
      VideoCreativePages.ClickOkOrCancelInDelAction(OkOrCancel);
   }
   
   @Step // Trasnfer icon ok or cancel popup
   public void TransferOkOrCancelPopupAction(String TransferOkOrCancel)
   {
      VideoCreativePages.TransferIconOkOrCancelBtnClick(TransferOkOrCancel);
   }
   
   @Step // click header Tabs Creative or Library
   public void CreativeHeaderTabsActions(String HeaderTabs)
   {
      VideoCreativePages.ClickHeaderTabs(HeaderTabs);
   }
   
   @Step
   public void CreativeSubTabAction(String TabName)
   {
      VideoCreativePages.ClickCreativeSubTabs(TabName);
   }
   
   @Step    // Enter Folder name 
   public void EnterFolderName(String FolderName)   
   {
      VideoCreativePages.EnterFolderNamePage(FolderName);
   }
   
   @Step  //Folder option Btn
   public void OptionFolderBtn()
   {
      VideoCreativePages.OptionFolderBtnAction();
   }
   
   @Step
   public void EditOptionFolderBtn()
   {
      VideoCreativePages.EditOptionFolderBtnAction();
   }
   
   @Step
   public void DeleteOptionFolderBtn()
   {
      VideoCreativePages.DeleteOptionFolderBtnAction();
   }
   
   @Step  // Clicks on submit or cancel button
   public void clickSubmit()
   {
      VideoCreativePages.clickSubmitPages();
   }
   
   @Step  // common method for checking the validation for the Folder Name Validation
   public void verifyFolderFieldValidationError(String FolderFieldErrorMsg)
   {
      //assertThat("Verify FolderNameField validation error:", VideoCreativePages.getFolderFieldValidationError(), equalTo(FolderFieldErrorMsg));
      
      
      assertThat("Verify FolderNameField validation error:", VideoCreativePages.getFolderFieldValidationError(), endsWith(FolderFieldErrorMsg));

   }
   
   @Step  // Clicks on cancel button
   public void clickCancel()
   {
      VideoCreativePages.clickCancelPages();
   }

   
   
   
   @Step
   public void clickSaveVideoCreativeButton()
   {
      VideoCreativePages.clickCreativeVideoSaveBtn();
      Log.info("Clicked Creative Save button");
   }
   
   @Step    // submit for draft Review
   public void clicksubmitForDraftReviewVideoCreativeButton()
   {
      VideoCreativePages.clickCreativeVideosubmitForDraftReviewBtn();
      Log.info("Clicked Creative submitForDraftReview button");
   }
   
   @Step  // submit for Translation 
   public void clicksubmitForTranslationVideoCreativeButton()
   {
      VideoCreativePages.clickCreativeVideosubmitForTranslationBtn();
      Log.info("Clicked Creative submit for Translation button");
   }
   
   @Step // submit for TranslationReview
   public void clicksubmitForTranslationReviewVideoCreativeButton()
   {
      VideoCreativePages.clickCreativeVideosubmitForTranslationReviewBtn();
      Log.info("Clicked Creative submit for TranslationReview button");
   }
   
   @Step // submit for approval
   public void clicksubmitForApprovalVideoCreativeButton()
   {
      VideoCreativePages.clickCreativeVideosubmitForApprovalBtn();
      Log.info("Clicked Creative submit for Approval button");
   }
   
   @Step
   public void clickPreviewToFollowerVideoCreativeButton( )
   {
      VideoCreativePages.clickCreativeVideoPreviewToFollowerBtn();
      Log.info("Clicked Creative PreviewToFollower button");
   }
   
   @Step
   public void PreUserSelect( )
   {
      VideoCreativePages.ClickOnPreUser();
      Log.info("Clicked Creative PreviewToFollower User Select ");
   }
   
   
   @Step
   public void clickBackToListVideoCreativeButton(String BackToList)
   {
      VideoCreativePages.clickCreativeVideoBackToListBtn(BackToList);
      Log.info("Clicked Creative BackToList button");
   }
   
   
   
   @Step
   public void clickSaveAndCloseVideoCreativeButton()
   {
      VideoCreativePages.clickCreativeVideoSaveAndCloseBtn();
      Log.info("Clicked Creative SaveAndClose button");
   }
   
   @Step
   public void verifyVideoTitleValidationError(String titleErrorMsg)
   {
      assertThat("Verify title validation error:", VideoCreativePages.getTitleTextValidationError(), equalTo(titleErrorMsg));

   }
   
   @Step
   public void verifyTransTitleValidationError(String TranstitleErrorMsg)
   {
      assertThat("Verify Transtitle validation error:", VideoCreativePages.getTransTitleTextValidationError(), equalTo(TranstitleErrorMsg));

   }

   
   
   @Step
   public void VerifyMessageValidationError(String MessageErrorMsg)
   {
      assertThat("Verify Text Message field Validation error : ", VideoCreativePages.getMessageTextValidationError(),equalTo(MessageErrorMsg) );
      CommonUtils.waitForSeconds(3);
   }
   
   @Step
   public void VerifyTransMessageValidationError(String TransMessageErrormsg)
   {
      assertThat("Verify Text Message field Validation error : ", VideoCreativePages.getTransMessageTextValidationError(),equalTo(TransMessageErrormsg) );
      CommonUtils.waitForSeconds(3);
   }
   
   @Step
   public void VerifyVideoUploadValidationError(String InvalidVideoErrorMsg)
   {
      assertThat("Verify Video Upload Validation Error : ",VideoCreativePages.getVideoUploadValidationError(),equalTo(InvalidVideoErrorMsg));
      CommonUtils.waitForSeconds(3);
   }
   
   @Step
   public void VerifyVideoInvalidValidationError(String ValidationPopUp)   //Please upload only MP4 Video format
   {
      assertThat("Verify Video Creative Message Field PopUp Validation Error :",VideoCreativePages.getVideoInvalidValidationError(),equalTo(ValidationPopUp));
   }
   
   public static void main(String[] args)
   {
      // TODO Auto-generated method stub

   }

}