package DataMungerSplitFile;

/**
 * query = Select player1, city, matchdate from data/ipl.csv where player1 = 'John' and city = 'New York' Order By Player1
========================================================================
Create an DataMunger API having following functionalities -
 * */
public class DataMunger {
	

	
	
	public String fetchFileName(String query) {
		String[] arrOfStr = query.split(" from "); 
		String[] fileName = arrOfStr[1].split(" ");
		return fileName[0];
				
		
	}

	public String mainQuery(String query) {
		String[] mainQuery = query.split("where|order by|group by"); 
		return mainQuery[0]; 
	}

	public String[] projectionField(String query) {
		String[] q1 = query.split(" from "); 
		String[] q2 = q1[0].split("Select "); 
		String[] q3 = q2[1].split(", "); 
		
		return q3; 
	}

	public String[] conditions(String query) {
		return null; 
	}

	public String[] fetchOrderBy(String query) {
		return null; 
	}
}	
//	public Restriction[] fetchAllCondistions(String query) {
//		return null; 
//	}
//	public AggregateFunction[] fetchAggregateFunction(String query) {
//		return null; 
//	}
//	
//	
//
//}
//	
//	public class Restriction {
//	//	operator
//	//	operand1
//	//	operand2
//		
//}
//	
//	public class StringDemo {
//		
//}
