package com.choucair.formacion.definition;
import java.util.List;
import com.choucair.formacion.steps.ColorlibFormValidationSteps;
import com.choucair.formacion.steps.PopupValidationSteps;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PopupValidationDefinition {

	@Steps
	PopupValidationSteps PopupValidationSteps;
	
	@Steps
	ColorlibFormValidationSteps ColorlibFormValidationSteps;
	
	@Given("^Autentico en Colorlib con usuario ([^\"]*) y clave ([^\"]*)$") 
	public void autentico_en_Colorlib_con_usuario_y_clave(String Usuario, String Clave) throws Throwable {
		PopupValidationSteps.login_colorlib(Usuario, Clave);
	}
	
	@And("^Ingreso a la funcionalidad Forms Validation$")
	public void ingreso_a_la_funcionalidad_Forms_Validation() throws Throwable {
		PopupValidationSteps.ingresar_form_validation();
	}

	/*
	@When("^Diligencio Formulario Popup Validation$")
	public void diligencio_Formulario_Popup_Validation(DataTable dDatosForm) {
		
		List<List<String>> data= dDatosForm.raw();
		for (int i=1; i<data.size(); i++) {
			ColorlibFormValidationSteps.diligenciar_popup_datos_tabla(data, i);
			
		}
	}
   */
	
	@When("^Diligencio el Formulario Popup Validation e ingreso la palabra ([^\"]*)$")
	public void diligencio_el_Formulario_Popup_Validation_e_ingreso_la_palabra(String txtObligatorio) throws Throwable {
		ColorlibFormValidationSteps.diligencio_el_Formulario_Popup_Validation_e_ingreso_la_palabra(txtObligatorio);
	}

	@And("^Selecciono el Deporte ([^\"]*)$")
	public void selecciono_el_Deporte_cmbSeleccion(String cmbSeleccion) throws Throwable {
		ColorlibFormValidationSteps.selecciono_el_Deporte_cmbSeleccion(cmbSeleccion);
	}

	@And("^Hago una selección multiple de los deportes ([^\"]*) y ([^\"]*)$")
	public void hago_una_seleccion_multiple_de_los_deportes_cmbMultipleS1_y_cmbMultipleS2(String cmbMultipleS1, String cmbMultipleS) throws Throwable {
		ColorlibFormValidationSteps.hago_una_seleccion_multiple_de_los_deportes_cmbMultipleS1_y_cmbMultipleS2(cmbMultipleS1,cmbMultipleS);
	}

	@And("^Ingreso la url ([^\"]*)$")
	public void ingreso_la_url_txtUrl(String txtUrl) throws Throwable {
		ColorlibFormValidationSteps.ingreso_la_url_txtUrl(txtUrl);
	}

	@And("^Ingreso el email ([^\"]*)$")
	public void ingreso_la_url_txtEmail(String txtEmail) throws Throwable {
		ColorlibFormValidationSteps.ingreso_la_url_txtEmail(txtEmail);
	}
    
	@And("^Ingreso el Password ([^\"]*)$")
	public void ingreso_el_Password_txtPassword(String txtPassword) throws Throwable {
		ColorlibFormValidationSteps.ingreso_el_Password_txtPassword(txtPassword);
	}

	@And("^Ingreso nuevamente el Password ([^\"]*)$")
	public void ingreso_nuevamente_el_Password_txtPassword2(String txtPassword) throws Throwable {
		ColorlibFormValidationSteps.ingreso_el_Password_de_Confirmacion_txtPassword2(txtPassword);
	}

	@And("^Ingreso el Tamaño Mínimo de ([^\"]*)$")
	public void ingreso_el_Tamanio_Minimo_de_txtMinSize(String txtMinSize) throws Throwable {
		ColorlibFormValidationSteps.ingreso_el_Tamanio_Minimo_de_txtMinSize(txtMinSize);
	}

	@And("^Ingreso el Tamaño Máximo de ([^\"]*)$")
	public void ingreso_el_Tamanio_Maximo_de_txtMaxSize(String txtMaxSize) throws Throwable {
		ColorlibFormValidationSteps.ingreso_el_Tamanio_Maximo_de_txtMaxSize(txtMaxSize);
	}

	@And("^Ingreso el Número ([^\"]*)$")
	public void ingreso_el_Numero_txtNumero(String txtNumero) throws Throwable {
		ColorlibFormValidationSteps.ingreso_el_Numero_txtNumero(txtNumero);
	}

	@And("^Ingreso la IP ([^\"]*)$")
	public void ingreso_la_IP(String txtIP) throws Throwable {
		ColorlibFormValidationSteps.ingreso_la_IP(txtIP);
	}

	@And("^Ingreso la fecha ([^\"]*) en formato YYYY-mm-dd$")
	public void ingreso_la_fecha_txtFecha_en_formato_YYYY_mm_dd(String txtFecha) throws Throwable {
		ColorlibFormValidationSteps.ingreso_la_fecha_txtFecha_en_formato_YYYY_mm_dd(txtFecha);
	}

	@And("^Ingreso la fecha ([^\"]*) en formato YYYY/mm/dd y que sea menor a la fecha$")
	public void ingreso_la_fecha_txtFechaMenor_en_formato_YYYY_mm_dd_y_que_sea_menor_a_la_fecha(String txtFecha) throws Throwable {
		ColorlibFormValidationSteps.ingreso_la_fecha_txtFechaMenor_en_formato_YYYY_mm_dd_y_que_sea_menor_a_la_fecha(txtFecha);
	}

	@Then("^Verifico que los valores hayan sido ingresados correctamente$")
	public void verifico_que_los_valores_hayan_sido_ingresados_correctamente() throws Throwable {
		ColorlibFormValidationSteps.verifico_que_los_valores_hayan_sido_ingresados_correctamnte();
	}
	
	
}
