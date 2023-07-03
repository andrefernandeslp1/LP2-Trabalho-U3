import java.util.*;

public class App {

  public static void main(String[] args) throws Exception {
      Scanner input = new Scanner(System.in);
      Loja loja = new Loja("Loja do João", 1000000.00);
      Carro carro = new Carro(); //CASO PRECISE ACESSAR ALGUM MÉTODO NESTA CLASSE
      Cliente cliente = new Cliente(); //CASO PRECISE ACESSAR ALGUM MÉTODO NESTA CLASSE
      Funcionario funcionario = new Funcionario(); //CASO PRECISE ACESSAR ALGUM MÉTODO NESTA CLASSE

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
        opcao1 = input.nextInt();

        switch (opcao1) {
          case 1: //RECURSOS HUMANOS
            do {
              System.out.println("Recursos Humanos");
              System.out.println("Escolha uma opção:");
              System.out.println("1 - Cadastrar Funcionário");
              System.out.println("2 - Demitir Funcionário");
              System.out.println("3 - Consultar Funcionário");
              System.out.println("4 - Listar Funcionários");
              System.out.println("5 - Voltar");
              opcao2 = input.nextInt();

              switch (opcao2) {
                case 1: //cadastrar funcionario
                  System.out.println("Cadastrar Funcionário");
                  loja.cadastrarFuncionario();
                  //String matri = funcionarios.get(0).getMatricula();
                  //System.out.println(matri);
                  break;

                case 2: //demitir funcionario
                  System.out.println("Demitir Funcionário");
                  //input.nextLine();
                  loja.demitirFuncionario();

                  /*
                  input.nextLine();
                  System.out.println("Por favor digite a matrícula do Funcionário:");
                  String matriculaRemover = input.nextLine();
                  funcionarios.removeIf(funcionarioss -> funcionarioss.getMatricula().equals(matriculaRemover));
                  //fazer tratamento pra se caso não tenha esse funcionário.
                  System.out.println("Funcionário demitido!");
                 //não estou conseguindo ver se estou conseguindo ou não fazer a exclusão do espaço desse funcionário.
                  */
                  break;

                case 3: //consultar funcionario
                  System.out.println("Consultar Funcionário");
                  //input.nextLine();
                  loja.consultarFuncionario();
                  /*
                  boolean funcionarioEncontrado = false;
                  for (Funcionario funcionarioss : funcionarios) {
                    if (funcionarioss.getMatricula().equals(matriculaConsultar)) {
                      funcionarioEncontrado = true;
                    }
                    break;
                  }

                  if (funcionarioEncontrado) {
                      System.out.println("Funcionário localizado.");
                  } else {
                      System.out.println("Funcionário não encontrado.");
                  }
                  */
                  break;

                case 4: //listar funcionarios
                  System.out.println("Listar Funcionários");
                  loja.listarFuncionarios();
                  break;

                case 5: //sair
                  System.out.println("Saindo...");
                  break;

                default:
                  System.out.println("Opção inválida!");
                  break;
              }
            } while (opcao2 != 5);
            break;

          case 2: //CLIENTES
            System.out.println("Clientes");
            break;

          case 3: //ABASTECIMENTO E VENDA
            System.out.println("Abastecimento e Venda");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Abastecer Estoque");
            System.out.println("2 - Vender Carro");
            System.out.println("3 - Voltar");
            opcao2 = input.nextInt();

            switch (opcao2) {
              case 1: //abastecer estoque
                System.out.println("Abastecer Estoque");
                loja.cadastrarCarro();
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
