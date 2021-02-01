package com.bek.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.bek.helpers.Props;

public class DataHelper {
	static int rowIndex = 0;
	static int rowCount;
	static int passRowCount;
	public static HashMap<String,String> storeValues = new HashMap();
	   public static List<HashMap<String,String>> data(String filepath,String sheetName)
	   {
	      List<HashMap<String,String>> mydata = new ArrayList<>();
	      try
	      {
	         FileInputStream fs = new FileInputStream(filepath);
	         XSSFWorkbook workbook = new XSSFWorkbook(fs);
	         XSSFSheet sheet = workbook.getSheet(sheetName);
	         Row HeaderRow = sheet.getRow(0);
	         for(int i=1;i<sheet.getPhysicalNumberOfRows();i++)
	         {
	            Row currentRow = sheet.getRow(i);
	            //System.out.println("CURRENT CELLS IN THE ROWWW  "+currentRow.getPhysicalNumberOfCells());
	            HashMap<String,String> currentHash = new HashMap<String,String>();
	            for(int j=0;j<currentRow.getPhysicalNumberOfCells();j++)
	            {
	               Cell currentCell = currentRow.getCell(j);
	               switch (currentCell.getCellType())
	               {
	               case Cell.CELL_TYPE_STRING:
	                  currentHash.put(HeaderRow.getCell(j).getStringCellValue(), currentCell.getStringCellValue());
	                  break;
	               case Cell.CELL_TYPE_NUMERIC:
	            	   currentHash.put(HeaderRow.getCell(j).getStringCellValue(), Integer.toString((int)(currentCell.getNumericCellValue())));
	               }
	            }
	            mydata.add(currentHash);
	         }
	         fs.close();
	      }
	      catch (Exception e)
	      {
	         e.printStackTrace();
	      }
	      return mydata;
	   }
	   
	  
	   
	   public static String getDataFor(String sheetName,String arg1, String arg2){
		   List<HashMap<String,String>> datamap;
		   String cellValue= null;
		   datamap = DataHelper.data(System.getProperty("user.dir")+"//src//test//resources//testData//TestData.xlsx",sheetName);
	    	int siz = datamap.size();
	    	for(int i =0;i<siz;i++){
	    		String param=datamap.get(i).get("parameter").toString().trim();
	    		if(param.equalsIgnoreCase(arg1)){
	    			cellValue = datamap.get(i).get(arg2);
	    		}
	    	}
	    	if(cellValue==null){
	    		cellValue = "";
	    	}
	    	return cellValue;
	   }
	   
	   static Sheet sheet;
       static Workbook workBook = null;
	   
	   public static void readExcel(String filePath, String sheetName) throws IOException, InterruptedException {
		   FileInputStream inputStream = new FileInputStream(filePath);
		   workBook = new XSSFWorkbook(inputStream);
		   sheet = workBook.getSheet(sheetName);
		   rowCount = (sheet.getLastRowNum()) - (sheet.getFirstRowNum());
		   setRowCount(rowCount);
	   }
	   public static  void setRowCount(int rc){
           passRowCount =rc;
       }
       public  int getRowCount(){
           return passRowCount;
       }
       
       
      
       public static String getRegisteredUser(String regUser){
		   return getDataFor(Props.getProp("environment")+"Credentials",regUser, "useremail");
	   }
	   
	   public static String getPassword(String regUserPwd){
		   return getDataFor(Props.getProp("environment")+"Credentials",regUserPwd, "password");
	   }
       
  }

