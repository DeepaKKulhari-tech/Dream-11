package DreamPackage.Dream11Project;

import java.net.MalformedURLException;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.omg.CORBA.TIMEOUT;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.IReporter;
import org.testng.annotations.Test;

public class LoginPageTest extends Dream11Base {

	@Test
	public static void loginActivity() throws MalformedURLException {
		capabilities();
		Dream11BeforeLogin home = new Dream11BeforeLogin(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		home.Alreadylogin.click();

		Assert.assertEquals(home.login.getText(), "LOG IN");

	}

	@Test(dependsOnMethods = "loginActivity")
	public static void LoginViaGoogle() throws MalformedURLException {

		Dream11LoginPage log = new Dream11LoginPage(driver);
		log.ClickGoogle.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Assert.assertEquals(log.ChooseAccount.getText(), "Choose an account");
		
		log.ClickAccount.click();

	}
	
	
	

}
