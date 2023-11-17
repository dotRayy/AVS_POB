package avs_3pob;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		int escolha = 0;
		int resp = 1;
		
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
			System.out.println("Selecione a opção:");
			escolha = sc.nextInt();
			
			switch(escolha) {
				case 1:
					while(resp == 1) {
						if (incluirAluno(alunos)) {
							System.out.println("Aluno incluído com sucesso!");
						} else {
							System.out.println("Já existe um aluno com esse ID");
						}
						System.out.println("Continuar? 1 - Sim\t2 - Não");
						resp = sc.nextInt();
					}
					break;
				case 2:
					if(incluirEmTurma(turmas, alunos)) {
						System.out.println("Aluno adicionado a turma com sucesso!");
					} else {
						System.out.println("Aluno já existente nessa turma");
					}
					
					break;
				case 3:
					listarTurma(turmas);
					break;
				case 4:
					System.out.println("Finalizando execução...");
					break;
				default:
					System.out.println("Opção inválida");
			}
		
		}	

	}
	
	private static void listarTurma(ArrayList<Turma> turmas) {
		
		System.out.println("Op\tID\tNome\tTurno\tIdDisciplina");
		for(int i = 0; i < turmas.size(); i++) {
			System.out.println(i + " - \t" + turmas.get(i).toString());
		}
		System.out.print("Selecione a turma que você deseja exibir: ");
		Scanner sc =  new Scanner(System.in);
		int numTurma = sc.nextInt();
		
		Turma turma = turmas.get(numTurma);
		System.out.println("Turma:\nID\tNome\tTurno\tIdDisciplina");
		System.out.println(turma.toString());
		System.out.println( "Alunos:");
		turma.exibirAlunos();
		
	}

	private static boolean incluirEmTurma(ArrayList<Turma> turmas, ArrayList<Aluno> alunos) {
		
		for(int i = 0; i < turmas.size(); i++) {
			System.out.println(i +" - "+ turmas.get(i).getId() + " " + turmas.get(i).getNome() 
					+ " " + turmas.get(i).getTurno());
		}
		System.out.print("Selecione a turma onde o aluno será incluído: ");
		Scanner sc = new Scanner(System.in);
		int numTurma = sc.nextInt();
		Turma turma = turmas.get(numTurma);
		
		System.out.println("Op\tID\tNome\tMatr\tEmail\tCPF");
		for(int i = 0; i < alunos.size(); i++) {
			System.out.println(i + " - \t" + alunos.get(i).toString());
		}
		System.out.print("Selecione o aluno que será incluído: ");
		int numAluno =  sc.nextInt();
		
		
		Aluno aluno = alunos.get(numAluno);
		
		for(Aluno a: turma.getListaAluno()) {
			if(a.getId() == aluno.getId()) {
				return false;
			}
		}
		
		turma.adicionarAluno(aluno);
		
		return true;
	}

	private static boolean incluirAluno(ArrayList<Aluno> alunos) {
		Aluno aluno;
		
		Scanner sc = new Scanner(System.in);
			
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
			
		for(Aluno a: alunos) {
			if(a.getId().intern() == id.intern()) {
				return false;
			}
		}
		
		alunos.add(aluno);
		
		return true;
	}
	
}
