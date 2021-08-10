package ex3;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Demo {

	private static List<Livro> livros;

	public static void main(String[] args) {

		livros = new ArrayList<>();

		livros.add(new Livro("Java Anti-Stress", 1, 2000, "Omodionah"));
		livros.add(new Livro("A Guerra dos Padrões", 2, 2000, "Jorge Omel"));
		livros.add(new Livro("A Procura da Luz", 3, 2000, "Kumatkli"));

		while (true) {
			printMenu();
			executeUserOperation();
		}
	}

	private static void printMenu() {
		System.out.println("\n*** Biblioteca ***");
		for (Livro l : livros)
			System.out.println(
					l.getISBN() + "\t" + l.getTitulo() + "\t" + l.getPrimeiroAutor() + "\t[" + l.getLivroState() + "]");
		System.out.println(">> <livro>,<operacao: (1) regista; (2) requisita; (3) devolve; (4) reserva; (5) cancela>");
	}

	private static void executeUserOperation() {
		Scanner myObj = new Scanner(System.in);
		String operation;

		System.out.print(">> ");
		operation = myObj.nextLine();

		String[] operationArr = operation.split(",", 2);

		Livro chosenBook = livros.get(Integer.parseInt(operationArr[0]) - 1);

		// System.out.println(chosenBook.getISBN());

		switch (operationArr[1]) {
			case "1":
				chosenBook.regista();
				break;
			case "2":
				chosenBook.requisita();
				break;
			case "3":
				chosenBook.devolve();
				break;
			case "4":
				chosenBook.reserva();
				break;
			case "5":
				chosenBook.cancelaReserva();
				break;
			default:
				System.out.println("The operation " + operationArr[1] + " does not exist");
		}
	}
}
