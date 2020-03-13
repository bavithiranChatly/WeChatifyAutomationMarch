package com.uiautomation.pages;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.json.JSONException;

import com.uiautomation.utils.CommonUtils;
import com.uiautomation.utils.GsonSample;
import com.wechatify.utils.Constants;

import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import jline.internal.Log;

/**
 * 
 * @version $Id$
 */
public class TagAutotrigger
{

   /**
    * @Description:
    * @param
    * @return : void
    * @throws IOException
    * @throws JSONException
    * @exception :
    * @Created_by : Raghuram
    */

   public static void GetProcess(String filePath, String fileName, String sheetName, RequestSpecification httpRequest) throws IOException, JSONException
   {
      // Creating a File to write 
      //CommonUtils.fileCreation(filePath, fileName, "xlxs");

      Sheet PageSheet = CommonUtils.readExcel(filePath, fileName, sheetName);

      int rowCount = PageSheet.getLastRowNum();
      // Log.info(rowCount);

      // Create a loop over all the rows of excel file to read it
      for (int i = 0; i < rowCount; i++)
      {
         Row row = PageSheet.getRow(i);

         // Log.info(row.getLastCellNum());
         // Create a loop to Get cell values in a row
         for (int j = 0; j < row.getLastCellNum(); j++)
         {
            String openId = row.getCell(j).getStringCellValue();
            Response response = httpRequest.request(Method.GET, "/" + openId + "/622");

            /** Converted JSON to STRING value */
            GsonSample dataHolder = CommonUtils.jsonToString(response);

            System.out.println("contactId for " + openId + " is => " + dataHolder.data.contactid);

            String FILEE = "F:\\Wechatify - Local\\wechatify-automation-local\\src\\test\\resources\\test-data\\apiWrite.xlsx";
            InputStream inp = new FileInputStream(FILEE);
            Workbook wb = WorkbookFactory.create(inp);
            Sheet sheet1 = wb.getSheetAt(0);
            int num = sheet1.getLastRowNum();
            Row row1 = sheet1.createRow(++num);
            row1.createCell(0).setCellValue(dataHolder.data.contactid);

            // Now this Write the output to a file
            FileOutputStream fileOut = new FileOutputStream(FILEE);
            wb.write(fileOut);
            fileOut.close();
            Log.info("Write Operation Successfull");
         }
      }
   }

   /*
    * public static void readingExcel() throws IOException { Sheet PageSheet = CommonUtils.readExcel(filePath, fileName, sheetName); }
    */

   public static void main(String[] args) throws IOException, JSONException
   {
      /** http request initiation */
      Properties obj = new Properties();
      
      FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\Api.properties");
      obj.load(objfile);
      String mobileTesting = obj.getProperty("BaseUrl");
      
      //String baseURL = "https://servicecloudwechatifyapi.azurewebsites.net/api/SalesforceContact";
      RequestSpecification httpRequest = CommonUtils.GetApiDetails(mobileTesting);

      // TODO Auto-generated method stub
      // readingExcel();
      String inputSheetFilePath = CommonUtils.getAbsolutePathPath(Constants.EXCEL_SHEET_DATA_FAQ_PATH);
      String inputSheetFileName = "api.xlsx";
      String inputSheetName = "Sheet1";
      GetProcess(inputSheetFilePath, inputSheetFileName, inputSheetName, httpRequest);

   }

}
