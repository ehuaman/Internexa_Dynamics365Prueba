package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class ColorlibMenuPage extends PageObject {

	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/a")
	public WebElementFacade menuForms;
	
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/ul/li[1]/a")
	public WebElementFacade menuFormGeneral;
	
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/ul/li[2]/a")
	public WebElementFacade menuFormValidation;
	
	@FindBy(xpath="//*[@id='content']/div/div/div[1]/div/div/header/h5")
	public WebElementFacade lblFormValidation;
	
	public void menuFormValidation() {
		menuForms.click();
		menuFormValidation.click();
		Serenity.takeScreenshot();
		String StrMensaje= lblFormValidation.getText();
		assertThat(StrMensaje, containsString("Popup Validation"));
	}

}
