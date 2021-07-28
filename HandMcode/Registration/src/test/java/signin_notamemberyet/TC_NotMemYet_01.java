package signin_notamemberyet;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC_NotMemYet_01 {


	WebDriver driver;
	
	TC_NotMemYet_01() {
		
		System.setProperty("webdriver.chrome.driver",  "D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
	}
	
	void signupVerification_1()  {
	 	
		driver = new ChromeDriver(); 
		driver.get("https://www2.hm.com/en_in/index.html");
                 
		//sign in button and become a member
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 WebElement si1 = driver.findElement(By.xpath("//div[@class=\"account parbase\"]"));
		 WebElement si2 = driver.findElement(By.xpath("//button[@class=\"button large\"]"));
		 
		 Actions act = new Actions(driver);
		 act.moveToElement(si1).moveToElement(si2).click().perform();
		 WebElement  bm = driver.findElement(By.xpath("//button[@class=\"button large secondary\"]"));
		bm.click();
		
		
		WebElement Email_Box = driver.findElement(By.id("modal-signin-email"));
		Email_Box.clear();
		Email_Box.sendKeys("form@gmail.com"); 
		
		WebElement Pw_Box = driver.findElement(By.id("modal-signin-password"));
		Pw_Box.clear();
		Pw_Box.sendKeys("Belinda123@"); 
		
		driver.findElement(By.xpath("//div[@class=\"input-info js-validtips\"]")).click();
		
	
		driver.findElement(By.xpath("//input[@id=\"modal-signin-day\"]")).sendKeys("03");
		
		driver.findElement(By.xpath("//input[@id=\"modal-signin-month\"]")).sendKeys("09");
		
		driver.findElement(By.xpath("//input[@id=\"modal-signin-year\"]")).sendKeys("1996");
		
               
                // add more and get more
                WebElement Addmore_Getmore_Box = driver.findElement(By.xpath("//div[@class=\"full-registration\"]"));
                Addmore_Getmore_Box.click();
            
                //first name , last name, gender , pincode
 
                 WebElement Firstname_Box = driver.findElement(By.id("modal-sign-up-form-first-name"));
                 Firstname_Box.sendKeys("A");
                 
                 WebElement Lastname_Box = driver.findElement(By.id("modal-sign-up-form-last-name"));
                 Lastname_Box.sendKeys("B");

                 //gender drop box
                 driver.findElement(By.xpath("//div[@class=\"select-primary\"]")).click();
                 //any of the two
                 
                // Gender_DropBox.selectByIndex(1)
               driver.findElement(By.xpath("//div[@class=\"select-primary\"]")).click();
               Thread(5000);
                  driver.findElement(By.xpath("//option[@value=\"FEMALE\"]")).click();
                  Thread(5000);
                //pincode                 
               driver.findElement(By.id("modal-sign-up-form-postal-code")).sendKeys("600012");
                  
                 //tick box
                WebElement Tick_Box = driver.findElement(By.id("modal-create-account-fashion-news"));
                Tick_Box.click();

                System.out.print("taken values");
          
		

                WebElement Become_Member = driver.findElement(By.xpath("//button[@class=\"button large js-submit-join\"]"));
                Become_Member.click();
		
				
		
		
		
		//driver.close();
		//driver.quit();

	}
	private void Thread(int i) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) throws InterruptedException {
		
TC_NotMemYet_01 signup1 = new TC_NotMemYet_01();
		
		signup1.signupVerification_1();

	}

}
