package Assignment02;

public class Gasoline extends Oil{
	
	private int vat = 0;
	private int totalCostPerLiter = 0;
	private int totalPrice = 0;
	private int maxSalses = 0;
	private int cpl = 0;
	
	
	public Gasoline(String name, int maxSales, int cpl, int vt) {
        super(name, maxSales, cpl);
        this.vat = vt;
        this.cpl = cpl;
        
	}
	
	public String toString() {
		double totalCostPerLiter = this.cpl + (this.cpl * vat / 100.0);
		return super.toString() +"VAT : " + this.vat + "%\n" + "Price : " +(int)totalCostPerLiter +"\n";
	}

	public int getPrice(int quantity) {
		double totalCostPerLiter = this.cpl + (this.cpl * vat / 100.0);
        int totalPrice = quantity * (int)totalCostPerLiter;
        return totalPrice;
        
	}
	
	public int getCPL() {
		double totalCostPerLiter = this.cpl + (this.cpl * vat / 100.0);
        return (int)totalCostPerLiter;
	}
	
}
