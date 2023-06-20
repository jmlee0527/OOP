package selfTest;

public class Item implements Comparable {
	private String name;
	private String desc;
	private int quantity;
	
	public Item(String name, String desc, int quantity) {
		this.name = name;
		this.desc = desc;
		this.quantity = quantity;
	}
	
	public String getName() { return this.name; }
	public String getDesc() { return this.desc; }
	public int getQuantity() { return this.quantity; }
	
	public void setName(String name) { this.name = name; }
	public void setDesc(String desc) { this.desc = desc; }
	public void setQuantity(int quantity) { this.quantity = quantity; }
	public int compareTo(Object compareItem) {
		int compareQuantity = ((Item)compareItem).getQuantity();
		return this.quantity - compareQuantity;
	}
}

