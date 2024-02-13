package cursoJava.executavel;



import POO.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
		
		/* new Aluno() é uma instancia (Criação de objeto)*/
		/* aluno1 é uma  referencia  para o objeto aluno*/
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome("Douglas"); 
		aluno1.setIdade(33);
		aluno1.setDataNascimento("20/01/91");
		aluno1.setRegistroGerel("0122.302-92");
		aluno1.setNumeroCpf("001.202.193-81");
		aluno1.setNomeMae("Edina");
		aluno1.setNomePai("Davi");
		aluno1.setDataMatricula("10/11/22");
		aluno1.setSerieMatriculado("5");
		
		System.out.println("Nome aluno é: " + aluno1.getNome());
		System.out.println("Idade aluno é: " + aluno1.getIdade());
		System.out.println("Nome aluno é: " + aluno1.getDataNascimento());
		System.out.println("Nome aluno é: " + aluno1.getRegistroGerel());
		System.out.println("Nome aluno é: " + aluno1.getNumeroCpf());
		System.out.println("Nome aluno é: " + aluno1.getNomeMae());
		System.out.println("Nome aluno é: " + aluno1.getNomePai());
		System.out.println("Nome aluno é: " + aluno1.getDataMatricula());
		System.out.println("Nome aluno é: " + aluno1.getSerieMatriculado());
		
		System.out.println("---------------------------------------------");
		
		/*Aluno aluno2 = new Aluno();
		aluno2.nome = "fernanda";
		
		
		System.out.println("Aluno: " + aluno2.nome);
		
		System.out.println("---------------------");
		
		Aluno aluno3 = new Aluno();
		aluno3.nome = "Ester";
		
		
		System.out.println("Aluno: " + aluno3.nome);
		
		
		System.out.println("---------------------");
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("josé", 50);*/
		
		
	}

}
