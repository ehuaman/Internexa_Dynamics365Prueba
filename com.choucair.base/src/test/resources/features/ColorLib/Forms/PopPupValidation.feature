#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Regresión
Feature: Formulario Popup Validation
	El usuario debe poder ingresar al formulario los datos requeridos.
	Cada campo del formulario realiza validaciones de obligatoriedad,
	longitud y formato, el sistema debe presentar las validaciones respectivas
	para cada campo a travéz de un globo informático

    
  @CasoExitoso
  Scenario Outline: Diligenciamiento exitoso del formulario Popup Validation,
  					no se presenta ningún mensaje de validación
    Given Autentico en Colorlib con usuario <txtUsuario> y clave <txtClave> 
    And Ingreso a la funcionalidad Forms Validation
    When Diligencio el Formulario Popup Validation e ingreso la palabra <txtOligatorio>
    And Selecciono el Deporte <cmbSeleccion>
    And Hago una selección multiple de los deportes <cmbMultipleS1> y <cmbMultipleS2>
    And Ingreso la url <txtUrl>
    And Ingreso el email <txtEmail>
    And Ingreso el Password <txtPassword1>
    And Ingreso nuevamente el Password <txtPassword2>
    And Ingreso el Tamaño Mínimo de <txtMinSize>
    And Ingreso el Tamaño Máximo de <txtMaxSize>
    And Ingreso el Número <txtNumero>
    And Ingreso la IP <txtIP> 
    And Ingreso la fecha <txtFecha> en formato YYYY-mm-dd
    And Ingreso la fecha <txtFechaMenor> en formato YYYY/mm/dd y que sea menor a la fecha    
    Then Verifico que los valores hayan sido ingresados correctamente
Examples:
|txtUsuario|txtClave|txtOligatorio|cmbSeleccion|cmbMultipleS1|cmbMultipleS2|txtUrl|txtEmail|txtPassword1|txtPassword2|txtMinSize|txtMaxSize|txtNumero|txtIP|txtFecha|txtFechaMenor|
##@externaldata@./src/test/resources/DataDriven/datLoginTest.xlsx@Login
|demo|demo|Deportes|Golf|Golf|Tennis|https://www.google.com|prueba@choucair.com|12346|12346|895623|7845|-38.95|192.168.152.174|2018-05-16|2012/06/01|
|demo|demo|Deportes|Golf|Golf|Tennis|https://www.google.com|prueba02@choucair.com|12346|12346|895623|7845|-38.95|192.168.152.174|2018-05-16|2012/06/01|
