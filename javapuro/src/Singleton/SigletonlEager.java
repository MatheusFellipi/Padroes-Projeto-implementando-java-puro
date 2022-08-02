package Singleton;

public class SigletonlEager {
  private static SigletonlEager instancia = new SigletonlEager();

  private SigletonlEager() {
    super();
  }

  public static SigletonlEager getInstacia() {
    return instancia;
  }
}
