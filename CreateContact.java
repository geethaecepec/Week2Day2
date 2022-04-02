package Week2Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Geetha");
		driver.findElement(By.id("lastNameField")).sendKeys("Sharanjith");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Anu");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Sharan");
		driver.findElement(By.name("departmentName")).sendKeys("Selenium");
		driver.findElement(By.name("description")).sendKeys("Learning on Selenium Basics");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("Geetha.S@gmail.com");
		WebElement eleDropdown = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId") );
		Select dd = new Select(eleDropdown);
		dd.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("Edited the Description field");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String display = driver.findElement(By.id("sectionHeaderTitle_contacts")).getText();
		System.out.println(display);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
	}
}
