package Assignments.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		System.out.println("entered username");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		System.out.println("entered password");
		driver.findElement(By.className("decorativeSubmit")).click();
		System.out.println("logged in");

		driver.findElement(By.linkText("CRM/SFA")).click();
		System.out.println("entered SFA");

		driver.findElement(By.linkText("Leads")).click();
		System.out.println("clicked on Leads");

		driver.findElement(By.partialLinkText("Create Lead")).click();
		System.out.println("clicked on Create Lead");

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Cognizant");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Anushya");	
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("N");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Anushya");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Cognizant");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Healthcare");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Enter your description here.");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("xyz@gmail.com");
		System.out.println("entered email");

		Select s = new Select (driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		s.selectByVisibleText("New York");

		driver.findElement(By.name("submitButton")).click();
		System.out.println("submitted");
		String title = driver.getTitle();
		System.out.println(title);


	}

}
