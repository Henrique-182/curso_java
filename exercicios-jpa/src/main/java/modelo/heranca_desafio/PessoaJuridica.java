package modelo.heranca_desafio;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("PessoaJuridica") // atribui "PessoaFisica" à coluna @DiscriminatorColumn, definida pela classe pai
public class PessoaJuridica extends Pessoa {

	private String CNPJ;
	
	public PessoaJuridica() {

	}

	public PessoaJuridica(String nome, String cNPJ) {
		super(nome);
		CNPJ = cNPJ;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	
}
