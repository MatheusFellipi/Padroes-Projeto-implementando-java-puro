import Singleton.SigletonlEager;
import Singleton.SigletonlLazy;
import Singleton.SigletonlLazyHolder;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("SigletonlLazy");
        SigletonlLazy lazy = SigletonlLazy.getInstacia();
        System.out.println(lazy);
        lazy = SigletonlLazy.getInstacia();
        System.out.println(lazy);

        System.out.println("SigletonlEager");
        SigletonlEager eager  = SigletonlEager.getInstacia();
        System.out.println(eager);
        eager = SigletonlEager.getInstacia();
        System.out.println(eager);

        System.out.println("SigletonlLazyHolder");
        SigletonlLazyHolder holder = SigletonlLazyHolder.getInstacia();
        System.out.println(holder);
        holder = SigletonlLazyHolder.getInstacia();
        System.out.println(holder);
        System.out.println("------------------------------------------------");
    }
}
