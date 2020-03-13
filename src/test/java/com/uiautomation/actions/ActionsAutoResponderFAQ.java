package com.uiautomation.actions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import java.io.IOException;
import java.util.List;

import com.uiautomation.pages.PageAutoResponderFAQ;

/**
 * 
 * @version $Id$
 */
public class ActionsAutoResponderFAQ
{
   PageAutoResponderFAQ faqPage;

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : raghuram
    */
   public void clickAddqnaButton()
   {
      faqPage.AddQnaButton();
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : raghuram
    */
   public void qnafields(String question, String questionType)
   {
      faqPage.QnATextinputs(question, questionType);
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @throws IOException
    * @exception :
    * @Created_by : raghuram
    */
   public void bulkdataEntryAction(String filePath, String fileName, String sheetName) throws IOException
   {
      faqPage.readExcelData(filePath, fileName, sheetName);
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : Raghuram
    */
   public void faqAction(String editQuestion, String actionType)
   {
      faqPage.faqActions(editQuestion, actionType);
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : Raghuram
    */
   public void responseFields(String textmessage, String responseType, String cardName, String moduleName)
   {
      faqPage.responseSelection(textmessage, responseType, cardName, moduleName);
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : Raghuram
    */
   public void faqSystags(String sysTagname, String strength)
   {
      faqPage.sysTag(sysTagname, strength);
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : Raghuram
    */
   public void existingfaqSystags(String exSysTagname)
   {
      faqPage.existingsysTag(exSysTagname);
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : Raghuram
    */
   public void qnaSave(String buttonChoice)
   {
      faqPage.qNaSave(buttonChoice);
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : Raghuram
    */
   public void verifyTopsubMenus(List<String> autoResponderTopMenuOptions)
   {
      boolean match = true;
      for (int i = 0; i < autoResponderTopMenuOptions.size(); i++)
      {
         if (faqPage.getautoResponderTopMenuOptions().get(i).contains(autoResponderTopMenuOptions.get(i)))
         {
            match = match && true;
         }
         else
         {
            match = false;
         }
      }
      assertThat("Verify Top menu options", match, is(equalTo(true)));
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : Raghuram
    */
   public void autoSubmenu(String subMenu)
   {
      faqPage.autoSubmenuChoose(subMenu);
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : Raghuram
    */
   public void faqConfigSetting(String subPage, String configSetting, String responseType, String cardName)
   {
      faqPage.faqConfigSettings(subPage, configSetting, responseType, cardName);
   }

   /**
    * @Description: FAQ Configuration Save / Cancel
    * @param
    * @return : void
    * @exception :
    * @Created_by : Raghuram
    */
   public void qnaConfig(String configButtonChoice)
   {
      faqPage.qnaConfigActionButton(configButtonChoice);
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : Raghuram
    */
   public void qnaConfigDelte(String configSetting)
   {
      faqPage.qnaConfigDelete(configSetting);
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : Raghuram
    */
   public void csTransferToggle(String csStatus)
   {
      faqPage.csTransferToggleState(csStatus);
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : Raghuram
    */
   public void csTransfer(String csKeyword)
   {
      faqPage.csTransferInputs(csKeyword);
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : Raghuram
    */
   public void faqErrorMessagesCheck(String errorMSgType, String errmsg)
   {
      faqPage.faqErrorMessages(errorMSgType,errmsg);
   }

}
