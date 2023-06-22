public class Pessoa {
  private String nome;
  private String cpf;
  private String endereco;
  private String telefone;
  private String email;
  private String dataNascimento;
  private String sexo;
  private String estadoCivil;
  private String profissao;
  private String renda;
  private String dataCadastro;

  //construtor vazio
  public Pessoa() {
  }
  //construtor com alguns atributos obrigatórios
  public Pessoa(String nome, String cpf){
    this.nome = nome;
    this.cpf = cpf;
  }

  //getters e setters
  public String getNome(){ return nome; }
  public void setNome(String nome){ this.nome = nome; }
  public String getCpf(){ return cpf; }
  public void setCpf(String cpf){ this.cpf = cpf; }
  public String getEndereco(){ return endereco; }
  public void setEndereco(String endereco){ this.endereco = endereco; }
  public String getTelefone(){ return telefone; }
  public void setTelefone(String telefone){ this.telefone = telefone; }
  public String getEmail(){ return email; }
  public void setEmail(String email){ this.email = email; }
  public String getDataNascimento(){ return dataNascimento; }
  public void setDataNascimento(String dataNascimento){ this.dataNascimento = dataNascimento; }
  public String getSexo(){ return sexo; }
  public void setSexo(String sexo){ this.sexo = sexo; }
  public String getEstadoCivil(){ return estadoCivil; }
  public void setEstadoCivil(String estadoCivil){ this.estadoCivil = estadoCivil; }
  public String getProfissao(){ return profissao; }
  public void setProfissao(String profissao){ this.profissao = profissao; }
  public String getRenda(){ return renda; }
  public void setRenda(String renda){ this.renda = renda; }
  public String getDataCadastro(){ return dataCadastro; }
  public void setDataCadastro(String dataCadastro){ this.dataCadastro = dataCadastro; }

  //métodos

}
