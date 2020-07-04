package counter;

enum BMIWeight {
    UNDERWEIGHT(0, 18.49),
    OPTIMUM(18.5, 24.99),
    OVERWEIGHT(25, 29.99),
    OBESITY(30, 40);

    private final double leftInterval;
    private final double rightInterval;

     BMIWeight(double leftInterval, double rightInterval){
        this.leftInterval = leftInterval;
        this.rightInterval = rightInterval;
    }

    public double getLeftInterval() {
        return leftInterval;
    }

    public double getRightInterval() {
        return rightInterval;
    }
}
