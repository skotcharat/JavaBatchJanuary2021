package collectionMapProduct;

import java.util.*;
public class MapDemo {
	private Map<Integer,Product> mapproduct;
	private Scanner sc;
	int noofproduct;
	public MapDemo()
	{
		mapproduct=new HashMap<Integer,Product>();
		sc=new Scanner(System.in);
		System.out.println("Enter no of products ");
		noofproduct=sc.nextInt();
	}
	public void accept()
	{
		for(int x=1;x<=noofproduct;x++)
		{
			Product p = new Product();
			System.out.println("Enter product id ");
			p.setProductid(sc.nextInt());
			System.out.println("Enter Product name ");
			p.setProductname(sc.next());
			System.out.println("Enter product price ");
			p.setPrice(sc.nextDouble());
			mapproduct.put(x,p);
		}
	
	}
	public void display()
	{
	Set<Map.Entry<Integer, Product>> pmap=mapproduct.entrySet();
	for(Map.Entry<Integer,Product> mp:pmap)
	{
	System.out.println("Key is "+mp.getKey());
	Product p=mp.getValue();
	System.out.println("Product id "+p.getProductid());
	System.out.println("Product name "+p.getProductname());
	}
	
	}
	public static void main(String args[])
	{
		MapDemo pdemo=new MapDemo();
		pdemo.accept();
		pdemo.display();
	}

}