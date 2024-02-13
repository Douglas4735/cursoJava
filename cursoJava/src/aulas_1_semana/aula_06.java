package aulas_1_semana;

public class aula_06 {
	public static void main(String[]args) {
		
		/*SWITCH CASE: OPERAÇÃO EXATAS*/
		int dia = 1;
		switch (dia) {
		case 1:
			System.out.println("domingo");
			break;
		case 2:
			System.out.println("segunda-feira");
			break;
		case 3:
			System.out.println("terça-feira");
			break;
		case 4:
			System.out.println("quarta-feira");
			break;
		case 5:
			System.out.println("quinta-feira");
			break;
		case 6:
			System.out.println("sexta-feira");
			break;
		case 7:
			System.out.println("sabado");
			break;
		default:
			System.out.println("Outro dia qualquer.");
			break; 
		}
	}

}
