import java.util.ArrayList;
import java.util.List;


class Laptop{
	
	private int id;
	private int ram;
	private String model;
	private double price;
	
	Laptop(int id, int ram, String model, double price)
	{
		this.id = id;
		this.ram = ram;
		this.model = model;
		this.price = price;
		
		
	}
	@Override
	public String toString()
	{
		return "id: " + id + " ram: " + ram + " model: " + model + " price: " + price;  
	}
	
}


public class ListFirstExample {
	
	public static void main(String[] args)
	{
		
		Laptop lap1 = new Laptop(1,8, "acer", 50000);
		Laptop lap2 = new Laptop(2,4, "dell", 30000);
		Laptop lap3 = new Laptop(3,8, "hp", 55000);
		Laptop lap4 = new Laptop(4,8, "lenovo", 60000);
		Laptop lap5 = new Laptop(5,8, "apple", 100000);
		
		List<Laptop> list = new ArrayList<Laptop>();
		
		list.add(lap1);
		list.add(lap2);
		list.add(lap3);
		list.add(lap4);
		list.add(lap5);
		
		System.out.println(list);
		
		for(Laptop l:list)
		{
			System.out.println(l);
		}
		
	}
	
}
