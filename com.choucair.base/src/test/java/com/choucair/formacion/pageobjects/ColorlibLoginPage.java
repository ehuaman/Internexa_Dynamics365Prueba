
package com.choucair.formacion.pageobjects;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://colorlib.com/polygon/metis/login.html")
public class ColorlibLoginPage extends PageObject {
	
	@FindBy(xpath="//*[@id=\"login\"]/form/input[1]")
	public WebElementFacade txtUsername;
	
	@FindBy(xpath="//*[@id=\"login\"]/form/input[2]")
	public WebElementFacade txtPassword;
	
	@FindBy(xpath="//*[@id=\"login\"]/form/button")
	public WebElementFacade btnSignIn;
	
	@FindBy(xpath="//*[@id=\"bootstrap-admin-template\"]")
	public WebElementFacade lblHomePpal;
	
	public void IngresarDatos(String usuario, String clave) {
		// TODO Auto-generated method stub
		txtUsername.sendKeys(usuario);
		txtPassword.sendKeys(clave);
		Serenity.takeScreenshot();
		btnSignIn.click();
	}
	
	public void VerificaHome() {
		// TODO Auto-generated method stub
		String Lavelv="";
		String StrMensaje= lblHomePpal.getText();
		assertThat(StrMensaje, containsString(Lavelv));
		Serenity.takeScreenshot();
		
	}


}
