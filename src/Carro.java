public class Carro {
  //atributos fixos de carro
  private String marca;
  private String modelo;
  private String cor;
  private int ano;
  private String placa;
  private String chassi;
  private String motor;
  private String combustivel;
  private String cambio;
  private String direcao;
  private String freio;
  private String suspensao;
  private String rodas;
  private String pneus;
  private String portas;
  private String bancos;
  private String airbag;
  private boolean alarme;
  private boolean travaAutomatica;
  private boolean vidroEletrico;
  private boolean arcondicionado;
  private boolean camera;
  private boolean sensor;
  private boolean tetoSolar;
  private boolean multimidia;

  public Carro() {
  }

  public Carro(String marca, String modelo, int ano, String chassi) {
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
    this.chassi = chassi;
  }

  //getters e setters. sugira todos de uma vez
  public String getMarca(){ return marca; }
  public void setMarca(String marca){ this.marca = marca; }
  public String getModelo(){ return modelo; }
  public void setModelo(String modelo){ this.modelo = modelo; }
  public String getCor(){ return cor; }
  public void setCor(String cor){ this.cor = cor; }
  public int getAno(){ return ano; }
  public void setAno(int ano){ this.ano = ano; }
  public String getPlaca(){ return placa; }
  public void setPlaca(String placa){ this.placa = placa; }
  public String getChassi(){ return chassi; }
  public void setChassi(String chassi){ this.chassi = chassi; }
  public String getMotor(){ return motor; }
  public void setMotor(String motor){ this.motor = motor; }
  public String getCombustivel(){ return combustivel; }
  public void setCombustivel(String combustivel){ this.combustivel = combustivel; }
  public String getCambio(){ return cambio; }
  public void setCambio(String cambio){ this.cambio = cambio; }
  public String getDirecao(){ return direcao; }
  public void setDirecao(String direcao){ this.direcao = direcao; }
  public String getFreio(){ return freio; }
  public void setFreio(String freio){ this.freio = freio; }
  public String getSuspensao(){ return suspensao; }
  public void setSuspensao(String suspensao){ this.suspensao = suspensao; }
  public String getRodas(){ return rodas; }
  public void setRodas(String rodas){ this.rodas = rodas; }
  public String getPneus(){ return pneus; }
  public void setPneus(String pneus){ this.pneus = pneus; }
  public String getPortas(){ return portas; }
  public void setPortas(String portas){ this.portas = portas; }
  public String getBancos(){ return bancos; }
  public void setBancos(String bancos){ this.bancos = bancos; }
  public String getAirbag(){ return airbag; }
  public void setAirbag(String airbag){ this.airbag = airbag; }
  public boolean getAlarme(){ return alarme; }
  public void setAlarme(boolean alarme){ this.alarme = alarme; }
  public boolean getTravaAutomatica(){ return travaAutomatica; }
  public void setTravaAutomatica(boolean travaAutomatica){ this.travaAutomatica = travaAutomatica; }
  public boolean getVidroEletrico(){ return vidroEletrico; }
  public void setVidroEletrico(boolean vidroEletrico){ this.vidroEletrico = vidroEletrico; }
  public boolean getArcondicionado(){ return arcondicionado; }
  public void setArcondicionado(boolean arcondicionado){ this.arcondicionado = arcondicionado; }
  public boolean getCamera(){ return camera; }
  public void setCamera(boolean camera){ this.camera = camera; }
  public boolean getSensor(){ return sensor; }
  public void setSensor(boolean sensor){ this.sensor = sensor; }
  public boolean getTetoSolar(){ return tetoSolar; }
  public void setTetoSolar(boolean tetoSolar){ this.tetoSolar = tetoSolar; }
  public boolean getMultimidia(){ return multimidia; }
  public void setMultimidia(boolean multimidia){ this.multimidia = multimidia; }

  //métodos


}
