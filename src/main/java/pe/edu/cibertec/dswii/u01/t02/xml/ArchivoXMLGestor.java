/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.u01.t02.xml;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import java.io.File;

/**
 *
 * @author italo
 */
public class ArchivoXMLGestor {
    public void escribirArchivo(String ruta, Object objeto) {
        try {
            JAXBContext context = JAXBContext.newInstance(objeto.getClass());
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(objeto, new File(ruta));
        } catch (JAXBException e) {
            e.printStackTrace();
            System.out.println("Error al escribir el archivo XML: " + e.getMessage());
        }
    }

    public Object leerArchivo(String ruta, Class<?> clase) {
        try {
            JAXBContext context = JAXBContext.newInstance(clase);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            return unmarshaller.unmarshal(new File(ruta));
        } catch (JAXBException e) {
            e.printStackTrace();
            System.out.println("Error al leer el archivo XML: " + e.getMessage());
        }
        return null;
    }
}