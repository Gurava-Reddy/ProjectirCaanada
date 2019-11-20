package com.steps;

import com.lib.LibGlobal;
import com.pojoclass.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import org.junit.Assert;

public class StepDefination extends LibGlobal {

	LoginPage page;

	@Given("User is on FaceBook Page")
	public void user_is_on_FaceBook_Page() {

		driver = getDriver();

		loadUrl("https://www.facebook.com/");

	}

	/*
	 * @When("user enters {string} and {string}") public void user_enters_and(String
	 * u, String p) {
	 * 
	 * page = new LoginPage();
	 * 
	 * type(page.getLstTxtUserName().get(0), u);
	 * 
	 * type(page.getLstTxtPassword().get(0), p);
	 * 
	 * Assert.assertEquals("Verify the UserName", u,
	 * getAttributeValue(page.getLstTxtUserName().get(0)));
	 * 
	 * Assert.assertEquals("Verify the password", p,
	 * getAttributeValue(page.getLstTxtPassword().get(0)));
	 * 
	 * }
	 * 
	 * @When("User Clicks Login Validation") public void
	 * user_Clicks_Login_Validation() { btnClick(page.getLstBtnLogin());
	 * 
	 * }
	 * 
	 * @Then("User Verifies the Succces Message") public void
	 * user_Verifies_the_Succces_Message() {
	 * 
	 * // Assert.assertEquals("Verify invalid credentials", //
	 * getUrl().contains("login_attempt"));
	 * 
	 * Assert.assertNotEquals("Verify invalid credentials",
	 * getUrl().contains("login_attempt"));
	 * 
	 * }
	 */

	@When("User enters Registrtion Detais")
	public void user_enters_Registrtion_Detais(io.cucumber.datatable.DataTable data) {

		List<String> li = data.asList();

		page = new LoginPage();

		type(page.getLstTxtFirstName().get(0), li.get(0));

		type(page.getLstTxtSurname().get(0), li.get(1));

		type(page.getLstTxtMobile().get(0), li.get(2));

		type(page.getLstTxtNewPassword().get(0), li.get(3));

		selectDD(page.getLstDDdate().get(0), "1");

		selectDD(page.getLstDDMonth().get(0), "Jan");

		selectDD(page.getLstDDYear().get(0), "2000");

		selectRB(page.getLstRBGender());

	}

	@Then("User Verifies the Succces Message")
	public void user_Verifies_the_Succces_Message() {

		page = new LoginPage();

		btnClick(page.getBtnSignUP());

	}

	@Then("Quit the Browser")
	public void quit_the_Browser() throws InterruptedException {

		Thread.sleep(5000);
		
		Assert.assertTrue(false);

	}

}
