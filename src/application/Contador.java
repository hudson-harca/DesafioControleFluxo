package application;

import java.util.Scanner;

import exception.ParametrosInvalidosException;

public class Contador {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro parâmetro: ");
		int parametroUm = sc.nextInt();
		System.out.print("Digite o segundo parâmetro: ");
		int parametroDois = sc.nextInt();
		
			try {
				contar(parametroUm, parametroDois);
			} catch (ParametrosInvalidosException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}

		sc.close();

	}
	
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		//validar se parametroUm é maior que parametroDois e lançar a exceção
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		} else {
			int contagem = parametroDois - parametroUm;
			//realizar o for para imprimir os números com base na variável contagem
			for (int i = 1; i <= contagem; i++) {
				System.out.println("Imprimindo o número :" + i);
			}	
		}
		
	}

}
