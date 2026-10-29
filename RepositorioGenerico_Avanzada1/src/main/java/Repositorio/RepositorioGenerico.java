/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositorio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


/**
 *
 * @author Eduardo
 */
public class RepositorioGenerico<T> {
    private List<T> ListaElementos = new ArrayList<>();
    private Map<String, T> MapaElementos = new HashMap<>();
    private Stack<T> HistorialOperaciones = new Stack<>();
    
    public void agregar(String clave, T elemento){
        ListaElementos.add(elemento);
        MapaElementos.put(clave, elemento);
        HistorialOperaciones.push(elemento);
    }
    
    public List<T> ObtenerTodos(){
        return Collections.unmodifiableList(ListaElementos);
    }
    
    public T buscarPorClave(String Clave){
        return MapaElementos.get(Clave);
    }
    
    public T deshacerUltimo(){
        if(!HistorialOperaciones.isEmpty()){
            T ultimo = HistorialOperaciones.pop();
            ListaElementos.remove(ultimo);
            return ultimo;
        }
        return null;
    }  
}
