package selpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBSignUp1 {	

	    public void facbookCreatNewAccount() throws InterruptedException 
	    {
		System.setProperty("webdriver.chrome.driver","S:\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/r.php?next=https%3A%2F%2Fwww.facebook.com%2Fcampaign%2Flanding.php%3Fcampaign_id%3D14884913640%26extra_1%3Ds%257Cc%257C589460569867%257Cb%257Ccreate%2Baccount%2Bfacebook%257C%26placement%26creative%3D589460569867%26keyword%3Dcreate%2Baccount%2Bfacebook%26partner_id%3Dgooglesem%26extra_2%3Dcampaignid%253D14884913640%2526adgroupid%253D128696221432%2526matchtype%253Db%2526network%253Dg%2526source%253Dnotmobile%2526search_or_content%253Ds%2526device%253Dc%2526devicemodel%253D%2526adposition%253D%2526target%253D%2526targetid%253Dkwd-298831207577%2526loc_physical_ms%253D20462%2526loc_interest_ms%253D%2526feeditemid%253D%2526param1%253D%2526param2%253D%26gclid%3DCjwKCAjws--ZBhAXEiwAv-RNL-6uTy4Zo3gycEe4Gc0GrVSwX5zOwOVctZUuJYKPQIaw3_kzflefnRoCF30QAvD_BwE&locale=en_GB&display=page");
		
		WebElement dropDown=driver.findElement(By.xpath("//select[@aria-label='Day']"));
		
		Select sel=new Select(dropDown);
		
	   // sel.selectByIndex(6);
	    
	    List<WebElement> list = sel.getOptions();
	    System.out.println("The size of the date"+list.size());
	    
	    System.out.print("In the date dropdown following date are present:");
	    for (WebElement ele: list) 
	    {
	    	String number = ele.getText();
	    	System.out.print(number+",");
	    	
	    	if(number.equals("3")) 
	    	{
	    		ele.click();
	        }
	    }
	         System.out.println("-----------------------------------------------------------------------------");
	    
	       WebElement dropDown2=driver.findElement(By.xpath("//select[@name='birthday_month']"));
	       
	       Select sel2=new Select(dropDown2);
	       
	      // sel2.selectByVisibleText("Jan");
	       
	       List<WebElement> list2 = sel2.getOptions();
	       
	       System.out.println("Actual Month are present in dropdown is :"+list2.size()+"month");
	       
	       for (WebElement ele2:list2) 
	       {
	    	   
	    	   String months = ele2.getText();
	    	   System.out.print(months+",");
	    	   
	    	   if (months.equals("Jan")) 
	    	   {
	    		    ele2.click();
	    	   }
	    	   
	       }
	            System.out.println("------------------------------------------------------------------------");
	       WebElement dropDown3=driver.findElement(By.id("year"));
	       
	       Select sel3=new Select(dropDown3);
	       
	      // sel3.selectByValue("1995");
	       
	     List <WebElement> list3=sel3.getOptions();
	       
	     System.out.println("Count of the Year present in Year DropDown is:"+list3.size());
	     
	     for (WebElement ele3:list3)
	     {
	    	 
	    	    String years=ele3.getText();
	    	    
	    	    System.out.print(years+",");
	    	    
	    	    if (years.equals("1995"))
	    	    {
	    	    	ele3.click();
	    	    }
	     }
	     System.out.println("-----------------------------------------------------------------------------");
	       JavascriptExecutor js=(JavascriptExecutor)driver;
	       
	       WebElement Already=driver.findElement(By.linkText("Already have an account?"));
	       js.executeScript("arguments[0].scrollIntoView()", Already);
	       
	      String text4 = Already.getText();
	      System.out.println(text4 );
	       
	       Thread.sleep(5000);
	       //Already.click();
	     

	       WebElement plusButton=driver.findElement(By.xpath("(//a[@role='button'])[6]"));
	        
	       plusButton.click();
	       
			/*
			 * WebElement lang=driver.findElement(By.xpath("//*[@id=\"js_8l\"]"));
			 * js.executeScript("arguments[0].scrollIyView",lang);
			 * 
			 * lang.click(); String Language= lang.getText(); System.out.println(Language);
			 */
	       
	       WebElement close=driver.findElement(By.xpath("//*[@id=\"facebook\"]/body/div[4]/div[2]/div/div/div/div[3]/div/a"));
	       js.executeScript("arguments[0].scrollIntoView()", close);
	       
	       close.click();
	       
	       
	  }
	     
		public static void main(String[] args) throws InterruptedException {
			FBSignUp1 ref=new FBSignUp1();
			ref.facbookCreatNewAccount();

		}

	}