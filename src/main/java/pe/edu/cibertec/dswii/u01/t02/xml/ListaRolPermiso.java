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
public class ListaRolPermiso {
  @XmlElement(name = "usuarioRol")
    private List<RolPermiso> rolPermisos;

    public ListaRolPermiso() {}

    public ListaRolPermiso(List<RolPermiso> rolPermisos) {
        this.rolPermisos = rolPermisos;
    
    }

    public List<RolPermiso> getRolPermisos() {
        return rolPermisos;
    }

    public void setRolPermisos(List<RolPermiso> rolPermisos) {
        this.rolPermisos = rolPermisos;
    }

   
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== Reporte de Roles y Permisos ===\n");
        for (RolPermiso rolPermiso : rolPermisos) {
            sb.append(rolPermiso).append("\n");
        }
        sb.append("===================================");
        return sb.toString();
    }

    
}