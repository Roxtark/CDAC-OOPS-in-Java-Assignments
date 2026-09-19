class Parent {

    void displayParent() {
        System.out.println("This is parent class");
    }
}

class Child extends Parent {

    void displayChild() {
        System.out.println("This is child class");
    }
}

public class InheritanceDemoQ1 {

    public static void main(String[] args) {

        Parent p = new Parent();
        Child c = new Child();

        p.displayParent();

        c.displayChild();

        c.displayParent();
    }
}



