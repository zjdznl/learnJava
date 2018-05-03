package basisclass.bignumber;

import java.math.BigInteger;

public class BitIntegerTest {
    public static void main(String[] args) {
        BigInteger bigA = new BigInteger("12345678912345");
        BigInteger bigB = new BigInteger("12345678912345");

        System.out.println(bigA.add(bigB));
        System.out.println(bigA.subtract(bigB));
        System.out.println(bigA.multiply(bigB));
        System.out.println(bigB.divide(bigA));

        BigInteger[] result = bigB.divideAndRemainder(bigA);
        System.out.println(result[0] + " " + result[1]);

    }
}
