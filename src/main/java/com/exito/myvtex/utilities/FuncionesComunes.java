package com.exito.myvtex.utilities;


import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.List;

public class FuncionesComunes extends PageObject{
	
	public void waitElement(WebElement element) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(getDriver()).withTimeout(Duration.ofSeconds(60))
				.pollingEvery(Duration.ofMillis(1000)).ignoring(NoSuchElementException.class)
				.ignoring(TimeoutException.class);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void waitElementIsPresent(WebElement element) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(getDriver()).withTimeout(Duration.ofSeconds(60))
				.pollingEvery(Duration.ofMillis(1000)).ignoring(NoSuchElementException.class)
				.ignoring(TimeoutException.class);
		wait.until(ExpectedConditions.elementSelectionStateToBe(element, element.isEnabled()));
	}
	
	
	public void waitElementTxt(WebElement element) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(getDriver()).withTimeout(Duration.ofSeconds(60))
				.pollingEvery(Duration.ofMillis(1000)).ignoring(NoSuchElementException.class)
				.ignoring(TimeoutException.class);
		wait.until(ExpectedConditions.textToBePresentInElement(element,"�En cuantas cuotas deseas pagar?"));

	}
	
	public void waitLstElement(List<WebElement> element) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(getDriver()).withTimeout(Duration.ofSeconds(60))
				.pollingEvery(Duration.ofMillis(1000)).ignoring(NoSuchElementException.class)
				.ignoring(TimeoutException.class);
		wait.until(ExpectedConditions.visibilityOfAllElements(element));
	}
	
	
	
	public void waitElementClicleable(WebElement element) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(getDriver()).withTimeout(Duration.ofSeconds(60))
		.pollingEvery(Duration.ofMillis(1000)).ignoring(NoSuchElementException.class)
		.ignoring(TimeoutException.class);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		}
	
	
	public void waitElementInvisibility(WebElement element) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(getDriver()).withTimeout(Duration.ofSeconds(60))
		.pollingEvery(Duration.ofMillis(1000)).ignoring(NoSuchElementException.class)
		.ignoring(TimeoutException.class);
		wait.until(ExpectedConditions.invisibilityOf((element)));
		}

	
	public void scrollUp() {
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		//jse.executeScript("arguments[0].scrollIntoView();", lstAddToCart.get(i)); 
		jse.executeScript("scroll(250, 0)");
	}
	
	public void scrollDown(String tam) {
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("scroll(0, "+ tam + ")");
	}
	
	public void ScrollToElement(WebElement element) {
		((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView();", element);
	}
	
	
	public String normalizeString(String str){
		str=str.replace("�", "a").replace("�", "e").replace("�", "i").replace("�", "o").replace("�", "u").
		replace("�", "A").replace("�", "E").replace("�", "I").replace("�", "O").replace("�", "U");
		return str;
	}
	
	public String createEmail() {

		String strCreateEmail = "";
		String strUnregisteredEmail = "";
		String[] abecedario = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q",
				"R", "S", "T", "U", "V", "W", "X", "Y", "Z" };

		for (int i = 0; i <= 10; i++) {

			int numRandon = (int) Math.round(Math.random() * 25);
			strCreateEmail = strCreateEmail + abecedario[numRandon];

		}

		strUnregisteredEmail = strCreateEmail + "@GMAIL.COM";
		return strUnregisteredEmail;

	}

}
