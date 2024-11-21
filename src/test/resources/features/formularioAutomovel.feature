
@regressivo 
Feature: Preecher formulario de seguro Automobile
  
  COMO usuario do site Tricentis
  QUERO preencher o formulario de seguro Automobile
  PARA contratar o seguro
  
  Background: Acesso ao site
    Given que esteja na tela principal do site "https://sampleapp.tricentis.com/101/index.php"


  @positivo @comSucesso
  Scenario: Preencher com sucesso o formulario de seguro Automobile 
    When clicar no menu Automobile
    And preencher todos os campos obrigatorios na tela Vehicle Data e clicar em Next para avancar
    And preencher todos os campos obrigatorios na tela Insurance Data e clicar em Next para avancar
    And preencher todos os campos obrigatorios na tela Product Data e clicar em Next para avancar
    And preencher todos os campos obrigatorios na tela Price Option e clicar em Next para avancar
    And preencher os campos obrigatorios na tela Send Quote e clicar em Send para enviar a cotacao
    Then deve aparecer uma mensagem de confirmacao dizendo que o email foi enviado com sucesso
    
    
    
    

  