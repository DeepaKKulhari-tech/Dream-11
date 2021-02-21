package DreamPackage.Dream11Project;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends Dream11Base {

	@Test
	public static void footerActivity() throws MalformedURLException, InterruptedException {
		capabilities();
		LoginPageTest.loginActivity();
		LoginPageTest.LoginViaGoogle();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Dream11Home hom = new Dream11Home(driver);
		Thread.sleep(10000);
		  Assert.assertEquals(hom.home.getText(), "Home");
		  //Assert.assertEquals(hom.MyMatches.getText(), "My Matches");
		  Assert.assertEquals(hom.Winners.getText(), "Winners");
		  Assert.assertEquals(hom.Groups.getText(), "Groups");
		  Assert.assertEquals(hom.Feed.getText(), "Feed");
		 
		// System.out.println(driver.getPageSource());
		hom.MyMatches.click();
		hom.UpcomingMatches.click();
		hom.selectMatch(driver);
		
		Dream11TeamFormation dtf=new Dream11TeamFormation(driver);
		
		dtf.MyTeams.click();
		dtf.createTeam.click();
		System.out.println("end of test");

	}
}
