/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.io.Serializable;
/**
 *
 * @author holam
 */
    
public class Empleado extends Persona {
    private double SalarioBase;
    private double Bono;
    
    //sera el miembro estatico que nos ayudara a contar las instancias globales creadas
    public static int ContadorEmpleados = 0;
    
    public Empleado(String ID, String Nombre, Direccion direccion, double SalarioBase, double bono){
        super(ID, Nombre, direccion); //llamada al constructor padre (persona)
        this.SalarioBase = SalarioBase;
        this.Bono = bono;
        ContadorEmpleados++;
    }
    
    @Override
    public double CalcularSalario(){
        return SalarioBase + Bono;
     }
    
    }
 