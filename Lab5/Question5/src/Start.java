public class Start {
    public static void main(String[] args) {
    	Bird.testBird();
        Student.testStudent();
        Bird bird = new Bird("Tweet", 1.0, 1080);
        //Test student with bird as pet
        Student stu = new Student("Max", bird);
        //Test the information of student's pet
        System.out.println(stu.getPet().getName() == "Tweet");
        System.out.println(stu.getPet().getWeight() == 1.0);
    }
}
