package selenium;

import java.awt.Desktop.Action;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Screenshot {
public static void main(String args[])throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\path\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://parivahan.gov.in/parivahan/");
	//driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	//driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	//driver.findElement(By.name("Submit")).click();
	
	//WebElement element = driver.findElement(By.xpath("//li[@class='tb-megamenu-item level-1 mega dropdown']"));
	WebElement element = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[2]"));
	Actions action = new Actions(driver);
	action.moveToElement(element).build().perform();
	driver.findElement(By.xpath("//a[@href='https://parivahan.gov.in/rcdlstatus/?pur_cd=101']")).click();
	 File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(f, new File("C:\\Users\\HP\\Desktop\\photo\\saroj\\screenshot.png"));
	 driver.close();
}
}
