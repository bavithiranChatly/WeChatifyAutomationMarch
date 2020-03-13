/**
 * 
 */
package com.uiautomation.actions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

//import com.openhtmltopdf.util.Constants;
import com.uiautomation.pages.AudioCreativePages;
import com.uiautomation.utils.CommonUtils;
import com.wechatify.utils.Constants;

import net.thucydides.core.annotations.Step;

/**
 * 
 * @version $Id$
 */
public class AudioPageAction
{
   AudioCreativePages AudioCreativePages;
   
   /**
    * @Description: 
    * @param
    * @return : void
    * @exception :
    * @Created_by : bavithiranpc
   */
   
   @Step
   public void enterAudioCreativeInformation(String AudioTitle,String SendOrClose)
   {
      AudioCreativePages.enterAudioCreativeInfoPages(AudioTitle,SendOrClose);
   }
   
   @Step
   public void VerifyAudioUploadValidationError(String InvalidVideoErrorMsg)
   {
      assertThat("Verify Video Upload Validation Error : ",AudioCreativePages.getAudioUploadValidationError(),equalTo(InvalidVideoErrorMsg));
      CommonUtils.waitForSeconds(5);
   }
   
   @Step
   public void enterAudioTransCreativeInformation(String TransAudioTitle,String SendOrClose)
   {
      AudioCreativePages.enterAudioTransCreativeInfoPages(TransAudioTitle,SendOrClose);
   }
   
   @Step
   public void uploadAudioWithSaveBtn(String Audioname,String Lang)
   {
      AudioCreativePages.uploadAudioNew(Constants.TEST_DATA_PATH + Audioname,Lang);
   }
   
   @Step // Transfer Edit Icon
   public void clickAudioEditIconAction(String AudioName,String TransferIcon)
   {
      AudioCreativePages.clickAudioTransferIcon(AudioName, TransferIcon);
   }
   
   @Step    // video edit creative button 
   public void clickAudioEditBtn(String AudioName)
   {
      AudioCreativePages.clickAudioEditBtn(AudioName);
   }
   
   @Step
   public void clickAudioViewBtn(String AudioName)
   {
      AudioCreativePages.clickAudioViewBtn(AudioName);
   }
   
   @Step
   public void VerifyAudiocardByName(String AudioName)
   {
      AudioCreativePages.VerifyAudioCardByName(AudioName);
   }
   
   
   public static void main(String[] args)
   {
      // TODO Auto-generated method stub

   }

}
