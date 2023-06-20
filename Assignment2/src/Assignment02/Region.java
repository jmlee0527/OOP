package Assignment02;

public class Region extends Thread{

	private String regionName;			// The name of the area
	private int regionNum;			// The number of the area
	private int overallSales;			// Overall sales of the area
	private Oil[] oil;	// An array of the candidates of the election
	
	public Region(String regionName, int regionNum, int totalSales, Oil[] oil) {
		super(regionName);
        this.regionName = regionName;
        this.regionNum = regionNum;
        this.overallSales = totalSales;
        this.oil = oil;
	}
	
	public String getRegionName() {
		return this.regionName;
	}
	
	public int getRegionNum() {
		return this.regionNum;
	}
	
	
	public void generateSales() {
		for (int i = 0; i < overallSales; i++) {
			int categoryIndex = (int) (Math.random() * oil.length);
			int quantity = (int) (Math.random() * 10);
			int price = oil[categoryIndex].getPrice(quantity);
			
			Sale sale = new Sale(regionNum, quantity, price);
			
			oil[categoryIndex].addSale(sale);
		}
	}
	
	public void run() {
				generateSales();
				
	}

}
