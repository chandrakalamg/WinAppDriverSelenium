package WinAppdriverSeleniumJava.WindowAppTesting;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;

public class WinappTest1 {
	
	private static WindowsDriver driverSession = null;
    private static WebElement driverResult = null;
    

    @BeforeClass
    public static void setup() {
        	
        	DesiredCapabilities cap = new DesiredCapabilities();
        	
        	cap.setCapability("app","C:\\Users\\ChandrakalaG\\AppData\\Local\\SourceTree\\SourceTree.exe");

        	try {
        		driverSession = new WindowsDriver(new URL("http://127.0.0.1:4723/"),cap);
        		driverSession.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
        		driverResult = driverSession.findElementByXPath("//*[@Name='Sourcetree']");
        		Assert.assertNotNull(driverResult);  
        		
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	 
    }
    @AfterClass
    public static void tearDown(){
        System.out.println("Teardown");
        driverSession.close();
    }
	
	@Test
	 	public void remote(){
	        System.out.println("click on remote1");
	        driverSession.findElementByName("Remote").click();
	    }
	@Test
	    public void EditAccounts(){
	        System.out.println("Click Edit accounts1");
	        System.out.println("Click Edit accounts");
    	     driverSession.findElementByName("Edit Accounts...").click();
 	        System.out.println(driverSession.findElementByName("Options").isDisplayed());
	        
	    }
	@Test
	    public void subtraction(){
	        System.out.println("test3");
	    }
	@Test
	    public void division(){
	        System.out.println("test4");
	    }
	
}
