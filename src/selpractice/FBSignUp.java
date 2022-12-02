package selpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBSignUp {
		public static void m8() throws InterruptedException {
			
	System.setProperty("webdriver.chrome.driver","S:\\Drivers\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/campaign/landing.php?campaign_"
					+ "id=14884913640&extra_1=s%7Cc%7C589460569867%7Cb%7Ccreate%20new"
					+ "%20facebook%20account%7C&placement=&creative=589460569867&keyword=create"
					+ "%20new%20facebook%20account&partner_id=googlesem&extra_2=campaignid%3D14884913"
					+ "640%26adgroupid%3D128696221432%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search"
					+ "_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-35081"
					+ "3237447%26loc_physical_ms%3D1007786%26loc_interest_ms%3D%26feeditemid%3D%26p"
					+ "aram1%3D%26param2%3D&gclid=EAIaIQobChMI1PWR-oHJ-gIViwVyCh1J5AScEAAYASAAEgLlFfD_BwE");
			
		     	driver.findElement(By.name("firstname")).sendKeys("Ashok");
		     	
		     	driver.findElement(By.name("lastname")).sendKeys("Gutte");
		     	
		     	driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")).sendKeys("7276234734");
		     	
		     	driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("12345");
		     	
		     	WebElement dateDropDown = driver.findElement(By.xpath("//select[@aria-label='Day']"));
		     	
		     	Select sel=new Select(dateDropDown);
		     	
		     	List<WebElement> list1 = sel.getOptions();
		     	System.out.println("The Size of the list is:-"+list1.size());
		     	
		     	System.out.println("dates present in date DropDown:");
		     	for(WebElement ele:list1) {
		     		
		     		String date = ele.getText();
		     		System.out.print(date+",");
		     		if(date.equals("3")) {
		     			ele.click();
		     		}
		     		
		     	}
		     	System.out.println("");
		     	
		     WebElement monthDropDown = driver.findElement(By.xpath("//select[@aria-label='Month']"));
		     	
		         Select sel2=new Select(monthDropDown);
		         
		         List<WebElement> list2=sel2.getOptions();
		         System.out.println("The size of the month drop down is"+list2.size());
		        
		         
		         System.out.println("Months present in Month DropDown:");
		         for(WebElement ele2:list2) {
		        	 
		        	String months=ele2.getText();
		        	System.out.print(months+",");
		        	if (months.equals("Jan")) {
		        		ele2.click();
		        	}
		         }
		         System.out.println("");
		         
		         WebElement YearDropDown = driver.findElement(By.xpath("//select[@aria-label='Year']"));
		         
		         Select sel3=new Select(YearDropDown);
		         
		         List<WebElement> list3 = sel3.getOptions();
		         System.out.println("The Size of the Year Drop Down is:-"+list3.size());
		         
		         System.out.println("Year present in Year DropDown:");
		         
		         for (WebElement ele3:list3) {
		        	 
		        	 String years = ele3.getText();
		        	 System.out.print(years+",");
		        	 
		        	 if(years.equals("1995")) {
		        		 ele3.click();
		        	 }
		         }
		         
		         WebElement radio = driver.findElement(By.xpath("//input[@type='radio' and @name='sex' and @value='2']"));
		         
		         radio.click();
		         
		         driver.findElement(By.linkText("Learn more")).click();
		         
		         Thread.sleep(5000);
		         driver.quit();
		     	
		}

		public static void main(String[] args) throws InterruptedException {
			
			m8();
		}

	}