/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.ArchivoDescarga;
import vista.DescargaForm;
/**
 *
 * @author holam
 */
public class DescargaController {
    public static void main(String[] args) {
        DescargaForm vista = new DescargaForm();
        
        vista.mostrarTitulo();
        
        ArchivoDescarga archivo1 = new ArchivoDescarga(
                "TareaJava.pdf",
                3,
                5
        );
        
        ArchivoDescarga archivo2 = new ArchivoDescarga(
                "ProyectoFinal.zip",
                6,
                4
        );
        
        ArchivoDescarga archivo3 = new ArchivoDescarga(
                "Imagen.jpg",
                2,
                5
        );
        
        Thread hilo1 = new Thread(archivo1);
        Thread hilo2 = new Thread(archivo2);
        Thread hilo3 = new Thread(archivo3);
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
        
        System.out.println("\nDescargas iniciadas...");
              
    }
 }
