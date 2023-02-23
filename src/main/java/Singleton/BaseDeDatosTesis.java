package Singleton;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BaseDeDatosTesis {
    private static BaseDeDatosTesis instance;
    private Map<Tesis, Date> registro = new ConcurrentHashMap<>();

    private BaseDeDatosTesis (){
        System.out.println("Estamos generando la base de datos");
    }
    public static BaseDeDatosTesis getInstance(){
        if(instance == null){
            multithreadControl();
        }
        return instance;
    }
    private synchronized void  registrarTesis (Tesis tesis, Date date) {
        if (registro.containsKey(tesis)) {
            System.out.println("Estamos registrando la tesis de:" + tesis.getDatosEstudiante().getNombre() + "en la fecha:" + date);
            registro.put(tesis, date);
        } else {
            System.out.println("Error se encontro tesis duplicada");
        }
    }
    public synchronized void verRegistro(){
        System.out.println("Registro");
        for (Map.Entry<Tesis,Date> entry: registro.entrySet()){
            System.out.println(entry.getKey().getDatosEstudiante().getNombre()+"---->"+entry.getKey().getDatosEstudiante().getCi()+"----->"+entry.getKey().getTitulo()+"------>"+ entry.getKey().getMencion()+"----->"+ entry.getValue());
        }
    }
}
