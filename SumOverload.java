public class SumOverload {
    public int sum(int a, int b) {
        return a + b;
    }
    public int sum (int a, int b, int c){
        return a + b + c;
    }
    public double sum(double a, double b){
        return a + b;
    }

    public static void main(String[] args){
        SumOverload ovl = new SumOverload();
        ovl.sum(20, 30);
        ovl.sum(20, 30, 40);
        ovl.sum(20.5, 30.5);
        System.out.println("Sum of two integers: " + ovl.sum(20, 30));
        System.out.println("Sum of three integers: " + ovl.sum(20, 30, 40));
        System.out.println("Sum of two doubles: " + ovl.sum(20.5, 30.5));
    }
}
