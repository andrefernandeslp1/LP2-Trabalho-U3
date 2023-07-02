import java.util.*;

public class Loja {
  private String nome;
  private Double caixa;
  private ArrayList<Carro> carros;
  private ArrayList<Cliente> clientes;
  private ArrayList<Funcionario> funcionarios;
  Scanner input = new Scanner(System.in);

  public Loja() {
  }

  public Loja(String nome, Double caixa) {
    this.nome = nome;
    this.caixa = caixa;
    this.carros = new ArrayList<Carro>();
    this.clientes = new ArrayList<Cliente>();
    this.funcionarios = new ArrayList<Funcionario>();
  }

  public void comprarCarro(Carro carro, int quantidade){
    for(int i = 0; i < quantidade; i++){
      this.carros.add(carro);
      this.caixa -= carro.getPreco();
    }
  }

  public void venderCarro(Carro carro, Cliente cliente){
    this.carros.remove(carro);
    this.clientes.add(cliente);
    this.caixa += carro.getPreco();
  }

  public void cadastrarCliente(Cliente cliente){
    this.clientes.add(cliente);
  }

  public Funcionario cadastrarFuncionario(){
    System.out.println("Cadastrando funcionário...");
    System.out.println("Digite o nome do funcionário:");
    String nome = input.nextLine();
    System.out.println("Digite o CPF do funcionário:");
    String cpf = input.nextLine();
    System.out.println("Digite o cargo do funcionário:");
    String cargo = input.nextLine();
    Funcionario funcionario = new Funcionario(nome, cpf, cargo);
    return funcionario;
  }

  public void listarCarros(){
    for(Carro carro : this.carros){
      System.out.println(carro);
    }
  }

  public void listarClientes(){
    for(Cliente cliente : this.clientes){
      System.out.println(cliente);
    }
  }

  public void listarFuncionarios(){
    for(Funcionario funcionario : this.funcionarios){
      System.out.println(funcionario);
    }
  }

  public void getCaixa(){
    System.out.println("Caixa: " + this.caixa);
  }


}
