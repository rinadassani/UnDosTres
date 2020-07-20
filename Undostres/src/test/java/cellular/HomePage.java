package cellular;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.PaymentPage;
import pageObjects.RechargePage;
import resources.base;

public class HomePage extends base {
	public WebDriver driver;
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver = initializeDriver();

	}
	
	@Test(dataProvider="getData")
	
	public void basePageNavigation(String Phone) throws IOException, Exception
	{
		
		
		driver.get("http://prueba.undostres.com.mx");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// creating object to that class and invoke methods of it
		RechargePage l = new RechargePage(driver);
		l.getOperator().click();
		Thread.sleep(2000);
		l.selectOperator().click();
		l.cellularNum().sendKeys(Phone);
		l.planSelect().click();
		Thread.sleep(2000);;
		l.rechargeSelect().click();
		l.submitButton().click();
		PaymentPage p = new PaymentPage(driver);
	    System.out.println(p.VerifyTitle().getText());
	    p.CardName().sendKeys("Test");
	    p.CardNumber().sendKeys("4111111111111111");
	    p.Month().sendKeys("11");
	    p.Year().sendKeys("2025");
	    p.CVV().sendKeys("111");
	    p.Email().sendKeys("test@test.com");
	    p.Recharge().click();
	    p.Login().sendKeys("marze.zr@gmail.com");
	    p.Password().sendKeys("123456");
	    //wait for the captcha to be clicked manually
	    WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"loginBtn\"]")));
	    p.Payment().click();
	    
		
		
	
	}
	
	@DataProvider
	public Object[][] getData()
	// Row stands for how many different data types test should run
			//coloumn stands for how many values per each test
	{
		Object[][] data=new Object[1][1];
		//0th row
		data[0][0]="5523261151";
		return data;
	}
	@AfterTest
	public void teardown()
	{
		
		driver.close();
	
		
	}

	
}