import java.util.Locale;
import java.util.Scanner;

public class Exerc4 {
	public static void main(String[] args) {

		int numeroFunc;
		double horasTrabalhadas, valorHora, salarioFuncionario;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		numeroFunc = sc.nextInt();
		horasTrabalhadas = sc.nextDouble();
		valorHora = sc.nextDouble();

		salarioFuncionario = horasTrabalhadas * valorHora;

		System.out.println("NUMBER: " + numeroFunc);
		System.out.printf("SALARY = U$ %.2f", salarioFuncionario);

	}
}
