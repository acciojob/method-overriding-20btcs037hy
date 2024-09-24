class A {
    public String meth() {
        String s = "Invoking method from class A";
        return s;
    }
}

class B extends A {
    @Override
    public String meth() {
        String s = "Method is overridden in Extended class B";
        return s;
    }
}

class Main {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.meth());  // Output will be from Class B's method
    }
}
