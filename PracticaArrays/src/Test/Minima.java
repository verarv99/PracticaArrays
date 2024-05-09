package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Util.MisArrays;

class Minima {
	static int[] array;
	 @BeforeAll
	 static void init() {
		array = new int[]{10, 9, 8, 7, 6};
	}
	@Test
	void test() {
		int minimaesperada = 6;
		int minimametodo = MisArrays.minima(array);
		Assert.assertEquals(minimaesperada, minimametodo);
		}
	}


