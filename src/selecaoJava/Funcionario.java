package selecaoJava;

import java.util.Date;

public class Funcionario extends Pessoa{
	
	private Date data_admissao;
	private String matricula;
	
	public Funcionario(String nome, String cPF, String email, Date data_nascimento, Date data_admissao,
			String matricula) {
		super(nome, cPF, email, data_nascimento);
		this.data_admissao = data_admissao;
		this.matricula = matricula;
	}
	
	public Date getData_admissao() {
		return data_admissao;
	}
	public void setData_admissao(Date data_admissao) {
		this.data_admissao = data_admissao;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	

}
