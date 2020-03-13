/**
 * 
 */
package com.uiautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;

/**
 * 
 * @version $Id$
 */

public class TestPageFile
{

   @FindBy(xpath = "//ul[@id='WechatifyNavigation']//li//a//span[text()='Event Management']")
   private static WebElement creativeNavMenu;
   
   public static void action(String moduleName)
   {
      getDriver().findElement(By.xpath("//ul[@id='WechatifyNavigation']//li//a//span[text()='"+moduleName+"']")).click();
      //creativeNavMenu.click();
   }

   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   /**
    * @Description: 
    * @param
    * @return : WebElement
    * @exception :
    * @Created_by : Raghuram
   */
   private static WebElement getDriver()
   {
      // TODO Auto-generated method stub
      return null;
   }
   
}
