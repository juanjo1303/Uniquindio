package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.List;

import co.edu.uniquindio.poo.Reserva.ReservaBuilder;

public class Main {
    public static void main(String args[]) {
        Reserva reserva = new ReservaBuilder()
        .tipoAlojamiento(TipoAlojamiento.ESTANDAR)
        .preferenciaTransporte(PreferenciaTransporte.TERRESTRE)
        .dieta(Dieta.OMNIVORA)
        .actividades(List.of("Sky Diving", "Bungee"))
        .fechaSalida(LocalDate.of(2024, 12, 9))
        .duracionViaje(12)
        .destino("Berlín, Alemania")
        .build();

        Reserva reserva2 = new ReservaBuilder()
        .fechaSalida(LocalDate.of(2024, 6, 16))
        .dieta(Dieta.VEGANA)
        .destino("Cacún, México")
        .build();

        System.out.println("Reserva: " + reserva.getFechaSalida() + "\nTipo de alojamiento: " + 
        reserva.getTipoAlojamiento() + "\nDieta: " + reserva.getDieta() + "\nPreferencia de transporte: " +
        reserva.getPreferenciaTransporte() + "\nActividades: " + reserva.getActividades() + "\nDuración del viaje: "
        + reserva.getDuracionViaje() + " Días" + "\nDestino: " + reserva.getDestino());

        System.out.println("Reserva: " + reserva2.getFechaSalida() + "\nDieta: " + reserva2.getDieta() +
        "\nDestino: " + reserva2.getDestino());
    }
}