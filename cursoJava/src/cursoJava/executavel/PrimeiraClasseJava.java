package cursoJava.executavel;



import javax.swing.JOptionPane;

import POO.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
		
		/* new Aluno() é uma instancia (Criação de objeto)*/
		/* aluno1 é uma  referencia  para o objeto aluno*/
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual sua idade?");
		String DataNascimento = JOptionPane.showInputDialog("Data de nascimento?");
		String rg = JOptionPane.showInputDialog("Registro geral?");
		String cpf = JOptionPane.showInputDialog("CPF?");
		String mae = JOptionPane.showInputDialog("Nome da mãe?");
		String pai = JOptionPane.showInputDialog("Nome do pai?");
		String matricula = JOptionPane.showInputDialog("Matricula?");
		String serie = JOptionPane.showInputDialog("Qual a serie?");
		String nota1 = JOptionPane.showInputDialog("nota1");
		String nota2 = JOptionPane.showInputDialog("nota2");
		String nota3 = JOptionPane.showInputDialog("nota3");
		String nota4 = JOptionPane.showInputDialog("nota4");
		
		
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome(nome); 
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(DataNascimento);
		aluno1.setRegistroGerel(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(matricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));
		
		System.out.println("Nome aluno é: " + aluno1.getNome());
		System.out.println("Idade aluno é: " + aluno1.getIdade());
		System.out.println("Data de nascimento do aluno é: " + aluno1.getDataNascimento());
		System.out.println("RG do aluno é: " + aluno1.getRegistroGerel());
		System.out.println("CPF do aluno é: " + aluno1.getNumeroCpf());
		System.out.println("Nome da mãe aluno é: " + aluno1.getNomeMae());
		System.out.println("Nome do pai do aluno é: " + aluno1.getNomePai());
		System.out.println("Data da matricula do aluno é: " + aluno1.getDataMatricula());
		System.out.println("Serie do aluno é: " + aluno1.getSerieMatriculado());
		System.out.println("Média do aluno é : " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado());
		System.out.println("---------------------------------------------");
		
		/*
		Aluno aluno2 = new Aluno();
		aluno2.setNome("fernanda");
		aluno2.setIdade(25);
		aluno2.setNota1(70.0);
		aluno2.setNota2(65);
		aluno2.setNota3(80.0);
		aluno2.setNota4(70.0);
		
		
		
		System.out.println("Nome Aluno2: " + aluno2.getNome());
		System.out.println("Idade Aluno2 é : " + aluno2.getIdade());
		System.out.println("Média Aluno2 é : " + aluno2.getMediaNota());
		System.out.println("Resultado Aluno2 é : " +( aluno2.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		
		System.out.println("---------------------");
		
		Aluno aluno3 = new Aluno();
		aluno3.nome = "Ester";
		
		
		System.out.println("Aluno: " + aluno3.nome);
		
		
		System.out.println("---------------------");
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("josé", 50);*/
		
		
	}

}
