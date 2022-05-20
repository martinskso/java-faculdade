
package RevisaoJFrame;

import javax.swing.JOptionPane;

public class CadastroCidade {
    
    public static void main(String[] args) {
		
		String menu = "1 - Cadastrar\n"+
		              "2 - Alterar\n"+
                              "3 - Remover\n"+
		              "4 - Listar\n"+
                              "5 - Sair do sistema\n"+
		              "Digite uma opção:";
		boolean sair = false;
		Cidade cidade;
		CidadeRepository repository = new CidadeRepository();
		
		while(sair==false) {
			
			int op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			switch (op) {
			case 1:
				cidade = new Cidade();
				cidade.setCodigo( Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo")));
				cidade.setNome(JOptionPane.showInputDialog("Digite o nome"));
                                cidade.setUf(JOptionPane.showInputDialog("Digite o estado"));
				repository.inserir(cidade);
				break;
			case 2:
				cidade = new Cidade();
				cidade.setCodigo( Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo a ser alterado")));
				cidade.setNome(JOptionPane.showInputDialog("Digite o nome a ser alterado"));
                                cidade.setUf(JOptionPane.showInputDialog("Digite o estado a ser alterado"));
				repository.alterar(cidade);				
				break;
			case 3:
				cidade = new Cidade();
				cidade.setCodigo( Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo a ser removidoo")));				
				repository.remover(cidade);	
				break;
			case 4:
				JOptionPane.showMessageDialog(null, repository.getAll().toArray());
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "Saindo do sistema...");
				sair = true;
				break;
			}			
		}
	}
    
}
