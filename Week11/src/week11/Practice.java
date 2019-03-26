package week11;

public class Practice {

	public static void main(String[] args) {
		// 
		
		String[] vertices = {"Seattle", "San Francisco", "Los Angeles", "Denver", "Kansas City", "Chicago", "Boston", "New York", "Atlanta", "Miami", "Dallas", "Houston"};
		
		City city0 = new City("Orlando", 		280257, "Buddy Dyer");
		City city1 = new City("Tallahassee", 	191049, "John E. Dailey");
		City city2 = new City("Miami", 			463347, "Francis X. Suarez");
		City city3 = new City("Tampa", 			385430, "Bob Buckhorn");
		City city4 = new City("Deland", 		32506, 	"Robert F. Apgar");
		City city5 = new City("Daytona", 		68055, 	"Derrick Henry");
		
		City[] cityVertices = {city0, city1, city2, city3, city4, city5};
		
	}

}

class City {
	private int population;
	private String cityName;
	private String mayor;

	public City(String cityName, int population, String mayor) {
		this.cityName =  	cityName; 
		this.population = 	population;
		this.mayor = 		mayor;
	}
	
	
	/**
	 * getters
	 * @return
	 */
	public String getCityName() {
		return this.cityName; 
	}
	
	public int getPopulation() {
		return this.population;
	}
	
	public String getMayor() {
		return this.mayor; 
	}
	
	/**
	 * setters
	 */
	
	public void setMayor(String mayor) {
		this.mayor = mayor; 
	}
	
	public void setPopulation(int population) {
		this.population = population; 
	}
	
	
	
	
	
	
	
	
	
	
	
	
}



