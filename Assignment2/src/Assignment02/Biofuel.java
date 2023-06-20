package Assignment02;

public class Biofuel extends Oil {
	
	private int discount = 0;
	private int cpl = 0;

	
	public Biofuel(String name, int maxSales, int cpl, int disc) {
		 super(name, maxSales, cpl);
		 this.cpl = cpl;
	     this.discount = disc;
	}
	
	
	public String toString() {
        int totalPrice = this.cpl - this.discount;
		return super.toString() + "Discount : " + discount +"\n" + "Price : " + totalPrice +"\n" ;
	}
	
	

	public int getPrice(int quantity) {
        int totalCostPerLiter = this.cpl - this.discount;
		int totalPrice = quantity * totalCostPerLiter;
        return totalPrice;	
	}
	public int getCPL() {
        int totalCostPerLiter = this.cpl - this.discount;
        return totalCostPerLiter;	
	}
	
}
