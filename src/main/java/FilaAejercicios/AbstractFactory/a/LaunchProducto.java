package FilaAejercicios.AbstractFactory.a;

public class LaunchProducto {
    public static void main(String[] args) {
        String product = "batidora";
        FactoryProducto.make(product).precio(220);

        String product2 = "microondas";
        FactoryProducto.make(product2).precio(180);

        String product3 = "radio";
        FactoryProducto.make(product3).precio(180);

        String product4 = "refrigerador";
        FactoryProducto.make(product4).precio(180);

        String product5 = "television";
        FactoryProducto.make(product5).precio(180);
    }
}
