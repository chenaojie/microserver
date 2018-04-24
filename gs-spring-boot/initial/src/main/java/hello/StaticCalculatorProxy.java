package hello;

public class StaticCalculatorProxy implements Calculator {
    Calculator calculator;
    public StaticCalculatorProxy(Calculator calculator){
        this.calculator = calculator;
    }
    @Override
    public Integer add(Integer num1, Integer num2) {
        System.out.println("staticCalculatorProxy:before invocation");
        int sum = calculator.add(num1,num2);
        System.out.println("staticCalculatorProxy:after invocation");
        return sum;
    }

    @Override
    public Integer minus(Integer num1, Integer num2) {
        System.out.println("staticCalculatorProxy:before invocation");
        int rest = calculator.minus(num1,num2);
        System.out.println("staticCalculatorProxy:after invocation");
        return rest;
    }
}
