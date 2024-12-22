/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.u01.t02.json;

import com.google.gson.annotations.Expose;
import java.time.LocalDateTime;

/**
 *
 * @author italo
 */
public class Permiso {

    @Expose

      private Long idPermiso;
    @Expose

    private String nombre;
    @Expose

    private String descripcion;
     @Expose
    private LocalDateTime fechaCreacion;
     @Expose
    private LocalDateTime fechaActualización;


    public Permiso() {
    }

    public Permiso(Long idPermiso, String nombre, String descripcion) {
        this.idPermiso = idPermiso;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaCreacion =  LocalDateTime.now();
        this.fechaActualización =  this.fechaCreacion;
    }

    public Long getIdPermiso() {
        return idPermiso;
    }

    public void setIdPermiso(Long idPermiso) {
        this.idPermiso = idPermiso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDateTime getFechaActualización() {
        return fechaActualización;
    }

    public void setFechaActualización(LocalDateTime fechaActualización) {
        this.fechaActualización = fechaActualización;
    }

    @Override
    public String toString() {
        return "Permiso{" + "idPermiso=" + idPermiso + ", nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }

   


    
    

}