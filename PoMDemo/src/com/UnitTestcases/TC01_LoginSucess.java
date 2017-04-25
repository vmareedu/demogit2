package com.UnitTestcases;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import com.ResuableActions.TestBase;

public class TC01_LoginSucess extends TestBase {
	
	public void loginToApplication() throws Exception{
		getWebElement("Login.LoginButton.button").click();
		WebElement UserName = getWebElement("Login.Username.input");
		Reporter.log("entering userName to the userName textbox");
		UserName.sendKeys(Repository.getProperty("userName"));
		WebElement password = getWebElement("Login.Password.input");
		Reporter.log("entering password to the password textbox");
		password.sendKeys(Repository.getProperty("password"));
		Reporter.log("clicking on login button");
		getWebElement("Login.SubmitLoginButton.button").click();
	}

}
