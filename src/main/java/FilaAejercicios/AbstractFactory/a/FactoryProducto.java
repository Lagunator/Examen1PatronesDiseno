package FilaAejercicios.AbstractFactory.a;

public class FactoryProducto {
    public static Producto make(String type){
        Producto producto;
        switch (type.toLowerCase()){
            case "baridora":
                producto = new Batidora();
                break;
            case "microondas":
                producto = new Microondas();
            case "radio":
                producto = new Radio();
                break;
            case "refrigerador":
                producto = new Refrigerador();
                break;
            default:
                producto = new Television();
                break;
        }
        return producto;
    }
}
