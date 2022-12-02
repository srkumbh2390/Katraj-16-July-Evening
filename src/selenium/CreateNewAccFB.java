package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateNewAccFB {
	
	String path ="D:\\\\test\\\\Selenium\\\\Driver\\\\All Driver\\\\chromedriver.exe";
	
	
	public void FBaccCreating() throws InterruptedException {
		//set path require for creating driver instance
				System.setProperty("webdriver.chrome.driver", path);
				
				//step-1  crating object of chrome diver
				WebDriver driver = new ChromeDriver();
				System.out.println("-----------Step-1---------");
				
				//step-2 maximize
				driver.manage().window().maximize();
				System.out.println("-----------Step-2---------");
				
				//step-3  open webpage
				driver.get("https://www.facebook.com");
				System.out.println("-----------Step-3---------");
				Thread.sleep(2000);
				
				//step-4 find button
				WebElement NewAccButton = driver.findElement(By.xpath("//a[text()='Create New Account']"));
				System.out.println("-----------Step-4---------");
			
				
				//step-5--current window handle
				String parentTab = driver.getWindowHandle();
				System.out.println("Parent Tab : " + parentTab);
				System.out.println("-----------Step-5---------");
				
				//step-6--tab locator
				NewAccButton.click();
				System.out.println("-----------Step-6---------");
				Thread.sleep(3000);
				
				//  step-7 Fill Sign Up form
				WebElement Fname = driver.findElement(By.name("firstname"));
				Fname.sendKeys("Swapnil");
				Thread.sleep(1000);
				
				WebElement Lname = driver.findElement(By.name("lastname"));
				Lname.sendKeys("Kumbhare");
				Thread.sleep(1000);
				
				WebElement email = driver.findElement(By.name("reg_email__"));
				email.sendKeys("swapkumbh23@gmail.com");
				Thread.sleep(1000);
				
				WebElement email1 = driver.findElement(By.name("reg_email_confirmation__"));
				email1.sendKeys("swapkumbh23@gmail.com");
				Thread.sleep(1000);
				
				WebElement newPass = driver.findElement(By.name("reg_passwd__"));
				newPass.sendKeys("Prad@123");
				Thread.sleep(1000);
				System.out.println("-----------Step-7---------");
				
				//step-8  Fill day month & year
				WebElement dayDropDown = driver.findElement(By.xpath("//select[@title='Day']"));
				
				Select sel = new Select(dayDropDown);
				List<WebElement> list1 = sel.getOptions();
				System.out.println("The size of Day List is : " + list1.size());
				
				System.out.println("Dates present in date DropDown are : ");
				for (WebElement ele1 : list1) {
					String date = ele1.getText();
					System.out.print(date+",");
					
					if (date.equals("23")) {
						ele1.click();
					}
				}
				System.out.println("");
				System.out.println("----------------------------------------------------------------------------------");
				
				WebElement monthDropDown = driver.findElement(By.xpath("//select[@title='Month']"));
				
				Select sel2=new Select(monthDropDown);
				List<WebElement> list2 = sel2.getOptions();
				System.out.println("The size of Month List is : " + list2.size());
				
				System.out.println("Months present in Month DropDown are : ");
				for (WebElement ele2 : list2) {
					String month = ele2.getText();
					System.out.print(month+",");
					if (month.equals("Sep")) {
						ele2.click();
					}
				}
				System.out.println("");
				System.out.println("------------------------------------------------------------------------------------");
				
				WebElement yearDropDown = driver.findElement(By.xpath("//select[@title='Year']"));
				
				Select sel3=new Select(yearDropDown);
				List<WebElement> list3 = sel3.getOptions();
				System.out.println("The size of Year List is : " +list3.size());
				
				System.out.println("Years present in  Year DropDown are : ");
				for (WebElement ele3 : list3) {
					String year = ele3.getText();
					System.out.print(year+",");
					if (year.equals("1990")) {
						ele3.click();
				}
			}
				System.out.println("");
				System.out.println("-----------Step-8---------");				
				System.out.println("------------------------------------------------------------------------------------");
				
				WebElement gender = driver.findElement(By.xpath("//input[@name='sex' and @value='2']"));
				gender.click();
				
				//step-9
				WebElement signUp = driver.findElement(By.name("websubmit"));
				signUp.click();
				System.out.println("-----------Step-9---------");
				
				//step-10--close all tab
				Thread.sleep(5000);
				driver.quit();
				System.out.println("-----------Step-10-------");
				
	}

	public static void main(String[] args) throws InterruptedException {
		CreateNewAccFB var=new CreateNewAccFB();
		var.FBaccCreating();
		
	}

}
