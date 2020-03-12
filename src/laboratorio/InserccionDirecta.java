/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio;

import java.util.Scanner;

/**
 *
 * @author Luma
 */
public class InserccionDirecta implements Array {
    @Override
    public String array() {
        Scanner numero= new Scanner(System.in);
        int num;
        System.out.print("Metodo insercion, ingrese el numero de elementos para el vector: ");
        num=numero.nextInt();
        System.out.println("Ingrese los datos del vector");        
        Scanner ordenar = new Scanner(System.in);
        int vector[] = new int[num];
        int aux,x,y;
        for (int i=0;i<num;i++)
        {
            System.out.print("A["+(i+1)+"]=");
            vector[i]=ordenar.nextInt();
        }
            for (x=1 ; x < vector.length; x++)
            {
                aux = vector[x];
                
                for (y = x-1; y >=0 && vector [y]>aux ; y --)
                {
                    vector[y+1] = vector [y];
                    vector [y] = aux;
                }
            }
            
            System.out.println("El nuevo vector es: ");
            System.out.print("Arreglo= {");
            for (int i=0; i<vector.length; i++)
            {    
               System.out.print(vector[i]+ ", ");
            }
            System.out.print("}");
       return "Fin metodo insercion";
    }
     }
    