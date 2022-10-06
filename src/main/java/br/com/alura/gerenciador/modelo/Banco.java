package br.com.alura.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Empresa> listaEmpresas = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	static {
		listaEmpresas.add(new Empresa(Banco.chaveSequencial++, "Alura"));
		listaEmpresas.add(new Empresa(Banco.chaveSequencial++, "Caelum"));
	}
	
	
	public Empresa buscarEmpresa(Integer id) {
		
		for (Empresa empresa : Banco.listaEmpresas) {
			if (empresa.getId() == id) {
				return empresa;
			}
		}
		
		return null;
	}
	
	public void adiciona(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		Banco.listaEmpresas.add(empresa);
	}
	
	public void removeEmpresa(Integer id) {
		
		Iterator<Empresa> it = listaEmpresas.iterator();
		
		while(it.hasNext()) {
			Empresa emp = it.next();
			if (emp.getId() == id) {
				it.remove();
				break;
			}
		}
		
		//Banco.listaEmpresas.remove(this.buscarEmpresa(id));
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.listaEmpresas;
	}

	

	

}
