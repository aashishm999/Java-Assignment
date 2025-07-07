public class MethodExample {
    
    static void staticMethod() {
        System.out.println("This is a static method");
    }

    void nonStaticMethod() {
        System.out.println("This is a non static method");
    }

    public static void main(String[]args){
        // calling the static method
        MethodExample.staticMethod();

        // creating an object to call the non-static method
        MethodExample object = new MethodExample();
        object.nonStaticMethod();
    }
}
