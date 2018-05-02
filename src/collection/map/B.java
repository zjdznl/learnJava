package collection.map;

public class B {
    public int count;
    public B(int count) {
        this.count = count;
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
        B other = (B) obj;
        if (count != other.count)
            return false;
        return true;
    }

}
