/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.maincontacto;
import vista.VentanaContacto;
/**
 *
 * @author holam
 */
public class MainContacto {

    public static void main(String[] args) {
         java.awt.EventQueue.invokeLater(new Runnable(){
             public void run(){
                 new VentanaContacto().setVisible(true);
             }
         });
    }
}
