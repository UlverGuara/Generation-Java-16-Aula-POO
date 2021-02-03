package exPOO;

//1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe,
//em seguida crie um objeto cliente, defina as instancias deste objeto e apresente as informações deste objeto no console.

public class Ex1Main {
	public static void main(String[] args) {
		// Instanciando um Objeto da Classe Ex1Cliente
		Ex1Cliente auto = new Ex1Cliente(001, "Peter Parker", "Spider-Man", "Salgadinho Keleck");
		auto.imprimaInfo();
		Ex1Cliente auto1 = new Ex1Cliente(002, "Daniel Santos", "Batman", "Pipoca");
		auto1.imprimaInfo();
		Ex1Cliente auto2 = new Ex1Cliente(003, "Princesa Diana", "Wonder Woman", "Finnies");
		auto2.imprimaInfo();

	}

}
