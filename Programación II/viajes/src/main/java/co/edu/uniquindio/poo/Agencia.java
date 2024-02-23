package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.util.Collection;

public class Agencia {
    private String nombre;
    private String nit;
    private Collection<Reserva> reservas;
    private Collection<Usuario> usuarios;
 
    public Agencia(String nombre, String nit){
        this.nombre = nombre;
        this.nit = nit;
        this.reservas = new LinkedList<>();
        this.usuarios = new LinkedList<>();
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public Collection<Reserva> getReservas() {
        return reservas;
    }

    public void setViajes(Collection<Reserva> reservas) {
        this.reservas = reservas;
    }

    public Collection<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Collection<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}