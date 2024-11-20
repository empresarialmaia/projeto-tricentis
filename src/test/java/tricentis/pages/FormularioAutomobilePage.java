package tricentis.pages;

import tricentis.elementos.Elementos;
import tricentis.metodos.Metodos;

public class FormularioAutomobilePage {

	Metodos metodo = new Metodos();
	Elementos elemento = new Elementos();
	

	public void menuAutomobile() {
		metodo.clicar(elemento.automobile);

	}

	public void preencherDadosFomularioParte01(String carType, String enginePerformance, String dateOfManufacture, String numberOfSeat, 
			String fulType, String listPrice, String licensePlateNumber, String annualMileage, String nomeDoTeste, String nomeDaEvidencia) {

			
		metodo.escrever(elemento.makeSelectCar, carType);
		metodo.escrever(elemento.enginePerformance, enginePerformance);
		metodo.escrever(elemento.dateOfManufacture, dateOfManufacture);	
		metodo.escrever(elemento.numberOfSeat,numberOfSeat);		
		metodo.escrever(elemento.fulType, fulType);		
		metodo.escrever(elemento.listPrice, listPrice);
		metodo.escrever(elemento.licensePalteNumber, licensePlateNumber);
		metodo.escrever(elemento.annualMileage, annualMileage);
		metodo.tirarPrint(nomeDoTeste, nomeDaEvidencia);		
		metodo.clicar(elemento.btnNext01);
		
		
	}

	public void preencherDadosFomularioParte02(String firstName, String lastName, String dataOfBirth, String gender,
			String streetAddress,String country, String zipCode, String city, String occupation, String hobbies, String website, 
			String nomeDoTeste, String nomeDaEvidencia ) {
        
		metodo.escrever(elemento.firstName, firstName);
		metodo.escrever(elemento.lastName, lastName);
		metodo.escrever(elemento.dataOfBirth, dataOfBirth);
		if(gender.equalsIgnoreCase("Male")) {
			metodo.clicar(elemento.genderMale);	
		}else {
			metodo.clicar(elemento.genderFemale);
		}		
		metodo.escrever(elemento.streetAddress, streetAddress);
		metodo.escrever(elemento.country, country);
		metodo.escrever(elemento.zipCode, zipCode);
		metodo.escrever(elemento.city, city);
		metodo.escrever(elemento.occupation, occupation);
		metodo.scroll(300);
		if(hobbies.equalsIgnoreCase("Speeding")) {
			metodo.clicar(elemento.hobbiesSpeeding);	
		}else if(hobbies.equalsIgnoreCase("Bungee Jumping")) {
			metodo.clicar(elemento.hobbiesBungeeJumping);
		}else if(hobbies.equalsIgnoreCase("Cliff Diving")) {
			metodo.clicar(elemento.hobbiesCliffDiving);
		}else if(hobbies.equalsIgnoreCase("Skydiving")) {
			metodo.clicar(elemento.hobbiesSkydiving);
		}else {
			metodo.clicar(elemento.hobbiesOther);
		}			
		metodo.escrever(elemento.website, website);
		metodo.tirarPrint(nomeDoTeste, nomeDaEvidencia);
		metodo.clicar(elemento.btnNext02);
	

	}

	public void preencherDadosFormularioParte03(String startDate, String insuranceSum, String meritRating, String damageInsurance, 
			String optionalProducts, String coutersyCar,  String nomeDoTeste, String nomeDaEvidencia) {

		metodo.escrever(elemento.startDate, startDate);
		metodo.escrever(elemento.insuranceSum, insuranceSum);
		metodo.escrever(elemento.meritRating, meritRating);			
		metodo.escrever(elemento.damageInsurance, damageInsurance );
		if(optionalProducts.equalsIgnoreCase("Euro Protection")) {
			metodo.clicar(elemento.optionalProductsEuro);	
		}else {
			metodo.clicar(elemento.optionalProductsLegal);
		}		
		metodo.escrever(elemento.coutersyCar, coutersyCar);
		metodo.tirarPrint(nomeDoTeste, nomeDaEvidencia);
		metodo.clicar(elemento.btnNext03);
        

	}
	
	public void preencherDadosFormularioParte04(String option, String nomeDoTeste, String nomeDaEvidencia) {
		
		if(option.equalsIgnoreCase("Silver")) {
			metodo.clicar(elemento.selectOptionSilver);	
		}else if(option.equalsIgnoreCase("Gold")) {
			metodo.clicar(elemento.selectOptionGold);	
		}else if(option.equalsIgnoreCase("Platinum")) {
			metodo.clicar(elemento.selectOptionPlatinum);	
		}else {
			metodo.clicar(elemento.selectOptionUltimate);
		}		
		metodo.esperarElemento(elemento.btnNext04);
		metodo.tirarPrint(nomeDoTeste, nomeDaEvidencia);
		metodo.clicar(elemento.btnNext04);		
		
	}
	
	public void preencherDadosFormularioParte05(String email, String phone, String username, 
			String password, String confPassword, String comments, String nomeDoTeste, 
			String nomeDaEvidencia ) {
	    
		metodo.escrever(elemento.email, email);
		metodo.escrever(elemento.phone, phone);
		metodo.escrever(elemento.username, username);
		metodo.escrever(elemento.password, password);
		metodo.escrever(elemento.confPassword, confPassword);
		metodo.escrever(elemento.comments, comments);
		metodo.tirarPrint(nomeDoTeste, nomeDaEvidencia);
		metodo.clicar(elemento.btnSend);
	}
	
	public void confirmacaoEnvioDoCadastro(String textoConfirmacao, 
			String nomeDoTeste, String nomeDaEvidencia) {
		
		metodo.esperarElemento(elemento.msgConformacao);
		metodo.validarTexto(elemento.msgConformacao, textoConfirmacao);
		metodo.tirarPrint(nomeDoTeste, nomeDaEvidencia);
		metodo.clicar(elemento.btnOk);
		
	}
	
	public void validacaoTexto(String textoEsperado) {
		
	         if(textoEsperado.equals("Welcome Aboard!")) {
	        	metodo.validarTexto(elemento.textoHome, textoEsperado); 
	        } else if (textoEsperado.equals("Make")) {
	            metodo.validarContainTexto(elemento.textoPrimeiraParte, textoEsperado);
	        } else if (textoEsperado.equals("First Name")) {
	            metodo.validarTexto(elemento.textoSegundaParte, textoEsperado);
	        } else if(textoEsperado.equals("Start Date")) {
	        	metodo.validarTexto(elemento.textoTerceiraParte, textoEsperado);
	        }else if(textoEsperado.equals("Price per Year ($)")) {
	        	metodo.validarTexto(elemento.textoQuartaParte, textoEsperado);
	        }else if(textoEsperado.equals("E-Mail")) {
	        	metodo.validarTexto(elemento.textoQuintaParte, textoEsperado);
	        }else {
	            throw new IllegalArgumentException("Texto inesperado: " + textoEsperado);
	        }	   
	}
}