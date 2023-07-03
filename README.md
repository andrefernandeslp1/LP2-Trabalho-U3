## Projeto: Sistema de Informações para Concessionária de Automóveis desenvolvido em Java.

### UNIVERSIDADE FEDERAL DO RIO GRANDE DO NORTE – UFRN

### INSTITUTO METRÓPOLE DIGITAL – IMD

### DIM0116 - LINGUAGEM DE PROGRAMAÇÃO II

### Docente: Francimar Carlos de Macêdo

### Alunos: André Augusto Fernandes & Edvaldo Dantas de Medeiros Júnior

#

### 1. Introdução

Este projeto foi desenvolvido para a disciplina de Linguagem de Programação II, como meio de avaliar os conhecimentos adquiridos pelo aluno ao longo da disciplina.

Esta etapa do projeto consiste de uma entrega parcial do projeto, com apresentação do conceito e funcionalidades implementadas até o momento.

###

### 2. Objetivo

Os requisitos da avaliação (2ª Unidade) eram desenvolver uma aplicação em JAVA na qual fosse possível aplicar os conceitos abaixo:

1. Classes e Objetos;
2. Herança;
3. Classes Abstratas;
4. Interfaces;
5. Composição;
6. Polimorfismo;
7. Tratamento de Exceção;
8. Coleções;

###

### 3. Proposta

Para nosso projeto, criamos um sistema de informações para concessionárias de automóveis, no qual será possível administrar os departamentos de:

* Recursos Humanos;

* Clientes;

* Estoques;

* Vendas.

Tais departamentos serão dispostos em forma de menus para o usuário do sistema, em que cada menu possuirá sub-menus para realizar operações específicas para cada área, como cadastrar clientes, cadastrar funcionários, abastecer estoque, realizar vendas, entre outras.

###

### 4. Instruções de Uso

### 4.1. Compilação

Para compilar o programa, foi criado um Makefile para facilitar o processo. Para executá-lo, abra o Terminal na pasta raiz do projeto e execute o seguinte comando: `make -B`

![Capturar3](https://github.com/andrefernandeslp1/LP2-Trabalho-U3/assets/92834067/39a83a30-4895-46ae-919e-7b0695be04fe)

Os arquivos serão compilados na estrutura padrão de diretórios de um projeto Java:

![Capturar2](https://github.com/andrefernandeslp1/LP2-Trabalho-U3/assets/92834067/5c67385d-e14c-498a-b6f3-1a69d157b5ca)

### 4.2. Execução

Para executar o programa, dirija-se ao diretório `/bin` e digite `java App` no prompt de comando.

O seguinte menu será exibido:

![Capturar](https://github.com/andrefernandeslp1/LP2-Trabalho-U3/assets/92834067/e836f360-f15a-4075-9e6b-37f7dd4089c9)

A partir do menu acima, o usuário iniciará sua jornada pelo SYSCAR - Sistema de Informações para Concessionárias de Automóveis.

###

### 5. Implementação

O projeto possui a seguinte estrutura de classes:

<img title="" src="https://github.com/andrefernandeslp1/LP2-Trabalho-U3/assets/92834067/1d5ef57b-e184-48d9-88a6-dcf9f1c09756" alt="Captura de tela de 2023-07-03 16-02-22 - Copia" data-align="inline">

* Pessoa: Pessoa é uma classe abstrata com atributos e métodos genéricos de uma pessoa física;

* Cliente, Funcionários: são classes herdeiras de Pessoa, com especializações próprias. Cliente possui uma coleção do tipo List<> para armazenar seus automóveis. Já funcionário, além de seus atributos especializados, possui também métodos próprios para fazer transações ordinárias da loja;

* Carro: classe que será utilizada para instanciar os automóveis da loja e dos clientes.;

* Loja: classe utilizada para instanciar o objeto loja. Loja possuirá coleções do tipo List<> para clientes, funcionários e carros, além de métodos para manipular seus atributos e coleções;

* App: Classe que contem o main, no qual será executado o programa.



### 6. Tecnologias utilizadas

Para desenvolver o sistema foi utilizada a linguagem de programação Java e o editor de código VS Code.



### 7. Conclusão

O projeto se encontra em estágio avançado de desenvolvimento e, até o momento, foi possível aplicar os conceitos de classes e objetos, herança, classes abstratas, interfaces, composição, polimorfismo, tratamento de exceção e coleções.
