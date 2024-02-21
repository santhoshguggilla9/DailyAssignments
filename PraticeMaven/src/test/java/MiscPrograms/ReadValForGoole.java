package MiscPrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class readValExcel
{
	WebDriver driver;
	public void searchGoogle(String key)
	{
		 driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		WebElement s = driver.findElement(By.name("q"));
		s.sendKeys(key + Keys.ENTER);
	}
	public void teardown()
	{
		driver.close();
	}
}

public class ReadValForGoole {

	public static void main(String[] args) throws IOException
	{
		//Create an object of File class to open xlsx file
	    File file = new File("C:\\Users\\santh\\Downloads\\file1.xlsx");
	    
	    //Create an object of FileInputStream class to read excel file
	    FileInputStream inputStream = new FileInputStream(file);

	  //Creating workbook instance that refers to .xls file
	    XSSFWorkbook wb = new XSSFWorkbook(inputStream);
	    
	    //Creating a Sheet object using the sheet Name
	    XSSFSheet sheet = wb.getSheet("google");
	    
	  //Create a row object to retrieve row at index 1
	    XSSFRow row2=sheet.getRow(0);
	    
	    //Create a cell object to retreive cell at index 5
	    XSSFCell cell=row2.getCell(0);
	    
	    String key = cell.getStringCellValue();
	    
	    readValExcel read = new readValExcel();
	    read.searchGoogle(key);
	    //read.teardown();
	}
	
}
