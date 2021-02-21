package DreamPackage.Dream11Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Dream11LoginPage {

	Dream11LoginPage(AppiumDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//*[@text='Google']")
	WebElement ClickGoogle;

	@AndroidFindBy(id = "com.google.android.gms:id/main_title")
	WebElement ChooseAccount;

	@AndroidFindBy(id = "com.google.android.gms:id/account_display_name")
	WebElement ClickAccount;
}
