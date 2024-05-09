package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Util.MisArrays;

class Maxima {
 static int[] array;
 @BeforeAll
 static void init() {
	array = new int[]{10, 9, 8, 7, 6};
}

	@Test
	void test() {
		int maximaesperada = 10;
		int maximametodo = MisArrays.maxima(array);
		Assert.assertEquals(maximaesperada, maximametodo);
		}

}
