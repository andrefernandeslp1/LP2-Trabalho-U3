## Projeto: Sistema de Informações para Concessíonária de Automóveis desenvolvido em Java.

### UNIVERSIDADE FEDERAL DO RIO GRANDE DO NORTE – UFRN

### INSTITUTO METRÓPOLE DIGITAL – IMD

#### DIM0116 - LINGUAGEM DE PROGRAMAÇÃO II

#### Docente: Francimar Carlos de Macêdo

#### Alunos: André Augusto Fernandes / Edvaldo Dantas de Medeiros Júnior

#

#### 1. Introdução

Este projeto foi desenvolvido para a disciplina de Linguagem de Programação II, como meio de avaliar os conhecimentos adquiridos pelo aluno ao longo da disciplina.

Esta etapa do projeto consiste de uma entrega parcial do projeto, com apresentação do conceito e funcionalidades implementadas até o momento.

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

### 3. Proposta

Para nosso projeto, criamos um sistema de informações para concessionárias de automóveis, no qual será possível administrar os departamentos de:

* Recursos Humanos;
  
* Clientes;
  
* Estoques;
  
* Vendas.
  

Tais departamentos serão dispostos em forma de menus para o usuário do sistema, em que cada menu possuirá sub-menus para realizar operções específicas para cada área, como cadastrar clientes, cadastrar funcionários, abastecer estoque, realizar vendas, entre outras.

### 4. Instruções de Uso

#### 4.1. Compilação

Para compilar o programa, foi criado um Makefile para facilitar o processo. Para executá-lo, abra o Terminal na pasta raiz do projeto e execute o seguinte comando: `make -B`

Os arquivos serão compilados na estrutura padrão de diretórios de um projeto Java:

├── Makefile
####
├── bin
####
│   └── (arquivos .class serão gerados aqui)
####
└── src
####
    └── (arquivos-fonte .java aqui)

#### 4.2. Execução

Para executar o programa, dirija-se ao diretório `/bin` e digite `java App` no prompt de comando.

O seguinte menu será exibido:

![Capturar](https://github.com/andrefernandeslp1/LP2-Trabalho-U3/assets/92834067/fc40627f-4846-4a50-8765-e603ba0655e2)


A partir do menu acima, o usuário iniciará sua jornada pelo SYSCAR - Sistema de Informações para Concessionária de Automóveis.

### 5. Implementação

O projeto possui a seguinte estrutura de classe:

![Captura de tela de 2023-07-03 16-02-22 - Copia](https://github.com/andrefernandeslp1/LP2-Trabalho-U3/assets/92834067/1d5ef57b-e184-48d9-88a6-dcf9f1c09756)


* Pessoa: Pessoa é uma classe abstrata com atributos e métodos genéricos de uma pessoa física;
  
* Cliente, Funcionários: são classes herdeiras de Pessoa, com especializações próprias;
  
* Carro: classe que será utilizada para instanciar os automóveis da loja;
  
* Loja: classe utilizada para instanciar o objeto loja;
  
* App: Classe que contem o main, no qual será executado o programa.
