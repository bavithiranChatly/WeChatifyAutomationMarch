/**
 * 
 */
package com.uiautomation.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.uiautomation.utils.CommonUtils;

import jline.internal.Log;
import net.serenitybdd.core.annotations.findby.FindBy;

/**
 * 
 * @version $Id$
 */
public class QRcodePage extends CommonPage
{
   private static final TimeUnit SECONDS = null;

   // +ADD Button
   @FindBy(xpath = "//i[@class='fa fa-plus']")
   private WebElement qrADDbtn;

   // QRcode Name
   @FindBy(xpath = "//div[@class='col-md-5']//input[@id='Name']")
   private WebElement QrcodeName;

   // Send Response DropDown
   @FindBy(xpath = "//select[@id='ResponseType']")
   private WebElement sendRresponsedropdown;

   // Maptag button
   @FindBy(xpath = "//div[@class='addedTag']//button//i[@class='fa fa-angle-up']")
   private WebElement mapTagBtn;

   // ChooseTag Option
   @FindBy(xpath = "//div[@class='chosen-container chosen-container-single']//b")
   private WebElement chooseTagOption;

   // Add New Tag Options
   @FindBy(xpath = "//ul[@class='chosen-results']//li[@data-option-array-index='1' and text()='- - Add new tag - -']")
   private WebElement addNewTagOption;

   // Choose category Name dropdown
   @FindBy(xpath = "//div[@id='ParentTagId_chosen']//b")
   private WebElement chooseCatnameDropdown;

   // Add New category option'
   @FindBy(xpath = "//ul[@class='chosen-results']//li[@data-option-array-index = '1' and text()='- - Add new category - -']")
   private WebElement addNewCatOption;

   // Enter new TagCategory input field
   @FindBy(xpath = "//div[@class='input-group']//input[@id='ParentTagName']")
   private WebElement newTagCategoryField;

   // Enter New Tag Name INput Field
   @FindBy(xpath = "//div[@class='col-sm-7']//input[@id='childTagName']")
   private WebElement newTagNameField;

   // ADD tag button
   @FindBy(xpath = "//div[@class='col-sm-7']//button[@id='addTag']")
   private WebElement addTagButton;

   // QR name already exists error message
   @FindBy(xpath = "//span[@class='text-danger field-validation-error']//span[@id='Name-error']")
   private WebElement QRexistsErrmsg;

   // TagAlermSG
   @FindBy(xpath = "//div[@id='AlertInfo']")
   private WebElement tagaletmsg;

   // Error message String Value
   String QRNameExists = "//span[@class='text-danger field-validation-error']//span[@id='Name-error']";

   // Tag Name already exists error message
   String tagExistsErrorMessage = "//div[@id='AlertInfo' and text()='Tag name already exist']";

   // QR Field for Text Response Only - Exp
   @FindBy(xpath = "//div[@id='writingtxtDiv']//div[@id='contenteditableDiv']")
   private WebElement qrTextResponseField;

   // Add Link in Description
   @FindBy(xpath = "//*[@id='linkAdd']")
   private WebElement addlink;

   // Link - url
   @FindBy(xpath = "//*[@id='fr-link-insert-layer-url']")
   private WebElement link;

   @FindBy(xpath = "//*[@id=\"fr-link-insert-layer-text\"]")
   private WebElement linktextcontent;

   // Add button in url popup
   @FindBy(xpath = "//*[@id='addup']")
   private WebElement addButton;

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : Raghuram
    */
   public void ADDbtn()
   {
      qrADDbtn.click();
      CommonUtils.waitForSeconds(3);// label[@class='qr-label']//input[@value='Permanent']
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : Raghuram
    */
   public void QRType(String QRType)
   {
      if (QRType.contentEquals("Permanent"))
      {
         try
         {
            getDriver().findElement(org.openqa.selenium.By.xpath("//label[@class='qr-label']//input[@value='" + QRType + "']")).click();
         }
         catch (Exception e)
         {
            System.out.println("No records");
         }
      }
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : Raghuram
    */
   public void QRnameExists()
   {
      getDriver().findElement(org.openqa.selenium.By.xpath("//label[@class='control-label col-md-2' and @for ='Name']")).click();

      boolean checkit = false;
      do
      {
         // To check whether the QR code name exists or not
         checkit = isElementPresent(QRNameExists);

         if (checkit == true)
         {
            QrcodeName.sendKeys("_");
            CommonUtils.waitForSeconds(1);
         }
         else
         {
            Log.info("Success");
         }
      }
      while (checkit == true);
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : Raghuram
    */
   public void QRresponseType(String QRresponseType)
   {
      if (QRresponseType.equalsIgnoreCase("OFF"))
      {
         getDriver().findElement(org.openqa.selenium.By.xpath("//div[@class='lcs_cursor']")).click();
      }
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : Raghuram
    */
   private void sendResponse(String sendResponseType)
   {
      int sendResponseType1 = 0;
      try
      {
         if (sendResponseType == "Any")
         {
            sendResponseType1 = 0;
         }
         else if (sendResponseType == "First")
         {
            sendResponseType1 = 1;
         }
         // TODO Auto-generated method stub
         Log.info(sendResponseType1);
         getDriver().findElement(org.openqa.selenium.By.xpath("//select[@id='ResponseType']//option[@value='" + sendResponseType1 + "']")).click();
      }
      catch (Exception e)
      {
         Log.info("Element Click Failed");
      }
   }

   // div[@class='form-group text-right']//input[@value='Save & Close']
   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : Raghuram
    */
   public void QRbuttons(String qrBtn)
   {
      getDriver().findElement(org.openqa.selenium.By.xpath("//div[@class='form-group text-right']//input[@value='" + qrBtn + "']")).click();
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @throws IOException
    * @exception :
    * @Created_by : Raghuram
    */
   public void readExcelData(String filePath, String fileName, String sheetName) throws IOException
   {

      Sheet PageSheet = CommonUtils.readExcel(filePath, fileName, sheetName);

      // Find number of rows in excel file
      int rowCount = PageSheet.getLastRowNum();

      // Create a loop over all the rows of excel file to read it
      for (int i = 0; i < rowCount + 1; i++)
      {
         Row row = PageSheet.getRow(i);

         // ADD button Click
         ADDbtn();

         // QR code type Permanent / Temporary
         QRType("Permanent");

         // Response Type ON / OFF // QRresponseType("OFF");
         getDriver().findElement(org.openqa.selenium.By.xpath("//div[@class='lcs_cursor']")).click();

         int j = 0;
         while (j < row.getLastCellNum())
         {
            if (j == 0)
            {
               // QR code Name
               QrcodeName.sendKeys(row.getCell(j).getStringCellValue());
               CommonUtils.waitForSeconds(1);
               getDriver().findElement(org.openqa.selenium.By.xpath("//label[@class='control-label col-md-2' and @for ='Name']")).click();

               boolean checkit = false;
               do
               {
                  // To check whether the QR code name exists or not
                  checkit = isElementPresent(QRNameExists);

                  if (checkit == true)
                  {
                     QrcodeName.sendKeys("_");
                     CommonUtils.waitForSeconds(1);
                  }
                  else
                  {
                     Log.info("Success");
                  }
               }
               while (checkit == true);

               j++;
               mapTagBtn();
               CommonUtils.waitForSeconds(2);
               addnewTagoption();
               CommonUtils.waitForSeconds(2);
               addnewCatoption();
               CommonUtils.waitForSeconds(2);
            }
            else if (j == 1)
            {
               // New Tag Category Name
               newTagCategoryField.sendKeys(row.getCell(j).getStringCellValue());
               CommonUtils.waitForSeconds(1);
               j++;
            }
            else if (j == 2)
            {
               // New Tag Name
               newTagNameField.sendKeys(row.getCell(j).getStringCellValue());
               CommonUtils.waitForSeconds(1);

               // Add Tag button click
               addTagButton.click();
               CommonUtils.waitForSeconds(2);

               // To check whether the Tag name exists or not
               boolean checkit;
               do
               {
                  // To check whether the QR code name exists or not
                  checkit = isElementPresent(tagExistsErrorMessage);

                  if (checkit == true)
                  {
                     newTagNameField.sendKeys("_");
                     CommonUtils.waitForSeconds(1);
                     // Add Tag button click
                     addTagButton.click();
                     CommonUtils.waitForSeconds(10);
                     getDriver().findElement(org.openqa.selenium.By.xpath("//span[@id='alert-close' and text()='x']")).click();
                  }
                  else
                  {
                     CommonUtils.waitForSeconds(2);
                     getDriver().findElement(org.openqa.selenium.By.xpath("//span[@id='alert-close' and text()='x']")).click();
                     Log.info("Success");
                  }

               }
               while (checkit == true);
               j++;
            }
         }
         // Save Button
         CommonUtils.waitForSeconds(3);
         QRbuttons("Save & Close");
         CommonUtils.waitForSeconds(5);
      }
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : Raghuram
    */
   public void mapTagBtn()
   {
      mapTagBtn.click();
      chooseTagOption.click();
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : Raghuram
    */
   public void addnewTagoption()
   {
      addNewTagOption.click();
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : Raghuram
    */
   public void addnewCatoption()
   {
      chooseCatnameDropdown.click();
      addNewCatOption.click();
   }

   public void addnewCatoption1(String catName)
   {
      chooseCatnameDropdown.click();
      // addNewCatOption.click(); -- Temporary Commenting

      getDriver().findElement(org.openqa.selenium.By.xpath("//ul[@class='chosen-results']//li[@class='active-result' and text() = '" + catName + "']")).click();

   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : Raghuram
    */
   public void tagCreationFields(String catName, String tagName)
   {
      newTagCategoryField.clear();
      newTagCategoryField.sendKeys(catName);
      newTagNameField.clear();
      newTagNameField.sendKeys(tagName);
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : Raghuram
    */
   public void tagCreation_newCat_newTag(String catName, String tagName, String tagStrength)
   {
      mapTagBtn();
      CommonUtils.waitForSeconds(2);
      addnewTagoption();
      CommonUtils.waitForSeconds(2);
      addnewCatoption();
      CommonUtils.waitForSeconds(2);
      tagCreationFields(catName, tagName);
      CommonUtils.waitForSeconds(1);
      addTagButton.click();
   }

   public boolean isElementPresent(String elementTobeFound)

   {
      getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
      try
      {
         WebElement aa = getDriver().findElement(By.xpath(elementTobeFound));
         // getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         return true;
      }
      catch (Exception e)
      {
         return false;
      }
   }

   public void autoQRcodes(String filePath, String fileName, String sheetName) throws IOException
   {
      // Worksheet
      Sheet PageSheet = CommonUtils.readExcel(filePath, fileName, sheetName);

      // Find number of rows in excel file
      int rowCount = PageSheet.getLastRowNum();

      // Create a loop over all the rows of excel file to read it
      for (int rowNumber = 0; rowNumber < rowCount + 1; rowNumber++)

      {
         Row row = PageSheet.getRow(rowNumber);

         // ADD button Click
         ADDbtn();
         CommonUtils.waitForSeconds(2);

         int abc = row.getLastCellNum();
         Log.info(abc);
         int column = 0;
         while (column < row.getLastCellNum())
         {
            if (column == 0)
            {
               // QR code type Permanent / Temporary
               String Qrtype = row.getCell(column).getStringCellValue();
               Log.info(Qrtype);
               QRType(Qrtype);
               column++;
            }
            if (column == 1)
            {
               // QR code Name
               QrcodeName.sendKeys(row.getCell(column).getStringCellValue());
               CommonUtils.waitForSeconds(1);

               // Check whether QR code name already Exists or Not
               QRnameExists();

               column++;
            }
            if (column == 2) // QR code response type (On or Off)
            {
               String QRresponseType = row.getCell(column).getStringCellValue();
               Log.info(QRresponseType);
               QRresponseType(QRresponseType);
               column++;
            }
            if (column == 3) // Send response type (Any followers or New Followers)
            {
               sendRresponsedropdown.click();
               CommonUtils.waitForSeconds(1);
               String sendResponseType = row.getCell(column).getStringCellValue();
               Log.info(sendResponseType);
               sendResponse(sendResponseType);

               column++;
            }
            if (column == 4)
            {
               String responseType = row.getCell(column).getStringCellValue();
               Log.info(responseType);
               responseType("-------", responseType, "------", "QRExceptional");

               column++;
            }
            if (column == 5)
            {

               String Content1 = row.getCell(column).getStringCellValue();
               Log.info(Content1);
               exceptionalTextResponse(Content1);

               column++;
            }
            
            if (column == 6)
            {
               String tagCatName = row.getCell(column).getStringCellValue();
               Log.info(tagCatName);

               NewTagUnderExistingCat(tagCatName);
               CommonUtils.waitForSeconds(1);

               column++;
            }
            if (column == 7)
            {
               String tagName = row.getCell(column).getStringCellValue();
               Log.info(tagName);

               NewTagUnderExistingCat1(tagName);
               CommonUtils.waitForSeconds(1);

               column++;
            }
            /**
             * if (column == 8) { String Content2 = row.getCell(column).getStringCellValue(); Log.info(Content2); exceptionalTextResponse(Content2);
             * 
             * column++; } if (column == 9) { String LinkContent2 = row.getCell(column).getStringCellValue(); Log.info(LinkContent2);
             * 
             * // Right Click descripRclick();
             * 
             * urlContent(LinkContent2);
             * 
             * column++; } if (column == 10) { String Link2 = row.getCell(column).getStringCellValue(); Log.info(Link2);
             * 
             * url(Link2); CommonUtils.waitForSeconds(1); addButton.click();
             * 
             * column++; }
             **/
         }
         // Save Button
         Log.info("Save Process DOne");
         CommonUtils.waitForSeconds(3);
         QRbuttons("Save & Close");
         CommonUtils.waitForSeconds(7);
      }
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : Raghuram
    */
   private void exceptionalTextResponse(String Content)
   {
      // TODO Auto-generated method stub
      qrTextResponseField.sendKeys(Content);
      qrTextResponseField.sendKeys(" ");
   }

   public void descripRclick()
   {
      Actions qtPage = new Actions(getDriver());
      qtPage.contextClick(qrTextResponseField).perform();
      CommonUtils.waitForSeconds(2);
      addlink.click();
   }

   public void url(String Link1)
   {
      link.clear();
      link.sendKeys(Link1);
   }

   public void urlContent(String LinkContent1)
   {
      linktextcontent.clear();
      linktextcontent.sendKeys(LinkContent1);
   }

   public void NewTagUnderExistingCat(String tagCatName)
   {
      mapTagBtn();
      CommonUtils.waitForSeconds(2);
      addnewTagoption();
      CommonUtils.waitForSeconds(2);
      addnewCatoption1(tagCatName);
      CommonUtils.waitForSeconds(2);
   }

   public void NewTagUnderExistingCat1(String tagName)
   {
      // New Tag Name
      newTagNameField.sendKeys(tagName);
      CommonUtils.waitForSeconds(1);

      // Add Tag button click
      addTagButton.click();
      CommonUtils.waitForSeconds(2);

      // To check whether the Tag name exists or not
      boolean checkit;
      do
      {
         // To check whether the QR code name exists or not
         checkit = isElementPresent(tagExistsErrorMessage);

         if (checkit == true)
         {
            newTagNameField.sendKeys("_");
            CommonUtils.waitForSeconds(1);
            // Add Tag button click
            addTagButton.click();
            CommonUtils.waitForSeconds(10);
            getDriver().findElement(org.openqa.selenium.By.xpath("//span[@id='alert-close' and text()='x']")).click();
         }
         else
         {
            CommonUtils.waitForSeconds(2);
            getDriver().findElement(org.openqa.selenium.By.xpath("//span[@id='alert-close' and text()='x']")).click();
            Log.info("Success");
         }

      }
      while (checkit == true);
   }

}
