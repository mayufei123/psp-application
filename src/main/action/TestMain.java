package action;

import entity.Student;

public class TestMain {
    public static void main(String[] args) {
        System.out.println("===========This is Action=========");
        Student student = new Student();
        student.setName("小明");
        student.setAge(3);
        System.out.println("StudentInfo:"+student.getName()+";"+student.getAge()+";");

        System.out.println("===========This is Action12=========");
    }
}
