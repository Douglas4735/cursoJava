package cursoJava.executavel;



import javax.swing.JOptionPane;

import POO.Aluno;
import POO.Disciplina;

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
		String escola = JOptionPane.showInputDialog("Nome Escola?");
		String serie = JOptionPane.showInputDialog("Qual a serie?");
		
		
		
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
		aluno1.setNomeEscola(escola);
		
		Disciplina disciplina11 = new Disciplina();
		disciplina11.setDisciplina("Banco de dados");
		disciplina11.setNota(90);
		
		
		Disciplina disciplina12 = new Disciplina();
		disciplina12.setDisciplina("Matematiaca");
		disciplina12.setNota(80);
		
		
		Disciplina disciplina13 = new Disciplina();
		disciplina13.setDisciplina("Geografia");
		disciplina13.setNota(97);
		
		
		Disciplina disciplina14 = new Disciplina();
		disciplina14.setDisciplina("Java Web");
		disciplina14.setNota(70);
		
		
		aluno1.getDisciplinas().add(disciplina11);
		aluno1.getDisciplinas().add(disciplina12);
		aluno1.getDisciplinas().add(disciplina13);
		aluno1.getDisciplinas().add(disciplina14);
		
		
		
		System.out.println(aluno1.toString());/*Descrição do objeto  na memoria*/
		System.out.println("Media do aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado());
		
		
	
		
	}

}
