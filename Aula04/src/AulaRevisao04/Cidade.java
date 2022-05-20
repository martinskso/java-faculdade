package AulaRevisao04;

public class Cidade {
	
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
	public Cidade(int codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}
	public Cidade() {
		super();
			
	}
	@Override
	public String toString() {
		return "Código: " + codigo + " Nome: " + nome;
	}
	
	@Override
	public boolean equals(Object obj) {
		return ((Cidade)obj).codigo == this.codigo;
	}
	
}
