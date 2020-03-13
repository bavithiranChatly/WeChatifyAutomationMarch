package com.uiautomation.actions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import com.uiautomation.pages.CommonPage;
import com.uiautomation.pages.TextCreativePage;
import com.uiautomation.utils.CommonUtils;

import jline.internal.Log;
import net.thucydides.core.annotations.Step;

public class TextCreativePageActions extends CommonPage
{
   TextCreativePage textpage;
   
   @Step
   public void verifyTextCreatePage(String textheading)
   {
      textpage.isTextContentPageHeaderDisplayed(textheading);
   }
  
   @Step
   public void textcontent(String texttitleuniquename, String message,String NormOrTrans)
   {
      textpage.textcontent(texttitleuniquename, message,NormOrTrans);
   }
   

   @Step
   public void clickSaveandcloseCreativeButton()
   {
      textpage.clickCreativeSaveandcloseBtn();
      Log.info("Clicked Creative Save and Close button");
   }
   
   @Step
   public void verifyTextTitleValidationError(String TextTitleErrorMsg,String msgType)
   {
      //assertThat("Verify title validation error:", textpage.getTextTitleValidationError(), equalTo(TextTitleErrorMsg));
      if(msgType.equalsIgnoreCase("Original"))
      {
         textpage.getTextTitleValidationError();
      }
      else if(msgType.equalsIgnoreCase("Translate"))
      {
         textpage.getTransTextTitleValidationError(TextTitleErrorMsg,msgType);
      }
   }
   
   @Step
   public void verifyTextDescValidationError(String TextDescErrorMsg)
   {
      assertThat("Verify title validation error:", textpage.getTextDescValidationError(), equalTo(TextDescErrorMsg));
   }

   @Step
   public void descrightclick(String OrgOrTrans)
   {
      textpage.contextclick(OrgOrTrans);
   }
   
   @Step
   public void url(String url, String urluniquename,String OrigOrTrans)
   {
      textpage.descLink(url,urluniquename,OrigOrTrans);
   }
   
   @Step
   public void BacktoList()
   {
      textpage.backtoList();
   }
   
   @Step
   public void preview()
   {
      textpage.previewclick();
   }
   
   @Step
   public void editclick(String EditTitleName)
   {
      textpage.editclickk(EditTitleName);
      CommonUtils.waitForSeconds(5);
   }
   
   @Step
   public void viewclick(String texttitleuniquename)
   {
      textpage.viewclickk(texttitleuniquename);
      CommonUtils.waitForSeconds(1);
   }
   
   @Step
   public void submitfordr()
   {
      textpage.movetodraftreview();
   }


   /**
    * @Description: 
    * @param
    * @return : void
    * @exception :
    * @Created_by : raghuram
   */
   public void clickSmileyButton(String OrigOrTrans)
   {
      textpage.smileyicon(OrigOrTrans);
      
   }

   /**
    * @Description: 
    * @param
    * @return : void
    * @exception :
    * @Created_by : raghuram
   */
   public void deleteicon(String texttitleuniquename)
   {
      textpage.deleteicon(texttitleuniquename);
      CommonUtils.waitForSeconds(5);
      
   }
   
   public void previewtoFollowersAction()
   {
   previewtoFollowers();      
   }
   
   public void chooseFollowerAction(String followerName)
   {
    chooseFollower(followerName);
   }

   /**
    * @Description: 
    * @param
    * @return : void
    * @exception :
    * @Created_by : raghuram
   */
   public void notifyTousers()
   {
      textpage.notifyToUSer();
   }

   /**
    * @Description: 
    * @param
    * @return : void
    * @exception :
    * @Created_by : raghuram
   */
   public void selectuserstoNotify(String emailid)
   {
      selectUserstoNotify(emailid);
   }

   /**
    * @Description: 
    * @param
    * @return : void
    * @exception :
    * @Created_by : raghuram
   */
   public void clickRedirectiontext()
   {
      textpage.clickRedirectionText();
   }

   /**
    * @Description: 
    * @param
    * @return : void
    * @exception :
    * @Created_by : raghuram
   */
   public void inserttagicon(String OrigOrTrans)
   {
      textpage.instertagIcon(OrigOrTrans);
   }
   
   @Step
   public void selectTagByName(String tagName)
   {
      //textpage.navigateSelectTagWindow();
      //assertThat("Verify navigation to tag window:", textpage.isNavigatedToTagWindow(), is(equalTo(true)));
      textpage.selectTagFromDropdown(tagName);
   }
   
   @Step
   public void createNewTagWithNewCategoryy(String tagCategory, String tagName, String tagStrength, String memberShip, String points)
   {
      textpage.createTagWithNewCategory(tagCategory, tagName, tagStrength, memberShip, points);
   }

   /**
    * @Description: 
    * @param
    * @return : void
    * @exception :
    * @Created_by : raghuram
   */
   public void selectAddNewTag()
   {
      textpage.selectAddNewTagFromDropdown();
   }

   /**
    * @Description: 
    * @param
    * @return : void
    * @exception :
    * @Created_by : raghuram
   */
   public void addTagButton()
   {
      textpage.clickAddTagButton();
   }

   /**
    * @Description: 
    * @param
    * @return : void
    * @exception :
    * @Created_by : raghuram
   */
   public void selectAddNewCategory()
   {
      textpage.selectAddNewCategoryFromDropdown();
   }

   /**
    * @Description: 
    * @param
    * @return : void
    * @exception :
    * @Created_by : raghuram
   */
   public void createNewTagWithExistingCategory(String tagCategory, String tagName, String tagStrength, String memberShip, String points)
   {
      textpage.createTagWithExistingCategory(tagCategory, tagName, tagStrength, memberShip, points);
   }

   /**
    * @Description: 
    * @param
    * @return : void
    * @exception :
    * @Created_by : raghuram
   */
   public void deleteall()
   {
     textpage.deleteAll();      
   }

   /**
    * @Description: 
    * @param
    * @return : void
    * @exception :
    * @Created_by : raghuram
   */
   public void clickSaveTextCreativeButton()
   {
      textpage.clickCreativeSaveTextBtn();
      Log.info("Clicked Creative Save button");
   }

}
