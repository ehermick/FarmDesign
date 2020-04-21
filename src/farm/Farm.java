package farm;

import java.util.ArrayList;

import main.Farmers;
import predators.Predators;

public class Farm {
	
	private int size;
	private int numFarmers;
	public static int currency = 0;
	private int maxNumFarmers;
	ArrayList<Farmers> farmers = new ArrayList<Farmers>();
	ArrayList<Predators> predators = new ArrayList<Predators>();

	
	public void setSize(int size) {
	    this.size = size;
	}
	
	public void addFarmers(Farmers farmer) {
	    farmers.add(farmer);
	}
	

}
