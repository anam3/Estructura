/**
 * UTNG -Sistemas Informaticos
 * @author Alamilla Martínez Ana Cristina
 * No control 1215100704
 * OBJETIVO DEL PROGRAMA: MÉTODOS DE RECURSIVIDAD
 */

public class Ejercicio_04 {
	static int factorial (int numero){
		if (numero <=1){
			return 1;
		}else {
			return numero * factorial(numero - 1);
		}
	}
	
	//método para contar de 1 ...N
	static int inicial = 1;
	static void cuentaHasta(int n){
		if(inicial<=n){
			System.out.println(inicial);
			inicial++;
			cuentaHasta(n);
		}
	}
	
	//método para cuenta regresiva a partir de N a 1
	static void cuentaHastaa(int n){
		if(n>=0){
			System.out.println(n);
			n--;
			cuentaHastaa(n);
		}
	}
	
	public static void main (String args[]) {
		//System.out.println(factorial(4));
		//cuentaHasta(10);
		cuentaHastaa(10);
	}
}
