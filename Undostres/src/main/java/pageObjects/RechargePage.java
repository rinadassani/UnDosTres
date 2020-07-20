package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class RechargePage {
	
	public WebDriver driver;
	By operator = By.xpath("//*[@id=\"col-sm-12\"]/form/div/div[1]/div[1]/div[2]/ul/li[1]/div/div/input");
    By telcel = By.xpath("//*[@id=\"col-sm-12\"]/form/div/div[1]/div[1]/div[2]/ul/li[1]/div/div/div/ul/li[1]");
    By cell = By.xpath("//*[@id=\"col-sm-12\"]/form/div/div[1]/div[1]/div[2]/ul/li[2]/div/div/input");
	By  plan = By.xpath("//*[@id=\"col-sm-12\"]/form/div/div[1]/div[1]/div[2]/ul/li[3]/div/div/input");
	By planselect = By.xpath("//*[@id=\"col-sm-12\"]/form/div/div[1]/div[1]/div[2]/ul/li[3]/div/div/div/ul[1]/li[1]");
    By button = By.xpath("//*[@id=\"col-sm-12\"]/form/div/div[1]/div[1]/div[3]/div/button");
	public RechargePage(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getOperator()
	{
		
		
	//Select s = new Select(driver.findElement(By.xpath("//*[@id=\"col-sm-12\"]/form/div/div[1]/div[1]/div[2]/ul/li[1]/div/div/input")));
	//s.selectByVisibleText("Telcel");
	//Thread.sleep(2000);
	return driver.findElement(operator);
	 
			 
	}
	public WebElement selectOperator()
	{
		return driver.findElement(telcel);
	}
	
	public WebElement cellularNum()
	{
		return driver.findElement(cell);
	}
	
	public WebElement planSelect()
	{
		return driver.findElement(plan);
	}
	
	public WebElement rechargeSelect()
	{
		return driver.findElement(planselect);
	}
	
	
	public WebElement submitButton()
	{
		return driver.findElement(button);
	}
	
	
	

}
