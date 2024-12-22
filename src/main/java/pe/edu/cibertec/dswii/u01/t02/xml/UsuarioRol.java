/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.u01.t02.xml;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 * @author italo
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.PROPERTY) // trabaja a nivel getters
public class UsuarioRol implements Serializable {
   
     private Long idUsuarioRol;
    private Usuario idUsuario;  // Relación con Usuario
     private Rol id;  // Relación con Usuario
    private LocalDateTime fechaCreacion;
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
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    public LocalDateTime getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(LocalDateTime fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

 /*   @Override
    public String toString() {
        return "UsuarioRol{" + "idUsuarioRol=" + idUsuarioRol + ", idUsuario=" + idUsuario + ", id=" + id + ", fechaCreacion=" + fechaCreacion + ", fechaActualizacion=" + fechaActualizacion + '}';
    }*/

    
      @Override
    public String toString() {
        return "UsuarioRol{" + "Id Usuario: " + idUsuario +
               " |Id Rol: " + id+
               " | Fecha de creación: " + fechaCreacion +
                " | Fecha de Actualización: " + fechaActualizacion;
    }
    
}
