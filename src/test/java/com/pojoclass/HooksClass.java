package com.pojoclass;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.lib.LibGlobal;

import io.cucumber.core.api.Scenario;

public class HooksClass extends LibGlobal {

	public void beforeScenario() {

		

	}

	public void afterScenario(Scenario sc) {

		if (sc.isFailed()) {

			TakesScreenshot tk = (TakesScreenshot) driver;

			byte[] b = tk.getScreenshotAs(OutputType.BYTES);

			sc.embed(b, "failed/png");

		}
		
		else {
			
			TakesScreenshot tk = (TakesScreenshot) driver;

			byte[] b = tk.getScreenshotAs(OutputType.BYTES);

			sc.embed(b, "passed/png");
			
			
			
		}
		

		try {
			Thread.sleep(4000);

			
			
			quitBrowser();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

}
