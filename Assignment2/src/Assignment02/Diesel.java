package Assignment02;

public class Diesel extends Oil {
	
	private int vat = 0;
	private int envtax = 0;
	
	public Diesel(String name, int maxSales, int cpl, int vt, int ent) {
        super(name, maxSales, cpl);
        this.vat = vt;
        this.envtax = ent;
	}
	
	public Diesel(String name, int cpl, int vt, int ent) {
		// TODO Auto-generated constructor stub
		super(name,0,cpl);
		this.vat = vt;
		this.envtax = ent;
	}

	public String toString() {
		double totalCostPerLiter = costPerLiter + (costPerLiter * (vat / 100.0)) + (costPerLiter * (envtax / 100.0));
		return super.toString() + "VAT : " + vat + "%\n" + "EnvTax : " + envtax +"%\n"+ "Price : "+(int)totalCostPerLiter +"\n";
	}
	
	
	
	public int getPrice(int quantity) {
		double totalCostPerLiter = costPerLiter + (costPerLiter * (vat / 100.0)) + (costPerLiter * (envtax / 100.0));
//        int totalPrice = (int) Math.round(quantity * totalCostPerLiter);
        int totalPrice = quantity * (int)totalCostPerLiter;
        return totalPrice;
		
	}
	
	public int getCPL() {
		double totalCostPerLiter = costPerLiter + (costPerLiter * (vat / 100.0)) + (costPerLiter * (envtax / 100.0));
		return (int)totalCostPerLiter;
		
	}
	
}
