package basisclass;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random r = new Random(System.currentTimeMillis());
        for (int i=0;i<5;i++) {
            System.out.println(r.nextDouble());
        }
    }
}
