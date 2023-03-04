
class A {

    void meth1() {
        System.out.println("i am in class a meth1");
    }

    void meth2() {
        System.out.println("i am in class a meth2");
    }
}

class B extends A {

    void meth2() {
        System.out.println("i am in class B meth2");
    }

    void meth3() {
        System.out.println("i am in class B meth3");
    }
}

public class overriding {
    public static void main(String arrg[]) {
        System.out.println("my");
        A a = new A();
        a.meth1();
        a.meth2();
        B b = new B();
        b.meth1();
        b.meth2();
        b.meth3();
    }
}
