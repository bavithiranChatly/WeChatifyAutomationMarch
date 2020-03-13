/**
 * 
 */
package com.uiautomation.steps;

import java.io.IOException;

import com.uiautomation.actions.QRcodeActions;
import com.uiautomation.pages.QRcodePage;
import com.uiautomation.utils.CommonUtils;
import com.wechatify.utils.Constants;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

/**
 * 
 * @version $Id$
 */
public class QRcodeSteps
{
   @Steps
   QRcodeActions qrcodeActions;
   QRcodePage qrcodepage;
   
   @Then("^User clicks on the ADD button$")
   public void User_clicks_on_the_ADD_button() throws Exception
   {
      qrcodeActions.addbtn();
   }
   
   @When("QRcode Excel data insert \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
   public void Bulk_data_insert(String filePath,String fileName,String sheetName) throws IOException
   { 
      filePath = CommonUtils.getAbsolutePathPath(Constants.EXCEL_SHEET_DATA_FAQ_PATH);
      qrcodeActions.bulkdataEntryAction(filePath,fileName,sheetName);
   }
   
   @Then("^User clicks on the MapTag Button$")
   public void User_clicks_on_the_MapTag_Button()
   {
      qrcodepage.mapTagBtn();
   }
   
   @When("^User creates new tag \"([^\"]*)\" with new category as \"([^\"]*)\" & strength number as \"([^\"]*)\"$")
   public void User_creates_newcat_newTag(String catName,String tagName,String tagStrength)
   {
      qrcodepage.tagCreation_newCat_newTag(catName,tagName,tagStrength);
   }
}
