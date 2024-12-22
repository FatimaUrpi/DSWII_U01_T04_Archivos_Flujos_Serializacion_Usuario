/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.u01.t02.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

/**
 *
 * @author italo
 */
public class ArchivoJsonGestor {
  
    private final Gson gson;

    /**
     * Constructor que configura Gson con un adaptador para LocalDateTime.
     */
    public ArchivoJsonGestor() {
        this.gson = new GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation()
                .setPrettyPrinting()
                .registerTypeAdapter(LocalDateTime.class, new LocalDateTimeAdapter())
                .create();
    }

    /**
     * Método que permite escribir un archivo JSON.
     *
     * @param ruta      Ruta del archivo donde se guardará el JSON.
     * @param contenido El objeto que será convertido y escrito como JSON.
     */
    public void escribirArchivo(String ruta, Object contenido) {
        if (ruta == null || ruta.isBlank()) {
            throw new IllegalArgumentException("La ruta no puede estar vacía.");
        }
        if (contenido == null) {
            throw new IllegalArgumentException("El contenido no puede ser nulo.");
        }

        try (FileWriter archivo = new FileWriter(ruta);
             PrintWriter print = new PrintWriter(archivo)) {
            // Conversión de objeto a JSON (String).
            String json = gson.toJson(contenido);
            print.print(json);
        } catch (IOException ex) {
            throw new RuntimeException("Error al escribir el archivo JSON en la ruta: " + ruta, ex);
        }
    }

    /**
     * Método que permite leer un archivo JSON.
     *
     * @param ruta        Ruta del archivo desde donde se obtendrá el JSON.
     * @param claseObjeto Clase del objeto esperado al deserializar el JSON.
     * @param <T>         Tipo genérico del objeto esperado.
     * @return Objeto leído y deserializado del JSON.
     */
    public <T> T leerArchivo(String ruta, Class<T> claseObjeto) {
        if (ruta == null || ruta.isBlank()) {
            throw new IllegalArgumentException("La ruta no puede estar vacía.");
        }
        if (claseObjeto == null) {
            throw new IllegalArgumentException("La clase del objeto no puede ser nula.");
        }

        File refArchivo = new File(ruta);
        if (!refArchivo.exists()) {
            throw new RuntimeException("El archivo no existe en la ruta: " + ruta);
        }

        try (FileReader fileReader = new FileReader(refArchivo)) {
            // Conversión de JSON a objeto.
            return gson.fromJson(fileReader, claseObjeto);
        } catch (FileNotFoundException ex) {
            throw new RuntimeException("Archivo no encontrado en la ruta: " + ruta, ex);
        } catch (IOException ex) {
            throw new RuntimeException("Error al leer el archivo JSON en la ruta: " + ruta, ex);
        }
    }
}