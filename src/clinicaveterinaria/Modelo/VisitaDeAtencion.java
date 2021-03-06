/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria.Modelo;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author elinote
 */
public class VisitaDeAtencion {
   private int id_visita=-1;
   private  Mascota mascota;
   private Tratamiento tratamiento;
   private LocalDate fecha;
   private String detalle;
   private double peso_actual;
   private double peso_promedio;

    public VisitaDeAtencion(){}
  
    

    public VisitaDeAtencion(int id,Mascota mascota, Tratamiento tratamiento, LocalDate fecha, String detalle, double peso_actual, double peso_promedio) {
        this.id_visita=id;
        this.mascota = mascota;
        this.tratamiento = tratamiento;
        this.fecha = fecha;
        this.detalle = detalle;
        this.peso_actual = peso_actual;
        this.peso_promedio = peso_promedio;
    }

    public VisitaDeAtencion(Mascota mascota, Tratamiento tratamiento, LocalDate fecha, String detalle, double peso_actual, double peso_promedio) {
        this.mascota = mascota;
        this.tratamiento = tratamiento;
        this.fecha = fecha;
        this.detalle = detalle;
        this.peso_actual = peso_actual;
        this.peso_promedio = peso_promedio;
    }

    public double getPeso_actual() {
        return peso_actual;
    }

    public void setPeso_actual(double peso_actual) {
        this.peso_actual = peso_actual;
    }

    public double getPeso_promedio() {
        return peso_promedio;
    }

    public void setPeso_promedio(double peso_promedio) {
        this.peso_promedio = peso_promedio;
    }
    

    public int getId_visita() {
        return id_visita;
    }

    public void setId_visita(int id_visita) {
        this.id_visita = id_visita;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Tratamiento getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(Tratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }

    public LocalDate getFecha() {
        return fecha;
    }
    
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
   
   
  
  
   
  
}
