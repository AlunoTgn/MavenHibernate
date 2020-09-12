package br.com.prog3.trabalho4.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "empregado")
public class Empregado implements Serializable {
	@Override
	public String toString() {
		return "Empregado [idade=" + idade + ", nome=" + nome + ", salario=" + salario + ", cpf=" + cpf + "]";
	}

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "idade")
	private String idade;

	@Column(name = "nome")
	private Integer nome;

	@OneToMany(mappedBy = "empregado", targetEntity = Dependente.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Dependente> dependente;

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public Integer getNome() {
		return nome;
	}

	public void setNome(Integer nome) {
		this.nome = nome;
	}

	public Integer getSalario() {
		return salario;
	}

	public void setSalario(Integer salario) {
		this.salario = salario;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Column(name = "salario")
	private Integer salario;
	@Column(name = "cpf")
	private String cpf;
	// get/set

	public List<Dependente> getDependente() {
		return dependente;
	}

	public void setDependente(List<Dependente> dependente) {
		this.dependente = dependente;
	}
	
}
