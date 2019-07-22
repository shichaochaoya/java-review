package test;

public class LambdaTest {
    public static void main(String[] args) {
         LambdaTest lambdaTest = new LambdaTest();
        MathOperation add = (int a, int b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (int a, int b) -> {
            return a * b;
        };
        MathOperation division = (int a, int b) -> a / b;
        System.out.println("10+5 = " + lambdaTest.operate(10, 5, add));
        System.out.println("10-5 = " + lambdaTest.operate(10, 5, subtraction));
        System.out.println("10*5 = " + lambdaTest.operate(10, 5, multiplication));
        System.out.println("10/5 = " + lambdaTest.operate(10, 5, division));


        GreetingService s1 = (message) -> System.out.println("hello"+message);
        GreetingService s2 = message -> System.out.println("hello"+message);

        s1.sayMessage("wang");
        s2.sayMessage("cat");

    }


    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {

        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }

}
