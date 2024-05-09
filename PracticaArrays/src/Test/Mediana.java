package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Util.MisArrays;

class Mediana {
static int[] array;
@BeforeAll
 static void init() {
	array = new int[]{10, 9, 8, 7, 6};
}

/**
 * esto es un test que comprueba que hace bien el metodo mediana
 */
	@Test
	void test() {
	int medianaEsperada = 8;
	int medianametodo = MisArrays.mediana(array);
	Assert.assertEquals(medianaEsperada, medianametodo);
	}

}
