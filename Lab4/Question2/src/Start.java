
/*
* Check is better to be static because we can use it without initialize in class Start if it is static
*/

public class Start {
    public static String check(Student student){
        return student.isSleeping() ? "sweet dreams" : "need coffee";
    }
    public static void main(String[] args) {
        Student.testStudent();
        Student s = new Student(123);
        System.out.println(check(s));
    }
}
