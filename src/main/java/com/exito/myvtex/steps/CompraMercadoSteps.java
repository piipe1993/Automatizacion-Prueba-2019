package com.exito.myvtex.steps;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import com.exito.myvtex.pages.HomePage;
import com.exito.myvtex.pages.ShippingPage;
import com.exito.myvtex.utilities.FuncionesComunes;

public class CompraMercadoSteps {

	HomePage home;
	ShippingPage shipping;
	FuncionesComunes funcionesComunes;
	
	public void AbrirNavegador () {
		home.open();
		
	}
	
	public void loguearAmbiente(String usuario, String password) {
		home.getBtnIngresoGoogle().click();
        String parentWinHandle = home.getDriver().getWindowHandle();
        Set<String> winHandles = home.getDriver().getWindowHandles();
        for (String handle : winHandles) {
            if (!handle.equals(parentWinHandle)) {
                home.getDriver().switchTo().window(handle);
                home.getInputEmail().sendKeys(usuario);
                home.getBtnNext().click();
                home.getInputPassword().sendKeys(password);
                home.getBtnPasswordNext().click();
                break;
            }
        }
        home.getDriver().switchTo().window(parentWinHandle);
	}

	public void seleccionarCategoriaySubcategoriaMercado(String categoria, String subcategoria) {
		Actions action = new Actions(home.getDriver());
	//	funcionesComunes.waitLstElement(home.lstCategoriasHome);
		System.out.println("CATEGORIAS");
		System.out.println( home.lstCategoriasHome.size());
		for (WebElement elementCategories : home.lstCategoriasHome) {
			System.out.println(elementCategories.getText());
			
			if(elementCategories.getText().equals(categoria)) {
				action.moveToElement(elementCategories).build().perform();
				break;
			}
		}
		
		//funcionesComunes.waitLstElement(home.getlstsubcategoriasMercado());
		for(WebElement elementsSubcategoriasMercado : home.getlstsubcategoriasMercado()) {
			if (elementsSubcategoriasMercado.getText().equals(subcategoria)) {
				elementsSubcategoriasMercado.click();
				break;
			}
		}		
	}
	
	public void seleccionarProducto(String producto) {
		int size = home.getLstProductosPlp().size();
		for (int i=0 ; i < size ; i++) {
			String txtProducto = home.getLstProductosPlp().get(i).getText();
			if(txtProducto.equalsIgnoreCase(producto)) {
				funcionesComunes.scrollDown("250");			
				home.getBotonesPlp().get(i).click();
				break;
			}
		}
	}
	
	public void confirmarModalEnvio_A_Domicilio(String emailModal) throws InterruptedException {
		//funcionesComunes.waitElement(home.getbtnModalEnvioDomicilio());
		home.getbtnModalEnvioDomicilio().click();
		home.getinputEmailModal().click();
		home.getinputEmailModal().sendKeys(emailModal);
		home.getBtnEnviarCorreoModal().click();
		home.getBtnConfirmarCorreoModal().click();
		Thread.sleep(5000);

	}
	
	public void ir_a_checkout() {
		funcionesComunes.scrollUp();
		home.getIconoMiniCart().click();
		funcionesComunes.waitElementClicleable(home.getBtnFinalizarCompra());
		home.getBtnFinalizarCompra().click();
	}
	
	public void ir_a_shipping() {
		funcionesComunes.waitElementClicleable(home.getCheckAceptarTerminos());
		home.getCheckAceptarTerminos().click();
		home.getBtnFinalizarCompraCart().click();
	}
	
	public void seleccionarFechaEntrega() {
		funcionesComunes.ScrollToElement(shipping.getBtnFechaEntrega());
		shipping.getBtnFechaEntrega().click();
		shipping.getDatePickerFechaSeleccionada().click();
		Select rangoHoras = new Select (shipping.getDropDownRangoHoras());
		rangoHoras.selectByIndex(0);
		
	}
	
	public void ir_A_MetodoDePago() throws InterruptedException {
		shipping.getBtnIr_A_MetodoDePago().click();
		Thread.sleep(5000);
	}
	
}
