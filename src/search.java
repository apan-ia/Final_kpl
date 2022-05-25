import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class search extends base{
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		
		AndroidDriver<AndroidElement> driver =capabilities();
		
		/*
		 * 1. Xpath
		 * 
		 * syntax 
		 *   //tagname[@id='value']
		 *   
		 * 
		
		*driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		*driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		**/

		/*
		 * 2. id dan index
		 * 
		 * */
		
		driver.findElementById("com.application.app:id/btnReservasi").click();
		driver.findElementByXPath("//android.widget.Button[@text='Masuk']").click();
		driver.findElementById("com.application.app:id/etSearch").click();
		
	}
}
