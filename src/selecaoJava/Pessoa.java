package selecaoJava;

import java.util.Date;

public class Pessoa {
	
	private String nome;
	private String CPF;
	private String email;
	private Date dataNascimento;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String cPF, String email, Date data_nascimento) {
		super();
		this.nome = nome;
		CPF = cPF;
		this.email = email;
		this.dataNascimento = data_nascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date data_nascimento) {
		this.dataNascimento = data_nascimento;
	}
	
	

}
