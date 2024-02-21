package Sel4Features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.javafaker.Faker;

public class FakerDemo {

	public static void main(String[] args) {
		
        // Initialize Faker
        Faker faker = new Faker();

        // Initialize Selenium WebDriver
        WebDriver driver = new ChromeDriver();

        // Open the webpage
        driver.get("https://demowebshop.tricentis.com/register");
        
        WebElement btnRadio = driver.findElement(By.xpath("//input[@id='gender-male']"));
        btnRadio.click();
        
        WebElement firstName = driver.findElement(By.id("FirstName"));
        firstName.sendKeys(faker.name().firstName());
        
        WebElement lastName = driver.findElement(By.id("LastName"));
        lastName.sendKeys(faker.name().lastName());
        
        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys(faker.internet().emailAddress());
        
        WebElement pwd = driver.findElement(By.id("Password"));
        pwd.sendKeys("Edu123");
        
        WebElement cpwd = driver.findElement(By.id("ConfirmPassword"));
        cpwd.sendKeys("Edu123");
        
        driver.findElement(By.id("register-button")).click();
        
        //driver.close();

	}

}
