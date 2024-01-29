package locateElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdownExample {

	public static void main(String[] args) {

		WebDriver driver;

		driver = new ChromeDriver();

		driver.get("https://demoqa.com/select-menu"); 
		driver.manage().window().maximize();

		Select select = new Select(driver.findElement(By.id("cars")));	

		List<WebElement> lst = select.getOptions();

		//Looping through the options and printing dropdown options
		System.out.println("The multi-dropdown options are:");

		for(WebElement option : lst)
			System.out.println(option.getText());
		
		if(select.isMultiple())
		{
			System.out.println(" selecting option by index");
			select.selectByIndex(2);
			
			System.out.println(" selecting option by value");
			select.selectByValue("saab");
			
			System.out.println(" selecting option by visable text");
			select.selectByVisibleText("Audi");
			
			System.out.println("Listing out the selected options..");
			
			List<WebElement> SelectedList = select.getAllSelectedOptions();
			
			for(WebElement getSelOption : SelectedList)
				System.out.println(getSelOption.getText());
			
			select.deselectAll();
			
			driver.quit();
		}
	}

}
