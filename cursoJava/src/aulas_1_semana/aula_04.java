package aulas_1_semana;

public class aula_04 {
	public static void main(String[]args) {
		
		int nota1 = 70;
		int nota2 = 60;
		int nota3 = 90;
		int nota4 = 90;
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		/*
		if (mediaAluno >= 70 && nome.equals("douglas")) {
			System.out.println("Parabens vc está aprovado");
		}else if (mediaAluno < 70) {
			System.out.println("vc está reprovado");
		}else {
			 System.out.println("Aluno não encontrado");
		}
		*/
		//Operadores ternários
		
		String saidaResultado = media >= 70 ? "aluno Aprovado" : "Aluno reprovado";
		
		System.out.println(saidaResultado);
	}

}
