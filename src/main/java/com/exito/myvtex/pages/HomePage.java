package com.exito.myvtex.pages;

import org.openqa.selenium.WebElement;
import java.util.List;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://exito.myvtex.com/")

public class HomePage extends PageObject {
	
	@FindBy(xpath = "(//a[contains(.,'Mercado')])[1]")
	private WebElement categoriaMercado;
	
	@FindBy(id = "vtexIdUI-google-plus")
	private WebElement btnIngresoGoogle;
	
    @FindBy(id = "identifierId")
    private WebElement inputEmail;

    @FindBy(id = "identifierNext")
    private WebElement btnNext;

    @FindBy(name = "password")
    private WebElement inputPassword;

    @FindBy(id = "passwordNext")
    private WebElement btnPasswordNext;
    
    @FindBy(className = "menu-categoria")
    public List <WebElement> lstCategoriasHome;
    
    @FindBy(className = "mercado-subcategoria")
    private List<WebElement> lstSubcategoriasMercado;
    
    @FindBy(className = "vtex-button")
    private List<WebElement> lstbotonesPlp;
    
    @FindBy(className = "exito-vtex-component-nombre-producto")
    private List<WebElement> lstProductosPlp;
    
    @FindBy(className = "orderoption-envio-domicilio")
    private WebElement btnModalEnvioDomicilio;
    
    @FindBy(xpath = "//input[contains(@id,'requestemail-input')]")
    private WebElement inputEmailModal;
    
    @FindBy(className = "requestemail-enviar")
    private WebElement btnEnviarCorreoModal;
    
    @FindBy(className = "addressbyuser-confirmar")
    private WebElement btnConfirmarCorreoModal;
    
    @FindBy(className = "exito-header-2-x-minicartInner")
    private WebElement IconoMiniCart;
    
    @FindBy(xpath = "(//div[contains(.,'Finalizar compra')])[18]")
    private WebElement btnFinalizarCompra;

    @FindBy(id = "acceptTerms")
    private WebElement checkAceptarTerminos;
    
    @FindBy(id = "cart-to-orderform")
    private WebElement btnFinalizarCompraCart;
    
    @FindBy(className = "items-center")
    private WebElement PantallaEsperaModal;
    

    //Metodos públicos que devuelven los WebElements



	public WebElement getInputEmail() {
		return inputEmail;
	}


	public WebElement getBtnNext() {
		return btnNext;
	}


	public WebElement getInputPassword() {
		return inputPassword;
	}


	public WebElement getBtnPasswordNext() {
		return btnPasswordNext;
	}


	public WebElement getBtnIngresoGoogle() {
		return btnIngresoGoogle;
	}


	public WebElement getCategoriaMercado() {
		return categoriaMercado;
	}
	
    public List<WebElement> getlstsubcategoriasMercado(){
    	return lstSubcategoriasMercado;
    }
	
    public List<WebElement> getBotonesPlp() {
    	return lstbotonesPlp ;
    }
    
    public List <WebElement> getLstProductosPlp(){
    	return lstProductosPlp;
    }
    
	public WebElement getbtnModalEnvioDomicilio() {
		return btnModalEnvioDomicilio;
	}
	
	public WebElement getinputEmailModal() {
		return inputEmailModal;
	}
	
	public WebElement getBtnEnviarCorreoModal() {
		return btnEnviarCorreoModal;
	}
	
	public WebElement getBtnConfirmarCorreoModal() {
		return btnConfirmarCorreoModal;
	}
	
	public WebElement getIconoMiniCart() {
		return IconoMiniCart;
	}
	
	public WebElement getBtnFinalizarCompra() {
		return btnFinalizarCompra;
	}
	
	public WebElement getCheckAceptarTerminos() {
		return checkAceptarTerminos;
	}

	public WebElement getBtnFinalizarCompraCart() {
		return btnFinalizarCompraCart;
	}

	public WebElement getPantallaEsperaModal() {
		return PantallaEsperaModal;
	}
	
	
	
}

