/**
 * 
 */
package com.uiautomation.actions;

import com.uiautomation.pages.CommonPage;
import com.uiautomation.pages.ImagePage;
import com.uiautomation.utils.CommonUtils;
import com.wechatify.utils.Constants;

import jline.internal.Log;
import net.thucydides.core.annotations.Step;

/**
 * 
 * @version $Id$
 */
public class ImagePageActions extends CommonPage
{
   ImagePage imagepage;
   
   @Step
   public void imageTitle(String imageTitleuniquename,String NormOrTrans)
   {
      imagepage.imagecontent(imageTitleuniquename,NormOrTrans);
      CommonUtils.waitForSeconds(1);
   }
   
   @Step
   public void uploadJumpLinkImageWithSaveBtn(String imageName,String uploadType)
   {
      imagepage.uploadImage(Constants.TEST_DATA_PATH + imageName,uploadType);
   }

   /**
    * @Description: 
    * @param
    * @return : void
    * @exception :
    * @Created_by : raghuram
   */
   public void clickSaveTextImageCreativeButton(String saveType)
   {
      imagepage.clickCreativeSaveImagetBtn(saveType);
      Log.info("Clicked Image Creative Save button");
   }
   
   @Step
   public void editclick(String EditTitleName)
   {
      imagepage.editclickk(EditTitleName);
      CommonUtils.waitForSeconds(5);
   }

   /**
    * @Description: 
    * @param
    * @return : void
    * @exception :
    * @Created_by : raghuram
   */   
   @Step
   public void viewclick(String editTitleName)
   {
      imagepage.viewclickk(editTitleName);
      CommonUtils.waitForSeconds(1);
   }

   /**
    * @Description: 
    * @param
    * @return : void
    * @exception :
    * @Created_by : raghuram
   */
   public void cardCheck(String editTitleName)
   {
      imagepage.cardCheckk(editTitleName);  
   }
}
