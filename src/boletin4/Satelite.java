/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4;

/**
 *
 * @author otorradomiguez
 */
public class Satelite {
    
    private double meridiano,paralelo,distanciaTierra;
    
    //asignando todos los valores en la misma linea
    public Satelite(){
        meridiano = 0; paralelo=0; distanciaTierra=0;
    }
    
    public Satelite (double m, double p, double d){
        meridiano=m;
        paralelo=p;
        distanciaTierra=d;
    }
    //colocado en varias lineas para verlo entero
    public void verPosicion(){
        System.out.println("El satélite se encuantra en el paralelo "
                +paralelo+" meridiano "+meridiano+" a una distancia de la Tierra de "
                +distanciaTierra);
    }
    
}
