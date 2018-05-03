package basisconcept;


class Car {
    String name = "smart";
    String color = "red";
    int num = 4;

    void run() {
        System.out.println(name + ":" + color + ":" + num + ":跑起来了。。。。");
    }

}

class BlackCarFactory {
    String name;
    String addr;

    Car repairCar(Car c) {
        c.num = 3;
        c.color = "黑色";
        System.out.println("改装成功啦。。。");
        return c;
    }
}

class Demo1 {

    public static void main(String[] args) {

        BlackCarFactory bcf = new BlackCarFactory();
        bcf.name = "幸福修理厂";
        bcf.addr = "天河区棠东东路御富科贸园a栋206";

        // 非匿名对象
        Car c = new Car();
        c.run();
        // 改装
        bcf.repairCar(c);
        // 取车
        c.run();

        // 匿名对象一,只使用一次：
        // 如下创建了2个对象
        /*
         * new Car().run();
         *
         * new Car().run();
         */

        // 匿名对象二，作为实际参数传递
        Car c2 = bcf.repairCar(new Car());
        c2.run();

        System.out.println();
    }
}