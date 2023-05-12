package UseACabecaJava;

public class A {
    int ivar = 7;
    void m1() {
        System.out.print("m1, ");
    }
    void m2() {
        System.out.print("m2, ");
    }
    void m3() {
        System.out.print("m3, ");
    }
}
class B extends A{
    void m1() {
        System.out.print("B em A, ");
    }
}
class C extends B{
    void m3() {
        System.out.print("C e B, "+(ivar + 6));
    }
}
