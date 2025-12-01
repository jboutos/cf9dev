package gr.aueb.cf.cf9.ch2;

import java.math.BigInteger;

//BigInteger class demo

public class AddBigIntsApp {
    public static void main(String[] args) {
        BigInteger bigNum1 = new BigInteger("2142342345234483647");
        BigInteger bigNum2 = new BigInteger("2142342342347483647");
        BigInteger bigResult;

        //λειτουργικότητα της κλάσης
        bigResult = bigNum1.add(bigNum2);

        System.out.printf("The result is: %,d%n", bigResult);
    }
}
