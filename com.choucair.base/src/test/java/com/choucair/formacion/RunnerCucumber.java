package com.choucair.formacion;

import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;
import com.choucair.formacion.toolbox.BeforeSuite;
import com.choucair.formacion.toolbox.DataToFeature;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;

/**
 * ejecución con un runner personalizado para lograr la ejecución de casos de prueba por medio de documentos de excel
 */

@CucumberOptions (features = "src/test/resources/features/ColorLib/Forms/PopPupValidation.feature", 
					  tags = {"@CasoExitoso"}, monochrome= true, snippets= SnippetType.CAMELCASE)

@RunWith(RunnerPersonalizado.class)
public class RunnerCucumber {
	@BeforeSuite
	public static void test() throws InvalidFormatException, IOException {
		DataToFeature.overrideFeatureFiles("./src/test/resources/features/ColorLib/Forms");
		System.out.println("Prueba individual sin datos");
	}

}
