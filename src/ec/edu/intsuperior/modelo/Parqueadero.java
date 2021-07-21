/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author Home
 */
public class Parqueadero {
     private Integer idParqueadero;
     private String direccion;
     private String nombreParqueadero;
     private Integer capacidad;
     private Double tarifa;
     
     public Parqueadero(){
        
     }

    public Parqueadero(Integer idParqueadero, String direccion, String nombreParqueadero, Integer capacidad, Double tarifa) {
        this.idParqueadero = idParqueadero;
        this.direccion = direccion;
        this.nombreParqueadero = nombreParqueadero;
        this.capacidad = capacidad;
        this.tarifa = tarifa;
    }

    public Integer getIdParqueadero() {
        return idParqueadero;
    }

    public void setIdParqueadero(Integer idParqueadero) {
        this.idParqueadero = idParqueadero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombreParqueadero() {
        return nombreParqueadero;
    }

    public void setNombreParqueadero(String nombreParqueadero) {
        this.nombreParqueadero = nombreParqueadero;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public Double getTarifa() {
        return tarifa;
    }

    public void setTarifa(Double tarifa) {
        this.tarifa = tarifa;
    }
     
     
    
}