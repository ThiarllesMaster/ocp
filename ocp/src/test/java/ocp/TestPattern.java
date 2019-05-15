package ocp;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Before;
import org.junit.Test;

public class TestPattern {

	List<Product>products = null;
	
	@Before
	public void setUp() {
		products = createListProduct();		
	}
	
	@Test
	public void testPattern() {
		BetterFilter bf = new BetterFilter();
		List<Product>products = bf.filter(this.products, new ColorSpecification(Color.GREEN)).collect(Collectors.toList());
		assertTrue(products.size() == 2);
		

		
	}
	
	private List<Product>createListProduct() {
		Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
		Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
		Product house = new Product("House", Color.BLUE, Size.LARGE);
		
		List<Product>products = new ArrayList<>();
		products.add(apple);
		products.add(tree);
		products.add(house);
		
		return products;
		
	}
}
