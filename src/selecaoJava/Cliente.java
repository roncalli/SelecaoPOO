package selecaoJava;

import java.util.Date;

public class Cliente extends Pessoa{
	
	private String endereco;
	
	public Cliente() {
		
	}

	public Cliente(String nome, String cPF, String email, Date data_nascimento, String endereco) {
		super(nome, cPF, email, data_nascimento);
		this.endereco = endereco;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}	

}
