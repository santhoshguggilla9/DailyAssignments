package Assignment3;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_01_Google {

	public static void main(String[] args) throws IOException {
		
			WebDriver driver;
			
			driver = new ChromeDriver();
			
			BaseClass bObj = new BaseClass(driver);
			bObj.readExcel();
		}

}
