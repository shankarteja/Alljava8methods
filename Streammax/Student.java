package Streammax;

import java.util.ArrayList;
import java.util.List;

public class Student {
    int id;
    String name;
    int marks;
    String grade;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", grade='" + grade + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Student> ll = new ArrayList<>();
        Student s=new Student();
        s.id=4;
        s.name="king";
        s.marks=86;
        s.grade="A";
        Student s1=new Student();
        s1.id=3;
        s1.name="queen";
        s1.marks=58;
        s1.grade="B";
        Student s2=new Student();
        s2.id=1;
        s2.name="jack";
        s2.marks=77;
        s2.grade="C";
        Student s3=new Student();
        s3.id=2;
        s3.name="meave";
        s3.marks=62;
        s3.grade="D";

        ll.add(s);
        ll.add(s1);
        ll.add(s2);
        ll.add(s3);

        ll.stream().map(x-> {
            if (x.getMarks() > 85) {
                x.grade = "A";
            } else if (x.getMarks() > 75 && x.getMarks() < 85) {
                x.grade = "B";

            } else if (x.getMarks() > 55 && x.getMarks() < 75) {
                x.grade = "c";

            } else if (x.getMarks() > 35 && x.getMarks() < 55) {
                x.grade = "D";
            } else {
                x.grade = "Fail";
            }
            return x;

        }).filter(x->x.getGrade().equalsIgnoreCase("b")).forEach(x-> System.out.println(x));
//        }).forEach(x-> System.out.println(x));
    }


}