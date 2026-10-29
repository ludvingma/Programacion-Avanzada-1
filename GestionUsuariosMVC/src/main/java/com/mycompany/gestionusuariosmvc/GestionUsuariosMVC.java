/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestionusuariosmvc;

import Controlador.UsuarioController;
import Vista.UsuarioView;

/**
 *
 * @author holam
 */
public class GestionUsuariosMVC {

    public static void main(String[] args) {
        UsuarioView vista = new UsuarioView();
        UsuarioController controlador = new UsuarioController(vista);
        
        controlador.iniciar();
    }
}
