/**
 * 
 */
package com.uiautomation.actions;

import java.io.IOException;

import com.uiautomation.pages.QRcodePage;

import net.thucydides.core.annotations.Step;

/**
 * 
 * @version $Id$
 */
public class QRcodeActions
{
   QRcodePage qrCodePage;

   @Step
   public void addbtn()
   {
      qrCodePage.ADDbtn();
   }

   /**
    * @Description: 
    * @param
    * @return : void
    * @throws IOException 
    * @exception :
    * @Created_by : Raghuram
   */
   public void bulkdataEntryAction(String filePath, String fileName, String sheetName) throws IOException
   {
      qrCodePage.autoQRcodes(filePath, fileName, sheetName);
   }

}