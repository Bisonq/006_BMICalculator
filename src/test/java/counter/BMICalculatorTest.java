package counter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {

    @Test
    @DisplayName("BMI Calculator should return correct BMI pointer")
    void test1(){
        //given
        double kilograms = 71.0;
        double meters = 1.86;
        BMICalculator bmiCalculator = new BMICalculator(kilograms, meters);

        //when
        double result = bmiCalculator.countBMI();

        //then
        assertEquals(20, (int)result);
    }

    @Test
    @DisplayName("BMI Message should return UNDERWEIGHT weight description when BMI is between <0;18.49>")
    void test2(){
        //given
        double kilograms = 41.0;
        double meters = 1.86;
        BMICalculator bmiCalculator = new BMICalculator(kilograms, meters);

        //when
        String result = bmiCalculator.getBMIMessage(bmiCalculator.countBMI());

        //then
        assertEquals(BMIWeight.UNDERWEIGHT.toString(), result);
    }

    @Test
    @DisplayName("BMI Message should return OPTIMUM weight description when BMI is between <18.5;24.99>")
    void test3(){
        //given
        double kilograms = 74.0;
        double meters = 1.86;
        BMICalculator bmiCalculator = new BMICalculator(kilograms, meters);

        //when
        String result = bmiCalculator.getBMIMessage(bmiCalculator.countBMI());

        //then
        assertEquals(BMIWeight.OPTIMUM.toString(), result);
    }

    @Test
    @DisplayName("BMI Message should return OVERWEIGHT weight description when BMI is between <25;29.99>")
    void test4(){
        //given
        double kilograms = 98.0;
        double meters = 1.86;
        BMICalculator bmiCalculator = new BMICalculator(kilograms, meters);

        //when
        String result = bmiCalculator.getBMIMessage(bmiCalculator.countBMI());

        //then
        assertEquals(BMIWeight.OVERWEIGHT.toString(), result);
    }

    @Test
    @DisplayName("BMI Message should return OBESITY weight description when BMI is between <30;40>")
    void test5(){
        //given
        double kilograms = 120.0;
        double meters = 1.86;
        BMICalculator bmiCalculator = new BMICalculator(kilograms, meters);

        //when
        String result = bmiCalculator.getBMIMessage(bmiCalculator.countBMI());

        //then
        assertEquals(BMIWeight.OBESITY.toString(), result);
    }

    @Test
    @DisplayName("BMI Message should return Off Scale! description when BMI is Off Scale")
    void test6(){
        //given
        double kilograms = 1200.0;
        double meters = 1.86;
        BMICalculator bmiCalculator = new BMICalculator(kilograms, meters);

        //when
        String result = bmiCalculator.getBMIMessage(bmiCalculator.countBMI());

        //then
        assertEquals("Off Scale!", result);
    }
}