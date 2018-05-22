package OOP;
public class Main extends Vehicle
{
	public void display()
	{
		super.display();
		System.out.println("This is Main class method");
	}
	public static void main(String[] args)
	{  Main a=new Main();
	      a.display();
	      Vehicle vehicle = new Vehicle();
	      vehicle.setName("Lamborigini");
			System.out.println(vehicle.getName());
			vehicle.setModel("N06N");
		Vehicle vehicle1 = new Vehicle();
		System.out.println(vehicle1.getName());
		vehicle1.setName("city");
		System.out.println(vehicle1.getName());
		System.out.println(vehicle1.count);	
		
		Vehicle vehicle2 = new Vehicle("civic","black","2018","honda","800");
		System.out.println(vehicle2.getColor());
		vehicle2.setColor("green");
		System.out.println(vehicle2.getColor());
		System.out.println(vehicle2.getSpeed());		
		System.out.println(vehicle1.count);
		System.out.println(Vehicle.getVehicle());
		
		
		Car car1 =new Car("civic","black","2018","honda","800",false,true);
		 System.out.println(car1.getLedScreen());
		 System.out.println(car1.getName());
		 
		 Vehicle  vehicle3=new Vehicle("civic","black","2018","honda","800");
		 System.out.println(vehicle3.getInfo());
		 

		 Vehicle  vehicle4=new Car("civic","black","2018","honda","800",true,false);
		 System.out.println(vehicle4.getInfo());

		 Vehicle  vehicle5=new Bike("civic","black","2018","honda","800",true,false);
		 System.out.println(vehicle5.getInfo());
		
       Main m = new Main();
        m.display();
        
        
    	
	}

	

	
	
}
