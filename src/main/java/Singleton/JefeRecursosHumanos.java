package Singleton;

import java.util.Date;

public class JefeRecursosHumanos {
    private String nombre;
    private String ci;

    public JefeRecursosHumanos(){
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getCi(){
        return ci;
    }
    public void setCi(String ci){
            this.ci = ci;
    }
    public void registarTesis(Tesis tesis, Date date){
        BaseDeDatosTesis.getInstance().registrarTesis(tesis, date);
    }
    public void verRegistro(){
        BaseDeDatosTesis.getInstance().verRegistro();
    }
}
