/**
 * 
 */
package com.uiautomation.pages;

import org.openqa.selenium.WebElement;

import com.uiautomation.utils.CommonUtils;

import net.serenitybdd.core.annotations.findby.FindBy;

/**
 * 
 * @version $Id$
 */
public class ImagePage extends CommonPage
{
   //Text card Title name
   @FindBy(css = "input#Title.form-control.text-box.single-line")
   private WebElement imageCardtitle;
   
   //Trans Text card Title name
   @FindBy(xpath = "//div[@class='row']//input[@id='TransTitle']")
   private WebElement imageCardtitle_t;
   
   /** The upload button. */
   @FindBy(xpath = "//div[@class='row']//button[text()='Upload']")
   private WebElement uploadButton;
   
   /** The upload button.Translate */
   @FindBy(xpath = "//div[@class='row']//button[text()='上传']")
   private WebElement uploadButtont;
    
   // Image card Save button
   @FindBy(xpath = "//div[@class='row']//input[@value='Save']")
   private WebElement saveButton;
   
   // Image card Save and Close button
   @FindBy(xpath = "//div[@class='row']//input[@value='Save & Close']")
   private WebElement saveandcloseButton;
   
   public void imagecontent(final String imageTitleuniquename,String NormOrTrans)
   {      
      if(NormOrTrans.equalsIgnoreCase("Normal"))
      {
       imageCardtitle.clear();
       imageCardtitle.sendKeys(imageTitleuniquename);
      }
      else if(NormOrTrans.equalsIgnoreCase("Trans"))
      {
       imageCardtitle_t.clear();
       imageCardtitle_t.sendKeys(imageTitleuniquename);
      }
   }
   
   public void uploadImage(String path,String uploadType)
   {
      if (uploadType.equalsIgnoreCase("Original"))
      {
      uploadButton.click();
      CommonUtils.uploadFile(path);
      CommonUtils.waitForSeconds(4);
      }
      else if (uploadType.equalsIgnoreCase("Translate"))
      {
         uploadButtont.click();
         CommonUtils.uploadFile(path);
         CommonUtils.waitForSeconds(4); 
      }
   }

   /**
    * @Description: 
    * @param
    * @return : void
    * @exception :
    * @Created_by : raghuram
   */
   public void clickCreativeSaveImagetBtn(String saveType)
   {  
      if (saveType.equalsIgnoreCase("Save"))
      {
      saveButton.click();
      CommonUtils.waitForSeconds(3);
      }
      else if(saveType.equalsIgnoreCase("Save and Close"))
      {
      saveandcloseButton.click();  
      CommonUtils.waitForSeconds(3);
      }
      
   }
   
   public void editclickk(String EditTitleName)
   {
      getDriver()
         .findElement(
            org.openqa.selenium.By
               .xpath("//div[@class='item-holder cover grid-item mov-fdr  ']//h3[text()='"+EditTitleName+"']//..//a[@title='Edit']"))
         .click();

   }

   /**
    * @Description: 
    * @param
    * @return : void
    * @exception :
    * @Created_by : raghuram
   */
   public void viewclickk(String editTitleName)
   {
      getDriver()
         .findElement(
            org.openqa.selenium.By
               .xpath("//div[@class='item-holder cover grid-item mov-fdr  ']//h3[text()='"+editTitleName+"']//..//a[@title='View']"))
         .click();

   }

   /**
    * @Description: 
    * @param
    * @return : void
    * @exception :
    * @Created_by : raghuram
   */
   public boolean cardCheckk(String editTitleName)
   {      
   try
   {
      getDriver().findElement(org.openqa.selenium.By.xpath("//div[@class='item-holder cover grid-item mov-fdr  ']//h3[text()='"+editTitleName+"']"));
      System.out.println("Available");
      return true;
   }
   catch(Exception e)
   {
      System.out.println("Not available");
      return false;
   }
   }

}
