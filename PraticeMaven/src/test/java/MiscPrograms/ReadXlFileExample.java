package MiscPrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadXlFileExample {

	public static void main(String[] args) throws IOException {
		
		 //Create an object of File class to open xlsx file
        File file = new File("C:\\Users\\santh\\Downloads\\file1.xls");
        
        FileInputStream inputStream = new FileInputStream(file);
        
        //creating instance for excel workbook
        XSSFWorkbook wb = new XSSFWorkbook(inputStream);
        
        //getting the sheet1 data
        XSSFSheet sheet = wb.getSheet("Sheet1");
        
        //getting the first row data
        XSSFRow row = sheet.getRow(1);
        
        XSSFCell cell = row.getCell(1);
        
        String value = cell.getStringCellValue();
        
        System.out.println("the value is: " +value);
     
        
        
      
	}

}
