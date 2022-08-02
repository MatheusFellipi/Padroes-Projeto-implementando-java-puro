package Facede.SubSistema1;

public class CepApi {
  private static CepApi instancia = new CepApi();

  private CepApi() {
    super();
  }

  public static CepApi getInstacia() {
    return instancia;
  }

  public String recuperarCidade(String cep){
    return "Araraquara";
  }

  public String recuperarEstado(String cep){
    return "SP";
  }
}
