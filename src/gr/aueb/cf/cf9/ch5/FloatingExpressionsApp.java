package gr.aueb.cf.cf9.ch5;

public class FloatingExpressionsApp {
    public static void main(String[] args) {
        int intNum = 10;
        float floatNum = 0.1F;
        double doubleNum1 = 12.5D;
        double doubleNum2 = 2D;

        float floatResult = 0.0F;
        double doubleResult = 0.0;

        //int is smaller and is transformed to float
        floatResult = intNum + floatNum;

        //and here they all become doubles
        doubleResult = intNum + floatNum + doubleNum1;

        System.out.printf("float result = %f%n", floatResult);
        System.out.printf("double result = %f%n", doubleResult);
    }
}
