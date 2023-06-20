package Assignment02;


public class Sale {

		public int regionNum;
		public int liters;
		public int cost;
		
		public Sale(int regionNum, int quantity, int price) {
			this.regionNum = regionNum;
			this.cost = price;
			this.liters = quantity;
		}
	    public int getRegionNum() {
	        return regionNum;
	    }
		public int getQuantity() {
			return liters;
		}
		public int getCost() {
			return cost;
		}

}
