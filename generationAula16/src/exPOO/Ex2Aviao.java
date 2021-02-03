package exPOO;

//2) Crie uma classe avi�o e apresente os atributos e m�todos referentes esta classe,
//em seguida crie um objeto avi�o, defina as instancias deste objeto e apresente as informa��es deste objeto no console.

public class Ex2Aviao {
	// Declara��o dos Atributos da Classe.
	private String tipo;
	private String nomePiloto;
	private int ano;
	private String status;

	// M�todo Construtor.
	public Ex2Aviao(String tipo, String nomePiloto, int ano, String status) {
		this.tipo = tipo;
		this.nomePiloto = nomePiloto;
		this.ano = ano;
		this.status = status;
	}

	// Declara��o dos demias M�todos da Classe.
	public void imprimaInfo() {
		System.out.println("-----------------------------------------------");
		System.out.println("Tipo da Aeronave: " + tipo + ".");
		System.out.println("Piloto respons�vel: " + nomePiloto + ".");
		System.out.println("Ano de Fabrica��o: " + ano + ".");
		System.out.println("Status: " + status + ".");
		System.out.println("-----------------------------------------------");
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNomePiloto() {
		return nomePiloto;
	}

	public void setNomePiloto(String nomePiloto) {
		this.nomePiloto = nomePiloto;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
