package ocp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {

	private String name;
	private Color color;
	private Size size;
	
	public Product(String name, Color color, Size size) {
		this.name = name;
		this.color = color;
		this.size = size;
	}
}
