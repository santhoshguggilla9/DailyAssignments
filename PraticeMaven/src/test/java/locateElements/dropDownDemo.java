package locateElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class dropDownDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;

		driver = new ChromeDriver();

		driver.get("https://demoqa.com/select-menu"); 
		driver.manage().window().maximize();

		//Selecting the dropdown element by locating its id
		WebElement dropDown = driver.findElement(By.id("oldSelectMenu"));
		Select select = new Select(dropDown);
		
		//Step#4- Printing the options of the dropdown
		//Get list of web elements
		List<WebElement> lst = select.getOptions();
		
		//Looping through the options and printing dropdown options
		System.out.println("The dropdown options are:");
		
		for(WebElement option : lst)
		System.out.println(option.getText());

		Thread.sleep(30);
		//printing an option using index no
		System.out.println("Option present at the index 3..");
			select.selectByIndex(3);
				
		String currentValue=select.getFirstSelectedOption().getText();
		System.out.println("Select value is: " + currentValue);
		
		//Step#6- Selecting the option as 'Magenta'-- selectByVisibleText
		System.out.println("Select the Option by Text Magenta");
		select.selectByVisibleText("Magenta");
		System.out.println("Select value is: " + select.getFirstSelectedOption().getText());

		//Step#7- Selecting an option by its value
		System.out.println("Select the Option by value 6");
		select.selectByValue("5");
		System.out.println("Select value is: " + select.getFirstSelectedOption().getText());
	}

}
