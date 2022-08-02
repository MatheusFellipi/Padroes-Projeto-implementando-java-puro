import Facede.Facede;
import Singleton.SigletonlEager;
import Singleton.SigletonlLazy;
import Singleton.SigletonlLazyHolder;
import Strategy.Comportamento;
import Strategy.ComportamentoAgressivo;
import Strategy.ComportamentoDefensivo;
import Strategy.ComportamentoNormal;
import Strategy.Robo;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("SigletonlLazy");
        SigletonlLazy lazy = SigletonlLazy.getInstacia();
        System.out.println(lazy);
        lazy = SigletonlLazy.getInstacia();
        System.out.println(lazy);

        System.out.println("SigletonlEager");
        SigletonlEager eager = SigletonlEager.getInstacia();
        System.out.println(eager);
        eager = SigletonlEager.getInstacia();
        System.out.println(eager);

        System.out.println("SigletonlLazyHolder");
        SigletonlLazyHolder holder = SigletonlLazyHolder.getInstacia();
        System.out.println(holder);
        holder = SigletonlLazyHolder.getInstacia();
        System.out.println(holder);
        System.out.println("------------------------------------------------");

        System.out.println("Strategy");
        Comportamento normal = new ComportamentoNormal();
        Comportamento Agressivo = new ComportamentoAgressivo();
        Comportamento Defensivo = new ComportamentoDefensivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        robo.setComportamento(Agressivo);
        robo.mover();
        robo.mover();

        robo.setComportamento(Defensivo);
        robo.mover();
        robo.mover();

        System.out.println("Facede");

        Facede facede = new Facede();
        facede.migrarCliente("nome", "cep");

    }
}
