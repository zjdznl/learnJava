package basisclass;

public class GetMemorySize {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        String str = "";
        for (int i = 0; i < 5000; i++) {
            str += i;
        }

        System.out.println(runtime.maxMemory());
        System.out.println(runtime.totalMemory());
        System.out.println(runtime.freeMemory());

        runtime.gc();

        System.out.println(runtime.maxMemory());
        System.out.println(runtime.totalMemory());
        System.out.println(runtime.freeMemory());

    }
}
