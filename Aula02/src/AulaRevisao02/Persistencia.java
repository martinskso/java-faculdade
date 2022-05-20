package AulaRevisao02;

import java.util.ArrayList;

public class Persistencia implements IPadraoPersistencia{
	
	ArrayList pessoas = new ArrayList();

	@Override
	public void inserir(Object o) {
		pessoas.add(o);
	}

	@Override
	public void alterar(Object o) {
		
		if(pessoas.contains(o) == true) {
			pessoas.remove(o);
		}
		pessoas.add(o);		
	}

	@Override
	public void remover(Object o) {
		pessoas.remove(o);		
	}

	@Override
	public ArrayList listar() {		
		return pessoas;
	}


}