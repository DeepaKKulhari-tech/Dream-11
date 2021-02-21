package DreamPackage.Dream11Project;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.stream.FileImageInputStream;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Dream11Base {

	static AndroidDriver<AndroidElement> driver;
	
public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException
{
	File f=new File("src");
	File app=new File(f, "Dream11.apk");
	
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"DKPixel");
	capabilities.setCapability(MobileCapabilityType.APP,app.getAbsolutePath());
	capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10");
	
	 driver =new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
	return driver;
}
}
