package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentEditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("Demosalesmanager");
		WebElement passWord = driver.findElement(By.id("password"));
		passWord.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		WebElement createLead = driver.findElement(By.linkText("Create Lead"));
		createLead.click();
		WebElement companyname = driver.findElement(By.id("createLeadForm_companyName"));
		companyname.sendKeys("SAF PVT LTD");
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("Jack");
		WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
		lastName.sendKeys("Sparrow");
		WebElement localName = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		localName.sendKeys("John");
		WebElement localLastName = driver.findElement(By.id("createLeadForm_lastNameLocal"));
		localLastName.sendKeys("Durairaj");
		WebElement departmentName = driver.findElement(By.name("departmentName"));
		departmentName.sendKeys("Mechanical");
		WebElement description = driver.findElement(By.name("description"));
		description.sendKeys("I am testing this site by selenium");
		WebElement email = driver.findElement(By.id("createLeadForm_primaryEmail"));
		email.sendKeys("Testsaf@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		WebElement submit = driver.findElement(By.name("submitButton"));
		
		WebElement edit = driver.findElement(By.linkText("Edit"));
		edit.click();
		
		WebElement description2 = driver.findElement(By.name("description"));
		description2.clear();
		
		driver.findElement(By.name("importantNote")).sendKeys("Testing Selenium Project");
		
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());
		
		
	}

}
