import java.lang.reflect.Array;
import java.util.*;

public class App {
  Loja loja = new Loja("Loja do João", 1000000.00);

  public static void main(String[] args) throws Exception {
      System.out.println("Hello, World!");
      Scanner input = new Scanner(System.in);

      do {
        int opcao1 = 0;
        int opcao2 = 0;

        System.out.println("Bem vindo ao SYSCAR! Sistema de Informação para Concessionárias de Automóveis");
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
              System.out.println("2 - Alterar Funcionário");
              System.out.println("3 - Excluir Funcionário");
              System.out.println("4 - Consultar Funcionário");
              System.out.println("5 - Listar Funcionários");
              System.out.println("6 - Sair");
              opcao2 = input.nextInt();
              switch (opcao2) {
                case 1:
                  System.out.println("Cadastrar Funcionário");



                  break;
                case 2:
                  System.out.println("Alterar Funcionário");
                  break;
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
            }


            break;
          case 2:
            System.out.println("Clientes");
            break;
          case 3:
            System.out.println("Compra e Venda");
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


      } while (opcao != 5);

      input.close();

      return;
  }
}
