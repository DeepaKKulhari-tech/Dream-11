	package DreamPackage.Dream11Project;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class CreateTeamTest extends Dream11Base {

	@Test
	public static void createTeam() throws MalformedURLException, InterruptedException {

		HomePageTest.footerActivity();
		TeamCreater.selectWicket(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		TeamCreater.selectPlayer(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		TeamCreater.selectBatsman(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		TeamCreater.selectPlayer(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		TeamCreater.selectAllrounder(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		TeamCreater.selectPlayer(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		TeamCreater.selectBowler(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		TeamCreater.selectPlayer(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		//TeamCreater.selectWicketKeeper(driver);
		//TeamCreater TC=new TeamCreater(driver);
		//System.out.println(TC.Text.getText())	;
		System.out.println("Select type is noted");

		
	}
}
		