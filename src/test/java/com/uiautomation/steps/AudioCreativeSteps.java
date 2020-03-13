/**
 * 
 */
package com.uiautomation.steps;

import com.uiautomation.actions.AudioPageAction;
import com.uiautomation.utils.CommonUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
/**
 * 
 * @version $Id$
 */
public class AudioCreativeSteps
{
   String AudioName;
   
   @Steps
   AudioPageAction AudioPageAction;
   /**
    * @Description: 
    * @param
    * @return : void
    * @exception :
    * @Created_by : bavithiranpc
   */
   
   
   
   @When("USer enters Audio Creative \"([^\"]*)\" and \"([^\"]*)\"")
   public void User_Enters_AudioCreative_title(String AudioTitle,String SendOrClear)
   {
      AudioTitle =  AudioTitle+CommonUtils.getDateAsUniqueString();
      AudioName = AudioTitle;
      
      AudioPageAction.enterAudioCreativeInformation(AudioTitle,SendOrClear);
   }
   
   @Then("^Validation error should display for Invalid Audio Upload as \"([^\"]*)\"$") // Please upload video
   public void Validaton_Error_should_display_for_Invalid_Audio_Upload(String InvalidVideoErrorMsg) throws Exception
   {
      AudioPageAction.VerifyAudioUploadValidationError(InvalidVideoErrorMsg);
   }
   
   @When("USer enters Audio TransCreative \"([^\"]*)\" and \"([^\"]*)\"")
   public void User_Enters_TransAudioCreative_title(String TransAudioTitle,String SendOrClear)
   {
      TransAudioTitle =  TransAudioTitle+CommonUtils.getDateAsUniqueString();
      //AudioName = AudioTitle;
      
      AudioPageAction.enterAudioTransCreativeInformation(TransAudioTitle,SendOrClear);
   }
   
   @When("^User uploads valid image to Audio creative with name as \"([^\"]*)\" and \"([^\"]*)\"$")
   public void users_uploads_image_to_Audio_creative_type(String Audioname, String Lang) throws Exception
   {
      AudioPageAction.uploadAudioWithSaveBtn(Audioname, Lang);
      // VideoCreativeAction.verifyImageUpload();
      CommonUtils.waitForSeconds(10);
   }
   
   @When("^User Clicks Audio \"([^\"]*)\" Transfer icon$") // Transfer icon functionality
   public void User_ClicksAudio_Transfer_icon(String TransferIcon) throws Exception
   {

      AudioPageAction.clickAudioEditIconAction(AudioName, TransferIcon);
   }
   
   @When("^User clicks edit button of Audio creative$") // Video creative edit flow
   public void user_clicks_edit_button_of_Audio_creatives() throws Exception
   {
      AudioPageAction.clickAudioEditBtn(AudioName);
   }
   
   @When("^User clicks View button of Audio creative$")
   public void User_clicks_View_button_of_Audio_creative() throws Exception
   {
      AudioPageAction.clickAudioViewBtn(AudioName);
   }
   
   @Then("^Verify the Created Audio card is available or not$")
   public void Verify_the_created_Audio_card_is_available_or_not()
   {
      AudioPageAction.VerifyAudiocardByName(AudioName);
   }
   
   
   public static void main(String[] args)
   {
      // TODO Auto-generated method stub

   }

}
