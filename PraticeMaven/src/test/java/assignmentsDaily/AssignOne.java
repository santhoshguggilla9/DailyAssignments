package assignmentsDaily;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import config.ConfigurationDriver;

public class AssignOne {

    public static void main(String[] args) {

         
        ConfigurationDriver cObj = new ConfigurationDriver();
        String url="https://candymapper.com/";
         
        cObj.Config();
        cObj.getUrl(url);
        cObj.findElements();
        cObj.closeBrowser();

    }
}
