package aulas_1_semana;

import java.io.LineNumberReader;

public class aula_08 {

	public static void main(String[] args) {
		// ESTRUTURA DE REPETIÇÃO WHILE
		
		int numero = 0;
		
		while (numero <= 3) {
			System.out.println("O Numero é : " + numero);
			numero++;
		}
		/*------------------------------------------*/
		int numero2 = 0;
		do { /* primeiro executa e depois verifica */
			
			System.out.println("O numero atual é : " +  numero2);
			numero2++;
			
		}while(numero2 <= 60);
	}

}
