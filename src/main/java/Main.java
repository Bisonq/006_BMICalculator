import counter.BMICalculator;

public class Main {
    public static void main(String[] args) {

        double weight = 68;
        double height = 1.81;
        BMICalculator bmiCalculator = new BMICalculator(weight, height);
        System.out.println(bmiCalculator.countBMI());
        System.out.println(bmiCalculator.getBMIMessage(bmiCalculator.countBMI()));

    }
}
