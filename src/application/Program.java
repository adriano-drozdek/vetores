package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de vezes que será digitado: ");
		int n = sc.nextInt();
		double[] vect = new double[n];

		System.out.println("Alturas: ");
		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}

		double soma = 0.0;

		for (int i = 0; i < n; i++) {
			soma += vect[i];
		}

		double avg = soma / n;

		System.out.printf("Média das alturas : %.2f%n ", avg);

		sc.close();
	}

}
