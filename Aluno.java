package avs_3pob;

public class Aluno {
	
	private String id;
	private String nome; 
	private String matricula; 
	private String email; 
	private String cpf;
	
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
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	@Override
	public String toString() {
		return id + "\t" + nome + "\t" + matricula + "\t" + email + "\t" + cpf;
	}
	public Aluno(String id, String nome, String matricula, String email, String cpf) {
		super();
		this.id = id;
		this.nome = nome;
		this.matricula = matricula;
		this.email = email;
		this.cpf = cpf;
	}
	
}
	
