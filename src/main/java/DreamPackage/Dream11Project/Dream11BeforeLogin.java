package DreamPackage.Dream11Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Dream11BeforeLogin {
	
	Dream11BeforeLogin(AppiumDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath="//*[@text='Already a user?']")
	public WebElement Alreadylogin;
	
	@AndroidFindBy(xpath="//*[@text='LOG IN']")
	public WebElement login;
	
	
}
