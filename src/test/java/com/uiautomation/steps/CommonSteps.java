
package com.uiautomation.steps;

import java.io.IOException;

import com.uiautomation.actions.RichMediaCreativeActions;
import com.uiautomation.actions.TextCreativePageActions;
import com.uiautomation.pages.CommonPage;
import com.uiautomation.utils.CommonUtils;

import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

/**
 * 
 * @version $Id$
 */
public class CommonSteps extends CommonPage
{

   @Steps
   RichMediaCreativeActions richMediaCreativesActions;
   
   @Steps
   TextCreativePageActions textPageActions;
   
   @When("^User selects the respective module \"([^\"]*)\"$")
   public void User_selects_the_respective_module(String ModuleName) throws Exception
   {
      UserSelectsModule(ModuleName);
   }

   @When("^User Clicks on preview button$")
   public void user_Clicks_on_button_preview() throws Exception
   {
      richMediaCreativesActions.clickPreviewButton();
   }

   @When("^User click on mediatype subtab \"([^\"]*)\"$")
   public void User_click_on_mediatype_subtab(String MediaType) throws Exception
   {
      richMediaCreativesActions.selectingSubMediaTypeAction(MediaType);
   }
   
   @When("^User Clicks on \"([^\"]*)\" button$")
   public void user_Clicks_on_button(String buttonText) throws Exception {
      richMediaCreativesActions.clickSaveNavigationByButtonText(buttonText);
      
   }
   
   @When("^User clicks on Notify to User$")
   public void Notify_to_User() throws Exception
   {
      textPageActions.notifyToUSer();
   }
   
   @When("^User chooses a user for email notification \"([^\"]*)\"$")
   public void User_chooses_a_user_for_email_notification(String emailid) throws Exception
   {
      textPageActions.selectUserstoNotify(emailid);
   }
   
   @When("^Get the total text form thr page$")
   public void Get_the_total_text_form_the_page() throws IOException
   {
      //String fileNamesample = "QNA.xlsx";
      //textCountUNit(fileNamesample);
      newExFile("SampleEXFile"+CommonUtils.randomNumberwithinLimit(100)+".xlsx");
   }
}
