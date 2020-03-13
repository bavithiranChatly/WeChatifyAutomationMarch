package com.uiautomation.steps;

import com.uiautomation.actions.ImagePageActions;
import com.uiautomation.pages.CommonPage;
import com.uiautomation.utils.CommonUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ImagePageSteps extends CommonPage
{
   @Steps
   ImagePageActions imagePageActions;
   private String imageTitleuniquename;
   private String EditTitleName;

   @When("^User enters Image card title as \"([^\"]*)\" as \"([^\"]*)\"$")
   public void User_enters_title_for_Image_card_creation(String titlename, String NormOrTrans) throws Exception
   {
      if (NormOrTrans.equalsIgnoreCase("Normal"))
      {
         imageTitleuniquename = titlename + CommonUtils.getDateAsUniqueString();
         imagePageActions.imageTitle(imageTitleuniquename, NormOrTrans);
         EditTitleName = imageTitleuniquename;
      }
      else if (NormOrTrans.equalsIgnoreCase("Trans"))
      {
         imageTitleuniquename = titlename + CommonUtils.getDateAsUniqueString();
         imagePageActions.imageTitle(imageTitleuniquename, NormOrTrans);
      }
   }

   @When("^User uploads Cover image to Image creative with name as \"([^\"]*)\" and \"([^\"]*)\"$")
   public void User_uploads_Cover_image_to_Image_creative(String imageName, String uploadType) throws Exception
   {
      imagePageActions.uploadJumpLinkImageWithSaveBtn(imageName, uploadType);
      // imagePageActions.verifyImageUpload();
   }

   @When("^User clicks on save Image_creative button \"([^\"]*)\"$")
   public void User_clicks_on_save_Image_creative_button(String saveType) throws Exception
   {
      imagePageActions.clickSaveTextImageCreativeButton(saveType);
   }

   @When("^User clicks edit button of imageCard$")
   public void User_clicks_on_Edit_Button() throws Exception
   {
      imagePageActions.editclick(EditTitleName);
   }

   @When("^User clicks on Image card View Button$")
   public void User_clicks_onImage__View_Button() throws Exception
   {
      imagePageActions.viewclick(EditTitleName);
   }

   @Then("^Check whether the created image card is available in the Library$")
   public void Check_whether_the_created_image_card_is_available_in_the_Library()
   {
      imagePageActions.cardCheck(EditTitleName);
   }

}
