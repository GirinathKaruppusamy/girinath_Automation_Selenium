package com.selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Demos extends BaseClass{
	public static void main(String[] args) throws Throwable {
		browser("Chrome");
		getUrl("http://automationpractice.com/index.php");
														/*============== Account Create ==============*/
		signIn(driver.findElement(By.className("login")));
		/*createAcc(driver.findElement(By.id("email_create")),"giriajuu@gmail.com",driver.findElement(By.id("SubmitCreate")));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		selectGender(driver.findElement(By.id("id_gender1")));
		firstName(driver.findElement(By.id("customer_firstname")), "Girinath");
		lasttName(driver.findElement(By.id("customer_lastname")), "K");
		email(driver.findElement(By.id("email")), "giriajuu@gmail.com");
		password(driver.findElement(By.id("passwd")), "20112011");
		dob(driver.findElement(By.id("days")), driver.findElement(By.id("months")), driver.findElement(By.id("years"))
				, "20", "4", "1998");
		company(driver.findElement(By.id("company")), "kpg");
		addressDetails(driver.findElement(By.id("address1")), "48/a, 2nd Cross K.A Nagar, Kothur road, Velusamypuram, Karur");
		cityDetails(driver.findElement(By.id("city")), "Karur");
		stateDetails(driver.findElement(By.id("id_state")), "Indiana");
		postalCode(driver.findElement(By.id("postcode")), "63902");
		countryDetails(driver.findElement(By.id("id_country")), "21");
		additonalInformation(driver.findElement(By.id("other")), "happy to say");	
		homePhone(driver.findElement(By.id("phone")), "8072997806");
		phone(driver.findElement(By.id("phone_mobile")), "7094172348");
		aliasAddress(driver.findElement(By.id("alias")), "velusamypuram");
		register(driver.findElement(By.id("submitAccount")));*/
														/*============== Login and Order ==============*/
		logIn(driver.findElement(By.id("email")), driver.findElement(By.id("passwd")), "giriajuu@gmail.com", "20112011",
				driver.findElement(By.id("SubmitLogin")));
		homeButton(driver.findElement(By.xpath("(//a[@class='btn btn-default button button-small'])[2]")));
		women(driver.findElement(By.xpath("//a[text()='Women']")), driver.findElement(By.xpath("(//ul[@class='submenu-container clearfix first-in-line-xs'])[1]")),
				driver.findElement(By.xpath("//a[text()='T-shirts']")));
		selectTshirt(driver.findElement(By.className("product-container")), driver.findElement(By.xpath("(//a[@itemprop='url'])[3]")));
		size(driver.findElement(By.xpath("//select[@name='group_1']")), "2");
		selectDetailsOfOrder(driver.findElement(By.id("color_14")), driver.findElement(By.name("Submit")));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		proceedToPay(driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[1]")));
		proceedTo(driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")));
		addressToEdit(driver.findElement(By.name("processAddress"))); 
		checkBox(driver.findElement(By.id("cgv")));
		repeat(driver.findElement(By.name("processCarrier")));
		payment(driver.findElement(By.xpath("//a[@title='Pay by bank wire']")));
		confirmOrder(driver.findElement(By.xpath("(//button[@type='submit'])[2]")));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\GIRINATH\\eclipse-workspace\\Selenium\\ScreenShot\\orderconfirm.png");
		FileUtils.copyFile(source, des);


	}
}
