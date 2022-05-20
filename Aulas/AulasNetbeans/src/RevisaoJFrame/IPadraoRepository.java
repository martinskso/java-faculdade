
package RevisaoJFrame;

import java.util.ArrayList;

public interface IPadraoRepository {
    
        public void inserir(Object o);
	
	public void alterar(Object o);
	
	public void remover(Object o);
	
	public ArrayList getAll();
        
        public Object getByID(int codigo);
    
}
