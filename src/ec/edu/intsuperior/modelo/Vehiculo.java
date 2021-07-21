/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;


public class Vehiculo {
   private String placa;
    private Propietario propietario;
    private String fechaFabricacion;
    private String color;
    private String marca;
    private Double Precio;
    private String chasis;
    private TipoVehiculo tipovehiculo;
    
    public Vehiculo(){
        
    }

    public Vehiculo(String placa, Propietario propietario, String fechaFabricacion, String color, String marca, Double Precio, String chasis, TipoVehiculo tipovehiculo) {
        this.placa = placa;
        this.propietario = propietario;
        this.fechaFabricacion = fechaFabricacion;
        this.color = color;
        this.marca = marca;
        this.Precio = Precio;
        this.chasis = chasis;
        this.tipovehiculo = tipovehiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public String getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(String fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double Precio) {
        this.Precio = Precio;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public TipoVehiculo getTipovehiculo() {
        return tipovehiculo;
    }

    public void setTipovehiculo(TipoVehiculo tipovehiculo) {
        this.tipovehiculo = tipovehiculo;
    }
    
    
}