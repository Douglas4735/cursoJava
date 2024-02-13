package aulas_1_semana;

public class aula_01 {
	
	static int maiorIdadeGlobal = 30;
 
	public static void main(String[]args) {
		 
		 int maiorIdade = 18;
		 System.out.println("Valor variavel local = "+ maiorIdade );
		 
		 metodo2();
		 
	}
	
	public static void metodo2() {
		System.out.println("valor da variavel Global = " + maiorIdadeGlobal);
	}
}
