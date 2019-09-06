package com.exito.myvtex.pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;


public class ShippingPage extends PageObject{

	@FindBy(id = "scheduled-delivery-choose-Domicilio_Programado")
	private WebElement btnFechaEntrega;
	
	@FindBy(className  = "react-datepicker__day--today")
	private WebElement datePickerFechaActual;
	
	@FindBy(className  = "react-datepicker__day--keyboard-selected")	
	private WebElement datePickerFechaSeleccionada;
	
	@FindBy(id = "scheduled-delivery-Domicilio_Programado")
	private WebElement dropDownRangoHoras;
	
	@FindBy(id = "scheduled-delivery-Domicilio_Programado")
	private WebElement btnIr_A_MetodoDePago;
	
	@FindBy(className  = "payment-group-item-text")	
	private List<WebElement> lstMetodosDePago;
	
	// Metodos publicos que retornan los WebElements capturados


	
	public WebElement getDatePickerFechaActual() {
		return datePickerFechaActual;
	}

	public WebElement getDatePickerFechaSeleccionada() {
		return datePickerFechaSeleccionada;
	}

	public WebElement getDropDownRangoHoras() {
		return dropDownRangoHoras;
	}

	public WebElement getBtnIr_A_MetodoDePago() {
		return btnIr_A_MetodoDePago;
	}

	public WebElement getBtnFechaEntrega() {
		return btnFechaEntrega;
	}
	
	public List<WebElement>getLstMetodosDePago(){
	return 	lstMetodosDePago;
	}
	
	
	
}
