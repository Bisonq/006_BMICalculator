package counter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BMIWeightTest {

    @Test
    @DisplayName("UNDERWEIGHT status should have <0;18.49> compartments")
    void test1(){
        //given
        double leftInterval = BMIWeight.UNDERWEIGHT.getLeftInterval();
        double rightInterval = BMIWeight.UNDERWEIGHT.getRightInterval();

        //then
        assertEquals(0, leftInterval);
        assertEquals(18.49, rightInterval);
    }

    @Test
    @DisplayName("OPTIMUM status should have <18.5;24.99> compartments")
    void test2(){
        //given
        double leftInterval = BMIWeight.OPTIMUM.getLeftInterval();
        double rightInterval = BMIWeight.OPTIMUM.getRightInterval();

        //then
        assertEquals(18.5, leftInterval);
        assertEquals(24.99, rightInterval);
    }

    @Test
    @DisplayName("OVERWEIGHT status should have <25;29.99> compartments")
    void test3(){
        //given
        double leftInterval = BMIWeight.OVERWEIGHT.getLeftInterval();
        double rightInterval = BMIWeight.OVERWEIGHT.getRightInterval();

        //then
        assertEquals(25, leftInterval);
        assertEquals(29.99, rightInterval);
    }

    @Test
    @DisplayName("OBESITY status should have <30;40> compartments")
    void test4(){
        //given
        double leftInterval = BMIWeight.OBESITY.getLeftInterval();
        double rightInterval = BMIWeight.OBESITY.getRightInterval();

        //then
        assertEquals(30, leftInterval);
        assertEquals(40, rightInterval);
    }

}