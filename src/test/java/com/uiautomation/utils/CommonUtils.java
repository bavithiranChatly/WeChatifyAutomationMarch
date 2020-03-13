package com.uiautomation.utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.JSONException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.google.gson.Gson;
import com.wechatify.enums.Creatives;
import com.wechatify.enums.EnvironmentTypes;
import com.wechatify.enums.LanguageType;
import com.wechatify.enums.UserRole;
import com.wechatify.models.UserDetails;
import com.wechatify.models.UserRoleRoot;
import com.wechatify.utils.Constants;
import com.wechatify.utils.YamlUtils;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.thucydides.core.ThucydidesSystemProperty;
import net.thucydides.core.pages.Pages;

// TODO: Auto-generated Javadoc
/**
 * The Class CommonUtils.
 */
public class CommonUtils
{

   /** The Constant LOG. */
   private static final Logger LOG = LoggerFactory.getLogger(CommonUtils.class);

   /** The env type. */
   private static EnvironmentTypes envType;

   /** The user role. */
   private static UserRole userRole;

   /** The user language. */
   private static LanguageType userLanguage;

   /** The user role root. */
   private static UserRoleRoot userRoleRoot;

   /**
    * Gets the user details by role.
    *
    * @param userRole
    *           the user role
    * @return the user details by role
    * @created_by : narot
    * @created_on: 6 May, 2019 8:58:47 PM
    */
   public static UserDetails getUserDetailsByRole(UserRole userRole)
   {
      ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
      UserDetails userDetails = null;
      try
      {

         userRoleRoot = mapper.readValue(new File(Constants.USER_DATA_FILE_PATH), UserRoleRoot.class);

         userDetails = YamlUtils.getUserDetailByRole(userRoleRoot, envType, userRole.toString());
      }
      catch (

      Exception e)
      {
         e.printStackTrace();
      }
      return userDetails;
   }

   /**
    * Initialize env and user type.
    *
    * @created_by : narot
    * @created_on: 6 May, 2019 8:58:47 PM
    */
   public static void initializeEnvAndUserType()
   {
      envType = EnvironmentTypes
         .valueOf((System.getProperty(Constants.ENV_NAME) != null?System.getProperty(Constants.ENV_NAME):Constants.ENV_STAGING).toUpperCase());
      userRole = UserRole
         .valueOf((System.getProperty(Constants.USER_TYPE) != null?System.getProperty(Constants.USER_TYPE):Constants.USER_TYPE_ADMIN).toUpperCase());
      userLanguage = LanguageType
         .valueOf(
            (System.getProperty(Constants.USER_LANGUAGE) != null?System.getProperty(Constants.USER_LANGUAGE):LanguageType.ENGLISH.toString()).toUpperCase());

      LOG.info("===========================================================================");
      LOG.info("===========================================================================");
      LOG.info("==================== ENV & USER DETAILS====================================");
      LOG.info("USER DETAILS: " + CommonUtils.getUserDetailsByRole(userRole));
      LOG.info("===========================================================================");
      LOG.info("===========================================================================");

      Pages pages = new Pages();

      pages
         .getConfiguration()
         .getEnvironmentVariables()
         .setProperty(ThucydidesSystemProperty.WEBDRIVER_BASE_URL.getPropertyName(), YamlUtils.getEnvUrlByEnyType(userRoleRoot, envType));

   }

   /**
    * Deep compare list.
    *
    * @param firstList
    *           the first list
    * @param secondList
    *           the second list
    * @return true, if successful
    * @created_by : narot
    * @created_on: 6 May, 2019 8:58:47 PM
    */
   public static boolean deepCompareList(List<String> firstList, List<String> secondList)
   {
      boolean match = true;
      for (int i = 0; i < firstList.size(); i++)
      {
         if (secondList.get(i).contains(secondList.get(i)))
         {
            match = match && true;
         }
         else
         {
            match = false;
         }
      }
      return match;
   }

   /**
    * Gets the absolute path path.
    *
    * @param path
    *           the path
    * @return the absolute path path
    * @created_by : narot
    * @created_on: 6 May, 2019 8:58:47 PM
    */
   public static String getAbsolutePathPath(String path)
   {
      File file = new File(path);
      return file.getAbsolutePath();
   }

   /**
    * Upload file with robot.
    *
    * @param imagePath
    *           the image path
    * @created_by : narot
    * @created_on: 6 May, 2019 8:58:47 PM
    */
   public static void uploadFileWithRobot(String imagePath)
   {
      StringSelection stringSelection = new StringSelection(imagePath);
      Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
      clipboard.setContents(stringSelection, null);

      Robot robot = null;

      try
      {
         robot = new Robot();
      }
      catch (AWTException e)
      {
         e.printStackTrace();
      }

      robot.delay(250);
      robot.keyPress(KeyEvent.VK_CONTROL);
      robot.keyPress(KeyEvent.VK_V);
      robot.keyRelease(KeyEvent.VK_V);
      robot.keyRelease(KeyEvent.VK_CONTROL);
      robot.keyPress(KeyEvent.VK_ENTER);
      robot.keyRelease(KeyEvent.VK_ENTER);
   }

   /**
    * Upload file.
    *
    * @param filePath
    *           the file path
    * @created_by : narot
    * @created_on: 6 May, 2019 8:58:47 PM
    */
   public static void uploadFile(String filePath)
   {
      String absoluteFilePath = CommonUtils.getAbsolutePathPath(filePath);
      // CommonUtils.waitForSeconds(5);
      try
      {
         LOG.info("Uploading file with path: " + absoluteFilePath);
         Runtime.getRuntime().exec(CommonUtils.getAbsolutePathPath(Constants.UPLOAD_SCRIPT_PATH) + " " + absoluteFilePath);
      }
      catch (IOException e)
      {
         LOG.error("EXCEPTION OCCURED WHILE UPLOADING FILE: " + absoluteFilePath);
         e.printStackTrace();
      }
      CommonUtils.waitForSeconds(5);
   }

   /**
    * Wait for seconds.
    *
    * @param seconds
    *           the seconds
    * @created_by : narot
    * @created_on: 6 May, 2019 8:58:47 PM
    */
   public static void waitForSeconds(int seconds)
   {
      try
      {
         Thread.sleep(seconds * 1000);
      }
      catch (InterruptedException e)
      {
         e.printStackTrace();
      }

   }

   /**
    * Gets the color hex.
    *
    * @param rgbCode
    *           the rgb code
    * @return the color hex
    * @created_by : narot
    * @created_on: 6 May, 2019 8:58:47 PM
    */
   public static String getColorHex(String rgbCode)
   {
      String hax = null;
      try
      {
         hax = Color.fromString(rgbCode).asHex();
      }
      catch (Exception e)
      {
         LOG.error("NOT ABLE TO GET HEX CODE FOR GIVEN RGB CODE OF COLOR:" + rgbCode);
         e.printStackTrace();
      }
      return hax;
   }

   /**
    * Scroll to element.
    *
    * @param driver
    *           the driver
    * @param el
    *           the el
    * @created_by : narot
    * @created_on: 6 May, 2019 8:58:47 PM
    */
   public static void scrollToElement(WebDriver driver, WebElement el)
   {
      JavascriptExecutor je = (JavascriptExecutor) driver;
      je.executeScript("arguments[0].scrollIntoView(true);", el);
   }

   /**
    * Scroll to position.
    *
    * @param driver
    *           the driver
    * @param x
    *           the x
    * @param y
    *           the y
    * @created_by : narot
    * @created_on: 6 May, 2019 8:58:47 PM
    */
   public static void scrollToPosition(WebDriver driver, int x, int y)
   {
      JavascriptExecutor js = (JavascriptExecutor) driver;
      // js.executeScript("javascript:window.scrollBy(" + x, y + ")");
      js.executeScript("javascript:window.scrollBy(0,300)");
   }

   /**
    * Random number generator.
    *
    * @param maximum
    *           the maximum
    * @return the int
    * @created_by : narot
    * @created_on: 6 May, 2019 8:58:47 PM
    */
   public static int randomNumberGenerator(int maximum)
   {
      int randomNum = 0 + (int) (Math.random() * maximum);
      return randomNum;

   }

   /**
    * Gets the random with exclusion.
    *
    * @param end
    *           the end
    * @param exclude
    *           the exclude
    * @return the random with exclusion
    * @created_by : narot
    * @created_on: 6 May, 2019 8:58:47 PM
    */
   public static int getRandomWithExclusion(int end, int[] exclude)
   {
      Arrays.sort(exclude);
      int rand = 0;
      do
      {
         rand = randomNumberGenerator(end);
      }
      while (Arrays.binarySearch(exclude, rand) >= 0);
      return rand;
   }

   /**
    * Checks if is file exists.
    *
    * @param path
    *           the path
    * @return true, if is file exists
    * @created_by : narot
    * @created_on: 6 May, 2019 8:58:47 PM
    */
   public static boolean isFileExists(String path)
   {
      File f = null;
      try
      {
         f = new File(path);
         return f.exists();
      }
      catch (Exception e)
      {
      }
      return false;
   }

   /**
    * Delete file.
    *
    * @param path
    *           the path
    * @created_by : narot
    * @created_on: 6 May, 2019 8:58:47 PM
    */
   public static void deleteFile(String path)
   {
      File f = null;
      try
      {
         f = new File(path);
         f.delete();
         LOG.info("FILE DELETED SUCCESSFULYY WITH PATH:" + path);
      }
      catch (Exception e)
      {
         LOG.error("NOT ABLE TO DELETE FILE:" + path);
      }
   }

   /**
    * Gets the all files from folder.
    *
    * @param path
    *           the path
    * @return the all files from folder
    * @created_by : narot
    * @created_on: 6 May, 2019 8:58:47 PM
    */
   public static String getAllFilesFromFolder(String path)
   {
      File folder = new File(path);
      File[] listOfFiles = folder.listFiles();
      for (int i = 0; i < listOfFiles.length; i++)
      {
         if (listOfFiles[i].isFile())
         {
            LOG.info("FILE " + listOfFiles[i].getName());
            return listOfFiles[i].getName();
         }
         else if (listOfFiles[i].isDirectory())
         {
            LOG.info("DIRECTORY NAME " + listOfFiles[i].getName());
         }
      }
      return path;
   }

   /**
    * to-do.
    *
    * @param moduleList
    *           the module list
    * @auther Narottam Singh
    * @retrun_type void
    */
   public static void PrintList(List<String> moduleList)
   {
      for (String element : moduleList)
      {
         LOG.info(element);
      }

   }

   /**
    * Removes the junk from string.
    *
    * @param orginalString
    *           the orginal string
    * @return the string
    * @created_by : narot
    * @created_on: 6 May, 2019 8:58:41 PM
    */
   public static String removeJunkFromString(String orginalString)
   {
      String newString = "";

      for (int i = 0; i < orginalString.length(); i++)
      {
         // Ascci range for a-z A-Z
         if ((orginalString.charAt(i) > 64 && orginalString.charAt(i) < 121) | orginalString.charAt(i) == 32)
         {
            newString += orginalString.charAt(i);
         }
      }
      return newString;

   }

   /**
    * Select option by text.
    *
    * @param elementList
    * @param text
    * @created_by : narottam
    * @created_on: 6 May, 2019 8:58:47 PM
    */
   public static void selectOptionByText(List<WebElement> elementList, String text)
   {
      LOG.info("Selecting Option with Text: " + text);
      for (WebElement category : elementList)
      {
         if (category.getText().equalsIgnoreCase(text) || category.getText().contains(text))
         {
            category.click();
            break;
         }
      }
   }

   /**
    * Select option by text.
    *
    * @param elementList
    * @param text
    * @created_by : narottam
    * @created_on: 6 May, 2019 8:58:47 PM
    */
   public static void selectOptionByFullText(List<WebElement> elementList, String text)
   {
      LOG.info("Selecting Option with Text: " + text);
      for (WebElement category : elementList)
      {
         if (category.getText().equalsIgnoreCase(text))
         {
            category.click();
            break;
         }
      }
   }

   public static String getDateAsUniqueString()
   {
      SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyyhhmmss");
      Date custDate = new Date();
      System.out.println(sdf.format(custDate));
      return sdf.format(custDate);
   }

   public static String getRichMediaEmailContentByType(String baseText, String creativeName, String type)
   {
      return baseText + '"' + creativeName + '"' + " " + Creatives.NotifiactionContent.valueOf(type).getLabel();
   }

   public static boolean isElementDisplayed(WebElement element)
   {
      try
      {
         return element.isDisplayed();
      }
      catch (Exception e)
      {
         return false;
      }

   }

   /**
    * Checks if is element have attribute.
    *
    * @param element
    *           the element
    * @param attribute
    *           the attribute
    * @param value
    *           the value
    * @return true, if is element have attribute
    * @created_by : narot
    * @created_on: 6 May, 2019 5:32:29 PM
    */
   public static boolean isElementHaveAttribute(WebElement element, String attribute, String value)
   {
      try
      {
         return element.getAttribute(attribute).contains(value);
      }
      catch (Exception e)
      {
         return false;
      }

   }

   public static Sheet readExcel(String filePath, String fileName, String sheetName) throws IOException
   {
      // Get ExcelSheet File Path
      File exCelSheet = excelFilePathObj(filePath, fileName);

      // Create an object of FileInputStream class to read excel file
      FileInputStream inputStream = new FileInputStream(exCelSheet);

      // File extension Validation
      Workbook excelWorkorkBook = excelExtensionsCheck(inputStream, fileName);

      // Read sheet inside the workbook by its name
      Sheet PageSheet = excelWorkorkBook.getSheet(sheetName);

      return PageSheet;
   }

   /**
    * @Description: Excel File Location
    * @param
    * @return : File
    * @exception :
    * @Created_by : Raghuram
    */
   public static File excelFilePathObj(String filePath, String fileName)
   {
      // Create an object of File class to open xlsx file
      File excelSheet = new File(filePath + "\\" + fileName);
      return excelSheet;
   }

   /**
    * @Description: Excel File Extension Validation
    * @param
    * @return : Workbook
    * @throws IOException
    * @exception :
    * @Created_by : Raghuram
    */
   public static Workbook excelExtensionsCheck(FileInputStream inputStream, String fileName) throws IOException
   {
      Workbook excelWorkorkBook = null;

      // Find the file extension by splitting file name in substring and getting only
      // extension name
      String fileExtensionName = fileName.substring(fileName.indexOf("."));

      // Check condition if the file is xlsx file
      if (fileExtensionName.equals(".xlsx"))
      {
         // If it is xlsx file then create object of XSSFWorkbook class
         excelWorkorkBook = new XSSFWorkbook(inputStream);
      }
      // Check condition if the file is xls file
      else if (fileExtensionName.equals(".xls"))
      {
         // If it is xls file then create object of HSSFWorkbook class
         excelWorkorkBook = new HSSFWorkbook(inputStream);
      }
      return excelWorkorkBook;
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : Raghuram
    */
   public static int randomNumberwithinLimit(int limitSize)
   {
      Random rand = new Random();
      int rand_number = rand.nextInt(limitSize);
      return rand_number;
   }

   /**
    * @Description:
    * @param
    * @return : void
    * @exception :
    * @Created_by : Raghuram
    */
   public static String removeSpacesInbetweenString(String originalText)
   {
      String resultText = originalText.replaceAll("\\s", "");
      return resultText;
   }

   public static RequestSpecification GetApiDetails(String baseUrl) throws IOException, JSONException
   {
      // Specify the base URL to the RESTful web service
      RestAssured.baseURI = baseUrl;

      // Get the RequestSpecification of the request that you want to sent
      // to the server. The server is specified by the BaseURI that we have
      // specified in the above step.
      RequestSpecification httpRequest = RestAssured.given();
      return httpRequest;

      // Make a request to the server by specifying the method Type and the method URL.
      // This will return the Response from the server. Store the response in a variable.
   }

   public static GsonSample jsonToString(Response response)
   {
      String responseBody = response.getBody().asString();

      Gson gson = new Gson();
      GsonSample dataHolder = gson.fromJson(responseBody, GsonSample.class);

      return dataHolder;

   }
   
  /** public static void fileCreation(String filePath,String fileName,String fileExtension) throws FileNotFoundException
   {
    //To create a new WorkBook with xls extension
      
      Workbook wb = new HSSFWorkbook();
       
      FileOutputStream fileOut = new FileOutputStream(filePath);
   } */
}
