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
public class RolPermiso implements Serializable {
    
 
    private Long idRolPermiso;
    private Rol id;
    private Permiso idPermiso;   // Relación con Permiso  
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaActualizacion;
     

    public RolPermiso() {
    }

    public RolPermiso(Long idRolPermiso, Rol id, Permiso idPermiso) {
        this.idRolPermiso = idRolPermiso;
        this.id = id;
        this.idPermiso = idPermiso;
         this.fechaCreacion =  LocalDateTime.now();
        this.fechaActualizacion =  this.fechaCreacion;

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

   

     @Override
    public String toString() {
        return "RolPermiso{" + 
                "| idRolPermiso ="+  idRolPermiso +
                "| idRol ="+  idRolPermiso +
               " | idPermiso =" + idPermiso +
                "| FechaCreacion =" + fechaCreacion +
               "| FechaActualizacion =" + fechaActualizacion +
                 '}';

    }
}
