package Assignments.week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(50));
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Anushya");
		driver.findElement(By.name("lastname")).sendKeys("N");
		driver.findElement(By.name("reg_email__")).sendKeys("987654321");
		driver.findElement(By.id("password_step_input")).sendKeys("1234#");
		
		
		Select day = new Select (driver.findElement(By.id("day")));
		day.selectByValue("5");
	
		Select month = new Select (driver.findElement(By.id("month")));
		month.selectByVisibleText("Mar");
	
		Select year = new Select (driver.findElement(By.id("year")));
		year.selectByValue("1998");
		
		driver.findElement(By.className("_8esa")).click();
		
		
		//driver.findElement(By.xpath("//input[@id='u_2_4_5x']")).click();
		//driver.findElement(By.xpath("//input[@id='u_2_4_5x']")).click();
		//driver.findElement(By.xpath("//span[@id='u_a_o_wf']/span[1]/label")).click();
		
		//		driver.findElement(By.id("u_2_4_5x")).click();
		
	}

}
