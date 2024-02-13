package aulas_1_semana;

public class aula_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for (int numero = 0; numero <= 10; numero++) {
			if(numero == 3 || numero == 6 || numero == 9)
				System.out.println("Obaaa, encontrei o numero " + numero);
			continue;
		}
		System.out.println("processando laço de repetição");
	}

}
