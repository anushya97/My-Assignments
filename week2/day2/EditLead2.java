package Assignments.week2.day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//div[@id='x-form-el-ext-gen248']/input")).sendKeys("Keerthika");
		System.out.println("entered name");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		System.out.println("clicked on find leads");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		String f= driver.getTitle();
		System.out.println(f);
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("NLC");
		driver.findElement(By.name("submitButton")).click();
		System.out.println("updated");
		String g = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	System.out.println(g);
		
	
	driver.close();
		

	}

}
