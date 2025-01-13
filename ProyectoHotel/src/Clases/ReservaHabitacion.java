package Clases;

/**
 *
 * @author equipo
 */

public class ReservaHabitacion {

    // Propiedades
    private int claveCliente;
    private String nombreCliente;
    private String fechaReservacion;
    private int numeroHabitacion;
    private int nocheEstancia;

    // Constructor
    public ReservaHabitacion(int claveCliente, String nombreCliente, String fechaReservacion, int numeroHabitacion,
            int nocheEstancia) {
        this.claveCliente = claveCliente;
        this.nombreCliente = nombreCliente;
        this.fechaReservacion = fechaReservacion;
        this.numeroHabitacion = numeroHabitacion;
        this.nocheEstancia = nocheEstancia;
    }

    // Getters
    public int getClaveCliente() {
        return claveCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getFechaReservacion() {
        return fechaReservacion;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public int getNocheEstancia() {
        return nocheEstancia;
    }

    // Setters
    public void setClaveCliente(int claveCliente) {
        this.claveCliente = claveCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setFechaReservacion(String fechaReservacion) {
        this.fechaReservacion = fechaReservacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public void setNocheEstancia(int nocheEstancia) {
        this.nocheEstancia = nocheEstancia;
    }
}
