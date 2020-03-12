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
public class Selection implements Array{
   
    @Override
    public String array() {
             Scanner numero=new Scanner(System.in);

        int num;

        System.out.print("Ingrese el numero de elementos para el vector: ");

        num=numero.nextInt();

        int vector[] = new int[30];

        int aux;

        for (int i=0;i<num;i++)

        {
            System.out.print("Datos["+(i+1)+"]=");
            vector[i]=numero.nextInt();
        }
        for (int i = 0; i < num - 1; i++)
        {
               int min = i;
               for (int j = i + 1; j < num; j++)
               {
                       if (vector[j] < vector[min])
                       {
                               min = j;
                       }
               }
               if (i != min) 
               {
                       aux= vector[i];
                       vector[i] = vector[min];
                       vector[min] = aux;
               }
       }
       System.out.print("Arreglo= {");
        for (int i=0;i<num;i++)
        {
            System.out.print(vector[i]+ ", ");
        }
        System.out.print("}"); 
return "Fin metodo seleccion";
    }
    }

