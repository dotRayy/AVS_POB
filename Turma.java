package avs_3pob;

import java.util.ArrayList;

public class Turma {
	
	private String id;
	private String nome;
	private String turno;
	private String idDisciplina;
	private ArrayList<Aluno> listaAluno = new ArrayList<Aluno>();
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public String getIdDisciplina() {
		return idDisciplina;
	}
	public void setIdDisciplina(String idDisciplina) {
		this.idDisciplina = idDisciplina;
	}
	public ArrayList<Aluno> getListaAluno() {
		return listaAluno;
	}
	
	public void adicionarAluno(Aluno aluno) {
		this.listaAluno.add(aluno);
	}
	
	public void exibirAlunos() {
		for(Aluno aluno: listaAluno) {
			System.out.println(aluno.toString());
		}
	};
	
	public Turma(String id, String nome, String turno, String idDisciplina) {
		super();
		this.id = id;
		this.nome = nome;
		this.turno = turno;
		this.idDisciplina = idDisciplina;
	}
	
}
