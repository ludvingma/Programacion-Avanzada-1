/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author holam
 */
public abstract class Persona{
    private String id;
    private String nombre;
    private Direccion direccion;
    
    public Persona (String ID, String Nombre, Direccion direccion){
        this.id = ID;
        this.nombre = Nombre;
        this.direccion = direccion;
        
    }
    
    public String GetId(){
        return id;
    }
    
    public String GetNombre(){
        return nombre;
    }
    
    public Direccion GetDireccion(){
        return direccion;
    }
    
    //Metodo abstracto creado para obligar a las subclases a implementar su calculo de sueldo
    
    public abstract double CalcularSalario();
    
    
}