package CompileFail;

public class SwitchSupportOnlyIntOrString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Float f = new Float("12"); 
		switch (f) 
		{
		    case 12: System.out.println("Twelve"); 
		    case 0: System.out.println("Zero"); 
		    default: System.out.println("Default"); 
		}
	}

}
