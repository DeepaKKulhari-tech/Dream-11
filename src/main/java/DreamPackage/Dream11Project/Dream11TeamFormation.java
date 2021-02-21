package DreamPackage.Dream11Project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Dream11TeamFormation {

	public Dream11TeamFormation(AppiumDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//*[@text='VIEW UPCOMING MATCHES']")
	WebElement viewMatches;
	@AndroidFindBy(xpath = "//*[@text='Upcoming']")
	WebElement Upcoming;
	@AndroidFindBy(xpath = "//*[@text='Live']")
	WebElement Live;

	@AndroidFindBy(xpath = "//*[@text='My Teams']")
	WebElement MyTeams;

	@AndroidFindBy(className = "android.widget.Button")
	WebElement createTeam;
}
