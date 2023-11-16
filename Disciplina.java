package avs_3pob;

public class Disciplina {

	private String id;
	private String nomeDisciplina;
	private String sigla;
	private float cargaHoraria;
	private String idPreRequisito;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNomeDisciplina() {
		return nomeDisciplina;
	}
	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public float getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(float cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public String getIdPreRequisito() {
		return idPreRequisito;
	}
	public void setIdPreRequisito(String idPreRequisito) {
		this.idPreRequisito = idPreRequisito;
	}
	
	public Disciplina(String id, String nomeDisciplina, String sigla, float cargaHoraria, String idPreRequisito) {
		super();
		this.id = id;
		this.nomeDisciplina = nomeDisciplina;
		this.sigla = sigla;
		this.cargaHoraria = cargaHoraria;
		this.idPreRequisito = idPreRequisito;
	}
	
	
}
