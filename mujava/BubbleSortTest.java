import static org.junit.Assert.*;

import org.junit.Test;

public class BubbleSortTest {

	int arr[] = new int[]{1,6,2,2,5};
	int arrafter[] = new int[]{1,2,2,5,6};
	
	@Test
	public void BubbleSorttest() {
		assertArrayEquals(arrafter,new BubbleSort().BubbleSort(arr));
	}

}
