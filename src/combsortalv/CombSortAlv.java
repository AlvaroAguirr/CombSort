/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package combsortalv;

import Files.Archivos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class CombSortAlv {

public static void ImprimirArreglo(int[]arreglo){
    for(int undato: arreglo){
        System.out.println(undato);
    }     
}
    
    
    
    public static void main(String[] args) throws IOException {
// comb sort algorithm by Alvaro aguirre palestina From 4°A  of TIADSM 


    Archivos archivo = new Archivos();
    BufferedReader bufer= new BufferedReader(new InputStreamReader(System.in));
    String fileName;
    
    
    
    int[] arr;
    
        System.out.println("algoritmo de ordenanmiento comb sort");
        
        
        System.out.println("ingresa el nombre de tu archivo");
        fileName= bufer.readLine();
        
        
        arr=archivo.fileToInArray(fileName);
        System.out.println("Imprimimiendo arreglo original");
        ImprimirArreglo(arr);
        System.out.println("\n\n");
        
        
        

    }
    
}
