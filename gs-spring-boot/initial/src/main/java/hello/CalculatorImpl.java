package hello;

public class CalculatorImpl implements Calculator {
    @Override
    public Integer add(Integer num1, Integer num2) {
        int sum = num1 + num2;
        System.out.println("caculatorImpl:sum=="+sum);
        return sum;
    }

    @Override
    public Integer minus(Integer num1, Integer num2) {
        int result = num1 - num2;
        System.out.println("caculatorImpl:result=="+result);
        return result;
    }
}
