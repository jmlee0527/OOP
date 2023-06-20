package Assignment02;

public abstract class Oil implements Comparable<Object> {
	private String name;
	private int numSales = 0;
	private Sale[] sales;
	protected int costPerLiter = 0;

	public Oil(String name, int maxSales, int cpl) {
		this.name = name;
		this.numSales = 0;
		sales = new Sale[10000];
		costPerLiter = cpl;
	}

	
	@Override
	public String toString() {
		return "Name : " + name + "\n" + "Total Sales : "+ numSales + "\n";
	}
	
    public int totalSales(int regionNum) {
		int count = 0;
		for (Sale sale : sales) {
			if (sale != null && sale.getRegionNum() == regionNum) {
				count++;
			}
		}
		return count;
    }
	
    public int totalCost(int regionNum) {
        int totalCost = 0;
        for (Sale sale : sales) {
            if (sale != null && sale.getRegionNum() == regionNum) {
                totalCost += getCPL() * sale.getQuantity();
            }
        }
        return totalCost;
    }
	
    public int totalQuantity(int regionNum) {
        int totalQuantity = 0;
        for (Sale sale : sales) {
            if (sale != null && sale.getRegionNum() == regionNum) {
                totalQuantity += sale.getQuantity();
            }
        }
        return totalQuantity;
    }

	
	public abstract int getPrice(int quantity);
	public abstract int getCPL();
	
	@Override
	public int compareTo(Object obj) {
		Oil tmp = (Oil) obj;
		return Integer.compare(tmp.numSales, this.numSales);
	}
	
	public synchronized void addSale(Sale s) {
		// TODO Auto-generated method stub
		sales[numSales++] = s;
		notifyAll();
		
	}
}
