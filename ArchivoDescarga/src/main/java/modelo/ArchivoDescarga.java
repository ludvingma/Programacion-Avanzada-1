/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import excepciones.TiempoExcedidoException;
/**
 *
 * @author holam
 */
public class ArchivoDescarga implements Runnable{
    
    private String nombreArchivo;
    private int tiempoDescarga;
    private int tiempolimite;
    
    public ArchivoDescarga(String nombreArchivo, int tiempoDescarga, int tiempolimite ){
        this.nombreArchivo = nombreArchivo;
        this.tiempoDescarga = tiempoDescarga;
        this.tiempolimite = tiempolimite;
        
    }
    
    @Override
    public void run(){
        try {
            System.out.println("Descargando archivo: "+ nombreArchivo);
            
            Thread.sleep(tiempoDescarga * 1000);
            
            if (tiempoDescarga > tiempolimite){
                throw new TiempoExcedidoException("Tiempo excedido para:"+ nombreArchivo);
            }
            System.out.println("Descarga completada correctamente");
        } catch(InterruptedException e){
            System.out.println("La descarga fue interrumpida");
        } catch (TiempoExcedidoException e){
            System.out.println(e.getMessage());
        }
    }
    public String getNombreArchivo(){
        return nombreArchivo;
    }
}
