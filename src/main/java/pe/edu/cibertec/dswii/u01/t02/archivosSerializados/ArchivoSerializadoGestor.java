/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.u01.t02.archivosSerializados;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author italo
 */
public class ArchivoSerializadoGestor {
    public void serializarArchivo(String rutaCarpeta, String nombreArchivo, Serializable objeto) {
        File archivoSerializar = new File(rutaCarpeta, nombreArchivo);
        try (FileOutputStream flujoEscritura = new FileOutputStream(archivoSerializar); 
             ObjectOutputStream serializador = new ObjectOutputStream(flujoEscritura)) {
            serializador.writeObject(objeto);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Object deserializarArchivo(String rutaCompleta) {
        Object objetoLeido = null;
        File archivoDeserializar = new File(rutaCompleta);
        try (FileInputStream flujoLectura = new FileInputStream(archivoDeserializar);
             ObjectInputStream deserializador = new ObjectInputStream(flujoLectura)) {
            objetoLeido = deserializador.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return objetoLeido;
    }
}
