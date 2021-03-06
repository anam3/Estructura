/**
 * UTNG -Sistemas Informaticos
 * @author Alamilla Mart�nez Ana Cristina
 * No control 1215100704
 * Conocer los moviminetos que se deben realizar para jugar la torre
 */
public class Ejercicio_06 {

	private static int movimientos = 0;

	public static int mover(int n, char a, char b, char c) {
		if (n > 0) {
			mover(n - 1, a, c, b);
			System.out.println("mover disco " + a + " a " + c);
			movimientos++;
			mover(n - 1, b, a, c);
		}
		return movimientos;
	}
	
	public static void main(String[]args)
    {
     java.util.Scanner leer = new java.util.Scanner(System.in);
     int movimientos;
     System.out.println("Numero de discos: ");
     int n=leer.nextInt();
     movimientos = Ejercicio_06.mover(n, 'A', 'B', 'C');
     System.out.println("\nMovimientos efectuados: "+movimientos);
    }  

}
