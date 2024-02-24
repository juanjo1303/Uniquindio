package co.uni.edu.poo;

import co.uni.edu.poo.Conection.ConectionBuilder;

public class App {
    public static void main( String[] args ) {
        Conection conexion = new ConectionBuilder(null, null, null)
        .user("juanjo_09")
        .pass("0000")
        .host("192.168.123.103")
        .build();

        System.out.println("Su usuario es: " + conexion.getUser() + "\nSu contraseña es: " + 
        conexion.getPass() + "\nSu IP es: " + conexion.getHost());
    }
}
