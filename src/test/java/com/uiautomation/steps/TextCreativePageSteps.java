package com.uiautomation.steps;

import com.uiautomation.actions.TextCreativePageActions;
import com.uiautomation.pages.CommonPage;
import com.uiautomation.pages.TextCreativePage;
import com.uiautomation.utils.CommonUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TextCreativePageSteps extends CommonPage

{
        
	   @Steps
	   TextCreativePageActions textPageActions;
	   TextCreativePage textpage;
	   private String texttitleuniquename;
	   private String EditTitleName;
	   public String urluniquename;
	   private String adtagname;
	   private String catName;
	     
	   	   
	   @When("^User should see \"([^\"]*)\" Text creative page$")
	   public void user_should_see_creative_page(String textheading) throws Exception
	   {
	      textPageActions.verifyTextCreatePage(textheading);
	   }
	   	   
	   @When("^User enters title as \"([^\"]*)\" Description as \"([^\"]*)\" and \"([^\"]*)\"$")
	   public void User_enters_TextMessageName_as_Message_as(String titlename,String message,String NormOrTrans) throws Exception
	   {
	      if(NormOrTrans.equalsIgnoreCase("Normal"))
	      {
	      texttitleuniquename = titlename + CommonUtils.getDateAsUniqueString();
	      textPageActions.textcontent(texttitleuniquename,message,NormOrTrans);
	      EditTitleName = texttitleuniquename;
	      }
	      else if(NormOrTrans.equalsIgnoreCase("Trans"))
	      {
	      texttitleuniquename = titlename + CommonUtils.getDateAsUniqueString();
	      textPageActions.textcontent(texttitleuniquename,message,NormOrTrans);
	      }
	      else if(NormOrTrans.equalsIgnoreCase("Trans-existingcontent"))
          {
          texttitleuniquename = titlename + CommonUtils.getDateAsUniqueString();
          textPageActions.textcontent(texttitleuniquename,message,NormOrTrans);
          }
	   }
	   
	   @When("^User selects smiley character \"([^\"]*)\"$")
       public void User_clicks_on_the_smiley_button(String OrigOrTrans) throws Exception
       {
	      textPageActions.clickSmileyButton(OrigOrTrans);
       }
	   
	   @When("^User clicks on save text_creative button$")
       public void user_clicks_on_savetext_creative_button() throws Exception
       {
          textPageActions.clickSaveTextCreativeButton();
       }
	   
	   @When("^User clicks on save and close creative button$")
	   public void user_clicks_on_save_and_close_creative_button() throws Exception
	   {
	      textPageActions.clickSaveandcloseCreativeButton();
	   }
	  
	   @Then("^Textcard Validation error should display for title text as \"([^\"]*)\" and \"([^\"]*)\"$")
	   public void textcard_validation_error_should_display_for_text_title_as(String ErrorMsg,String msgType) throws Exception
	   {
	      textPageActions.verifyTextTitleValidationError(ErrorMsg,msgType);
	   }
	   
	   @Then("^Textcard Validation error should display for desc text as \"([^\"]*)\"$")
       public void textcard_validation_error_should_display_for_text_description_as(String ErrorMsg) throws Exception
       {
          textPageActions.verifyTextDescValidationError(ErrorMsg);
       }
	   
	   @When("^User clicks on preview button$")
       public void User_clicks_on_preview_button() throws Exception
       {
          textPageActions.preview();
       }
	   
	   @When("^User right clicks \"([^\"]*)\" on the description field$")
       public void User_right_clicks_on_the_description_field(String OrgOrTrans) throws Exception
       {
          textPageActions.descrightclick(OrgOrTrans);
       }

	   @When("^User enters link as \"([^\"]*)\" LinkText as \"([^\"]*)\" and \"([^\"]*)\"$")
       public void User_enters_link_as_LinkText_as(String url, String linktext,String OrigOrTrans) throws Exception
       {
	      urluniquename = linktext + CommonUtils.getDateAsUniqueString();
          textPageActions.url(url,urluniquename,OrigOrTrans);
       }
	   
	   @When("^User adds add tag to the redirection link \"([^\"]*)\"$")
       public void User_adds_add_tag_to_the_redirection_link(String OrigOrTrans) throws Exception
       {
	      textPageActions.clickRedirectiontext();
	      textPageActions.inserttagicon(OrigOrTrans);
       }
	   
	   @When("^User clicks Back to List Button$")
       public void User_clicks_Back_to_List_Button() throws Exception
       {
          textPageActions.BacktoList();
       }
	   
	   @When("^User clicks Submit for Draft Review$")
       public void User_clicks_Submit_for_Draft_Review() throws Exception
       {
          textPageActions.submitfordr();
       }
	   
	   @When("^User clicks edit button of textcard$")
       public void User_clicks_on_Edit_Button() throws Exception
       {
          textPageActions.editclick(EditTitleName);
       }
	   
	   @When("^User clicks on View Button$")
       public void User_clicks_on_View_Button () throws Exception
       {
          textPageActions.viewclick(texttitleuniquename);
       }
	   
	   @When("^User clicks delete button of textcard$")
       public void User_clicks_delete_button_of_textcard() throws Exception
       {
          textPageActions.deleteicon(texttitleuniquename);
       }
	   
	   @When("^User clicks on Preview$")
       public void User_clicks_on_Preview_Button() throws Exception
       {
	      textPageActions.previewtoFollowersAction();
       }

	   @When("^User Searches and selects follower to send preview \"([^\"]*)\"$")
       public void User_Searches_and_selects_follower_to_send_preview(String followerName) throws Exception
       {
	      textPageActions.chooseFollowerAction(followerName);
       }
	   
	   //Tag
	   @When("^User select tag by tagname as \"([^\"]*)\" for textcard with click on adtag button$")
	   public void user_select_tag_by_tagname_as_for_rich_media_with_click_on_adtag_button(String tagName) throws Exception
	   {
	      textPageActions.selectTagByName(tagName);
	   }
	   
	   //AddTag button
       @When("^User clicks on AddTag button$")
       public void User_clicks_on_AddTag_button() throws Exception
       {
          textPageActions.addTagButton();
       }
	   
	   @When("^User creates new tag \"([^\"]*)\" with neww category as \"([^\"]*)\" & strength number as \"([^\"]*)\" & membership card as \"([^\"]*)\" and point as \"([^\"]*)\"$")
	   public void user_creates_new_tag_with_neww_category_as_strength_number_as_membership_card_as_and_point_as(
	      String tagName,
	      String tagCategory,
	      String tagStrength,
	      String memberShip,
	      String points)
	      throws Exception
	   {
	      textPageActions.selectAddNewTag();
	      textPageActions.selectAddNewCategory();
	      adtagname = tagName + CommonUtils.getDateAsUniqueString();
          catName = tagCategory + CommonUtils.getDateAsUniqueString();
	      textPageActions.createNewTagWithNewCategoryy(catName, adtagname, tagStrength, memberShip, points);

	   }
	   
	   @When("^User creates new tag \"([^\"]*)\" under existing category as \"([^\"]*)\" & strength number as \"([^\"]*)\" & membership card as \"([^\"]*)\" and point as \"([^\"]*)\"$")
       public void user_creates_new_tag_under_existing_category_as_strength_number_as_membership_card_as_and_point_as(
          String tagName,
          String tagCategory,
          String tagStrength,
          String memberShip,
          String points)
          throws Exception
       {
          textPageActions.selectAddNewTag();
          adtagname = tagName + CommonUtils.getDateAsUniqueString();
          textPageActions.createNewTagWithExistingCategory(tagCategory, adtagname, tagStrength, memberShip, points);

       }
	   
	   @When("^multiple deletes in a single page$")
	   public void multiple_deletes_in_a_single_page()
	   {
	      textPageActions.deleteall();
	   }
	   
	   
	   @When("^User chooses on \"([^\"]*)\" button")
	   public void User_chooses_on_forward(String forwardType) throws Exception
	   {
	      textpage.selectingForwardtype(forwardType);
	   }
	   
	   //////////////////////////////////////////////////////////////////////////////////////////
	   //Unit Test part - Once completed back and delete it //*[@id="creativeDivSubId"]/li[3]/a
	   @When("^User clicks on the translationreview subtab$")
	   public void User_clicks_on_the_translation_subtab_unit()
	   {
       getDriver().findElement(org.openqa.selenium.By.xpath("//*[@id='creativeDivSubId']/li[4]/a")).click();
       CommonUtils.waitForSeconds(4);
	   }
	   
	   @When("^User clicks edit button of textcard unittest \"([^\"]*)\"$")
       public void User_clicks_edit_button_of_textcard_unittest(String unitname)
       {
       getDriver().findElement(org.openqa.selenium.By.xpath("//div[contains(@class,'item-holder')]//span[contains(text(),'" +unitname+ "')]/../../../..//div[1]//a[@title='Edit']")).click();
       }
	   
	   
}
