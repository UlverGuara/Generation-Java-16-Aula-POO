package exPOO;

//1) Crie uma classe cliente e apresente os atributos e m�todos referentes esta classe,
//em seguida crie um objeto cliente, defina as instancias deste objeto e apresente as informa��es deste objeto no console.

public class Ex1Cliente {
	// Declara��o dos Atributos da classe.
	private float id;
	private String nome;
	private String identidadeSecreta;
	private String produto;

	// M�todo Construtor
	public Ex1Cliente(float id, String nome, String identidadeSecreta, String produto) {
		this.id = id;
		this.nome = nome;
		this.identidadeSecreta = identidadeSecreta;
		this.produto = produto;
	}

	// Declara��o dos demais M�todos da Classe.
	public void imprimaInfo() {
		System.out.println("-----------------------------------------------");
		System.out.println("ID do cliente: " + id + ".");
		System.out.println("Nome: " + nome + ".");
		System.out.println("Conhecido como: " + identidadeSecreta + ".");
		System.out.println("Produto favorito: " + produto + ".");
		System.out.println("-----------------------------------------------");
	}

	public float getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdentidadeSecreta() {
		return identidadeSecreta;
	}

	public void setIdentidadeSecreta(String identidadeSecreta) {
		this.identidadeSecreta = identidadeSecreta;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

}
