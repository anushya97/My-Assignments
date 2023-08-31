package Assignments.week2.day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		System.out.println("entered username");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		System.out.println("entered password");
		driver.findElement(By.className("decorativeSubmit")).click();
		System.out.println("logged in");

		driver.findElement(By.linkText("CRM/SFA")).click();
		System.out.println("entered SFA");

		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();

		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("987654321");
		System.out.println("entered phone number");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		String leadid = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println("lead ID of First Resulting lead: "+leadid);
		
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		System.out.println("clicked First Resulting lead");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Delete")).click();
		System.out.println("deleted");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Find Leads")).click();
		System.out.println("clicked on find leads");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadid);
		System.out.println("search deleted leadid");

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String h = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		String j = "No records to display";
		
				if(h.equals(j))
				{
					System.out.println("message confirms the successful deletion");
				}
				
				else
				{
					System.out.println("Lead id present");
				}
	

				driver.close();
	
	}

}
