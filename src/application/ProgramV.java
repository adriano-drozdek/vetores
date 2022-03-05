package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class ProgramV {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a quantidade de produtos: ");
		int n = sc.nextInt();
		Produto[] vect = new Produto[n];

		for (int i = 0; i < n; i++) {

			sc.nextLine();
			System.out.println("Produto: ");
			String nome = sc.nextLine();

			System.out.println("Valor: ");
			double preco = sc.nextDouble();

			vect[i] = new Produto(nome, preco);
		}

		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			soma += vect[i].getPreco();
		}

		
		double media = soma / n;

		System.out.printf("Média dos valores: %.2f%n", media);

		sc.close();
	}

}
