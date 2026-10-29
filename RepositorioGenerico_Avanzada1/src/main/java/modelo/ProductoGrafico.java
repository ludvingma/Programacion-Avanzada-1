/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.*;

/**
 *
 * @author Eduardo
 */
public class ProductoGrafico {
    private String nombre;
    private double ValorVentas;

    public ProductoGrafico(String nombre, double ValorVentas) {
        this.nombre = nombre;
        this.ValorVentas = ValorVentas;
    }
    
    public String getNombre() {
        return nombre;
    }

    public double getValorVentas() {
        return ValorVentas;
    }
    
    
}
