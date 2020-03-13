/**
 * 
 */
package com.uiautomation.steps;

import com.uiautomation.pages.TestPageFile;

import cucumber.api.java.en.When;

/**
 * 
 * @version $Id$
 */
public class Testpage
{
   @When("^User navigates to module \"([^\"]*)\"$")
   public void UserMenuNavigation(String moduleName)
   {
      TestPageFile.action(moduleName);  
   }
}
