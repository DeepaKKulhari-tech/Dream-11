package DreamPackage.Dream11Project;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Dream11Home {

	public Dream11Home(AppiumDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//*[@text='Home']")
	WebElement home;
	@AndroidFindBy(xpath = "//*[@content-desc='My Matches']")
	WebElement MyMatches;
	@AndroidFindBy(xpath = "//*[@text='Winners']")
	WebElement Winners;
	@AndroidFindBy(xpath = "//*[@text='Groups']")
	WebElement Groups;
	@AndroidFindBy(xpath = "//*[@text='Feed']")
	WebElement Feed;
	@AndroidFindBy(xpath = "//*[@content-desc='NOTIFICATIONS']")
	WebElement NOTIFICATIONS;
	@AndroidFindBy(xpath = "//*[@text='VIEW UPCOMING MATCHES']")
	WebElement UpcomingMatches;

	public void selectMatch(AppiumDriver<AndroidElement> driver) {
		TouchAction t = new TouchAction(driver);

		WebElement expandList = driver.findElementsByXPath("//../android.widget.FrameLayout[1]/android.view.ViewGroup")
				.get(1);
		System.out.println(expandList);
		t.tap(tapOptions().withElement(element(expandList))).perform();

		System.out.println("clicked the game");
	
	}

	/*
	 * @AndroidFindBy(xpath =
	 * "//android.widget.TextView[@index='13'][@clickable='true']") WebElement
	 * getMatch;
	 * 
	 * @AndroidFindBy(xpath =
	 * "//*[contains(.,'LIVE')]/preceding-sibling::android.widget.ImageView[@index='10']")
	 * WebElement clickmatch;
	 */

}
