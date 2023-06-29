import java.util.*;

public class Funcionario extends Pessoa {
  private String matricula;
  private String cargo;
  private double salario;

  public Funcionario() {
  }

  public Funcionario(String nome, String cpf, String matricula, String cargo, double salario) {
    super(nome, cpf);
    this.matricula = matricula;
    this.cargo = cargo;
    this.salario = salario;
  }

  //getters
  public String getMatricula(){ return matricula; }
  public String getCargo(){ return cargo; }
  public double getSalario(){ return salario; }

  //setters
  public void setMatricula(String matricula){ this.matricula = matricula; }
  public void setCargo(String cargo){ this.cargo = cargo; }
  public void setSalario(double salario){ this.salario = salario; }


}
