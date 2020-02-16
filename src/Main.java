import model.Student;

public class Main {
    public static void main(String[] args){
        Student new_student = new Student("Tom", 18, "Male", 20190721);
        System.out.println(new_student.toString());
    }
}
