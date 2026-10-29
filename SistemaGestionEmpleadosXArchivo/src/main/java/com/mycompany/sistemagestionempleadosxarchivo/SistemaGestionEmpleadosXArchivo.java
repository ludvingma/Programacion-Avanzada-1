/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemagestionempleadosxarchivo;

import controlador.EmpleadoController;
import java.util.ArrayList;

/**
 *
 * @author holam
 */
public class SistemaGestionEmpleadosXArchivo {

    public static void main(String[] args) {
        EmpleadoController controller = new EmpleadoController();
        
        boolean exito1 = controller.registrarEmpleado("EMP01", "Alexander Maradiaga", "Tegucigalpa", "Col. Palmira", 15000, 2500);
        boolean exito2 = controller.registrarEmpleado("EMP02", "Mario Lopez", "San Pedro Sula", "Barrio Guamilito", 10000, 3000);
        
        if(exito1 && exito2){
            System.out.println("\n Lista de Empleados en Archivo");
            ArrayList <String> empleados = controller.ListarEmpleados();
            for (String emp: empleados){
                System.out.println(emp);
            }
            
        }
    }
}
