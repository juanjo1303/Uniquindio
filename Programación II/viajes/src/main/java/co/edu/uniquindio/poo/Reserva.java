package co.edu.uniquindio.poo;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

public class Reserva {
    private TipoAlojamiento tipoAlojamiento;
    private PreferenciaTransporte preferenciaTransporte;
    private List<String> actividades;
    private Dieta dieta;
    private LocalDate fechaSalida;
    private int duracionViaje;
    private String destino;

    public Reserva(TipoAlojamiento tipoAlojamiento, PreferenciaTransporte preferenciaTransporte, List<String> actividades,
                Dieta dieta,LocalDate fechaSalida, int duracionViaje, String destino) {

        this.tipoAlojamiento = tipoAlojamiento;
        this.preferenciaTransporte = preferenciaTransporte;
        this.actividades = (actividades != null) ? actividades : new ArrayList<>();
        this.dieta = dieta;
        this.fechaSalida = fechaSalida;
        this.duracionViaje = duracionViaje;
        this.destino = destino;
    }

    public Reserva() {
    }

    public TipoAlojamiento getTipoAlojamiento() {
        return tipoAlojamiento;
    }

    public void setTipoAlojamiento(TipoAlojamiento tipoAlojamiento) {
        this.tipoAlojamiento = tipoAlojamiento;
    }

    public PreferenciaTransporte getPreferenciaTransporte() {
        return preferenciaTransporte;
    }

    public void setPreferenciaTransporte(PreferenciaTransporte preferenciaTransporte) {
        this.preferenciaTransporte = preferenciaTransporte;
    }

    public List<String> getActividades() {
        return actividades;
    }

    public void setActividades(String actividad) {
        actividades.add(actividad);
    }

    public Dieta getDieta() {
        return dieta;
    }

    public void setDieta(Dieta dieta) {
        this.dieta = dieta;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getDuracionViaje() {
        return duracionViaje;
    }

    public void setDuracionViaje(int duracionViaje) {
        this.duracionViaje = duracionViaje;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public static class ReservaBuilder {
        private TipoAlojamiento tipoAlojamiento;
        private PreferenciaTransporte preferenciaTransporte;
        private List<String> actividades;
        private Dieta dieta;
        private LocalDate fechaSalida;
        private int duracionViaje;
        private String destino;

        public ReservaBuilder(){
        }

        public ReservaBuilder tipoAlojamiento(TipoAlojamiento tipoAlojamiento) {
            this.tipoAlojamiento = tipoAlojamiento;
            return this;
        }

        public ReservaBuilder preferenciaTransporte(PreferenciaTransporte preferenciaTransporte) {
            this.preferenciaTransporte = preferenciaTransporte;
            return this;
        }

        public ReservaBuilder actividades(List<String> actividades) {
            this.actividades = actividades;
            return this;
        }

        public ReservaBuilder dieta(Dieta dieta) {
            this.dieta = dieta;
            return this;
        }

        public ReservaBuilder fechaSalida(LocalDate fechaSalida) {
            this.fechaSalida = fechaSalida;
            return this;
        }

        public ReservaBuilder duracionViaje(int duracionViaje) {
            this.duracionViaje = duracionViaje;
            return this;
        }

        public ReservaBuilder destino(String destino) {
            this.destino = destino;
            return this;
        }

        public Reserva build() {
            return new Reserva(tipoAlojamiento, preferenciaTransporte, actividades, dieta, fechaSalida, duracionViaje, destino);
        }
    }
}