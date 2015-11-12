# e4-us mvc projeto contábil

Configurando o NodeJS e o projeto, passos:

* Instalar o NodeJS pelo site https://nodejs.org/en/;
* Fazer checkout do projeto (Caso ainda não tenha feito ou push);
* Após estar com o projeto em disco, ir na pasta do projeto pelo prompt e rodar o comando npm install, este comando faz com que o node package manager faça downloads de todas as dependências que estão no arquivo package.json;
* Para rodar o projeto executar o comando node bin/www para rodar e pronto o projeto estará rodando;
* O arquivo .gitignore ignora os arquivos de módulos, portanto se não instalar os módulos utilizando o comando npm install o projeto não funcionará.

* Ainda temos que decidir sobre o framework front-end que iremos usar, no exemplo do projeto estou usando o materializecss;
* O projeto conta com o ORM Sequelize para mapear as tabelas do Banco;
* Costumo utilizar o Brackets para trabalhar com projetos JS, é interessante baixar também o JS Beautify pois
  ás vezes teremos problemas com identação e chamadas de funções callback e pode virar uma bagunça e não conseguiremos
  visualizar o código decentemente, aqui está o plugin para o brackets: https://github.com/brackets-beautify/brackets-beautify
  
* O projeto conta com o NodeJS + ExpressJS (Framework de requisição) + SequelizeJS (ORM para o Banco)
