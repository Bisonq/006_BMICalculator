package counter;

public class BMICalculator {

    private final double kilograms;
    private final double meters;

    public BMICalculator(double kilograms, double height){
        this.kilograms = kilograms;
        this.meters = height;
    }

    public double countBMI(){
        return kilograms / Math.pow(meters, 2);
    }

    public String getBMIMessage(double BMI){
        if(BMIWeight.UNDERWEIGHT.getLeftInterval() <= BMI && BMI <= BMIWeight.UNDERWEIGHT.getRightInterval())
            return BMIWeight.UNDERWEIGHT.toString();
        else if (BMIWeight.OPTIMUM.getLeftInterval() <= BMI && BMI <= BMIWeight.OPTIMUM.getRightInterval())
            return BMIWeight.OPTIMUM.toString();
        else if (BMIWeight.OVERWEIGHT.getLeftInterval() <= BMI && BMI <= BMIWeight.OVERWEIGHT.getRightInterval())
            return BMIWeight.OVERWEIGHT.toString();
        else if (BMIWeight.OBESITY.getLeftInterval() <= BMI && BMI <= BMIWeight.OBESITY.getRightInterval())
            return BMIWeight.OBESITY.toString();
        else
            return "Off Scale!";
    }
}
