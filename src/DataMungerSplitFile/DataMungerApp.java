package DataMungerSplitFile;

public class DataMungerApp {

	public static void main(String[] args) {
		String query = "Select player1, city, matchdate from data/ipl.csv where player1 = 'John' and city = 'New York' Order By Player1";
		DataMunger file = new DataMunger();
		
		System.out.println(file.fetchFileName(query));
		System.out.println(file.mainQuery(query));
		
		String[] fields = file.projectionField(query);
		for(String s : fields) {
			System.out.println(s);
		}
	}

}
