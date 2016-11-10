/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_6;

/**
 *
 * @author erodriguez-lepinamartinez
 */
public class Boletin9_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int [] sueldos = {900, 700, -30000, 1000,1200,1750,500,5000,23000,};
       int masmil=0, negativo=0, menosmil=0;
       int trabajadores=0, porcentaje=0;
       
       for(int i=0; i<sueldos.length;i++){
        if(sueldos[i]>=1000 && sueldos[i]<=1750){
            masmil++;
        }
        else if(sueldos[i]<0){
            negativo++;
        }
        else
            menosmil++;
        }
       
       trabajadores = masmil + negativo + menosmil;
       porcentaje =(menosmil*100)/trabajadores;
       
        System.out.println("Los trabajadores que ganan entre 1000 y 1750 son: " +masmil+ ", y su porcentaje es: " +trabajadores +" %.");
       
    }
    
    
}
