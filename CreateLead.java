package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	
	
		   public static void main(String[] args)
		   
		   {
			   
	     	//Connect with the browser driver(exe file)
			 WebDriverManager.chromedriver().setup(); //check for version and download
			  
		   // Step2 :to launch the browser
		   
		   	   ChromeDriver driver=new ChromeDriver();
		   	   
		   //Step 3:Load the URL
		   	   
		   	   driver.get("http://leaftaps.com/opentaps/control/main");
		   	   
		   	driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("demosalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Umapriya");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sindhu");
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Uma");
			driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing dept");
			driver.findElement(By.id("createLeadForm_description")).sendKeys(" Application Testing");
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("umapriyavivek@gmail.com");
			driver.findElement(By.className("smallSubmit")).click();
			String title=driver.getTitle();
	        System.out.println(title);
		   }
		   	   

  }
