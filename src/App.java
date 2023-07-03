import java.util.*;

public class App {

  public static void main(String[] args) throws Exception {
      Scanner input = new Scanner(System.in);
      Loja loja = new Loja("Loja do João", 1000000.00);
      Carro carro = new Carro();
      Cliente cliente = new Cliente();
      Funcionario funcionario = new Funcionario();
      List<Funcionario> funcionarios = new ArrayList<>();
      List<Cliente> clientes = new ArrayList<>();
      List<Carro> carros = new ArrayList<>();
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
          case 1: //RECURSOS HUMANOS
            do {
              System.out.println("Recursos Humanos");
              System.out.println("Escolha uma opção:");
              System.out.println("1 - Cadastrar Funcionário");
              //System.out.println("2 - Alterar Funcionário");
              System.out.println("3 - Excluir Funcionário");
              System.out.println("4 - Consultar Funcionário");
              System.out.println("5 - Listar Funcionários");
              System.out.println("6 - Voltar");
              opcao2 = input.nextInt();

              switch (opcao2) {
                case 1: //cadastrar funcionario
                  System.out.println("Cadastrar Funcionário");
                  funcionarios.add(loja.cadastrarFuncionario());
                  break;
                //case 2: //alterar funcionario
                  //System.out.println("Alterar Funcionário");
                  //break;
                case 3: //excluir funcionario
                  System.out.println("Excluir Funcionário");
                  break;
                case 4: //consultar funcionario
                  System.out.println("Consultar Funcionário");
                  break;
                case 5: //listar funcionarios
                  System.out.println("Listar Funcionários");
                  break;
                case 6: //sair
                  System.out.println("Saindo...");
                  break;
                default:
                  System.out.println("Opção inválida!");
                  break;
              }
            } while (opcao2 != 6);
            break;

          case 2: //CLIENTES
            System.out.println("Clientes");
            break;

          case 3: //COMPRA E VENDA
            System.out.println("Compra e Venda");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Comprar Carro");
            System.out.println("2 - Vender Carro");
            System.out.println("3 - Voltar");
            opcao2 = input.nextInt();

            switch (opcao2) {
              case 1: //comprar carro
                System.out.println("Comprar Carro");
                Carro car = carro.cadastrarCarro();
                System.out.println("Digite a quantidade de carros que deseja comprar:");
                int quantidade = input.nextInt();
                loja.comprarCarro(car, quantidade);
                break;

              case 2: //vender carro
                System.out.println("Vender Carro");
                loja.venderCarro();
                break;
              case 3: //sair
                System.out.println("Saindo...");
                break;
              default: //opcao invalida
                System.out.println("Opção inválida!");
                break;
            }

            break;
          case 4: //ESTOQUE
            System.out.println("Estoque");
            break;
          case 5: //SAIR
            System.out.println("Saindo...");
            break;
          default: //OPCAO INVALIDA
            System.out.println("Opção inválida!");
            break;
        }


      } while (opcao1 != 5);

      input.close();

      return;
  }
}
