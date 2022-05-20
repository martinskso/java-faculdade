package AulaRevisao02;

import javax.swing.JOptionPane;

public class CadastroPessoa {
	
	public static void main(String[] args) {
		String menu = "01 - Cadastrar\n"+
	                  "02 - Alterar\n"+
				      "03 - Remover\n"+
	                  "04 - Listar\n"+
				      "05 - Sair do sistema\n"+
	                  "Digite uma opção";
		boolean sair = false;
		Pessoa pessoa;
		Persistencia persistencia = new Persistencia();
		while(sair == false) {
			
			int op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op) {
			case 1: 
				pessoa = new Pessoa();
				pessoa.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite um codigo")));
				pessoa.setNome(JOptionPane.showInputDialog("Digite um nome"));
				persistencia.inserir(pessoa);
				break;
			case 2: 
				pessoa = new Pessoa();
				pessoa.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite um codigo")));
				pessoa.setNome(JOptionPane.showInputDialog("Digite um nome"));
				persistencia.alterar(pessoa);
				break;
			case 3: 
				pessoa = new Pessoa();
				pessoa.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite um codigo")));				
				persistencia.remover(pessoa);
				break;
			case 4: 
				JOptionPane.showMessageDialog(null, persistencia.listar().toArray());
				break;
			case 5: 
				sair = true;
				JOptionPane.showMessageDialog(null, "Saindo do sistema");
				break;

			}
			
		}
		
	}
}


