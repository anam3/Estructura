/**
 * UTNG -Sistemas Informaticos
 * @author Alamilla Martínez Ana Cristina
 * No control 1215100704
 * Conocer los numeros insertados en cadena 
 */

import java.util.Scanner;

public class Ejercicio_07 {

	static String palabra="";
	static int i=0;
	
	
	public static String entroNumero(int n){
		String numerito = String.valueOf(n);
		char entra = numerito.charAt(i);
		
		switch (entra) {
		case '0':
			palabra = palabra +"CERO ";
			break;

		case '1':
			palabra = palabra +"UNO ";
			break;
			
		case '2':
			palabra = palabra +"DOS ";
			break;
		
		case '3':
			palabra = palabra +"TRES ";
			break;
			
		case '4':
			palabra = palabra +"CUATRO ";
			break;
			
		case '5':
			palabra = palabra +"CINCO ";
			break;
			
		case '6':
			palabra = palabra +"SEIS ";
			break;
			
		case '7':
			palabra = palabra +"SIETE ";
			break;
			
		case '8':
			palabra = palabra +"OCHO ";
			break;
			
		case '9':
			palabra = palabra +"NUEVE ";
			break;
		
		}
		
		i++;
		if(i<numerito.length()){
			Ejercicio_07.entroNumero(n);
		}
		
		return palabra.toLowerCase();
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Ingrese un número entre 1 y 9999");
		int numero = teclado.nextInt();
		
		if (numero>0 && numero<10000){
			Ejercicio_07 obj = new Ejercicio_07();
			obj.entroNumero(numero);
			System.out.println(palabra);
		}else{
			System.out.println("Número invalido");
		}
	}
}
