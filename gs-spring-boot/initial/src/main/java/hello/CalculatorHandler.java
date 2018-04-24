package hello;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CalculatorHandler implements InvocationHandler {
    Object object;
    public CalculatorHandler(Object obj){
        this.object=obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("calculatorHandler:before invocation");
        Object rest = method.invoke(object,args);
        System.out.println("calculatorHandler:after invocation");
        return rest;
    }
}
