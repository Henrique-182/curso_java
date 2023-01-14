package modelo.heranca_desafio;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("PessoaFisica") // atribui "PessoaFisica" à coluna @DiscriminatorColumn, definida pela classe pai
public class PessoaFisica extends Pessoa {
	
	private String CPF;
	
	public PessoaFisica() {

	}

	public PessoaFisica(String nome, String cPF) {
		super(nome);
		CPF = cPF;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

}
