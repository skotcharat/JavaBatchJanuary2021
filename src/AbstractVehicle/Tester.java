package AbstractVehicle;
// example
//class X implements Runnable { 
//    public static void main(String args[]) 
//    {
//        /* Missing code? */
//    } 
//    public void run() {} 
//}
// suitable to start a thread
//
// X run = new X();  //Creates objects that implements run() as per Runnable interface
//Thread t = new Thread(run);  //  
Creates thread
//t.start();	


public class Tester {

	public static void main(String[] args) {
		
		Vehicle car=new Car();
		testVehicle(car);
		
		Vehicle truck = new Truck();
		testVehicle(truck);
		
	}

	public static void testVehicle(Vehicle v) {
		v.testVehicle();
	
	}

}
