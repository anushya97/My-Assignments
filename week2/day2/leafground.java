package Assignments.week2.day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class leafground {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/input.xhtml");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		driver.findElement(By.name("j_idt88:name")).sendKeys("Anushya");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='j_idt88:j_idt91']")).sendKeys("-India");
		System.out.println(driver.findElement(By.xpath("//input[@name='j_idt88:j_idt93']")).isEnabled());

		driver.findElement(By.xpath("//input[@name='j_idt88:j_idt95']")).clear();
		System.out.println( driver.findElement(By.xpath("//input[@name='j_idt88:j_idt97']")).getAttribute("value"));

		driver.findElement(By.xpath("//input[@name='j_idt88:j_idt99']")).sendKeys("xyz@gmail.com");
		driver.findElement(By.xpath("//input[@name='j_idt88:j_idt99']")).sendKeys(Keys.TAB);
		System.out.println("tab works");
		
		driver.findElement(By.id("j_idt88:j_idt101")).sendKeys("I am a tester");

		driver.findElement(By.xpath("//div[@id='j_idt88:j_idt103_editor']/div[@class='ql-editor ql-blank']")).sendKeys("Enter any text");
		Thread.sleep(5000);
		driver.findElement(By.id("j_idt106:thisform:age")).sendKeys(Keys.ENTER);
		System.out.println(driver.findElement(By.id("j_idt106:thisform:j_idt110_error-detail")).getText());

		driver.findElement(By.id("j_idt106:float-input")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.id("j_idt106:float-input")).getLocation());
		Thread.sleep(5000);
		driver.findElement(By.id("j_idt106:auto-complete_input")).sendKeys("Anu");
		
		
		Thread.sleep(5000);
		 WebElement s = driver.findElement(By.xpath("//span[@id='j_idt106:auto-complete_panel']/descendant::li[text() = '3']"));
		 s.click();
		//s.selectByVisibleText("3");
		
		

	}

}
