package exPOO;

//3) Crie uma classe produto eletr�nico e apresente os atributos e m�todos referentes esta classe, 
//em seguida crie um objeto produto eletr�nico, defina as instancias deste objeto e apresente as informa��es deste objeto no console.

public class Ex3Main {
	public static void main(String[] args) {
		// Instanciando um Objeto da Classe Ex3Eletronico.
		Ex3Eletronico auto = new Ex3Eletronico(220, "Geladeira", "Philips", 2000, 3000.00, "N�o");
		auto.imprimaInfo();
		Ex3Eletronico auto1 = new Ex3Eletronico(110, "PlayStation 5", "Sony", 2021, 5000.00, "Sim");
		auto1.imprimaInfo();
		Ex3Eletronico auto2 = new Ex3Eletronico(220, "Notebook", "Samsung", 2001, 1500.00, "N�o");
		auto2.imprimaInfo();
	}

}
