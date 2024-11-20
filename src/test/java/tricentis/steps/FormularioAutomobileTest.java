package tricentis.steps;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tricentis.pages.FormularioAutomobilePage;
import tricentis.runner.Executa;

public class FormularioAutomobileTest {

	FormularioAutomobilePage page = new FormularioAutomobilePage();
	
	@After
	public void depoisDoTest() {
		Executa.encerrarTest();
	}
	
	@Given("que esteja na tela principal do site {string}")
	public void queEstejaNaTelaPrincipalDoSite(String url) {
		Executa.iniciarTest(url, "Edge");

	}

	@When("clicar no menu Automobile")
	public void clicarNoMenuAutomobile() {
		page.validacaoTexto("Welcome Aboard!");
		page.menuAutomobile();
		page.validacaoTexto("Make");

	}

	@When("preenche todos os campos obrigatorios do formulario Vehicle Data e clicar em Next para avancar")
	public void preencheTodosOsCamposObrigatoriosDoFormularioVehicleDataEClicarEmNextParaAvancar() {		
		page.preencherDadosFomularioParte01(
				"BMW",
				"1000", 
				"07/19/1986",
				"7",
				"Gas",
				"100000", 
				"1000",
				"100",
				"Positivo/FormularioParte01", "Enter Vehicle Data"
				);    
		page.validacaoTexto("First Name");
		
	}
	
	@When("preencher todos os campos obrigatorios do formulario Insurance Data e clicar em Next para avancar")
	public void preencherTodosOsCamposObrigatoriosDoFormularioInsuranceDataEClicarEmNextParaAvancar() {		
		page.preencherDadosFomularioParte02(
				"Eduardo",
				"Maia", 
				"07/19/1986",
				"Male",
				"Rua Teste", 
				"Brazil",
				"04333001", 
				"São Paulo",
				"Employee",
				"Speeding",
				"www.tricentis.com",
				"Positivo/FormularioParte02", "Enter Insurant Data" 
				);
		page.validacaoTexto("Start Date");
	}
	

	@When("preencher todos os campos obrigatorios na tela Product Data e clicar em Next para avancar")
	public void preencherTodosOsCamposObrigatoriosNaTelaProductDataEClicarEmNextParaAvancar() {
		page.preencherDadosFormularioParte03(
				"01/03/2025",
				"3.000.000,00",
				"Super Bonus",
				"Full Coverage",
				"Euro Protection",
				"yes",				
				"Positivo/FormularioParte03", "Enter Product Data"
				);
		page.validacaoTexto("Price per Year ($)");
	}
	
	@When("preencher todos os campos obrigatorios na tela Price Option e clicar em Next para avancar")
	public void preencherTodosOsCamposObrigatoriosNaTelaPriceOptionEClicarEmNextParaAvancar() {		
		page.preencherDadosFormularioParte04(
				"Silver",
				"Positivo/FormularioParte04", "Select Price Option"
				);
		page.validacaoTexto("E-Mail");

	}
	@When("preencher os campos obrigatorios na tela Send Quote e clicar em Send para enviar a cotacao")
	public void preencherOsCamposObrigatoriosNaTelaSendQuoteEClicarEmSendParaEnviarACotacao() {		
		 page.preencherDadosFormularioParte05(
		    		"eduardoTeste@gmail.com", 
		    		"11945692728", 
		    		"eduardo", 
		    		"Teste@10", 
		    		"Teste@10", 
		    		"Teste",
		    		"Positivo/FormularioParte05", "Send Quote"
		    		);
	}
	@Then("deve aparecer uma mensagem de confirmacao dizendo que o email foi enviado com sucesso")
	public void deveAparecerUmaMensagemDeConfirmacaoDizendoQueOEmailFoiEnviadoComSucesso() {		
		page.confirmacaoEnvioDoCadastro(
			    	"Sending e-mail success!",
				   "Positivo/FormularioParteFinal", "FormularioEnviado"
				  );
	    
	}
  


}
