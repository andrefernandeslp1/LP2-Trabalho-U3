import java.util.*;

public class App {

  public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);
    Loja loja = new Loja("Loja do João", 1000000.00);
    Carro carro = new Carro(); // CASO PRECISE ACESSAR ALGUM MÉTODO NESTA CLASSE
    Cliente cliente = new Cliente(); // CASO PRECISE ACESSAR ALGUM MÉTODO NESTA CLASSE
    Funcionario funcionario = new Funcionario(); // CASO PRECISE ACESSAR ALGUM MÉTODO NESTA CLASSE

    // criar uma instância de carro para abastecer o estoque
    Carro carro1 = new Carro("Fiat", "Uno", "Branco", 2010, "123456789", "Gasolina", 10000.00);
    loja.abastecerEstoque(carro1);
    // criar uma instância de funcionário para adicionar ao ArrayList de funcionários
    Funcionario funcionario1 = new Funcionario("PEDRO", "123456789", "Gerente");
    loja.adicionarFuncionario(funcionario1);
    // criar uma instância de cliente para adicionar ao ArrayList de clientes
    Cliente cliente1 = new Cliente("MARIA", "987654321");
    loja.adicionarCliente2(cliente1);

    int opcao1 = 0;

    do {
      opcao1 = 0;
      int opcao2 = 0;

      System.out.println("Bem vindo ao SYSCAR! Sistema de Informações para Concessionárias de Automóveis");
      System.out.println("Escolha uma opção:");
      System.out.println("1 - Recursos Humanos");
      System.out.println("2 - Clientes");
      System.out.println("3 - Abastecimento e Venda");
      System.out.println("4 - Estoque");
      System.out.println("5 - Sair");

      try {
        opcao1 = input.nextInt();
      } catch (InputMismatchException e) {
        opcao1 = 0;
        System.out.println("Opção inválida!");
        input.nextLine();
      }

      switch (opcao1) {
        case 1: // RECURSOS HUMANOS
          do {
            System.out.println("Recursos Humanos");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar Funcionário");
            System.out.println("2 - Demitir Funcionário");
            System.out.println("3 - Consultar Funcionário");
            System.out.println("4 - Listar Funcionários");
            System.out.println("5 - Voltar");

            try {
              opcao2 = input.nextInt();
            } catch (InputMismatchException e) {
              opcao2 = 0;
              System.out.println("Opção inválida!");
              input.nextLine();
            }

            switch (opcao2) {
              case 1: // cadastrar funcionario
                System.out.println("Cadastrar Funcionário");
                loja.cadastrarFuncionario();
                break;

              case 2: // demitir funcionario
                System.out.println("Demitir Funcionário");
                loja.demitirFuncionario();
                break;

              case 3: // consultar funcionario
                System.out.println("Consultar Funcionário");
                loja.consultarFuncionario();
                break;

              case 4: // listar funcionarios
                System.out.println("Listar Funcionários");
                loja.listarFuncionarios();
                break;

              case 5: // sair
                System.out.println("Saindo...");
                break;

              default:
                System.out.println("Opção inválida!");
                break;
            }
          } while (opcao2 != 5);
          break;

        case 2: // CLIENTESs
          System.out.println("Clientes");
          do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Consultar Cliente");
            System.out.println("3 - Listar Clientes");
            System.out.println("4 - Voltar");

            try {
              opcao2 = input.nextInt();
            } catch (InputMismatchException e) {
              opcao2 = 0;
              System.out.println("Opção inválida!");
              input.nextLine();
            }

            switch (opcao2) {
              case 1: // cadastrar cliente
                System.out.println("Cadastrar Cliente");
                loja.cadastrarCliente();
                break;

              case 2: // consultar cliente
                System.out.println("Consultar Cliente");
                loja.consultarCliente();
                break;

              case 3: // listar clientes
                System.out.println("Listar Clientes");
                loja.listarClientes();
                break;

              case 4: // sair
                System.out.println("Saindo...");
                break;

              default:
                System.out.println("Opção inválida!");
                break;
            }
          } while (opcao2 != 4);
          break;

        case 3: // ABASTECIMENTO E VENDA

        do{
          System.out.println("Abastecimento e Venda");
          System.out.println("Escolha uma opção:");
          System.out.println("1 - Abastecer Estoque");
          System.out.println("2 - Vender Carro");
          System.out.println("3 - Voltar");

          try {
            opcao2 = input.nextInt();
          } catch (InputMismatchException e) {
            opcao2 = 0;
            System.out.println("Opção inválida!");
            input.nextLine();
          }

          switch (opcao2) {
            case 1: // abastecer estoque
              System.out.println("Abastecer Estoque");
              loja.cadastrarCarro();
              break;

            case 2: // vender carro
              System.out.println("Vender Carro");
              loja.venderCarro();
              break;

            case 3: // sair
              System.out.println("Saindo...");
              break;

            default: // opcao invalida
              System.out.println("Opção inválida!");
              break;
          }
        }while (opcao2 != 3);
          break;
        case 4: // ESTOQUE

        do{
          System.out.println("Estoque");
          System.out.println("Escolha uma opção:");
          System.out.println("1 - Consultar Carro");
          System.out.println("2 - Listar Carros");
          System.out.println("3 - Voltar");

          try {
            opcao2 = input.nextInt();
          } catch (InputMismatchException e) {
            opcao2 = 0;
            System.out.println("Opção inválida!");
            input.nextLine();
          }

          switch (opcao2) {
            case 1: // consultar carro
              System.out.println("Consultar Carro");
              loja.consultarCarro();
              break;

            case 2: // listar carros
              System.out.println("Listar Carros");
              loja.listarCarros();
              break;

            case 3: // sair
              System.out.println("Saindo...");
              break;

            default: // opcao invalida
              System.out.println("Opção inválida!");
              break;
          }
        }while(opcao2 != 3);
          break;
        case 5: // SAIR
          System.out.println("Saindo...");
          break;
        default: // OPCAO INVALIDA
          System.out.println("Opção inválida!");
          break;
      }

    } while (opcao1 != 5);

    input.close();
    return;
  }
}
