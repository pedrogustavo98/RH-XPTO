<h1>AppRH - XPTO</h1>


Este projeto foi desenvolvido com o intuito de possibilitar o cadastro de vagas e consequentemente os candidatos às vagas disponíveis; no seu desenvolvimento , além de utilizar o workbench para criar o database, foram utilizados o Eclipse com Spring-boot e o VsCode; 

<h6>Linguagens utilizadas: JAVA & JAVASCRIPT</h6>
<h6>Framework: Spring-Boot e Boot-strap</h6>

Instruções de instalação e uso:
1º No MySQL criar um banco com o nome AppRH;

2º No Eclipse, ir em file, importar, escolher opção Maven, Existing Maven Projects, next, selecione a pasta do seu projeto em browser, marque a opção em Projects seuProjeto.jar e finish;

4º Ainda no Eclipse, acessar o arquivo DataConfiguration.java e mudar usuário e senha de acordo com o seu banco de dados. Fazer a mesma coisa no arquivo application.properties que está na pasta src/main/resources;

5º Para executar o projeto no Eclipse, escolher Run RhappApplication e executar como uma aplicação Java;

6º Acessar em: http://localhost:8080/

Obs.: O projeto não funciona se não existir um banco (vazio) chamado AppRH no MySQL.

----------------------------------------------------------------------------------------------------
 AVISO IMPORTANTE: Para que o usuário consiga se candidatar a vaga, é necessário que cadastre a vaga primeiro.


para acessar o painel "vagas em aberto" será pedido o login e senha são eles:

login: root <br>
senha: root
