package collection.map;

public class A {
    public int count;

    public A(int count) {
        this.count = count;
    }
    //根据count值来计算hashCode值
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + count;
        return result;
    }
    //根据count值来判断两个对象是否相等
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        A other = (A) obj;
        if (count != other.count)
            return false;
        return true;
    }


}
