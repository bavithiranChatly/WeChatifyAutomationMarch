/**
 * 
 */
package com.uiautomation.steps;

import com.uiautomation.pages.ApiJavaPage;

import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;

/**
 * 
 * @version $Id$
 */
public class ApiSteps
{
   @Steps
   ApiJavaPage apiPage;
   
   @Given("^read user input \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
   public void userInputs()
   {
      //apiPage.readingExcel();
   }
}
