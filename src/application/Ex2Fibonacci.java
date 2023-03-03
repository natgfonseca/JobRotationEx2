package application;

import java.util.Scanner;

public class Ex2Fibonacci {

	public static void main(String[] args) {
		// Exercicio 2: "informado um n�mero, ele calcule a sequ�ncia de Fibonacci e retorne uma mensagem 
		// avisando se o n�mero informado pertence ou n�o a sequ�ncia."

		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um numero:");
		int num = entrada.nextInt();

		int ant1 = 0, ant2 = 1, prox = 0;
		System.out.print(ant1+", "+ant2);
		boolean achou = false;
		while (prox <= num ){
			prox = ant1 + ant2;
			System.out.print(", "+prox); 
			if (prox == num){
				achou = true;
			}
			ant1 = ant2;
			ant2 = prox;
		}
		System.out.println();
		if (achou){
			System.out.println("O numero informado pertence a sequencia de Fibonacci");
		}else{
			System.out.println("O numero informado NAO pertence a sequencia de Fibonacci");
		}
	}
}


