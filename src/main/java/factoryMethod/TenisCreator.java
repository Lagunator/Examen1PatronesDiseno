package factoryMethod;

public class TenisCreator extends ElementoCreator{


    @Override
    public Tenis creator() {

        Tenis tenis = new Tenis();

        tenis.setTamanio("M");
        tenis.setColor("Azul");
        tenis.setGarantia("Nunca");

        return  tenis;

    }
}
