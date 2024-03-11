class A {
    public void showA() {
        System.out.println("I am Rahul");
    }
}

class B extends A {
    public void showB() {
        System.out.println("I am Nalla Rahul");
    }
}

class C extends B {
    public void showC() {
        System.out.println("I am an idiot");
    }
}

class inheritance1 {
    public static void main(String[] args) {
        C obj = new C();
        obj.showA();
        obj.showB();
        obj.showC();
    }
}

