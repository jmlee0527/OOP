package selfTest;

import java.util.ArrayList;
import java.util.Collections;

public class GenericManager <T extends Comparable> {
	private ArrayList<T> cList;

	public GenericManager() {
		this.cList = new ArrayList<T>();
	}
	
	public void add(T a) {
		this.cList.add(a);
	}
	
	public void sort() {
		Collections.sort(cList);
	}
	
	public String find(T a) {
		String temp = "";
		for(T b : this.cList) {
			if(b.equals(a))
				temp = temp + b.toString();
		}
		return temp;

	}
	
	public String toString() {
		String temp = "";
		for(T a : this.cList) {
			temp = temp + a.toString();
		}
		return temp;
	}
}
