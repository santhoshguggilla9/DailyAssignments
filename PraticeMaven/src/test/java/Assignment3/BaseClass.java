package Assignment3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class BaseClass implements configData {

	WebDriver driver;
	
	public BaseClass(WebDriver driver) {
		
		this.driver = driver;
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}

	@Override
	public void readExcel() throws IOException {
		
		 //Create an object of File class to open xlsx file
        File file = new File("C:\\Users\\santh\\Downloads\\file1.xlsx");
        
        //Create an object of FileInputStream class to read excel file
        FileInputStream inputStream = new FileInputStream(file);

      //Creating workbook instance that refers to .xls file
        XSSFWorkbook wb = new XSSFWorkbook(inputStream);
        
        //Creating a Sheet object using the sheet Name
        XSSFSheet sheet = wb.getSheet("google");
        
       int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
       
       for(int i=0;i<=rowCount;i++)
       {
    	   int cellCount = sheet.getRow(i).getLastCellNum();
    	   
    	   for(int j=0;j<cellCount;j++)
    	   {
    		   String key = sheet.getRow(i).getCell(j).getStringCellValue();
    		   fetchData(key);
    	   }
       }
        
        
	}

	@Override
	public void fetchData(String k) {
		
		
	}

	@Override
	public void teardown() {
		
		
	}

}
