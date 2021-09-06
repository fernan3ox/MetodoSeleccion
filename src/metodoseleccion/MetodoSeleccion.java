/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoseleccion;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Fernandito
 */
public class MetodoSeleccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int asd[]={3,5,7,1,9,4,8,6,2};
        seleccion(asd);
        JOptionPane.showMessageDialog(null, Arrays.toString(asd));
    }
    
   private static void seleccion(int arreglo[]){
       
       for (int i = 0; i < arreglo.length; i++) {
           int maximo= i;
           for (int j = i+1; j < arreglo.length ; j++) {
               if (arreglo[j]>arreglo[maximo]) {
                   
                   maximo=j;
                   
               }
           }
           if (i!=maximo) {
               
               int aux=arreglo[i];
               arreglo[i]=arreglo[maximo];
               arreglo[maximo]=aux;
               
            }
           
       }
   }
}