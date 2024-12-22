/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.u01.t02.archivosTexto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author italo
 */
public class ArchivoTextoGestorMain {
    
       public static void main(String[] args) {
        ArchivoTextoGestor archivoTextoGestor = new ArchivoTextoGestor();

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


       // Construcción del contenido del reporte
        StringBuilder contenido = new StringBuilder();
        contenido.append("==== REPORTE DE USUARIOS, ROLES Y PERMISOS ====").append("\n\n");

        contenido.append("Usuarios y Roles:\n");
        for (UsuarioRol usuarioRol : usuarioRoles) {
            contenido.append(usuarioRol).append("\n");
        }
        contenido.append("\n");

        contenido.append("Roles y Permisos:\n");
        for (RolPermiso rolPermiso : rolPermisos) {
            contenido.append(rolPermiso).append("\n");
        }
        contenido.append("\n");

        contenido.append("Lista de Usuarios:\n");
        for (Usuario usuario : usuarios) {
            contenido.append(usuario).append("\n");
        }
        contenido.append("\n");

        contenido.append("Lista de Roles:\n");
        for (Rol rol : roles) {
            contenido.append(rol).append("\n");
        }
        contenido.append("\n");

        contenido.append("Lista de Permisos:\n");
        for (Permiso permiso : permisos) {
            contenido.append(permiso).append("\n");
        }
        contenido.append("\n==== FIN DEL REPORTE ====");

        // Escritura del archivo
        String rutaCarpeta = "C:\\Users\\italo\\Downloads\\DSWII U01 T04 Archivos Flujos Serializacion";
        String rutaArchivo = "usuarios_y_roles_ordenado.txt";

        archivoTextoGestor.escribirArchivo(rutaCarpeta, rutaArchivo, contenido.toString());
        System.out.println("El archivo se escribió correctamente en... " + rutaCarpeta + " -> " + rutaArchivo);

        // Lectura del archivo
        String rutaArchivoLectura = rutaCarpeta + "\\usuarios_y_roles_ordenado.txt";
        String contenidoLeido = archivoTextoGestor.leerArchivoTexto(rutaArchivoLectura);
        System.out.println("------ Contenido Leído ------ ");
        System.out.println(contenidoLeido);
        System.out.println("------ Fin del Contenido Leído ------ ");
    }
}