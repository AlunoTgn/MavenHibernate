package br.com.prog3.trabalho4.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "dependente")
public class Dependente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cpfEmpregado")
	private Integer cpfEmpregado;

	@Column(name = "nome")
	private String nome;

	@Column(name = "grauParentesco")
	private String grauParentesco;

	@ManyToOne
	@JoinColumn(name = "cpf")
	private Empregado empregado;

	public Integer getCpfEmpregado() {
		return cpfEmpregado;
	}

	@Override
	public String toString() {
		return "Dependente [cpfEmpregado=" + cpfEmpregado + ", nome=" + nome + ", grauParentesco=" + grauParentesco
				+ ", dataNascimento=" + dataNascimento + "]";
	}

	public Empregado getEmpregado() {
		return empregado;
	}

	public void setEmpregado(Empregado empregado) {
		this.empregado = empregado;
	}

	public void setCpfEmpregado(Integer cpfEmpregado) {
		this.cpfEmpregado = cpfEmpregado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGrauParentesco() {
		return grauParentesco;
	}

	public void setGrauParentesco(String grauParentesco) {
		this.grauParentesco = grauParentesco;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Column(name = "dataNascimento")
	private String dataNascimento;
	// get/set

	public void setCpf(int i) {
		
	}

	public void setCpf(String string) {
		
	}

	public void setnome(Dependente d) {
		
	}

	public void setdataNascimento(String string) {
		
	}

	public void setgrauParentesco(String string) {
		

	}

	public void setnome(Empregado e) {
		
	}
}
