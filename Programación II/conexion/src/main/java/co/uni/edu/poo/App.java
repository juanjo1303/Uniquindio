package co.uni.edu.poo;

import co.uni.edu.poo.Conection.ConectionBuilder;

public class App {
    public static void main( String[] args ) {
        Conection conexion = ConectionBuilder.getInstance()
        .user("juanjo_09")
        .pass("0000")
        .host("192.168.123.103")
        .build();

        System.out.println("Estos son sus datos: " +"\n"+ conexion.getUser() +"\n"+ conexion.getPass() +"\n"+
        conexion.getHost() +"\n");

        Conection conexion1 = ConectionBuilder.getInstance()
        .user("picante_no_me_dejes_seco")
        .pass("4352")
        .host("172.002.344.123")
        .codification("UTF-8")
        .await((short)3000)
        .attempts((byte)3)
        .ssl(false)
        .port((short)3421)
        .dataBase("ServerHappyDuck")
        .build();

        System.out.println("Estos son sus datos: " +"\n"+ conexion1.getUser() +"\n"+ conexion1.getPass() +"\n"+
        conexion1.getHost() +"\n"+ conexion1.getCodification() +"\n"+ conexion1.getAwait() +"\n"+ 
        conexion1.getAttempts() +"\n"+ conexion1.isSsl() +"\n"+ conexion1.getPort() +"\n"+ 
        conexion1.getDataBase() +"\n");

        System.out.println("Estos son sus datos: " +"\n"+ conexion.getUser() +"\n"+ conexion.getPass() +"\n"+
        conexion.getHost() +"\n"+ conexion.getCodification() +"\n"+ conexion.getAwait() +"\n"+ 
        conexion.getAttempts() +"\n"+ conexion.isSsl() +"\n"+ conexion.getPort() +"\n"+ 
        conexion.getDataBase() +"\n");
    }
}
