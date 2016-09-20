/**
 * Universidad Tecnologica del Norte de Guajanuato
 * Sistemas Informaticos
 * @author Alamilla Martínez Ana Cristina
 * No control 1215100704
 * OBJETIVO DEL PROGRAMA: Conocer el maximo común divisor
 */



public class Ejercicio_05 {
	
	static int uno (int numerouno, int numerodos){
		if(numerodos==0){
			return numerouno;
		}else{
			return uno(numerodos,numerouno%numerodos);
		}
	}
	
	public static void main (String args[]) {
		System.out.println(uno(8,12));
	}
}
