/**
 * UTNG -Sistemas Informaticos
 * @author Alamilla Martínez Ana Cristina
 * No control 1215100704
 * Conocer el sueldo de los empleados 
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Ejercicio_03 {

	public static void main(String[] args) {
        String[] empleados=new String [10];// Arreglo nombre de empleado 
        String nombreMayor = null;// Nombre con mayor horas trabajadas 
        String nombreMenor = null;//Nombre de empleados con menor horas 
        String []nomPromedio=new String [10];
        double menor=1000222;
        double [] hora=new double[10];
        String  categoria = null;
        double [] sueldo=new double[10];
        int trabajadores;
        double mayor=0;
        
        
        double horasMaximas=0;
        String nombreHoraMax = null;
        double horasMinimas=5962;
        String nombreHoraMin = null;
        double pago = 0;
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        int i;
        
        for ( i = 0; i < 10; i++) {
        	System.out.println("Nombre del empleado  ");
        	empleados[i]=teclado.next();
        	
             System.out.println("Categoria ");
             categoria=teclado.next();
             
             System.out.println("Horas trabajadas ");
             hora[i]=teclado.nextDouble();
             
             if(categoria.equalsIgnoreCase("A")){
                 sueldo[i]=hora[i]*150;
             }
             if(categoria.equalsIgnoreCase("B")){
                  sueldo[i]=hora[i]*250;
             }
             if(categoria.equalsIgnoreCase("C")){
                  sueldo[i]=hora[i]*500;
             }
             
             if(sueldo[i]>=mayor){
                 mayor=sueldo[i];
                 nombreMayor=empleados[i];
             }
             if(sueldo[i]<=menor){
                 menor=sueldo[i];
                 nombreMenor=empleados[i];
             }
             if(hora[i]>=horasMaximas){
                 horasMaximas=hora[i];
                 nombreHoraMax=empleados[i];
             }
             if(hora[i]<=horasMinimas){
                 horasMinimas=hora[i];
                 nombreHoraMin=empleados[i];
             }
             
            pago=pago+sueldo[i];
            nomPromedio=empleados;
        }
        double promedio=pago/i;
        String nomPromedioMayor=null,nomProMenor=null;
        
        for (int j = 0; j < 10; j++) {
            if(sueldo[j]>=promedio){
                nomPromedioMayor=nomPromedio[j];
            }
             if(sueldo[j]<promedio){
                nomProMenor=nomPromedio[j];
            }
            
        }
      
        
        System.out.println("Empleado con mayor horas trabajadas "+nombreHoraMax +", número de horas son "+ horasMaximas);
        System.out.println("Empleado con menor horas trabajadas "+nombreHoraMin+",  número de horas son  "+ horasMinimas);
        
        System.out.println();
        
        System.out.println("Empleado que gana igual o más que el promedio "+ nomPromedioMayor);
        System.out.println("Empleado que gana menos que el promedio "+nomProMenor);
        
        System.out.println();
        
        System.out.println("Sueldo promedio semanal "+promedio);
        
        System.out.println();
        
        System.out.println("Sueldo mayor "+mayor + " pertenece a "+nombreMayor);
        System.out.println("Sueldo menor "+menor+" pertenece a "+nombreMenor);
        System.out.println("Sueldo promedio semanal "+promedio);
       
    }
    
}