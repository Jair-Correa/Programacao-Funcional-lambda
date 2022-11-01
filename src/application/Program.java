package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 350.5));
		list.add(new Product("Hd Case", 80.90));

		double factor = 1.1;

		// VAI RECEBER UMA FUNCAO UM PRODUTO P QUE VAI FAZER A ATUALIZACAO DOS PRECOS
		Consumer<Product> cons = p -> {
			p.setPrice(p.getPrice() * factor);
		};

		list.forEach(cons);

		list.forEach(System.out::println);
	}
}
