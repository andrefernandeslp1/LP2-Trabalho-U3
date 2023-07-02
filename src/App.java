import java.util.*;

public class App {

  public static void main(String[] args) throws Exception {
      System.out.println("Hello, World!");
      Scanner input = new Scanner(System.in);
      Loja loja = new Loja("Loja do João", 1000000.00);
      Carro carro = new Carro();
      Cliente cliente = new Cliente();
      Funcionario funcionario = new Funcionario();
      ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
      ArrayList<Cliente> clientes = new ArrayList<Cliente>();
      ArrayList<Carro> carros = new ArrayList<Carro>();
      int opcao1 = 0;

      do {
        opcao1 = 0;
        int opcao2 = 0;

        System.out.println("Bem vindo ao SYSCAR! Sistema de Informações para Concessionárias de Automóveis");
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Recursos Humanos");
        System.out.println("2 - Clientes");
        System.out.println("3 - Compra e Venda");
        System.out.println("4 - Estoque");
        System.out.println("5 - Sair");
        opcao1 = input.nextInt();

        switch (opcao1) {
          case 1:
            do {
              System.out.println("Recursos Humanos");
              System.out.println("Escolha uma opção:");
              System.out.println("1 - Cadastrar Funcionário");
              //System.out.println("2 - Alterar Funcionário");
              System.out.println("3 - Excluir Funcionário");
              System.out.println("4 - Consultar Funcionário");
              System.out.println("5 - Listar Funcionários");
              System.out.println("6 - Sair");
              opcao2 = input.nextInt();

              switch (opcao2) {
                case 1:
                  System.out.println("Cadastrar Funcionário");
                  funcionarios.add(loja.cadastrarFuncionario());
                  break;
                //case 2:
                  //System.out.println("Alterar Funcionário");
                  //break;
                case 3:
                  System.out.println("Excluir Funcionário");
                  break;
                case 4:
                  System.out.println("Consultar Funcionário");
                  break;
                case 5:
                  System.out.println("Listar Funcionários");
                  break;
                case 6:
                  System.out.println("Saindo...");
                  break;
                default:
                  System.out.println("Opção inválida!");
                  break;
              }
            } while (opcao2 != 6);
            break;

          case 2:
            System.out.println("Clientes");
            break;

          case 3:
            System.out.println("Compra e Venda");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Comprar Carro");
            System.out.println("2 - Vender Carro");
            System.out.println("3 - Sair");
            opcao2 = input.nextInt();

            switch (opcao2) {
              case 1:
                System.out.println("Comprar Carro");
                Carro car = carro.cadastrarCarro();
                System.out.println("Digite a quantidade de carros que deseja comprar:");
                int quantidade = input.nextInt();
                loja.comprarCarro(car, quantidade);
                break;

              case 2:
                System.out.println("Vender Carro");
                loja.venderCarro();
                break;
              case 3:
                System.out.println("Saindo...");
                break;
              default:
                System.out.println("Opção inválida!");
                break;
            }

            break;
          case 4:
            System.out.println("Estoque");
            break;
          case 5:
            System.out.println("Saindo...");
            break;
          default:
            System.out.println("Opção inválida!");
            break;
        }


      } while (opcao1 != 5);

      input.close();

      return;
  }
}
