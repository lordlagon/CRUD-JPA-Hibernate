package com.exemplo.teste;

import com.exemplo.entidade.Cliente;
import com.exemplo.repositorio.RepositorioCliente;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RepositorioCliente repositorio = new RepositorioCliente();
		
		Cliente cliente = new Cliente();
		cliente.setNome("bruno");
		cliente.setIdade(22);
		
		repositorio.salvar(cliente);
	}

}
