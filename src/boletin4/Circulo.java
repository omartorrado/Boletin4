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
public class Circulo {
    
    private double radio;
    //lo declaramos final por ser una constante
    private final double PI=3.14;
    
    public Circulo(){
        radio=0;
    }
    
    public Circulo(double r){
        radio=r;
    }
    
    public void setRadio(double r){
        radio=r;
    }
    
    public double getRadio(){
        return radio;
    }
    
    public float calcularArea(){
        return (float)(Math.pow(radio,2)*PI);
    }
    
    public float calcularLongitud(){
        System.out.println(PI+" "+radio+" pi*radio= "+(PI*radio));
        return (float)(2*PI*radio);
    }
}
