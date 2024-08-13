package Spring.driver;


public class Main1{
    public static void main(String[] args) {
        B b=new B();
        String first =  b.meth();
        String second = b.meth();
        
        System.out.println(first);
        System.out.println(second);
    }
}