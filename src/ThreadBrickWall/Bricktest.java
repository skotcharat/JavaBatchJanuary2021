package ThreadBrickWall;
// Create a class called Account which will have withdraw method , it will take certain amount as a parameter and will deduct amount from specific balance.
//Two threads will try to deduct different amount from balance. you have to make sure that only one thread can deduct amount at a time to remove inconsistence in balance.

import java.util.ArrayList;

class Brick extends Thread {
	int i = 0;
	ArrayList<String> WALL = new ArrayList<String>();
	@Override
	public synchronized void run() {
	    while(i<100)
	    {
	        if(i%2==0)
	        {   
	try{
	                notify();
	                WALL.add("RED");
	              
	                i++;
	                wait();

	             }catch(Exception e){ e.printStackTrace(); }
	        }else
	        {
	            try{
	                notify();
	                WALL.add("BLACK");
	              
	                i++;
	                wait();
	            }catch(Exception e){ e.printStackTrace(); }
	        }
	    }
	    
	    for(int i=0; i< WALL.size();i++ ) {
	    	
	    	System.out.print(WALL.get(i));
	    	
	    	if(i%9 == 0) {
	    		System.out.println("");
	    	}
	    	
	    }
	    
	   	    
	    
	}

}

class Bricktest {  
	public static void main(String args[]){  
	
		Brick obj = new Brick();//only one object  
		Thread thread1 = new Thread(obj);
		Thread thread2 = new Thread(obj);

		thread1.setName("t1");
		thread2.setName("t2");

		thread1.start();
		thread2.start();
		
		
	}	

}   
