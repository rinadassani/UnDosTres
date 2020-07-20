package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentPage {
	
	public WebDriver driver;
	public PaymentPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By title = By.xpath("/html/body/header/div/nav/div/div/div[2]/center/table/tbody/tr/td[2]/h2");
	By Cardname = By.xpath("//*[@id=\"payment-form\"]/div[1]/div[1]/div/div/input");
	By Cardno = By.xpath("//*[@id=\"cardnumberunique\"]");
	By month = By.xpath("//*[@id=\"payment-form\"]/div[1]/div[3]/div[1]/div/div[1]/input");
	By year = By.xpath("//*[@id=\"payment-form\"]/div[1]/div[3]/div[1]/div/div[2]/input");
	By CVV = By.xpath("//*[@id=\"payment-form\"]/div[1]/div[3]/div[2]/div/input");
	By email=By.xpath("//*[@id=\"email_block\"]/div/div/input");
	By rechargeButton = By.xpath("//*[@id=\"paylimit\"]");
	By loginid = By.xpath("//*[@id=\"usrname\"]");
	By password = By.xpath("//*[@id=\"psw\"]");
	By payment = By.xpath("//*[@id=\"loginBtn\"]");
	public WebElement VerifyTitle()
	{
		return driver.findElement(title);
	}
	
	public WebElement CardName()
	{
		return driver.findElement(Cardname);
	}
	
	public WebElement CardNumber()
	{
		return driver.findElement(Cardno);
	}
	
	public WebElement Month()
	{
		return driver.findElement(month);
	}
	
	public WebElement Year()
	{
		return driver.findElement(year);
	}
	public WebElement CVV()
	{
		return driver.findElement(CVV);
	}
	public WebElement Email()
	{
		return driver.findElement(email);
	}
	
	public WebElement Recharge()
	{
		return driver.findElement(rechargeButton);
	}
	
	public WebElement Login()
	{
		return driver.findElement(loginid);
	}
	
	public WebElement Password()
	{
		return driver.findElement(password);
	}
	
	public WebElement Payment()
	{
		return driver.findElement(payment);
	}
	
	
	
	
	
	
	
}
