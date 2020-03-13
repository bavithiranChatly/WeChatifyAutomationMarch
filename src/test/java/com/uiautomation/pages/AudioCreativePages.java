/**
 * 
 */
package com.uiautomation.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.uiautomation.utils.CommonUtils;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;

/**
 * 
 * @version $Id$
 */
public class AudioCreativePages extends CommonPage
{

   /**
    * @Description: 
    * @param
    * @return : void
    * @exception :
    * @Created_by : bavithiranpc
   */
   
   
   @FindBy(xpath = "//*[@placeholder=\"Audio Message \"]")
   private WebElement AudioTitle;
   
   @FindBy(xpath = "//*[@id=\"TransTitle\"]")
   private WebElement AudioTransTitle;
   
   @FindBy(xpath = "//*[@id=\"FormAudioId\"]/div/div/div/div/div[1]/div/div/div/div/div/div[2]/div/div/button")
   private WebElement AudioUploadEnglishClick;
   
   @FindBy(xpath = "//*[@id=\"FormAudioId\"]/div/div/div/div[3]/div[2]/div/div[2]/div/div/div/div[2]/div/div/button")
   private WebElement AudioUploadChineseClick;
   
   @FindBy(css = "input[value='Save']")
   private WebElement saveVideoBtn;
   
   @FindBy(xpath = "//*[@id=\"AudioValidationId\"]")
   private WebElement audioUploadValidation;
   
   String AudioName;
   
   
   
   
   public void enterAudioCreativeInfoPages(String title,final String ClearOrSend)
   {
      if (ClearOrSend.equalsIgnoreCase("Send"))
      {
         AudioTitle.clear();
         AudioTitle.sendKeys(title);
         CommonUtils.waitForSeconds(6);
      }
      else if (ClearOrSend.equalsIgnoreCase("Clear"))
      {
         AudioTitle.clear();
      }

   }
   
   public String getAudioUploadValidationError() // Please upload video to get text.
   {
      waitFor(audioUploadValidation);
      return audioUploadValidation.getText();
      //CommonUtils.waitForSeconds(3);
   }
   
   public void enterAudioTransCreativeInfoPages(String Transtitle,final String ClearOrSend)
   {
      if (ClearOrSend.equalsIgnoreCase("Send"))
      {
         AudioTransTitle.clear();
         AudioTransTitle.sendKeys(Transtitle);
         CommonUtils.waitForSeconds(6);
      }
      else if (ClearOrSend.equalsIgnoreCase("Clear"))
      {
         AudioTransTitle.clear();
      }

   }
   
   
   public void uploadAudioNew(String path, String Lang)
   {

      if (Lang.equalsIgnoreCase("English"))
      {
         AudioUploadEnglishClick.click();

         CommonUtils.uploadFile(path);
         ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", saveVideoBtn);
         CommonUtils.waitForSeconds(10);
         // driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
      }
      else if (Lang.equalsIgnoreCase("Chinese"))
      {
         AudioUploadChineseClick.click();

         CommonUtils.uploadFile(path);
         ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", saveVideoBtn);
         CommonUtils.waitForSeconds(10);
      }

   }
   
   public void clickAudioEditBtn(String AudioName) // Video creative button
   {
      CommonUtils.waitForSeconds(5);
      WebElement AudioNamedraftReviewEditBtn = getDriver()
         .findElement(By.xpath("//div[@class='item-holder sub grid-item mov-fdr']//span[text()='" + AudioName +"']/../../../..//div//a[@title='Edit']"));
      AudioNamedraftReviewEditBtn.click();
      CommonUtils.waitForSeconds(15);
   }
   
   public void clickAudioViewBtn(String AudioName)
   {
      CommonUtils.waitForSeconds(5);
      WebElement AudioNamedraftReviewViewBtn = getDriver()
         .findElement(By.xpath("//div[@class='item-holder sub grid-item mov-fdr']//span[text()='" + AudioName +"']/../../../..//div//a[@title='View']"));
      AudioNamedraftReviewViewBtn.click();
      CommonUtils.waitForSeconds(15);
   }
   
   
   public boolean VerifyAudioCardByName(String AudioName) // verifying the card by name
   {

      
      try
      {
         getDriver().findElement(By.xpath("//div[@class='item-holder sub grid-item mov-fdr']//span[text()='" + AudioName + "']"));
         CommonUtils.waitForSeconds(2);
         System.out.println("Audio card is available");
         return true;
      }
      catch (org.openqa.selenium.NoSuchElementException e)
      {
         System.out.println("Audio card is not available");
         return false;
      }

   }
   
   public void clickAudioTransferIcon(String AudioName, String TransferIcon) // Transfer Icon functionality
   {
      CommonUtils.waitForSeconds(5);
      WebElement TransferIconElement = getDriver()
         .findElement(
            By.xpath("//div[@class='item-holder sub grid-item mov-fdr']//span[text()='" + AudioName + "']/../../../..//div//a[@title='" + TransferIcon + "']"));
      TransferIconElement.click();
   }
   
   
   
   
   
   public static void main(String[] args)
   {
      // TODO Auto-generated method stub

   }

}
