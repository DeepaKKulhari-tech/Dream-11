package DreamPackage.Dream11Project;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TeamCreater2 {

	public TeamCreater2(AppiumDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Select\")")
	public MobileElement Text;

	public static void selectWicketKeeper(AndroidDriver<AndroidElement> driver) {

		TouchAction t = new TouchAction(driver);

		int size = driver.findElementsByXPath("//./androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup")
				.size();
		WebElement ele;
		for (int i = 0; i < 2; i++) {
			ele = driver.findElementsByXPath("//./androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup")
					.get(i);
			t.tap(tapOptions().withElement(element(ele))).perform();
			System.out.println(ele);

		}

		WebElement eleme, SelectType;
		for (int j = 0; j < 4; j++) {

			
			eleme = driver.findElementsByClassName("androidx.appcompat.app.ActionBar$Tab").get(j);
			t.tap(tapOptions().withElement(element(eleme))).perform();
			System.out.println(eleme);
			SelectType = driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"Select\")");
			System.out.println(SelectType.getText());

		}

	}

}
