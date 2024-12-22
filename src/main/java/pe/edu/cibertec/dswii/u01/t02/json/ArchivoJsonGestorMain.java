/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.u01.t02.json;

import java.util.ArrayList;
import java.util.List;


public class ArchivoJsonGestorMain {
                   // Instancia del gestor de archivos JSON
   public static void main(String[] args) {

        // Creación de permisos
        Permiso permiso1 = new Permiso(1L, "Crear", "Permite crear recursos" );
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

   // Instanciamos el gestor de archivos JSON
        ArchivoJsonGestor archivoJsonGestor = new ArchivoJsonGestor();

        // Archivos de salida
        String rutaArchivoRolesUsuarios = "C:\\Users\\italo\\Downloads\\DSWII U01 T04 Archivos Flujos Serializacion\\rolesUsuarios.json";
        String rutaArchivoRolesPermisos = "C:\\Users\\italo\\Downloads\\DSWII U01 T04 Archivos Flujos Serializacion\\rolesPermisos.json";

        // Escribimos los archivos JSON
        archivoJsonGestor.escribirArchivo(rutaArchivoRolesUsuarios, usuarioRoles);
        archivoJsonGestor.escribirArchivo(rutaArchivoRolesPermisos, rolPermisos);

      
        // Lectura de los archivos JSON usando generics
        List<UsuarioRol> usuarioRolesLeidos = archivoJsonGestor.leerArchivo(rutaArchivoRolesUsuarios, List.class);
        List<RolPermiso> rolPermisosLeidos = archivoJsonGestor.leerArchivo(rutaArchivoRolesPermisos, List.class);

        // Impresión de los objetos leídos desde los archivos JSON
        System.out.println("Objetos leídos desde los archivos JSON:");
        System.out.println("Roles y Usuarios: " + usuarioRolesLeidos);
        System.out.println("Roles y Permisos: " + rolPermisosLeidos);
    }
       
    }
