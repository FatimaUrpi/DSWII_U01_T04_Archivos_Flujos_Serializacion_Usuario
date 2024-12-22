/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.u01.t02.xml;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 *
 * @author italo
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ListaUsuarioRol {
      @XmlElement(name = "usuarioRol")
    private List<UsuarioRol> usuarioRoles;

    public ListaUsuarioRol() {}

    public ListaUsuarioRol(List<UsuarioRol> usuarioRoles) {
        this.usuarioRoles = usuarioRoles;
    
    }

    public List<UsuarioRol> getUsuarioRoles() {
        return usuarioRoles;
    }

    public void setUsuarioRoles(List<UsuarioRol> usuarioRoles) {
        this.usuarioRoles = usuarioRoles;
    }

     @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== Reporte de Usuarios y Roles ===\n");
        for (UsuarioRol usuarioRol : usuarioRoles) {
            sb.append(usuarioRol).append("\n");
        }
        sb.append("===================================");
        return sb.toString();
    }

    
}
