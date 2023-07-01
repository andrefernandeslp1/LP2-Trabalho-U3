import java.util.*;

public class Funcionario extends Pessoa {
  private String matricula;
  private String cargo;

  public Funcionario() {
  }

  public Funcionario(String nome, String cpf, String cargo, double salario) {
    super(nome, cpf);
    this.cargo = cargo;
    this.matricula = gerarMatricula(cpf, cargo);
  }

  //getters
  public String getMatricula(){ return matricula; }
  public String getCargo(){ return cargo; }

  //setters
  public void setCargo(String cargo){
    this.cargo = cargo;
    this.matricula = gerarMatricula(super.getCpf(), cargo);
  }

  //metodos
  public String gerarMatricula(String cpf, String cargo) {
    String matricula = cpf.substring(0, 3) + cargo.substring(0, 3);
    return matricula;
  }
}
