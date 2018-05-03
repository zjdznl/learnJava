package basisconcept.enumtest;

public enum Operation {
    // 用于执行加法运算
    PLUS { // 花括号部分其实是一个匿名内部子类

        @Override
        public double calculate(double x, double y) {
            return x + y;
        }

    },

    // 用于执行减法运算
    MINUS { // 花括号部分其实是一个匿名内部子类

        @Override
        public double calculate(double x, double y) {
            // TODO Auto-generated method stub
            return x - y;
        }

    },

    // 用于执行乘法运算
    TIMES { // 花括号部分其实是一个匿名内部子类

        @Override
        public double calculate(double x, double y) {
            return x * y;
        }

    },

    // 用于执行除法运算
    DIVIDE { // 花括号部分其实是一个匿名内部子类

        @Override
        public double calculate(double x, double y) {
            return x / y;
        }

    };


    public abstract double calculate(double x, double y);
}

