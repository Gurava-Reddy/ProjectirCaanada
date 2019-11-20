package com.pojoclass;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lib.LibGlobal;

public class LoginPage extends LibGlobal {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	/*@FindBy(id = "email")
	private List<WebElement> lstTxtUserName;

	@FindBy(id = "pass")
	private List<WebElement> lstTxtPassword;

	@FindBy(id = "u_0_b")
	private WebElement lstBtnLogin;

	public WebElement getLstBtnLogin() {
		return lstBtnLogin;
	}

	public List<WebElement> getLstTxtUserName() {
		return lstTxtUserName;
	}

	public List<WebElement> getLstTxtPassword() {
		return lstTxtPassword;
	}*/
	
	@FindBy(id="u_0_m")
	private List<WebElement> lstTxtFirstName;
	
	@FindBy(id="u_0_o")
	private List<WebElement> lstTxtSurname;
	
	
	@FindBy(id="u_0_r")
	private List<WebElement> lstTxtMobile;
	
	@FindBy(id="u_0_w")
	private List<WebElement> lstTxtNewPassword;
	
	
	@FindBy(id="day")	
	private List<WebElement> lstDDdate;
	
	@FindBy(id="month")
	private List<WebElement> lstDDMonth;
	
	@FindBy(id="year")
	private List<WebElement> lstDDYear;
	@FindBy(id="u_0_7")
	
	private WebElement lstRBGender;
	
	@FindBy(id="u_0_13")
	private WebElement btnSignUP;


	public List<WebElement> getLstTxtFirstName() {
		return lstTxtFirstName;
	}


	public List<WebElement> getLstTxtSurname() {
		return lstTxtSurname;
	}


	public List<WebElement> getLstTxtMobile() {
		return lstTxtMobile;
	}


	public List<WebElement> getLstTxtNewPassword() {
		return lstTxtNewPassword;
	}


	public List<WebElement> getLstDDdate() {
		return lstDDdate;
	}


	public List<WebElement> getLstDDMonth() {
		return lstDDMonth;
	}


	public List<WebElement> getLstDDYear() {
		return lstDDYear;
	}


	public WebElement getLstRBGender() {
		return lstRBGender;
	}


	public WebElement getBtnSignUP() {
		return btnSignUP;
	}
	
	
	
	
	
	
	

}
