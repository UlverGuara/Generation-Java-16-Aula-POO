package exPOO;

//2) Crie uma classe avi�o e apresente os atributos e m�todos referentes esta classe,
//em seguida crie um objeto avi�o, defina as instancias deste objeto e apresente as informa��es deste objeto no console.

public class Ex2Main {
	public static void main(String[] args) {
		// Instaciando um Objeto da Classe Ex2Aviao.
		Ex2Aviao auto = new Ex2Aviao("Militar", "Juca Bala", 1997, "Inoperante..");
		auto.imprimaInfo();
		Ex2Aviao auto1 = new Ex2Aviao("Civil", "Master Blaster", 2000, "Ativo");
		auto1.imprimaInfo();
		Ex2Aviao auto2 = new Ex2Aviao("Civil", "Rafael", 2021, "Ativo");
		auto2.imprimaInfo();
	}

}
