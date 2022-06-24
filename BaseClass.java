package com.selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	public static WebDriver browser(String browsername) {
		try {
			if(browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", 
						System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if(browsername.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", 
						System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
				driver = new EdgeDriver();			
			}
			else {
				System.out.println("Invalid Condition");
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		driver.manage().window().maximize();
		return driver;		
	}
	public static void getUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	public static void signIn(WebElement signIn) {
		try {
			signIn.click();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	public static void createAcc(WebElement click1, String email,WebElement button) {
		try {
			click1.sendKeys(email);
			button.click();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}
	public static void selectGender(WebElement radioButton) {
		try {
			radioButton.click();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}
	public static void firstName(WebElement fName,String first_Name) {
		try {
			fName.sendKeys(first_Name);
		} catch (Exception e) {

			e.printStackTrace();
		}	

	}
	public static void lasttName(WebElement lName,String last_Name) {
		try {
			lName.sendKeys(last_Name);
		} catch (Exception e) {

			e.printStackTrace();
		}	

	}
	public static void email(WebElement email1, String e_mail) {
		try {
			email1.clear();
			email1.sendKeys(e_mail);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static void password(WebElement pwd,String pass) {
		try {
			pwd.sendKeys(pass);
		} catch (Exception e) {

			e.printStackTrace();
		}	

	}
	public static void dob(WebElement date, WebElement month, WebElement year,
			String d, String m, String y) {
		try {
			Select s = new Select(date);
			s.selectByValue(d);
			Select s1 = new Select(month);
			s1.selectByValue(m);
			Select s2 = new Select(year);
			s2.selectByValue(y);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	public static void company(WebElement companyName, String cmpName) {
		try {
			companyName.sendKeys(cmpName);
		} catch (Exception e) {

			e.printStackTrace();
		}		
	}
	public static void addressDetails(WebElement address, String addrs) {
		try {
			address.sendKeys(addrs);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public static void cityDetails(WebElement city, String citi) {
		try {
			city.sendKeys(citi);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	public static void stateDetails(WebElement sd, String state) {
		try {
			Select s = new Select(sd);
			s.selectByVisibleText(state);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void postalCode(WebElement pc, String pinCode) {
		try {
			pc.sendKeys(pinCode);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	public static void countryDetails(WebElement cd, String country) {
		try {
			Select s = new Select(cd);
			s.selectByValue(country);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void additonalInformation(WebElement details, String text) {
		try {
			details.sendKeys(text);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public static void homePhone(WebElement ph, String phoneNumber) {
		try {
			ph.sendKeys(phoneNumber);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	public static void phone(WebElement phone, String number) {
		try {
			phone.sendKeys(number);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	public static void aliasAddress(WebElement addres, String ad) {
		try {
			addres.sendKeys(ad);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void register(WebElement submit) {
		try {
			submit.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void homeButton(WebElement home) {
		home.click();		
	}
	public static void logIn(WebElement username, WebElement pwd, String name, String pass, WebElement login) {
		try {
			username.sendKeys(name);
			pwd.sendKeys(pass);
			login.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void women(WebElement mainMenu, WebElement subMenu, WebElement tops) {
		try {
			Actions ac = new Actions(driver);
			ac.moveToElement(mainMenu);
			ac.moveToElement(subMenu);
			ac.moveToElement(tops);
			ac.click().build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void selectTshirt(WebElement select,WebElement more) {
		try {
			Actions ac = new Actions(driver);
			ac.moveToElement(select);
			ac.moveToElement(more);
			ac.click().build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	public static void size(WebElement sizes, String s1) {
		try {
			Select s = new Select(sizes);
			s.selectByValue(s1);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	public static void selectDetailsOfOrder(WebElement color, WebElement addCart) {

		try {
			Actions ac = new Actions(driver);
			ac.moveToElement(color).click().build().perform();
			addCart.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void proceedToPay(WebElement proceed) {
		try {
			proceed.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void proceedTo(WebElement proceedTO) {
		try {
			proceedTO.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void addressToEdit(WebElement ok) {
		try {
			ok.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void checkBox(WebElement clickBox) {
		try {
			clickBox.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void repeat(WebElement confim) {
		try {
			confim.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void payment(WebElement paymentBank) {
		try {
			paymentBank.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void confirmOrder(WebElement confirm) {

		try {
			confirm.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
