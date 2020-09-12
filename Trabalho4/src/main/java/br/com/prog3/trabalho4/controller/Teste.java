package br.com.prog3.trabalho4.controller;

import java.util.List;

import br.com.prog3.trabalho4.model.Dependente;
import br.com.prog3.trabalho4.model.Empregado;

public class Teste {

	public static void main(String[] args) {

		// HibernateUtil.getSessionFactory();

		/*
		 * Empregado d = new Empregado(); EmpregadoController ec = new
		 * EmpregadoController(); d.setCpf("05051056691"); d.setIdade("joao");
		 * d.setNome(40); d.setSalario(1200); ec.incluir(d);
		 */

		/*
		 * Empregado d = new Empregado(); EmpregadoController ec = new
		 * EmpregadoController(); d.setCpf("05051056692"); d.setNome(50);
		 * d.setIdade("vinte e nove"); d.setSalario(1300); ec.alterar(d);
		 */

		/*
		 * Empregado d = new Empregado(); EmpregadoController ec = new
		 * EmpregadoController(); d.setCpf("05051056691"); ec.excluir(d);
		 */

		/*
		 * Empregado d = new Empregado(); EmpregadoController ec = new
		 * EmpregadoController(); d.setCpf("9657845290"); d.setNome(80);
		 * d.setIdade("vinte e cinco"); d.setSalario(1500); ec.incluir(d);
		 * d.setCpf("9657845698"); d.setNome(90); d.setIdade("vinte e sete");
		 * d.setSalario(1000); ec.incluir(d); d.setCpf("9637865280"); d.setNome(100);
		 * d.setIdade("vinte e dois"); d.setSalario(2000); ec.incluir(d);
		 */

		/*
		 * EmpregadoController ec = new EmpregadoController(); List<Empregado> lista =
		 * ec.listarTodos();
		 */

		/*
		 * EmpregadoController ec = new EmpregadoController(); Empregado ee =
		 * ec.buscarPeloCpf("05056790065"); System.out.println(ee);
		 */

		/*
		 * Dependente d = new Dependente(); Empregado e = new Empregado();
		 * DependenteController dc = new DependenteController(); d.setCpf("0678346875");
		 * d.setCpf(1); d.setgrauParentesco("primos"); d.setdataNascimento("12.09");
		 * d.setnome(e); dc.incluir(d); d.setCpf(2);
		 * d.setgrauParentesco("muito próximos"); d.setdataNascimento("11.07");
		 * d.setnome(e); dc.incluir(d); d.setCpf("0677344875"); d.setCpf(3);
		 * d.setgrauParentesco("tios"); d.setdataNascimento("01.09"); d.setnome(e);
		 * dc.incluir(d); d.setCpf(4); d.setgrauParentesco("irmaos");
		 * d.setdataNascimento("09.07"); d.setnome(e); dc.incluir(d); d.setCpf(5);
		 * d.setgrauParentesco("parentes distantes"); d.setdataNascimento("05.09");
		 * d.setnome(d); dc.incluir(d);
		 */

		/*
		 * Dependente d = new Dependente(); Empregado e = new Empregado();
		 * DependenteController ec = new DependenteController();
		 * e.setCpf("03034556690"); d.setCpf(1); d.setgrauParentesco("conjugues");
		 * d.setdataNascimento("09.09"); d.setEmpregado(e); ec.alterar(d);
		 */

		/*
		 * Dependente d = new Dependente(); DependenteController dc = new
		 * DependenteController(); d.setCpf(1); dc.excluir(d);
		 */

		/*
		 * DependenteController dc = new DependenteController(); List<Dependente> lista
		 * = dc.listarTodos(); if(lista != null){ for(Dependente ec : lista){
		 * System.out.println("Cpf: "+ec.getEmpregado().getCpf());
		 * System.out.println("Descrição: "+ec.getNome());
		 */

		DependenteController dc = new DependenteController();
		Dependente ec = dc.buscarPeloCpf(3);
		if (dc != null) {
			System.out.println("Cpf: " + ec.getEmpregado().getCpf());
			System.out.println("Descrição: " + ec.getNome());

		}

	}

}
