package com.uiautomation.steps;

import java.io.IOException;
import java.util.List;

import com.uiautomation.actions.ActionsAutoResponderFAQ;
import com.uiautomation.utils.CommonUtils;
import com.wechatify.utils.Constants;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

/**
 * 
 * @version $Id$
 */
public class StepsAutoResponderFAQ
{
   @Steps
   ActionsAutoResponderFAQ faqActions;
   public String editQuestion;
   
   @When("^Autoresponder page should have following sections$")
   public void Autoresponder_page_should_have_following_sections(List<String> autoResponderTopMenuOptions)
   {
	   faqActions.verifyTopsubMenus(autoResponderTopMenuOptions);
   }
   
   @When("^user selects \"([^\"]*)\" sub-menu tab$")
   public void user_selects_submenu_tab(String subMenu)
   {
	   faqActions.autoSubmenu(subMenu);
   }
   
   @When("^User clicks on the Add QNA button$")
   public void User_clicks_on_the_Add_QNA_button() throws Exception
   {
      faqActions.clickAddqnaButton();
   }
   
   @When("^User creates Question as \"([^\"]*)\" in \"([^\"]*)\"$")
   public void User_creates_Question(String questioDdata,String questionType)throws Exception
   {
      String Question = questioDdata+CommonUtils.getDateAsUniqueString(); 
      faqActions.qnafields(Question,questionType); 
      editQuestion = Question;
   }
   
   @When("^User creates Response as \"([^\"]*)\" and \"([^\"]*)\" - card name \"([^\"]*)\" in module \"([^\"]*)\"$")
   public void User_creates_Response(String textmessage,String responseType,String cardName,String moduleName)throws Exception
   {
      String textMessage = textmessage+CommonUtils.getDateAsUniqueString();
      faqActions.responseFields(textMessage,responseType,cardName,moduleName);  
   }
   
   @When("Bulk data insert \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
   public void Bulk_data_insert(String filePath,String fileName,String sheetName) throws IOException
   { 
      filePath = CommonUtils.getAbsolutePathPath(Constants.EXCEL_SHEET_DATA_FAQ_PATH);
      faqActions.bulkdataEntryAction(filePath,fileName,sheetName);
   }
   
   @When("user performs \"([^\"]*)\" action in the respective FAQ")
   public void user_performs_action_in_the_respective_FAQ(String actionType)
   {
   faqActions.faqAction(editQuestion,actionType);  
   }
   
   @When("User creates and selects a new system tag \"([^\"]*)\" and strength \"([^\"]*)\"$")
   public void User_creates_and_selects_a_new_system_tag(String sysTagName,String strength)
   {
      String sysTagname=sysTagName+CommonUtils.getDateAsUniqueString();
      faqActions.faqSystags(sysTagname,strength);
   }
   
   @When("User selects an existing tag \"([^\"]*)\"$")
   public void User_selects_an_existing_tag(String exSysTagname)
   {
      faqActions.existingfaqSystags(exSysTagname);
   }
   
   @When("User clicks on FAQ Action \"([^\"]*)\" Button")
   public void User_clicks_on_faq_Action_Button(String buttonChoice)
   {
      faqActions.qnaSave(buttonChoice);
   }
   
   @When("^User creates FAQ configuration setting \"([^\"]*)\" as \"([^\"]*)\" and \"([^\"]*)\" - card name \"([^\"]*)\"$")
   public void User_creates_FAQ_configuration_as_and_cardname(String subPage,String configSetting,String responseType,String cardName)
   {
	   faqActions.faqConfigSetting(subPage,configSetting,responseType,cardName);
   }
   
   @When("^User clicks on \"([^\"]*)\" FAQ configuration Button$")
   public void User_clicks_on_FAQ_configuration_Button(String configButtonChoice)
   {
	   faqActions.qnaConfig(configButtonChoice);
   }

   @When("^User deletes FAQ configuration setting \"([^\"]*)\"$")
   public void User_deletes_FAQ_configuration_setting(String configSetting) 
   {
	   faqActions.qnaConfigDelte(configSetting);
   }
   
   @Then("^Customer Support Transfer toggle should be in \"([^\"]*)\"$")
   public void Customer_Support_Transfer_toggle(String csStatus) 
   {
	   faqActions.csTransferToggle(csStatus);   
   }
   
   @When("^User enter Customer Support Keyword \"([^\"]*)\"$")
   public void User_enter_Customer_Support_Keyword(String csKeyword) 
   {
	   faqActions.csTransfer(csKeyword);
   }
   
   @When("^check for the FAQ \"([^\"]*)\" error message as \"([^\"]*)\"$")
   public void check_for_the_FAQ_error_message(String ErrorMSgType,String Errmsg)
   {
      faqActions.faqErrorMessagesCheck(ErrorMSgType,Errmsg);
   }
}
