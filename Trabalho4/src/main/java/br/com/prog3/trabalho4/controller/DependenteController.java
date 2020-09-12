package br.com.prog3.trabalho4.controller;

import java.util.List;
import br.com.prog3.trabalho4.model.Dependente;
import br.com.prog3.trabalho4.model.Empregado;
import br.com.prog3.trabalho4.persistence.DependenteDaoImp;

public class DependenteController {

	public void incluir(Dependente dependente) {
		DependenteDaoImp dc = new DependenteDaoImp();
		dc.incluir(dependente);
	}

	public void alterar(Dependente dependente) {
		DependenteDaoImp dc = new DependenteDaoImp();
		dc.alterar(dependente);
	}

	public void excluir(Dependente dependente) {
		DependenteDaoImp dc = new DependenteDaoImp();
		dc.excluir(dependente);
	}

	public List<Dependente> listarTodos() {
		DependenteDaoImp dc = new DependenteDaoImp();
		return dc.listarTodos();
	}

	public Dependente buscarPeloCpf(int Cpf) {
		DependenteDaoImp dc = new DependenteDaoImp();
		return dc.buscarPeloCpf(Cpf);
	}

	public List<Dependente> buscarPeloEmpregado(Empregado empregado) {
		DependenteDaoImp dc = new DependenteDaoImp();
		return dc.buscarPeloEmpregado(empregado);
	}

}
