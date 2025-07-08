public class Student {
    String name;
    int RollNo;
    
    void displayInfo(){
        System.out.println("Name : " + name);
        System.out.println("Roll No : " + RollNo);
    }
    
    public static void main(String[] args) {
        Student stu = new Student();
        stu.name = "Ashish Mankar";
        stu.RollNo = 1001;
        stu.displayInfo();
    }
}
