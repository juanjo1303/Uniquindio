package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Usuario {
    private String name;
    private String apellido;
    private String email;
    private String id;
    private LinkedList<Reserva> reservas;

    public Usuario(String name, String apellido, String email, String id, Reserva reserva) {
        this.name = name;
        this.apellido = apellido;
        this.email = email;
        this.id = id;
        this.reservas = new LinkedList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LinkedList<Reserva> getReserva() {
        return reservas;
    }

    public void agregarReserva(Reserva reserva) {
        this.reservas.add(reserva);
    }

    public void crearReserva() {
        Reserva reserva = new Reserva();
        agregarReserva(reserva);
    }
}