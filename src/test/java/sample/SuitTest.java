package sample;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import sample.junit.CalculateTest;
import sample.junit.CalculatorTestSuccessful;
import sample.junit.HelloWord;

/**
 * Created by duongnapham on 8/26/15.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        CalculateTest.class,
        CalculatorTestSuccessful.class,
        HelloWord.class,
})
public class SuitTest {
}
