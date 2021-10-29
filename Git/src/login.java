import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class login {

	public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver;

			
				
				System.setProperty("webdriver.gecko.driver", "D:\\Web\\geckodriverSelenium\\geckodriver.exe");	
				 driver=new FirefoxDriver(); 
			    driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
			    String ExpectedResult="Web Orders Login";
			    String ActualResult=driver.getTitle();
			    if(ExpectedResult.equals(ActualResult))
			    {
			    	System.out.println("successfully navigate");
			    }
			    else {
			    	System.out.println("not navigate successfully");
			    }
			    WebElement Username=driver.findElement(By.xpath("//*[@id='ctl00_MainContent_username']"));
			    Username.sendKeys("Tester");
			    Thread.sleep(3000);
			    WebElement Password=driver.findElement(By.xpath("//*[@id='ctl00_MainContent_password']"));
			  Password.sendKeys("test");
			    Thread.sleep(3000);
			    WebElement Login=driver.findElement(By.xpath("//*[@id='ctl00_MainContent_login_button']"));
			    Login.click();
			    WebElement Order=driver.findElement(By.xpath("//*[@id='ctl00_menu']/li[3]/a"));
			    if(Order.isDisplayed())
			    {
			    	System.out.println("login is successful");
			    }
			    else {
			    	System.out.println("login is not successful");
			    }
				}

			

	}


