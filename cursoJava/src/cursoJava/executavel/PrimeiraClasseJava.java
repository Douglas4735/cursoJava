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
		String escola = JOptionPane.showInputDialog("Nome Escola?");
		
		String disciplina1 = JOptionPane.showInputDialog("Disciplina1?");
		String nota1 = JOptionPane.showInputDialog("nota1");
		
		String disciplina2 = JOptionPane.showInputDialog("Disciplina2?");
		String nota2 = JOptionPane.showInputDialog("nota2");
		
		String disciplina3 = JOptionPane.showInputDialog("Disciplina3?");
		String nota3 = JOptionPane.showInputDialog("nota3");
		
		String disciplina4 = JOptionPane.showInputDialog("Disciplina4?");
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
		aluno1.setEscola(escola);
		
	
		aluno1.getDisciplina().setNota1(Double.parseDouble(nota1));
		aluno1.getDisciplina().setNota2(Double.parseDouble(nota2));
		aluno1.getDisciplina().setNota3(Double.parseDouble(nota3));
		aluno1.getDisciplina().setNota4(Double.parseDouble(nota4));
		
		aluno1.getDisciplina().setDisciplina1(disciplina1);
		aluno1.getDisciplina().setDisciplina2(disciplina2);
		aluno1.getDisciplina().setDisciplina3(disciplina3);
		aluno1.getDisciplina().setDisciplina4(disciplina4);
		
		System.out.println(aluno1.toString());/*Descrição do objeto  na memoria*/
		
		System.out.println("Media do aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado());
		
		
		System.out.println("---------------------------------------------");
		
		
	}

}
