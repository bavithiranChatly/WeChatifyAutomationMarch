package com.uiautomation.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

/**
 * 
 * @version $Id$
 */
public class UserDefinedMenuPage extends PageObject
{
   /** The menuPage top menus. */
   @FindBy(css = "#defaultMenu>a, #altMenu>a")
   private List<WebElement> menupageTopMenus;
   
   /** Add Menu Button */
   @FindBy(xpath = "//button[@id='addMenu']")
   private WebElement addMenubtn;
   
   /** Add Menu Button */
   @FindBy(xpath = "//input[@id='txt_menuName']")
   private WebElement ADDalternateMenuInput;
   
   /** Add Menu Button */
   @FindBy(xpath = "//button[@id='saveBtn']")
   private WebElement aternateMenuSaveBtn;
   

   /**
    * @Description:
    * @param
    * @return : List<String>
    * @exception :
    * @Created_by : Raghuram
    */
   public List<String> getMenuTopMenuOptions()
   {
      List<String> options = new ArrayList<>();
      for (WebElement useMenu : menupageTopMenus)
      {
         options.add(useMenu.getText().trim());
      }
      return options;
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : Raghuram
    */
   public void menuTypeSubTab(String menuType)
   {
      getDriver().findElement(org.openqa.selenium.By.xpath("//li[@id='"+menuType+"']")).click();
   }

   /**
    * @Description: 
    * @param
    * @return : void
    * @exception :
    * @Created_by : Raghuram
   */
   public void createMenu(String menuName)
   {
      addMenubtn.click();
      ADDalternateMenuInput.sendKeys(menuName);
      aternateMenuSaveBtn.click();
   }

}
