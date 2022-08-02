package Facede;

import Facede.SubSistema1.CepApi;
import Facede.SubSistema2.CrmService;

public class Facede {
  public void migrarCliente(String nome, String cep) {
    String recuperarCidade = CepApi.getInstacia().recuperarCidade("cep");
    String recuperarEstado = CepApi.getInstacia().recuperarEstado("cep");

    CrmService.gravarCliente("nome", "cep", recuperarEstado, recuperarCidade);
  }
}
