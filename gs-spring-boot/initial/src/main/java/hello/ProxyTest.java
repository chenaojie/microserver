package hello;

import com.sun.deploy.net.proxy.ProxyUtils;

import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String args[]){
        CalculatorImpl calculatorimpl = new CalculatorImpl();
        CalculatorHandler calculatorHandler = new CalculatorHandler(calculatorimpl);
        Calculator calculator = (Calculator) Proxy.newProxyInstance(calculatorimpl.getClass().getClassLoader(),calculatorimpl.getClass().getInterfaces(),calculatorHandler);
        System.out.println(calculator.add(1,2));
        System.out.println(calculator.minus(1,2));
    }

}
