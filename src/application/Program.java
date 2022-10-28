package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 350.5));
		list.add(new Product("Hd Case", 80.90));

		// remover com função PREDICATE
		/* O predicate recebera uma função lambda
		 * função anonima que recebera como argumento um produto p
		 * que ira resultar num booleano p.getPrice() >= 100.0*/
		Predicate<Product> pred = p -> p.getPrice() >= 100.0; 
		
		list.removeIf(pred);

		/* pra cada produto p na minha lista list */
		for (Product p : list) {
			System.out.println(p);
		}
	}
}
