public class Calculator {
    int num1 = 10;
    int num2 = 20;

    public void add(){
        System.out.println("Addition :" + (num1 + num2));
    }
    public void substract(){
        System.out.println("Substraction :" + (num1 - num2));
    }
    public void multiply(){
        System.out.println("Multiplication :" + (num1 * num2));
    }
    public void divide(){
        if (num2 != 0){
            System.out.println("Division :" + (num1 / num2));
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.add();
        cal.substract();
        cal.multiply();
        cal.divide();
        
    }
}
