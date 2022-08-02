package Singleton;

public class SigletonlLazy {
  private static SigletonlLazy instancia;

  private SigletonlLazy() {
    super();
  }

  public static SigletonlLazy getInstacia() {
    if (instancia == null) {
      instancia = new SigletonlLazy();
    }
    return instancia;
  }
}
