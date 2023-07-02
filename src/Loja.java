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

  public void venderCarro(){
    System.out.println("Vendendo carro...");
    System.out.println("Digite o CPF do cliente:");
    String cpf = input.nextLine();
    System.out.println("Digite o chassi do carro:");
    String chassi = input.nextLine();
    for(Cliente cliente : this.clientes){
      if(cliente.getCpf().equals(cpf)){
        for(Carro carro : this.carros){
          if(carro.getChassi().equals(chassi)){
            cliente.addCarroComprado(carro);
            this.carros.remove(carro);
            this.caixa += carro.getPreco();
            System.out.println("Carro vendido com sucesso!");
            return;
          } else {
            System.out.println("Carro não encontrado!");
          }
        }
      } else {
        System.out.println("Cliente não encontrado!");
      }
    }
  }

  public void cadastrarCliente(){
    System.out.println("Cadastrando cliente...");
    System.out.println("Digite o nome do cliente:");
    String nome = input.nextLine();
    System.out.println("Digite o CPF do cliente:");
    String cpf = input.nextLine();
    Cliente cliente = new Cliente(nome, cpf);
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
