/**
 * 
 */
package com.uiautomation.pages;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.json.JSONException;

import jline.internal.Log;

/**
 * 
 * @version $Id$
 */
public class Write
{
   public void writeExcel() throws IOException 
   {
      String FILE_NAME = "F:\\Wechatify - Local\\wechatify-automation-local\\src\\test\\resources\\test-data\\apiWrite.xlsx"; 
      InputStream inp = new FileInputStream(FILE_NAME); 
      Workbook wb = WorkbookFactory.create(inp); 
      Sheet sheet = wb.getSheetAt(0); 
      int num = sheet.getLastRowNum(); 
      Row row = sheet.createRow(++num); 
      row.createCell(0).setCellValue("xyz"); 
      
          // Now this Write the output to a file 
          FileOutputStream fileOut = new FileOutputStream(FILE_NAME); 
      wb.write(fileOut); 
      fileOut.close(); 
      Log.info("Write Operation Successfull");
  } 


public static void main(String[] args) throws IOException, JSONException
{
   Write abc = new Write();
   abc.writeExcel();
}
}
