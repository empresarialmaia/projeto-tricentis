package tricentis.metodos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import tricentis.drivers.Drivers;

public class Metodos extends Drivers {

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}

	public void clicar(By elemento) {
		try {
	        driver.findElement(elemento).click(); // Tenta o clique convencional
	    } catch (ElementClickInterceptedException e) {
	        // Usa o JavascriptExecutor para forçar o clique se o elemento estiver oculto ou sobreposto
	        WebElement element = driver.findElement(elemento);
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
	    }
		
	    }

	public void scroll(int px) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0," + px + ")", "");
	}

	public void enviarFoto(String[] localFoto, By selecArquivo) {
		try {
			for (String caminho : localFoto) {
				WebElement inputElement = driver.findElement(selecArquivo);
				inputElement.sendKeys(caminho);
			}
		} catch (Exception e) {

			System.out.println("Causa do erro " + e.getCause());
			System.out.println("Mensagem de erro " + e.getMessage());
		}
	}

	public void validarTexto(By elemento, String textoEsperado) {
		String textoCapturado = driver.findElement(elemento).getText();
		assertEquals(textoEsperado, textoCapturado);
	}

	public void tirarPrint(String nomeDoTeste, String nomeDaEvidencia) {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

		try {
			FileUtils.copyFile(scrFile,
					new File("./evidencias/" + nomeDoTeste + "/" + nomeDaEvidencia + "_" + timestamp + ".png"));
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public void esperarElemento(By elemento) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));

	}

	public void validarTitle(By elemento, String titleEsperada) {
		String titleCapturada = driver.getTitle();
		assertEquals(titleEsperada, titleCapturada);
	}

	public void validarContainTexto(By elemento, String textoEsperado) {
		assertTrue(driver.findElement(elemento).getText().contains(textoEsperado));

	}
	
	
	
	
}