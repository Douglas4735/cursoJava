package cursoJava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import POO.Aluno;
import POO.Disciplina;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		for (int qtd = 1; qtd <= 2; qtd++) {
			
		
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno"+qtd+" ?");
		/*String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
		String dataNascimento = JOptionPane.showInputDialog("data de nascimento do aluno?");
		String rg = JOptionPane.showInputDialog("Registro geral?");
		String cpf = JOptionPane.showInputDialog("CPF do aluno?");
		String mae = JOptionPane.showInputDialog("Nome da mãe");
		String pai = JOptionPane.showInputDialog("Nome do pai");
		String matricula = JOptionPane.showInputDialog("Digite a matricula");
		String serie = JOptionPane.showInputDialog("Serie matriculada");
		String escola = JOptionPane.showInputDialog("Nome da Escola");*/
		
		
		System.out.println("DADOS DO ALUNO1");
		Aluno aluno1 = new Aluno();                                                                                                                                                                                                                                                                      
		
		aluno1.setNome(nome);
		/*aluno1.setIdade(Integer.valueOf(6));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(matricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(escola);*/
		
		for (int pos = 1; pos <= 4; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("nome da disciplina "+pos+"?");
		
			String notaDisciplina = JOptionPane.showInputDialog("nota da disciplina "+pos+"?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");
		
		if (escolha == 0) {/*Opção SIM e Zero*/
			
			int continuarRemover = 0;
			int posicao = 1;
			
			while (continuarRemover == 0) {
			String disciplinaRemover = JOptionPane.showInputDialog("Qual a diciplina 1, 2, 3 ou 4 ?");
			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
			posicao++;
			continuarRemover = JOptionPane.showConfirmDialog(null, "continuar removendo?");
			
			}
		}
		alunos.add(aluno1);
		}
		
		for (Aluno aluno : alunos) {
			
			System.out.println(aluno.toString());/*Descrição do objeto na memoria*/
			System.out.println("Média do aluno: " +aluno.getMediaNota());
			System.out.println("Resultado: " +aluno.getAlunoAprovado2());
			System.out.println("---------------------------------------------------------------");
			
		}
		
		
		
		
		
		
		}
	}
	
