import java.util.Locale;
import java.util.Scanner;

public class Exerc6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double A, B, C, TRIAN, CIRC, TRAP, QUAD, RET;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		TRIAN = A * C / 2.0;
		CIRC = 3.14159 * C * C;
		TRAP = (A + B) / 2.0 * C;
		QUAD = B * B;
		RET = A * B;	
		
		System.out.printf("TRIANGULO: %.3f%n", TRIAN);
		System.out.printf("CIRCULO: %.3f%n", CIRC);
		System.out.printf("TRAPEZIO: %.3f%n", TRAP);
		System.out.printf("QUADRADO: %.3f%n", QUAD);
		System.out.printf("RETANGULO: %.3f%n", RET);
		
		
	}

}
