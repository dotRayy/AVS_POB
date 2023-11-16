package avs_3pob;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		int escolha = 0;
		
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		ArrayList<Turma> turmas = new ArrayList<Turma>();
		
		turmas.add(new Turma("01", "3POB", "Manhã", "001"));
		turmas.add(new Turma("02", "3POB", "Noite", "001"));
		turmas.add(new Turma("03", "3DAW", "Manhã", "002"));
		turmas.add(new Turma("04", "3DAW", "Noite", "002"));
		
		while(escolha != 4) {
			System.out.println("Menu\n1 - Incluir Aluno\n2 - Adicionar aluno a turma"
					+ "\n3 - Listar Turma \n4 - Sair");
			Scanner sc = new Scanner(System.in);
			escolha = sc.nextInt();
			
			switch(escolha) {
				case 1:
					incluirAluno(alunos);
					break;
				case 2:
					incluirEmTurma(turmas, alunos);
					break;
				case 3:
					listarTurma(turmas);
					break;
				default:
					System.out.println("Opcao invalida!");
			}
			
		}
		

	}
	
	private static void listarTurma(ArrayList<Turma> turmas) {
		// TODO Auto-generated method stub
		
	}

	private static void incluirEmTurma(ArrayList<Turma> turmas, ArrayList<Aluno> alunos) {
		
		for(int i = 0; i < turmas.size(); i++) {
			System.out.println(i +" - "+ turmas.get(i).getId() + " " + turmas.get(i).getNome() 
					+ " " + turmas.get(i).getTurno());
		}
		System.out.println("Selecione a turma que o aluno será adicionardo: ");
		Scanner sc = new Scanner(System.in);
		int numTurma = sc.nextInt();
		
		for(int i = 0; i < alunos.size(); i++) {
			System.out.println(i+ " - " + alunos.get(i).toString());
		}
		System.out.println("Selecione o aluno que será incluído: ");
		int numAluno =  sc.nextInt();
		
		Turma turma = turmas.get(numTurma);
		Aluno aluno = alunos.get(numAluno);
		turma.adicionarAluno(aluno);
		
	}

	private static void incluirAluno(ArrayList<Aluno> alunos) {
		char resp = 's';
		Aluno aluno;
		Scanner sc = new Scanner(System.in);
		
		while(resp == 's') {
			System.out.print("Digite o Id do Aluno: ");
			String id = sc.nextLine();
			System.out.print("Digite o nome do Aluno: ");
			String nome = sc.nextLine();
			System.out.print("Digite o matricula do Aluno: ");
			String matricula = sc.nextLine();
			System.out.print("Digite o email do Aluno: ");
			String email = sc.nextLine();
			System.out.print("Digite o CPF do Aluno: ");
			String cpf = sc.nextLine();
			
			aluno = new Aluno( id, nome, matricula, email, cpf);
			
			alunos.add(aluno);
			
			System.out.println("Deseja continuar?\ts - Sim\tn - Não");
			resp = sc.next().charAt(0);
		}
	}
}
