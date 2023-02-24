package Singleton;

import java.util.Date;

public class Client {
    public static void main(String[] args) {

        JefeRecursosHumanos jefeRecursosHumanos = new JefeRecursosHumanos();
        jefeRecursosHumanos.setCi("9119772");
        jefeRecursosHumanos.setNombre("Paul");

        Tesis opcion1 = new Tesis();
        Tesis opcion2 = new Tesis();
        Tesis opcion3 = new Tesis();
        Tesis opcion4 = new Tesis();

        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante();
        Estudiante estudiante3 = new Estudiante();
        Estudiante estudiante4 = new Estudiante();

        estudiante1.setCi("736375");
        estudiante1.setNombre("Pedro");
        estudiante2.setCi("4647389");
        estudiante2.setNombre("Miguel");
        estudiante3.setCi("1832746");
        estudiante3.setNombre("Rolando");
        estudiante4.setCi("8375942");
        estudiante4.setNombre("Jose");

        opcion1.setTitulo("Ing Civil");
        opcion1.setMencion("Carreteras");
        opcion1.setDatosEstudiante(estudiante1);

        opcion1.setTitulo("Ing Sistemas");
        opcion1.setMencion("Hacking");
        opcion1.setDatosEstudiante(estudiante2);

        opcion1.setTitulo("Ing Comercial");
        opcion1.setMencion("Empresas");
        opcion1.setDatosEstudiante(estudiante3);

        opcion1.setTitulo("Ing Mecanica");
        opcion1.setMencion("Motos");
        opcion1.setDatosEstudiante(estudiante4);
    }


}
