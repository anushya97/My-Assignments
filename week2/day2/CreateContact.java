package Assignments.week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();

		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Anushya");
		driver.findElement(By.id("lastNameField")).sendKeys("N");	
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Anushya");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("N");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Healthcare");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Enter your description here.");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("xyz@gmail.com");


		Select s = new Select (driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")));
		s.selectByVisibleText("New York");
		


		driver.findElement(By.xpath("//input[@value='Create Contact']")).click();

		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Important notes to be written here.");
		driver.findElement(By.xpath("//input[@value='Update']")).click();

		String tl = driver.getTitle();
		System.out.println(tl);


	}

}
