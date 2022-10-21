package RegistrationForm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* 1. Check Requared fields in User Registration form (Do not fill in the fields and click Submit).

 Expected Result: Error messages appear for fields marked as requared (there is no mark (*) on the webpage).
 Actual result: Error message "This field is required." appeared for fields:
                First Name, Last Name, Hobby, Phone N., Username, E-mail, Password, Confirm Password.
*/

public class Check01 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty(
                "webdriver.chrome.driver", "C:\\Users\\Romanova\\Desktop\\Resources\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.way2automation.com/way2auto_jquery/registration.php#load_box");

        driver.findElement(By.cssSelector("input[value='submit']")).click();
        Thread.sleep(3000);
        driver.quit();

    }
}