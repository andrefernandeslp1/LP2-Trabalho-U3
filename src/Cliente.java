import java.util.*;

public class Cliente extends Pessoa {
  //informações exclusivas para cliente
  private String cadastro;
  private ArrayList<Carro> carrosComprados;

  public Cliente() {
  }

  public Cliente(String nome, String cpf, ArrayList<Carro> carrosComprados) {
    super(nome, cpf);
    this.cadastro = gerarCadastro(nome, cpf);
    this.carrosComprados = new ArrayList<Carro>();
  }

  //getters
  public String getCadastro(){ return cadastro; }
  public ArrayList<Carro> getCarrosComprados(){ return carrosComprados; }

  //setters
  public void setCadastro(String nome, String cpf){ this.cadastro = gerarCadastro(nome, cpf); }

  //metodos
  public String gerarCadastro(String nome, String cpf) {
    String cadastro = nome.substring(0, 3) + cpf.substring(0, 3);
    return cadastro;
  }

}
