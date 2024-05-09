package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Util.MisArrays;

class TestArrays {
	int[] array;

	@BeforeEach 
	void init() {
		array = new int[]{10, 9, 8, 7, 6};
	}
	
	@Test
	void test() {
		int mediaEsperada = 8;
		int mediareal=  MisArrays.media(array);
		Assert.assertEquals(mediaEsperada, mediareal);
	}
}
