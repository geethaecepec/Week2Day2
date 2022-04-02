package Week2Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLeadXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver=new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("geetha.s@yahoo.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text = driver.findElement(By.xpath("(//a[contains(@class,'linktext')])[6]")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("(//a[contains(@class,'linktext')])[6]")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Duplicate Lead")) {
			System.out.println("Confirmed");
		}
		else {
			System.out.println("Not Confirmed");
		}
		driver.findElement(By.name("submitButton")).click();
	String text2 = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if(text2.equals(text)) {
			System.out.println("Same as captured lead name");
		}
		else {
			System.out.println("Different Lead Name");
			driver.close();
		}
		


	}



	}


