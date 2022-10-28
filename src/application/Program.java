package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import util.ProductPredicate;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 350.5));
		list.add(new Product("Hd Case", 80.90));

		// remover com função PREDICATE
		/* Para todo p -> talq todo p seja igual ou maior a 100 */
		list.removeIf(new ProductPredicate());

		/* pra cada produto p na minha lista list */
		for (Product p : list) {
			System.out.println(p);
		}
	}
}
