//Es una clase dinamica
//Es una clase controladora al resto como
//la tabla de rompimiento
package ec.edu.intsuperior.controlador;



import ec.edu.intsuperior.modelo.Parqueadero;
import ec.edu.intsuperior.modelo.Vehiculo;

public class Ticket {
   
      private String idTicket;
    private Parqueadero parqueadero;
    private Vehiculo vehiculo;
    private Float horaIngreso;
    private Float horasalida;
    private String fechaIngreso;
    private String fechaSalida;

    public Ticket() {
    }
    
    public Ticket(String idTicket, Parqueadero parqueadero, Vehiculo vehiculo, Float horaIngreso, Float horasalida, String fechaIngreso, String fechaSalida) {
        this.idTicket = idTicket;
        this.parqueadero = parqueadero;
        this.vehiculo = vehiculo;
        this.horaIngreso = horaIngreso;
        this.horasalida = horasalida;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
    }

    public String getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(String idTicket) {
        this.idTicket = idTicket;
    }

    public Parqueadero getParqueadero() {
        return parqueadero;
    }

    public void setParqueadero(Parqueadero parqueadero) {
        this.parqueadero = parqueadero;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Float getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(Float horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public Float getHorasalida() {
        return horasalida;
    }

    public void setHorasalida(Float horasalida) {
        this.horasalida = horasalida;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    
    
   
}