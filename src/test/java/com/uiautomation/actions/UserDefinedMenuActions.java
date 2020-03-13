/**
 * 
 */
package com.uiautomation.actions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import java.util.List;

import com.uiautomation.pages.UserDefinedMenuPage;

import net.thucydides.core.annotations.Step;

/**
 * 
 * @version $Id$
 */
public class UserDefinedMenuActions
{
   UserDefinedMenuPage userMenuPage;
   
   @Step
   public void verifyTopMenuOptions(List<String> userMenuTopMenuOptions)
   {
      boolean match = true;
      for (int i = 0; i < userMenuTopMenuOptions.size(); i++)
      {
         if (userMenuPage.getMenuTopMenuOptions().get(i).contains(userMenuTopMenuOptions.get(i)))
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
   public void menuTypesubTab(String menuType)
   {
      userMenuPage.menuTypeSubTab(menuType);
   }

   /**
    * @Description: 
    * @param
    * @return : void
    * @exception :
    * @Created_by : Raghuram
   */
   public void addMenu(String menuName)
   {
      userMenuPage.createMenu(menuName);
   }
}
