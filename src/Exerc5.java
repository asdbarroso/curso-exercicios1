import java.util.Locale;
import java.util.Scanner;

public class Exerc5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		int codPeca1, codPeca2, quantPeca1, quantPeca2;
		double valorUnPeca1, valorUnPeca2, totalCompra;
		
		codPeca1 = sc.nextInt();
		quantPeca1 = sc.nextInt();
		valorUnPeca1 = sc.nextDouble();
		codPeca2 = sc.nextInt();
		quantPeca2 = sc.nextInt();
		valorUnPeca2 = sc.nextDouble();
		
		totalCompra = quantPeca1 * valorUnPeca1 + quantPeca2 * valorUnPeca2;
				
		System.out.printf("VALOR A PAGAR: R$ %.2f", totalCompra);
		
	}

}
