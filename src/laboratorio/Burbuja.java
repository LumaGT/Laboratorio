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
        public class Burbuja implements Array {
    @Override
    public String array() {
        
      Scanner numero=new Scanner(System.in);
        int num;
        System.out.print("Metodo burbuja, ingrese el numero de elementos para el vector: ");
        num=numero.nextInt();
        Scanner ordenar = new Scanner(System.in);
        int vector[] = new int[30];
        int i,j,aux;
        for (i=0;i<num;i++)
        {
            System.out.print("Datos["+(i+1)+"]=");
            vector[i]=ordenar.nextInt();
        }
        for (i=0;i<num;i++)
        {
            for (j=i+1;j<num;j++)
            {
                if (vector[i]>vector[j])
                {
                    aux=vector[i];
                    vector[i]=vector[j];
                    vector[j]=aux;
                }
            }
        }
        System.out.print("Arreglo= {");
        for (i=0;i<num;i++)
        {
            System.out.print(vector[i]+ ", ");
        }
        System.out.print("}");
        return "Fin metodo burbuja";
    }

}