package com.choucair.formacion.steps;

/*import java.util.List;*/
import com.choucair.formacion.pageobjects.ColorlibFormValidationPage;
import net.thucydides.core.annotations.Step;

public class ColorlibFormValidationSteps  {

	ColorlibFormValidationPage ColorlibFormValidationPage;
	
	@Step
	public void diligencio_el_Formulario_Popup_Validation_e_ingreso_la_palabra(String txtObligatorio) {
		ColorlibFormValidationPage.Required(txtObligatorio);			
	}
	
	public void selecciono_el_Deporte_cmbSeleccion(String cmbDeporte) {
		ColorlibFormValidationPage.Select_Sport(cmbDeporte);		
	}

	public void hago_una_seleccion_multiple_de_los_deportes_cmbMultipleS1_y_cmbMultipleS2(String cmbMultipleS1,String cmbMultipleS2) {
		ColorlibFormValidationPage.MultipleSelect(cmbMultipleS1);	
		ColorlibFormValidationPage.MultipleSelect(cmbMultipleS2);	
	}

	public void ingreso_la_url_txtUrl(String txtUrl) {
		ColorlibFormValidationPage.url(txtUrl);		
	}

	public void ingreso_la_url_txtEmail(String txtEmail) {
		ColorlibFormValidationPage.email(txtEmail);		
	}
		
	public void ingreso_el_Password_txtPassword(String txtPassword) {
		ColorlibFormValidationPage.password(txtPassword);			
	}

	public void ingreso_el_Password_de_Confirmacion_txtPassword2(String txtPassword) {
		ColorlibFormValidationPage.confirm_password(txtPassword);	
	}

	public void ingreso_el_Tamanio_Minimo_de_txtMinSize(String txtMinSize) {
		ColorlibFormValidationPage.minimun_fiel_size(txtMinSize);		
	}

	public void ingreso_el_Tamanio_Maximo_de_txtMaxSize(String txtMaxSize) {
		ColorlibFormValidationPage.maximun_fiel_size(txtMaxSize);		
	}

	public void ingreso_el_Numero_txtNumero(String txtNumero) {
		ColorlibFormValidationPage.number(txtNumero);		
	}

	public void ingreso_la_IP(String txtIP) {
		ColorlibFormValidationPage.ip(txtIP);			
	}

	public void ingreso_la_fecha_txtFecha_en_formato_YYYY_mm_dd(String txtFecha) {
		ColorlibFormValidationPage.date(txtFecha);		
	}

	public void ingreso_la_fecha_txtFechaMenor_en_formato_YYYY_mm_dd_y_que_sea_menor_a_la_fecha(String txtFecha) {
		ColorlibFormValidationPage.DateEarlier(txtFecha);		
	}

	public void verifico_que_los_valores_hayan_sido_ingresados_correctamnte() {
		ColorlibFormValidationPage.Validate();
		ColorlibFormValidationPage.form_sin_errores();		
	}



}
