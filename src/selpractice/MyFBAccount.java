package selpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MyFBAccount {
	
	public static void m2() throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\test\\Selenium\\Driver\\All Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_\"\r\n"
				+ "				+ \"id=14884913640&extra_1=s%7Cc%7C589460569867%7Cb%7Ccreate%20new\"\r\n"
				+ "				+ \"%20facebook%20account%7C&placement=&creative=589460569867&keyword=create\"\r\n"
				+ "				+ \"%20new%20facebook%20account&partner_id=googlesem&extra_2=campaignid%3D14884913\"\r\n"
				+ "				+ \"640%26adgroupid%3D128696221432%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search\"\r\n"
				+ "				+ \"_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-35081\"\r\n"
				+ "				+ \"3237447%26loc_physical_ms%3D1007786%26loc_interest_ms%3D%26feeditemid%3D%26p\"\r\n"
				+ "				+ \"aram1%3D%26param2%3D&gclid=EAIaIQobChMI1PWR-oHJ-gIViwVyCh1J5AScEAAYASAAEgLlFfD_BwE\r\n"
				+ "");
		
//		driver.get("https://www.facebook.com/");
//		Thread.sleep(1000);
		
//		WebElement newAcc = driver.findElement(By.linkText("Create New Account"));
//		newAcc.click();
		
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
		System.out.println("------------------------------------------------------------------------------------");
		
		WebElement gender = driver.findElement(By.xpath("//input[@name='sex' and @value='2']"));
		gender.click();
		
		
		WebElement signUp = driver.findElement(By.name("websubmit"));
		signUp.click();
		
		
	}
	public static void main(String[] args) throws InterruptedException {
	
		m2();
	}

}
