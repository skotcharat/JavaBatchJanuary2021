package CollectionMapListProduct;

import java.util.*;
public class MapDemo {
	private Map<Categorytype,List<Product>> mapproduct;
	private Scanner sc;
	int noofproduct;
	private List<Product> listPro;
	public MapDemo()
	{
		mapproduct=new HashMap<Categorytype,List<Product>>();
		sc=new Scanner(System.in);
		System.out.println("Enter no of products ");
		noofproduct=sc.nextInt();
	}
	public void accept() {
		for(int x=1;x<=noofproduct;x++)
		{
			Product p = new Product();
			System.out.println("Enter product id ");
			p.setProductid(sc.nextInt());
			System.out.println("Enter Product name ");
			p.setProductname(sc.next());
			
			listPro = new ArrayList<Product>();
			listPro.add(p);
			
			Categorytype type = new Categorytype();
			System.out.println("Enter Product Categorytype ");
			type.setCategory(sc.next());
			
			mapproduct.put(type, listPro);
		}
	
	}
	public void display() {
	Set<Map.Entry<Categorytype,List<Product>>> pmap = mapproduct.entrySet();
	for(Map.Entry<Categorytype,List<Product>> mp:pmap) {
		System.out.println("Key is "+mp.getKey().getCategory());
		
		List<Product> p = mp.getValue();
		
		for(Product pp : p) {
			System.out.println("Product id "+pp.getProductid());
			System.out.println("Product name "+pp.getProductname());
		}
		
	
	
	}
	
	}
	public static void main(String args[]) {
		MapDemo pdemo=new MapDemo();
		pdemo.accept();
		pdemo.display();
	}

}