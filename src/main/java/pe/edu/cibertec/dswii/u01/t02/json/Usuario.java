/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.u01.t02.json;


import com.google.gson.annotations.Expose;
import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author italo
 */
public class Usuario {
     @Expose
     private Long idUsuario;
     @Expose
    private String nombreUsuario;
     @Expose
    private String contrasena;
     @Expose
    private String email;
     @Expose
    private Boolean activo;
     @Expose
    private LocalDateTime fechaCreacion;
     @Expose
    private LocalDateTime fechaActualizacion;


    public Usuario() {
    }

    public Usuario(Long idUsuario, String nombreUsuario, String contrasena, String email, Boolean activo) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.email = email;
        this.activo = activo;
        this.fechaCreacion =  LocalDateTime.now();
        this.fechaActualizacion =  this.fechaCreacion;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
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
        return "Usuario{" + "idUsuario=" + idUsuario + ", nombreUsuario=" + nombreUsuario + ", contrasena=" + contrasena + ", email=" + email + ", activo=" + activo + '}';
    }

   

     

   
}
