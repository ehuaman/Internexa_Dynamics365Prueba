package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.ColorlibLoginPage;
import com.choucair.formacion.pageobjects.ColorlibMenuPage;

import net.thucydides.core.annotations.Step;

public class PopupValidationSteps {

	ColorlibLoginPage ColorlibLoginPage;
	ColorlibMenuPage ColorlibMenuPage;
	
	@Step
	public void login_colorlib(String usuario, String clave) {
		// TODO Auto-generated method stub
		ColorlibLoginPage.open();
		ColorlibLoginPage.IngresarDatos(usuario, clave);
		ColorlibLoginPage.VerificaHome();
	}

	public void ingresar_form_validation() {
		// TODO Auto-generated method stub
		ColorlibMenuPage.menuFormValidation();
	}

	

}
