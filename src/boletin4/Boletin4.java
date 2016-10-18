/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4;

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author otorradomiguez
 */
public class Boletin4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ejercicio=Integer.parseInt(JOptionPane.showInputDialog("Elije que "
                + "ejercicio quieres ejecutar\n1: 4.1 Clase coche "
                + "\n2: 4.2 Clase Satelite \n3: 4.3 Clase Circulo "
                + "\n4: 4.4 Clase Restaurante"));
        //selector de ejercicio
        switch (ejercicio){
        case 1: 
            Coche coche1 = new Coche();
            System.out.println(coche1.getVelocidad());
            coche1.acelerar(110);
            System.out.println(coche1.getVelocidad());
            coche1.acelerar(50);
            System.out.println(coche1.getVelocidad());
            coche1.frenar(100);
            System.out.println(coche1.getVelocidad());
            break;
        case 2:
            //Ejercicio 2
            Satelite s1= new Satelite();
            s1.verPosicion();
            Satelite s2=new Satelite(21.45,31.87,1958746);
            s2.verPosicion();
            break;
        case 3:
            //ejercicio 3
            Circulo c1=new Circulo();
            System.out.println("el radio es "+c1.getRadio());
            c1.setRadio(Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor del radio del circulo")));
            System.out.println("la longitud es de "+c1.calcularLongitud());
            System.out.println("el area es de "+c1.calcularArea());
            Circulo c2 = new Circulo(10);
            System.out.println(c2.calcularArea());
            System.out.println(c2.calcularLongitud());
            break;
        case 4:
            //ejercicio 4
            Restaurante rest1=new Restaurante(100,50);
            Scanner sc1=new Scanner(System.in);
            rest1.get_comensales();
            rest1.añadir_pulpo(sc1.nextInt());
            rest1.get_comensales();
            rest1.añadir_patatas(sc1.nextInt());
            rest1.get_comensales(); 
            rest1.ver_patatas();
            break;
        default: 
            System.out.println("Ese ejercicio no existe");
            break;
        
    }
    }
    
}
