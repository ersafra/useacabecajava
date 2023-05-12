import javax.swing.plaf.basic.BasicToolBarSeparatorUI;

import org.w3c.dom.Text;

import java.util.*;

public class TestBox {
    Integer i = 2;
    int j;
    String s = "2";
    int x = Integer.parseInt(s);
    double d = Double.parseDouble("420.24");
    boolean b = new Boolean("true").booleanValue();
   // double d1 = 42.5;
   // String doubleString = ""+d1;
    double d2 = 42.5;
    String doubleString = Double.toString(d2);
    String s1 = String.format("%, d",100000000);
    public static void main(String[] args) {
        
        TestBox t = new TestBox();
        t.go();
    }
    public void go(){
        j=i;
        System.out.println(s1);
        System.out.println(doubleString);
    }
}
