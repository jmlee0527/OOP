package selfTest;

import java.util.Arrays;

public class MyCustom /* your code */ {
	private Integer move_type = 0;
	private Boolean isAttack = false;
	
	public void move(String key) {
        switch (key) {
        case "w":
            move_type = 1;
            break;
        case "s":
            move_type = 2;
            break;
        case "a":
            move_type = 3;
            break;
        case "d":
            move_type = 4;
            break;
        default:
            move_type = 5;
            break;
    }
	}
	public void attack(String key) {
		 if(key.equals("spacebar"))
			 isAttack = true;
		 else
			 isAttack = false;

	}
	public void sortItem(Item[] itemList) {
		Arrays.sort(itemList);
	}
	public Integer getMoveType() {
		return new Integer(move_type);
	}
	public Boolean getIsAttack() {
		return new Boolean(isAttack);

	}
}
