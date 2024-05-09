package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Util.MisArrays;

class TestArrays {
static	int[] array;

	@BeforeAll
static	void init() {
		array = new int[]{10, 9, 8, 7, 6};
	}
	/**
	 * esto es un test que comprueba que se hace bien el metodo media 
	 */
	@Test
	void test() {
		int mediaEsperada = 8;
		int mediareal=  MisArrays.media(array);
		Assert.assertEquals(mediaEsperada, mediareal);
	}
}
