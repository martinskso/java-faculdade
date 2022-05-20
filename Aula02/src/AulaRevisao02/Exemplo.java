package AulaRevisao02;

import java.util.ArrayList;

public class Exemplo {
	
	public static void main(String[] args) {
		
		
		Pessoa p1 = new Pessoa();
		p1.setCodigo(1);
		p1.setNome("Douglas");
				
		Pessoa p2 = new Pessoa();
		p2.setCodigo(2);
		p2.setNome("Douglas 2");
		
		Pessoa p3 = new Pessoa();
		p3.setCodigo(3);
		p3.setNome("Douglas 3");

		ArrayList pessoas = new ArrayList();
		
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		
		Pessoa p4 = new Pessoa();
		p4.setCodigo(3);
		
		
		int total = pessoas.size();		
		System.out.println(total);
		
		
		pessoas.remove(p4);
		
		total = pessoas.size();		
		System.out.println(total);
		
		
	}

}