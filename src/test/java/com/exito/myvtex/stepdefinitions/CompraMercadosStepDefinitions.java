package com.exito.myvtex.stepdefinitions;

import com.exito.myvtex.steps.CompraMercadoSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class CompraMercadosStepDefinitions {

	@Steps
	CompraMercadoSteps compraMercadoSteps;
	
@Given ("^ingresar al ambiente de pruebas del exito \"(.*)\" \"(.*)\"$")
public void ingresaralambientedepruebasdelexito (String usuario, String password) {
	compraMercadoSteps.AbrirNavegador();
	compraMercadoSteps.loguearAmbiente(usuario, password);
}

@Given("^seleccionamos categoria (.+) y subcategoria (.+)$")
public void seleccionamos_categoria_y_subcategoria(String categoria, String subcategoria) throws Throwable {
compraMercadoSteps.seleccionarCategoriaySubcategoriaMercado(categoria, subcategoria);
}


@And("^seleccionamos y agregamos producto (.+)$")
public void seleccionamos_y_agregamos_producto(String producto) throws Throwable {
compraMercadoSteps.seleccionarProducto(producto);
}

@And("^clic sobre envio a domicio en la modal, ingresar email (.+) y finalizar modal$")
public void clic_sobre_envio_a_domicio_en_la_modal_ingresar_email_y_finalizar_modal(String emailModal) throws Throwable {
compraMercadoSteps.confirmarModalEnvio_A_Domicilio(emailModal);
}

@And("^clic sobre boton checkout$")
public void clic_sobre_boton_checkout() throws Throwable {
compraMercadoSteps.ir_a_checkout();
}

@And("^clic sobre boton finalizar compra$")
public void clic_sobre_boton_finalizar_compra() throws Throwable {
compraMercadoSteps.ir_a_shipping();
}

@And("^elegir fecha de entrega$")
public void elegir_fecha_de_entrega() throws Throwable {
compraMercadoSteps.seleccionarFechaEntrega();
}

@And("^dar clic en ir a metodo de pago$")
public void dar_clic_en_ir_a_metodo_de_pago() throws Throwable {
compraMercadoSteps.ir_A_MetodoDePago();
}

@And("^Seleccionar metodo pago$")
public void seleccionar_metodo_pago() throws Throwable {

}

@And("^clic sobre boton pagar$")
public void clic_sobre_boton_pagar() throws Throwable {
 
}

@Then("^se finaliza la compra correctamente y se visualiza el numero de pedido$")
public void se_finaliza_la_compra_correctamente_y_se_visualiza_el_numero_de_pedido() throws Throwable {

}





}
