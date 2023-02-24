package factoryMethod;

public class ShortsCreator extends ElementoCreator{


    @Override
    public Shorts creator() {

        Shorts shorts = new Shorts();

        shorts.setTamanio("S");
        shorts.setColor("Azul");
        shorts.setGarantia("Nunca");

        return  shorts;

    }
}
