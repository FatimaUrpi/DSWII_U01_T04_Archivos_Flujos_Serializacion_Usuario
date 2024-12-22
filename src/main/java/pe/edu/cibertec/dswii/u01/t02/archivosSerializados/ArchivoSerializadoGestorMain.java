/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.u01.t02.archivosSerializados;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author italo
 */
public class ArchivoSerializadoGestorMain {
      public static void main(String[] args) {
       // Creación de permisos
        Permiso permiso1 = new Permiso(1L, "Crear", "Permite crear recursos");
        Permiso permiso2 = new Permiso(2L, "Leer", "Permite leer recursos");

        // Creación de roles
        Rol rolAdmin = new Rol(1L, "Administrador", "Rol con todos los permisos");
        Rol rolUsuario = new Rol(2L, "Usuario", "Rol con permisos limitados");

        // Creación de usuarios
        Usuario usuario1 = new Usuario(1L, "juan", "password123", "juan@correo.com", true);
        Usuario usuario2 = new Usuario(2L, "maria", "password456", "maria@correo.com", true);

        // Creación de relaciones entre rol y permiso
        RolPermiso rolPermisoAdmin = new RolPermiso(1L, rolAdmin, permiso1);
        RolPermiso rolPermisoUsuario = new RolPermiso(2L, rolUsuario, permiso2);

        // Creación de relaciones entre usuario y rol
        UsuarioRol usuarioRol1 = new UsuarioRol(1L, usuario1, rolAdmin);
        UsuarioRol usuarioRol2 = new UsuarioRol(2L, usuario2, rolUsuario);

        // Listas para almacenar todos los objetos
        List<Permiso> permisos = new ArrayList<>();
        permisos.add(permiso1);
        permisos.add(permiso2);

        List<Rol> roles = new ArrayList<>();
        roles.add(rolAdmin);
        roles.add(rolUsuario);

        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(usuario1);
        usuarios.add(usuario2);

        List<RolPermiso> rolPermisos = new ArrayList<>();
        rolPermisos.add(rolPermisoAdmin);
        rolPermisos.add(rolPermisoUsuario);

        List<UsuarioRol> usuarioRoles = new ArrayList<>();
        usuarioRoles.add(usuarioRol1);
        usuarioRoles.add(usuarioRol2);


             // Serializar el archivo
        ArchivoSerializadoGestor archivoGestor = new ArchivoSerializadoGestor();
        String rutaCarpeta = "C:\\Users\\italo\\Downloads\\DSWII U01 T04 Archivos Flujos Serializacion";
        String nombreArchivo = "usuarios_y_roles.dat";

        // Crear un arreglo de objetos para serializar
        Object[] objetos = {permisos, roles, usuarios, rolPermisos, usuarioRoles};
        archivoGestor.serializarArchivo(rutaCarpeta, nombreArchivo, objetos);
        System.out.println("El archivo de datos se escribió correctamente en... " + rutaCarpeta + " -> " + nombreArchivo);

        // Deserializar el archivo
        String rutaCompleta = rutaCarpeta + "\\" + nombreArchivo;
        Object[] objetosLeidos = (Object[]) archivoGestor.deserializarArchivo(rutaCompleta);

        // Mostrar los datos deserializados de manera estructurada
        System.out.println("------ Reporte de Objetos Leídos ------ ");
        for (Object obj : objetosLeidos) {
            if (obj instanceof List<?>) {
                List<?> lista = (List<?>) obj;
                if (!lista.isEmpty()) {
                    Object elemento = lista.get(0);
                    if (elemento instanceof Usuario) {
                        System.out.println("Usuarios:");
                        for (Usuario u : (List<Usuario>) lista) {
                            System.out.println("  ID: " + u.getIdUsuario());
                            System.out.println("  Nombre: " + u.getNombreUsuario());
                            System.out.println("  Correo: " + u.getEmail());
                            System.out.println("  Activo: " + (u.getActivo() ? "Sí" : "No"));
                            System.out.println("---------------------------");
                        }
                    } else if (elemento instanceof Rol) {
                        System.out.println("Roles:");
                        for (Rol r : (List<Rol>) lista) {
                            System.out.println("  ID: " + r.getId());
                            System.out.println("  Nombre: " + r.getDescripcion());
                            System.out.println("---------------------------");
                        }
                    } else if (elemento instanceof Permiso) {
                        System.out.println("Permisos:");
                        for (Permiso p : (List<Permiso>) lista) {
                            System.out.println("  ID: " + p.getIdPermiso());
                            System.out.println("  Nombre: " + p.getNombre());
                            System.out.println("  Descripción: " + p.getDescripcion());
                            System.out.println("---------------------------");
                        }
                    } else if (elemento instanceof UsuarioRol) {
                        System.out.println("Relaciones Usuario-Rol:");
                        for (UsuarioRol ur : (List<UsuarioRol>) lista) {
                            System.out.println("  Usuario: " + ur.getIdUsuario().getNombreUsuario());
                            System.out.println("  Rol: " + ur.getId().getDescripcion());
                            System.out.println("---------------------------");
                        }
                    } else if (elemento instanceof RolPermiso) {
                        System.out.println("Relaciones Rol-Permiso:");
                        for (RolPermiso rp : (List<RolPermiso>) lista) {
                            System.out.println("  Rol: " + rp.getId().getDescripcion());
                            System.out.println("  Permiso: " + rp.getIdPermiso().getNombre());
                            System.out.println("---------------------------");
                        }
                    }
                }
            }
        }
        System.out.println("------ Fin del Reporte ------ ");
    }
}
