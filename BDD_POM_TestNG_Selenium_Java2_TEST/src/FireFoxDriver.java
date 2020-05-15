import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDriver {

	
	 
		

		public static WebDriver driver;

		public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Demoriel Purnell\\workspace_python\\drivers\\geckodriver.exe");
			driver= new FirefoxDriver();
			
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			driver.get("https://www.edureka.co/");
			
			driver.manage().window().maximize();
			
			driver.manage().deleteAllCookies();
			
			WebElement login = driver.findElement(By.xpath("//a[@class='signin top-signin giTrackElementHeader']"));
			login.click();
			
			Thread.sleep(2000);
			
			WebElement userName = driver.findElement(By.xpath("//input[@id='si_popup_email']"));
			userName.sendKeys("dpurnellqa@gmail.com");
			
			Thread.sleep(2000);
			
			WebElement password = driver.findElement(By.xpath("//input[@id='si_popup_passwd']"));
			password.sendKeys("Kobelastgame60$");
			
			Thread.sleep(2000);
			
			WebElement loginclick = driver.findElement(By.xpath("//button[@class='clik_btn_log btn-block pagesense_en_track']"));
			loginclick.click();


}
}