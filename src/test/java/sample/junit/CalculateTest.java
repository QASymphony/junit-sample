package sample.junit;

import org.junit.*;
import sample.intercls.ICalculator;
import sample.utils.CalculatorUtils;
import sample.utils.DateUtils;

/**
 * Created by duongnapham on 8/26/15.
 */
public class CalculateTest {

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
    public void testSum_One() {
        int testSum = 7;
        System.out.println("----- START OF Verify function testSum -------------");
        int sum = calculator.sum(2, 9);
        System.out.println("@Test sum(): " + sum + " = " + testSum);
        Assert.assertEquals(sum, testSum);
        System.out.println("----- END OF Verify function testSum -------------");
    }

    @Test
    public void testSum_second() {
        int subResult = 10;
        System.out.println("----- START OF Verify function testSum -------------");
        int sum = calculator.sum(2, 5);
        System.out.println("@Test sum(): " + sum + " = " + subResult);
        Assert.assertEquals(sum, subResult);
        System.out.println("----- END OF Verify function testSum -------------");
    }

}
