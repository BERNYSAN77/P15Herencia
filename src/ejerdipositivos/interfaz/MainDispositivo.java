package ejerdipositivos.interfaz;

import ejerdipositivos.negocio.CamaraSeguridad;
import ejerdipositivos.negocio.Computador;

public class MainDispositivo {
    static void main() {
        Computador c1 = new Computador(1,"hp",32);
        CamaraSeguridad cs1 = new CamaraSeguridad(2,"patito",1028);
        System.out.println("*******Computador********");
        System.out.println(c1.prender());
        if(c1.ejecutarPrograma("Word")){
            System.out.println("El programa se ha ejecutado con éxito");
        }else{
            System.out.println("El programa no ha podido ejecutarse");
        }
        System.out.println(c1.apagar());
        System.out.println(c1.apagar());
        System.out.println(c1.mostrarDatos());

        System.out.println("\n*******Camara Seguridad********");
        System.out.println(c1.apagar());
        if(cs1.grabarVideo()){
            System.out.println("El video se ha grabado y guarda con éxito");
        }else{
            System.out.println("No puedo grabarse");
        }
        System.out.println((cs1.prender()));
        System.out.println((cs1.prender()));
        System.out.println(cs1.mostrarDatos());

    }
}
