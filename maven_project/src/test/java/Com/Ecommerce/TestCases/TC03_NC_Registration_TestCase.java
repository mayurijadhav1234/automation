package Com.Ecommerce.TestCases;

	import org.testng.annotations.Test;
	import org.testng.AssertJUnit;
	import java.io.IOException;

	import org.openqa.selenium.By;
	import org.testng.Assert;
	import org.testng.annotations.Test;

import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;
import Com.Ecommerce.PageClass.TC03_NC_Registration;

	public class TC03_NC_Registration_TestCase extends Ecommerce_BaseClass
	{

		@Test
		public void Registration() throws IOException {
			
			TC03_NC_Registration TER  = new TC03_NC_Registration();
			
			TER.RegistrationForm();
			TER.SetFirstName("a");
			TER.SetLastName("a");
			TER.SetEmail("ppp@gmail.com");
			TER.SetPassoword("aa@123");
			TER.SetConfirmedPassoword("aa@123");
			TER.Submit();
			
			boolean test=driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]")).isDisplayed();

			if(test==true) {
				logger.info("User created");
				AssertJUnit.assertTrue(true);
			}
			else {
				logger.info("User creation failed");
				getScreenshotAs("Registration");
				AssertJUnit.assertTrue(false);


			

}
}
}