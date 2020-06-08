package fr.epita.maths.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.epita.maths.FactorialService;

public class TestFactorialService {
//*** @Test ro ezaf kardin in dastana kolan dg bayad pak she//
//	public static void main(String[] args) throws Exception {
//		passingPositiveSmallIntTest();
//		passingNegativeSmallIntTest();
//
//	}

	private static final Logger LOGGER = LogManager.getLogger(TestFactorialService.class);

	@BeforeClass
	public static void beforeAllTests() {
		// System.out.println("BeforeAll"); be jash az log4j
		LOGGER.info("beforeAllTests");
	}

	@Before
	public void beforeEachTest() {
		LOGGER.info("before");
	}

	@Test
	public void passingNegativeSmallIntTest() throws Exception {
		LOGGER.info("passingNegativeSmallIntTest");

		// passing test
		// given
		int negativeNumb = -5;
		FactorialService factorial = new FactorialService();

		// when
		try {
			int result = factorial.caculateFactorial(negativeNumb);
		} catch (Exception e) {
//			System.out.println("we got this exception");
//			// then
//			if (!(e instanceof IllegalArgumentException)) {
//				throw new Exception("we should have an Illegal argument exception");
//			} else
//				return;
			Assert.assertTrue(e instanceof IllegalArgumentException);
			return;
		}

		throw new Exception();

	}

//PositiveNumberTest**************************************************
	@Test
	public void passingPositiveSmallIntTest() throws Exception {
		LOGGER.info("passingPositiveSmallIntTest");
		// passing test
		// given
		int positiveNumb = 5;
		FactorialService factorial = new FactorialService();

		// when
		int result = factorial.caculateFactorial(positiveNumb);

		// then
		if (result != 120) {
			throw new Exception("Bad value for 5! got " + result);
		}
		System.out.println(result);
	}

	@After
	public void afterEachTest() {

		LOGGER.info("after");
	}

	@AfterClass
	public static void afterAllTests() {
		LOGGER.info("afterAll");
	}

}
