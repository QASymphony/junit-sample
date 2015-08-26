package sample.junit;

import org.junit.*;
import sample.intercls.ICalculator;
import sample.utils.CalculatorUtils;
import sample.utils.DateUtils;

/**
 * Created by duongnapham on 8/26/15.
 */
public class CalculatorTestSuccessful {

    private static ICalculator calculator;
    private static DateUtils dateUtils;

    @BeforeClass
    public static void initCalculator() {
        calculator = new CalculatorUtils();
        dateUtils = new DateUtils();
    }

    @Before
    public void beforeEachTest() {
        System.out.println("......Waiting.... .. at "  + dateUtils.getCurrentDate());
        System.out.println("This is executed before each Test");
    }

    @After
    public void afterEachTest() {
        System.out.println("This is executed after each Test");
        System.out.println("......END --- Waiting.... .. at "  + dateUtils.getCurrentDate());
    }

    @Test
    public void testSum_1() {
        System.out.println("----- START OF Verify function testSum_1 in CalculatorTestSuccessful class -------------");
        int result = calculator.sum(7, 4);

        Assert.assertEquals(7, result);
        System.out.println("----- END OF Verify function testSum_1 in CalculatorTestSuccessful class -------------");
    }

    @Test
    public void testSum_2() {
        System.out.println("----- START OF Verify function testSum_2 in CalculatorTestSuccessful class -------------");
        int result = calculator.sum(2, 4);

        Assert.assertEquals(7, result);
        System.out.println("----- END OF Verify function testSum_2 in CalculatorTestSuccessful class -------------");
    }

    @Test
    public void testSum_3() {
        System.out.println("----- START OF Verify function testSum_3 in CalculatorTestSuccessful class -------------");
        int result = calculator.sum(9, 4);

        Assert.assertEquals(7, result);
        System.out.println("----- END OF Verify function testSum_3 in CalculatorTestSuccessful class -------------");
    }

    @Test
    public void testSum_4() {
        System.out.println("----- START OF Verify function testSum_4 in CalculatorTestSuccessful class -------------");
        int result = calculator.sum(0, 4);

        Assert.assertEquals(7, result);
        System.out.println("----- END OF Verify function testSum_4 in CalculatorTestSuccessful class -------------");
    }

    @Test
    public void testSum_5() {
        System.out.println("----- START OF Verify function testSum_5 in CalculatorTestSuccessful class -------------");
        int result = calculator.sum(2, 4);

        Assert.assertEquals(7, result);
        System.out.println("----- END OF Verify function testSum_5 in CalculatorTestSuccessful class -------------");
    }

    @Test
    public void testSum_6() {
        System.out.println("----- START OF Verify function testSum_6 in CalculatorTestSuccessful class -------------");
        int result = calculator.sum(9, 4);

        Assert.assertEquals(7, result);
        System.out.println("----- END OF Verify function testSum_6 in CalculatorTestSuccessful class -------------");
    }

    @Test
    public void testSum_7() {
        System.out.println("----- START OF Verify function testSum_7 in CalculatorTestSuccessful class -------------");
        int result = calculator.sum(0, 4);

        Assert.assertEquals(7, result);
        System.out.println("----- END OF Verify function testSum_7 in CalculatorTestSuccessful class -------------");
    }

    @Test
    public void testDivison() {
        System.out.println("----- START OF Verify function testDivison in CalculatorTestSuccessful class -------------");
        try {
            int result = calculator.divison(10, 2);

            Assert.assertEquals(5, result);
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
        System.out.println("----- END OF Verify function testDivison in CalculatorTestSuccessful class -------------");
    }

    @Test(expected = Exception.class)
    public void testDivisionException() throws Exception {
        System.out.println("----- START OF Verify function testDivisionException in testDivisionException class -------------");
        calculator.divison(10, 0);
        System.out.println("----- END OF Verify function testDivisionException in CalculatorTestSuccessful class -------------");
    }

    @Test
    public void testEqual() {
        boolean result = calculator.equalIntegers(20, 20);

        Assert.assertFalse(result);
    }

    @Test
    public void testSubstraction() {
        int result = 10 - 3;

        Assert.assertTrue(result == 9);
    }

    @Test
    public void testTimeOut() {
        try{
            System.out.println("---------------------------------------------------");
            System.out.println("----- TC: testTimeOut in CalculatorTestSuccessful class -------");
            System.out.println("---------------------------------------------------");
            Assert.assertEquals(false, false);
            Thread.sleep(30000);
            System.out.println("---------------------------------------------------");
            System.out.println("----- END OF TC in CalculatorTestSuccessful class -----");
            System.out.println("---------------------------------------------------");
        }
        catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
