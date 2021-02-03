package exPOO;

//3) Crie uma classe produto eletrônico e apresente os atributos e métodos referentes esta classe, 
//em seguida crie um objeto produto eletrônico, defina as instancias deste objeto e apresente as informações deste objeto no console.

public class Ex3Main {
	public static void main(String[] args) {
		// Instanciando um Objeto da Classe Ex3Eletronico.
		Ex3Eletronico auto = new Ex3Eletronico(220, "Geladeira", "Philips", 2000, 3000.00, "Não");
		auto.imprimaInfo();
		Ex3Eletronico auto1 = new Ex3Eletronico(110, "PlayStation 5", "Sony", 2021, 5000.00, "Sim");
		auto1.imprimaInfo();
		Ex3Eletronico auto2 = new Ex3Eletronico(220, "Notebook", "Samsung", 2001, 1500.00, "Não");
		auto2.imprimaInfo();
	}

}
