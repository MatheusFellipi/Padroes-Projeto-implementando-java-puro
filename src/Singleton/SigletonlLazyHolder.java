package Singleton;

public class SigletonlLazyHolder {

  private static class Holder {
    public static SigletonlLazyHolder instancia;
  }

  private SigletonlLazyHolder() {
    super();
  }

  public static SigletonlLazyHolder getInstacia() {
    return Holder.instancia;
  }
}
