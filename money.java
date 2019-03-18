package Junit;

public class money {
    public boolean rmoney(int money) {
    	int [] ownedm = {50,20,5,5,1,1,1};
    	for (int i=0; i<ownedm.length; i++) {
    		if(money >= ownedm[i]) money -= ownedm[i];
    	}
    	if(money == 0) return true;
    	else return false;
    }
}
