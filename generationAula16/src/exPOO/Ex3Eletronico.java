package exPOO;

//3) Crie uma classe produto eletr�nico e apresente os atributos e m�todos referentes esta classe, 
//em seguida crie um objeto produto eletr�nico, defina as instancias deste objeto e apresente as informa��es deste objeto no console.

public class Ex3Eletronico {
	// Declara��o dos Atributos da Classe.
	private int volts;
	private String tipo;
	private String marca;
	private int modelo;
	private double valor;
	private String garantia;

	// M�todo Construtor.
	public Ex3Eletronico(int volts, String tipo, String marca, int modelo, double valor, String garantia) {
		this.volts = volts;
		this.tipo = tipo;
		this.marca = marca;
		this.modelo = modelo;
		this.valor = valor;
		this.garantia = garantia;
	}

	// Declara��o dos demais M�todos da Classe.
	public void imprimaInfo() {
		System.out.println("-----------Bem-Vindes a MegaLoga!------------");
		System.out.println(+volts + " Volts.");
		System.out.println("Produto: " + tipo + ".");
		System.out.println("Marca: " + marca + ".");
		System.out.println("Modelo: " + modelo + ".");
		System.out.println("Valor: " + valor + ".");
		System.out.println("Garantia: " + garantia + ".");
		System.out.println("-----------Volte sempre!----------------------");
	}

	public int getVolts() {
		return volts;
	}

	public void setVolts(int volts) {
		this.volts = volts;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getGarantia() {
		return garantia;
	}

	public void setGarantia(String garantia) {
		this.garantia = garantia;
	}

}
