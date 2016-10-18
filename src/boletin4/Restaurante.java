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
public class Restaurante {
    //atributos
    private int kg_pulpo=0,kg_patatas=0;
    
    //Constructor
    public Restaurante(){
        
    }
    
    public Restaurante(int a,int b){
        kg_pulpo=a;kg_patatas=b;
        
    }
    //Metodos
    public int get_comensales(){
        int pers_pulpo=(kg_pulpo/2)*3;
        int pers_patatas=(kg_patatas/1)*3;
        if(pers_pulpo<pers_patatas){
            System.out.println("Hay suficiente materia prima para "+pers_pulpo+" personas");
            return pers_pulpo;
            } else{
            System.out.println("Hay suficiente materia prima para "+pers_patatas+" personas");
            return pers_patatas;
        }
        
    }
    
    public void añadir_pulpo(int a){
        kg_pulpo=kg_pulpo+a;
    }
    
    public void añadir_patatas(int a){
        kg_patatas=kg_patatas+a;
    }
    
    public void ver_pulpo(){
        System.out.println(kg_pulpo+"Kg de pulpo");
    }
    
    public void ver_patatas(){
        System.out.println(kg_patatas+"Kg de patatas");
    }
}
