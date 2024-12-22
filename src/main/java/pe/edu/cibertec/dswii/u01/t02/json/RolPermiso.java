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
public class RolPermiso{
     @Expose
     private Long idRolPermiso;
      @Expose
    private Rol id;
      @Expose                                  // Relación con Rol
    private Permiso idPermiso;   // Relación con Permiso  
      @Expose
    private LocalDateTime fechaCreacion;
     @Expose
    private LocalDateTime fechaActualización;
     
    public RolPermiso() {
    }

    public RolPermiso(Long idRolPermiso, Rol id, Permiso idPermiso) {
        this.idRolPermiso = idRolPermiso;
        this.id = id;
        this.idPermiso = idPermiso;
        this.fechaCreacion =  LocalDateTime.now();
        this.fechaActualización =  this.fechaCreacion;
    }

    public Long getIdRolPermiso() {
        return idRolPermiso;
    }

    public void setIdRolPermiso(Long idRolPermiso) {
        this.idRolPermiso = idRolPermiso;
    }

    public Rol getId() {
        return id;
    }

    public void setId(Rol id) {
        this.id = id;
    }

    public Permiso getIdPermiso() {
        return idPermiso;
    }

    public void setIdPermiso(Permiso idPermiso) {
        this.idPermiso = idPermiso;
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
        return "RolPermiso{" + "idRolPermiso=" + idRolPermiso + ", id=" + id + ", idPermiso=" + idPermiso + '}';
    }

  

   

  
}
