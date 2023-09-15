package br.com.qwasolucoes.mentoria.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

public class Funcionario {
	
	private String nome;
	
	private String sobrenome;
	
	private Date dataNascimento;
	
	private Integer idade;
	
	private String sexo;
	
	private String profissao;
	
	private String cpfCnpj;
	
	private String escolaridade;
	
	private BigDecimal salario;
	
	private boolean maiorIdade;
	
	private BigDecimal taxa;

	public Funcionario(String nome, String sobrenome, Date dataNascimento, Integer idade, String sexo, String profissao,
			String cpfCnpj, String escolaridade, BigDecimal salario, boolean maiorIdade, BigDecimal taxa) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataNascimento = dataNascimento;
		this.idade = idade;
		this.sexo = sexo;
		this.profissao = profissao;
		this.cpfCnpj = cpfCnpj;
		this.escolaridade = escolaridade;
		this.salario = salario;
		this.maiorIdade = maiorIdade;
		this.taxa = taxa;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public Integer getIdade() {
		return idade;
	}

	public String getSexo() {
		return sexo;
	}

	public String getProfissao() {
		return profissao;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public String getEscolaridade() {
		return escolaridade;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public boolean isMaiorIdade() {
		return maiorIdade;
	}

	public BigDecimal getTaxa() {
		return taxa;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public void setMaiorIdade(boolean maiorIdade) {
		this.maiorIdade = maiorIdade;
	}

	public void setTaxa(BigDecimal taxa) {
		this.taxa = taxa;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpfCnpj, dataNascimento, escolaridade, idade, maiorIdade, nome, profissao, salario, sexo,
				sobrenome, taxa);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		return Objects.equals(cpfCnpj, other.cpfCnpj) && Objects.equals(dataNascimento, other.dataNascimento)
				&& Objects.equals(escolaridade, other.escolaridade) && Objects.equals(idade, other.idade)
				&& maiorIdade == other.maiorIdade && Objects.equals(nome, other.nome)
				&& Objects.equals(profissao, other.profissao) && Objects.equals(salario, other.salario)
				&& Objects.equals(sexo, other.sexo) && Objects.equals(sobrenome, other.sobrenome)
				&& Objects.equals(taxa, other.taxa);
	}
	
}
