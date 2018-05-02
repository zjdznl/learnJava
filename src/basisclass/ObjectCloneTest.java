package basisclass;

class Address {
    String detail;

    public Address(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return detail;
    }
}

class User implements Cloneable {
    int age;
    Address address;

    public User(int age) {
        this.age = age;
        address = new Address("no. 3663");
    }

    public User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }

    @Override
    public String toString() {
        return new String(this.age + this.address.toString());
    }
}

public class ObjectCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        User u1 = new User(20);
        User u2 = u1.clone();

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u1);
        System.out.println(u2);
    }
}
