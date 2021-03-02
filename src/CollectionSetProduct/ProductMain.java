package CollectionSetProduct;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class ProductMain {
	Scanner sc;	
	Set<Product> sets;
	int noofProduct;
	
	public ProductMain() {
		System.out.println("Enter no of product ");
		sc = new Scanner(System.in);
		noofProduct = sc.nextInt();
		sets = new HashSet<Product>();
		
		
	}
	
	public void accept()
	{
		for(int i = 0; i < noofProduct; i++) {
			
			// This one need to be inside the loop otherwise the display will duplicate cause 
			// if we put Product p; for the class level, it will instance every time in the loop
			Product p = new Product();
			
			System.out.println("Enter productId");
			p.setProductId(sc.nextInt());
			System.out.println("Enter productName");
			p.setProductName(sc.next());
			System.out.println("Enter price");
			p.setPrice(sc.nextInt());
			
			boolean b = sets.add(p);
			if(!b) {
				System.out.println("product already exit");				
			}
		}
		
		
	}
	
	public void display()
	{
		for(Product s : sets)
		{
			// We call the value Product class need to get the value
			System.out.println("ProductID " + s.getProductId());
			System.out.println("ProductName " + s.getProductName());
			System.out.println("ProductPrice " + s.getPrice());
		}		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductMain m = new ProductMain();
		m.accept();
		m.display();
	}

}
