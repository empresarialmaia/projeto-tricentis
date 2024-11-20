# Projeto de automação de testes para o site Tricentis
Este projeto automatiza a execução de testes no site [Tricentis](https://sampleapp.tricentis.com/101/index.php) para validar suas funcionalidades de maneira eficiente e precisa.
## Tecnologias utilizadas
- **Java:** Utilizada para desenvolver os scripts de teste e interagir com a aplicação web.
- **Selenium:** Framework para automação de ações no navegador, como clicar em botões, preencher formulários e verificar elementos em páginas web.
- **JUnit:** Framework para testes unitários em Java, utilizado para estruturar e executar testes que verificam partes específicas do código.
- **Cucumber:** Ferramenta que suporta o Desenvolvimento Orientado a Comportamento (BDD), permitindo a descrição de funcionalidades em linguagem natural, facilitando a colaboração e compreensão das funcionalidades do software.
- **Apache Commons IO:** Biblioteca que auxilia na manipulação de arquivos, o que inclui a cópia e movimentação de arquivos de evidências durante os testes.	

## Tecnologias necessárias
Este projeto de automação requer as seguintes tecnologias:
- **Git:** Sistema de controle de versão distribuído, utilizado para gerenciar o código fonte do projeto.
- **Java:** Linguagem de programação.
- **Maven:** Ferramenta de automação de compilação e gerenciamento de dependências, essencial para organizar e construir o projeto de automação de testes.

## Clonando o repositório

Siga os passos abaixo para clonar o projeto:

1 - Abra o terminal ou prompt de comando.

2 - Execute o comando para clonar o repositório:
- **git clone https://github.com/empresarialmaia/projeto-tricentis.git**

3 - Acesse o diretório do projeto:
-    **cd Tricentis**

## Como executar os testes
 Após clonar o repositório, siga os seguintes passos para instalar as dependências e executar os testes:

1 - Limpe e construa o projeto com Maven:
-    **mvn clean install**

2 - Execute os testes:
-    **mvn test -Dtest=Executa**

Os testes definidos serão executados, e você poderá ver o resultado diretamente no terminal.

## Contribuindo
 Contribuições são bem-vindas! Se você deseja colaborar com o desenvolvimento deste projeto, sinta-se à vontade para enviar melhorias e sugestões.
