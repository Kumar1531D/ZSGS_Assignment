package assignment_AbstractClassesAndMethods;

import java.util.ArrayList;
import java.util.List;

public class ShopingCartDemo {

	public static void main(String[] args) {
		
		ShoppingCart cart = new ShoppingCart();
		
		Product laptop = new ElectronicsProduct("Laptop","ASUS",52000.00);
		Product cloth = new ClothingProduct("Tshirt","M",2000.00);
		Product book = new ElectronicsProduct("HarryPotter","J.K.Rowling",1000.00);
		
		cart.addProduct(laptop);
		cart.addProduct(cloth);
		cart.addProduct(book);
		
		cart.displayCartDetails();

	}

}

class ShoppingCart{
	
	private List<Product> products;
	
	ShoppingCart(){
		products = new ArrayList<>();
	}
	
	public void addProduct(Product product) {
		products.add(product);
	}
	
	public double calculateTotalPrice() {
		double total = 0;
		
		for(Product p : products) {
			total+=p.getPrice();
		}
		
		return total;
	}
	
	public void displayCartDetails() {
		for(Product p:products) {
			System.out.println(p.getDescription());
			System.out.println();
		}
		
		System.out.println("Total Price : "+calculateTotalPrice()+"rs");
	}
	
}

abstract class Product{
	protected String name;
	protected double price;
	
	Product(String name,double price){
		this.name = name;
		this.price = price;
	}
	
	abstract double getPrice();
	abstract String getDescription();
	
	public String getName() {
		return name;
	}
	
}

class ElectronicsProduct extends Product{
	
	private String brand;
	
	ElectronicsProduct(String name,String brand,double price){
		super(name,price);
		this.brand = brand;
	}


	@Override
	double getPrice() {
		return price;
	}


	@Override
	String getDescription() {
		return "Name : "+super.getName()+
				"\nPrice : "+getPrice()+"rs"+
				"\nBrand : "+brand;
	}
	
}

class ClothingProduct  extends Product{
	
	private String size;
	
	ClothingProduct (String name,String size,double price){
		super(name,price);
		this.size = size;
	}


	@Override
	double getPrice() {
		return price;
	}


	@Override
	String getDescription() {
		return "Name : "+super.getName()+
				"\nPrice : "+getPrice()+"rs"+
				"\nSize : "+size;
	}
	
}

class BookProduct extends Product{
	
	private String author;
	
	BookProduct (String name,String author,double price){
		super(name,price);
		this.author = author;
	}


	@Override
	double getPrice() {
		return price;
	}


	@Override
	String getDescription() {
		return "Name : "+super.getName()+
				"\nPrice : "+getPrice()+"rs"+
				"\nAuthor : "+author;
	}
	
}
