/**
 * UTNG -Sistemas Informaticos
 * @author Alamilla Martínez Ana Cristina
 * No control 1215100704
 * Conocer el dato mayor de un arreglo de números
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Ejercicio_08 {

	
		   static int [] numeros={8,27,78,49,16,34,56};
		    int i=0;
		     static int may =numeros[0];
		   
		   public void datomayor(int arreglo[]){		         
		          if(i<numeros.length){
		       if(arreglo[i]>may){
		               may=arreglo[i];
		           }
		       i++;
		              datomayor(arreglo);
		       
		          }
		   }
		   
		    public static void main(String[] args) {
		      Ejercicio_08 obj= new Ejercicio_08();
		     obj.datomayor(numeros);
		        System.out.println("El may es "+ may);
		    }
		    
		
}
