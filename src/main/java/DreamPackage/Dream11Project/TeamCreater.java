package DreamPackage.Dream11Project;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TeamCreater {

	public TeamCreater(AppiumDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Select\")")
	public MobileElement Text;
	
	public static void selectPlayer(AndroidDriver<AndroidElement> driver)
	{
		WebElement SelectType = driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"Select\")");
		System.out.println(SelectType.getText());
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement ele;
		for (int i = 0; i < 1; i++) 
		{
			ele = driver.findElementsByXPath("//./androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup")
					.get(i);
			ele.click();
		}
		System.out.println("Player Selected");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	public static void selectWicket(AndroidDriver<AndroidElement> driver)
	{
		WebElement wicket=driver.findElementsByClassName("androidx.appcompat.app.ActionBar$Tab").get(0);
		wicket.click();
		System.out.println("wicketKeepr Selected");
	}
	
	public static void selectBatsman(AndroidDriver<AndroidElement> driver)
	{
		WebElement batsman=driver.findElementsByClassName("androidx.appcompat.app.ActionBar$Tab").get(1);
		batsman.click();
		System.out.println("Batsman Selected");
	}
	
	public static void selectAllrounder(AndroidDriver<AndroidElement> driver)
	{
		WebElement allrounder=driver.findElementsByClassName("androidx.appcompat.app.ActionBar$Tab").get(2);
		allrounder.click();
		System.out.println("Allrounder selected");
	}

	
	public static void selectBowler(AndroidDriver<AndroidElement> driver)
	{
		WebElement bowler=driver.findElementsByClassName("androidx.appcompat.app.ActionBar$Tab").get(3);
		bowler.click();
		
		System.out.println("Bowler Selected");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public static void selectWicketKeeper(AndroidDriver<AndroidElement> driver) throws InterruptedException {

		TouchAction t = new TouchAction(driver);

		int size = driver.findElementsByXPath("//./androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup")
				.size();
		WebElement ele;

		WebElement eleme, SelectType;
		int i=0,j=0;

		while(j<4) {
			eleme = driver.findElementsByClassName("androidx.appcompat.app.ActionBar$Tab").get(j);
			//t.tap(tapOptions().withElement(element(eleme))).perform();
			eleme.click();
			System.out.println(eleme);
		
			SelectType = driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"Select\")");
			System.out.println(SelectType.getText());
			
			for (i = 0; i < 2; i++) {
				ele = driver.findElementsByXPath("//./androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup")
						.get(i);
				//t.tap(tapOptions().withElement(element(ele))).perform();
				ele.click();
				System.out.println(ele);
				System.out.println("i="+i);
				Thread.sleep(1000);

			} i=0;System.out.println("j="+j);
			j++;

		}

	}

}
