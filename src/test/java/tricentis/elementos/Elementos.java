package tricentis.elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	//Página inicial
	public By automobile = By.id("nav_automobile");
	public By textoHome = By.xpath("//h2[contains(text(),'Welcome Aboard!')]");
	
	//Home page
	//Parte 01 - Enter Vehicle Data
	public By makeSelectCar = By.id("make");
	public By enginePerformance = By.id("engineperformance");
	public By dateOfManufacture = By.id("dateofmanufacture");	
	public By numberOfSeat = By.id("numberofseats");
	public By fulType = By.id("fuel");	
	public By listPrice = By.id("listprice");
	public By licensePalteNumber = By.id("licenseplatenumber");
	public By annualMileage = By.id("annualmileage");
	public By btnNext01 = By.id("nextenterinsurantdata");
	
	public By textoPrimeiraParte = By.xpath("//label[contains(text(),'Make')]");
	
	//Parte 02 - Enter Insurant Data
	public By firstName = By.id("firstname");
	public By lastName = By.id("lastname");
	public By dataOfBirth = By.id("birthdate");
	public By genderMale = By.xpath("//label[@class='ideal-radiocheck-label'][contains(.,'Male')]");
	public By genderFemale = By.xpath("//label[@class='ideal-radiocheck-label'][contains(.,'Female')]");
	public By streetAddress = By.id("streetaddress");
	public By country = By.id("country");
	public By zipCode = By.id("zipcode");
	public By city = By.id("city");
	public By occupation = By.id("occupation");
	public By hobbiesSpeeding = By.xpath("//label[contains(.,'Speeding')]");
	public By hobbiesBungeeJumping = By.xpath("//label[contains(.,'Bungee Jumping')]");
	public By hobbiesCliffDiving = By.xpath("//label[contains(.,'Cliff Diving')]");
	public By hobbiesSkydiving = By.xpath("//label[contains(.,'Skydiving')]");
	public By hobbiesOther = By.xpath("//label[contains(.,'Other')");
	public By website = By.id("website");
	public By btnNext02 = By.id("nextenterproductdata");
	
	public By textoSegundaParte = By.xpath("//label[@class='main'][contains(.,'First Name')]");
	
	//Parte 03 - Enter Product Data
	public By startDate = By.id("startdate");
	public By insuranceSum = By.id("insurancesum");
	public By meritRating =By.id("meritrating");	
	public By damageInsurance = By.id("damageinsurance");
    public By optionalProductsEuro = By.xpath("//label[contains(.,'Euro Protection')]");
    public By optionalProductsLegal = By.xpath("//label[contains(.,'Legal Defense Insurance')]");
    public By coutersyCar = By.id("courtesycar");
	public By btnNext03 = By.id("nextselectpriceoption");
	
	public By textoTerceiraParte = By.xpath("//label[@class='main'][contains(.,'Start Date')]");

	
	
	//Parte 04 - Select Price Option
	public By selectOptionSilver = By.cssSelector("th[colspan='4'] input[type='radio'][value='Silver']");
	public By selectOptionGold = By.cssSelector("th[colspan='4'] input[type='radio'][value='Gold']");
	public By selectOptionPlatinum = By.cssSelector("th[colspan='4'] input[type='radio'][value='Platinum']");
	public By selectOptionUltimate = By.cssSelector("th[colspan='4'] input[type='radio'][value='Ultimate']");
	public By btnNext04 = By.id("nextsendquote");
	
	public By textoQuartaParte = By.xpath("//td[contains(.,'Price per Year ($)')]");

	
	//Parte 05 - Send Quote
	public By email = By.id("email");
	public By phone = By.id("phone");
	public By username = By.id("username");
	public By password = By.id("password");
	public By confPassword = By.id("confirmpassword");
	public By comments = By.id("Comments");	
	public By btnPrev = By.id("prevselectpriceoption");
	public By btnSend = By.id("sendemail");
	
	public By textoQuintaParte = By.xpath("//label[@class='main'][contains(.,'E-Mail')]");

	
	//Parte 06 - Confirmação de cadastro 
	
	public By btnOk = By.xpath("//div[@class='sa-confirm-button-container']");
	public By msgConfirmacao = By.xpath("//h2[contains(text(),'Sending e-mail success!')]");
	
	
	
}
