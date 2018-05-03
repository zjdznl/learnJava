package basisclass;

import java.util.Enumeration;
import java.util.Properties;

public class SystemInfo {
    public static void main(String[] args) {
        Properties sp = System.getProperties();
        Enumeration e = sp.propertyNames();
        while (e.hasMoreElements()) {
            String key = (String) e.nextElement();
            System.out.println(key + "== " + sp.getProperty(key));
        }
    }
}
