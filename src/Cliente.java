import java.util.*;

public class Cliente extends Pessoa {
  //informações exclusivas para cliente
  private String cadastro;
  private ArrayList<Carro> carrosComprados;

  public Cliente() {
  }

  public Cliente(String nome, String cpf, String cadastro, ArrayList<Carro> carrosComprados) {
    super(nome, cpf);
    this.cadastro = cadastro;
    this.carrosComprados = new ArrayList<Carro>();
  }

  //getters
  public String getCadastro(){ return cadastro; }
  public ArrayList<Carro> getCarrosComprados(){ return carrosComprados; }

  //setters
  public void setCadastro(String cadastro){ this.cadastro = cadastro; }
  public void setCarrosComprados(ArrayList<Carro> carrosComprados){ this.carrosComprados = carrosComprados; }

}
