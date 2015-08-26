package sample.utils;

import sample.intercls.ICalculator;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by duongnapham on 8/26/15.
 */
public class CalculatorUtils implements ICalculator {

    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int subtraction(int a, int b) {
        return a - b;
    }

    @Override
    public int multiplication(int a, int b) {
        return a * b;
    }

    @Override
    public int divison(int a, int b) throws Exception {
        if (b == 0) {
            throw new Exception("Divider can't be zero");
        }

        return a / b;
    }

    @Override
    public boolean equalIntegers(int a, int b) {
        boolean result = false;

        if (a == b) {
            result = true;
        }

        return result;
    }

    public String getCurrentDate(){
        Date dNow = new Date( );
        SimpleDateFormat ft =
                new SimpleDateFormat ("yyyy/MM/dd HH:mm:ss");

//        System.out.println("Current Date: " + ft.format(dNow));
        return ft.format(dNow);
    }

}
