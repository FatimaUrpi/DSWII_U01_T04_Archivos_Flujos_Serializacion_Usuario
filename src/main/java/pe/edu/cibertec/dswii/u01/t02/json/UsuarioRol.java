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
public class UsuarioRol {
     @Expose
     private Long idUsuarioRol;
     @Expose
    private Usuario idUsuario;  // Relación con Usuario
      @Expose
     private Rol id;  // Relación con Usuario
      @Expose
    private LocalDateTime fechaCreacion;
     @Expose
    private LocalDateTime fechaActualizacion;
      
    public UsuarioRol() {
    }

    public UsuarioRol(Long idUsuarioRol, Usuario idUsuario, Rol id) {
        this.idUsuarioRol = idUsuarioRol;
        this.idUsuario = idUsuario;
        this.id = id;
         this.fechaCreacion =  LocalDateTime.now();
        this.fechaActualizacion =  this.fechaCreacion;
    }

    public Long getIdUsuarioRol() {
        return idUsuarioRol;
    }

    public void setIdUsuarioRol(Long idUsuarioRol) {
        this.idUsuarioRol = idUsuarioRol;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Rol getId() {
        return id;
    }

    public void setId(Rol id) {
        this.id = id;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDateTime getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(LocalDateTime fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    @Override
    public String toString() {
        return "UsuarioRol{" + "idUsuarioRol=" + idUsuarioRol + ", idUsuario=" + idUsuario + ", id=" + id +'}';
    }

   
}
