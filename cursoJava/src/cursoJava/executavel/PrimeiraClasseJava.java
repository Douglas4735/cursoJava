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
		
		Disciplina disciplina01 = new Disciplina();
		disciplina01.setDisciplina("Banco de dados");
		disciplina01.setNota(90);
		
		
		Disciplina disciplina02 = new Disciplina();
		disciplina02.setDisciplina("Matematiaca");
		disciplina02.setNota(80);
		
		
		Disciplina disciplina03 = new Disciplina();
		disciplina03.setDisciplina("Geografia");
		disciplina03.setNota(97);
		
		
		Disciplina disciplina04 = new Disciplina();
		disciplina04.setDisciplina("Java Web");
		disciplina04.setNota(70);
		
		
		aluno1.getDisciplinas().add(disciplina01);
		aluno1.getDisciplinas().add(disciplina02);
		aluno1.getDisciplinas().add(disciplina03);
		aluno1.getDisciplinas().add(disciplina04);
		
		
		
		System.out.println(aluno1.toString());/*Descrição do objeto  na memoria*/
		System.out.println("Media do aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado());
		
		
	
		
	}

}
