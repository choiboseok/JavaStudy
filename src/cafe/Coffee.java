package cafe;

public class Coffee {
	public String name;
	public int price;
	
	public Coffee(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public Coffee() {
	}

	@Override
	public String toString() {
		return "Coffee [name=" + name + ", price=" + price + "]";
	}
}
