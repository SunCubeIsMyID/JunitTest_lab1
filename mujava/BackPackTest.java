import static org.junit.Assert.*;

import org.junit.Test;

public class BackPackTest {

	int m = 10;
    int n = 3;
    /*
    放入的三个物体重量分别为3， 4， 5；价值分别为4， 5， 6
     */
    int w[] = {3, 4, 5};
    int p[] = {4, 5, 6};
    int arrafter[][]= {
    		{0,0,0,0,0,0,0,0,0,0,0},
    		{0,0,0,4,4,4,4,4,4,4,4},	
    		{0,0,0,4,5,5,5,9,9,9,9},	
    		{0,0,0,4,5,6,6,9,10,11,11}};
	@Test
	public void BubbleSorttest() {
		assertArrayEquals(arrafter,new BackPack().BackPack_Solution(m,n,w,p));
	}

}
