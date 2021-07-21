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
public class TipoVehiculo {
     private Integer idTipo;
    private String descripcionTipo;
    
    public TipoVehiculo(){
        
    }

    public TipoVehiculo(Integer idTipo, String descripcionTipo) {
        this.idTipo = idTipo;
        this.descripcionTipo = descripcionTipo;
    }

    public Integer getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(Integer idTipo) {
        this.idTipo = idTipo;
    }

    public String getDescripcionTipo() {
        return descripcionTipo;
    }

    public void setDescripcionTipo(String descripcionTipo) {
        this.descripcionTipo = descripcionTipo;
    }
    
    
}
