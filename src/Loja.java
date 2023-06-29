import java.util.*;

public class Loja {
  private String nome;
  private ArrayList<Carro> carros;
  private ArrayList<Cliente> clientes;
  private ArrayList<Funcionario> funcionarios;

  public Loja() {
  }

  public Loja(String nome, ArrayList<Carro> carros, ArrayList<Cliente> clientes, ArrayList<Funcionario> funcionarios) {
    this.nome = nome;
    this.carros = new ArrayList<Carro>();
    this.clientes = new ArrayList<Cliente>();
    this.funcionarios = new ArrayList<Funcionario>();
  }

  public void cadastrarCarro(Carro carro){
    this.carros.add(carro);
  }

  public void cadastrarCliente(Cliente cliente){
    this.clientes.add(cliente);
  }

  public void cadastrarFuncionario(Funcionario funcionario){
    this.funcionarios.add(funcionario);
  }

  public void listarCarros(){
    for(Carro carro : this.carros){
      System.out.println(carro);
    }
  }

}
