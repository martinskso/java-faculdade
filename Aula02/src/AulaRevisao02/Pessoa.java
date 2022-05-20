package AulaRevisao02;

public class Pessoa {
	
	private int codigo;
	private String nome;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Pessoa(int codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}
	
	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Código: " + codigo + " Nome: " + nome;
	}
	
	

	@Override
    public boolean equals(Object obj) {
        return ((Pessoa)obj).codigo==this.codigo;
    }
	
	
	
}