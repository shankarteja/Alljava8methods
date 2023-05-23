package Streammax;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Person {
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
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", grade='" + grade + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Person> pp = new ArrayList<>();
        Person p = new Person();
        p.id = 4;
        p.name = "king";
        p.marks = 86;
        p.grade = "A";
        Person s1 = new Person();
        s1.id = 3;
        s1.name = "queen";
        s1.marks = 78;
        s1.grade = "B";
        Person s2 = new Person();
        s2.id = 1;
        s2.name = "jack";
        s2.marks = 77;
        s2.grade = "C";
        Person s3 = new Person();
        s3.id = 2;
        s3.name = "meave";
        s3.marks = 62;
        s3.grade = "D";

        pp.add(p);
        pp.add(s1);
        pp.add(s2);
        pp.add(s3);
        Function<Person,Person>fungrade=ptu-> {
            if (ptu.getMarks() > 85) {
                ptu.grade = "a";
            }else if (ptu.getMarks()>70 && ptu.getMarks()<85) {
                ptu.grade = "b";
            }    else if (ptu.getMarks()>55 && ptu.getMarks()<65) {
                ptu.grade = "c";
            }    else if (ptu.getMarks()>35 && ptu.getMarks()<55){
                ptu.grade="d";
            }else {
                ptu.grade="fail";
            }
            return ptu;
        };


        Predicate<Person>gradepoint=x->x.getGrade().equalsIgnoreCase("c");
        Comparator<Person>comsort=(x,y)-> {
            if (x.getMarks() < y.getMarks()){
        }
        return -1;
        };

        Consumer<Person>printconsumer=x-> System.out.println(x.getName());

        pp.stream().map(fungrade).filter(gradepoint).filter(gradepoint).sorted(comsort).forEach(printconsumer);





//        System.out.println(gradepoint);
//        pp.stream().map(fungrade).collect(Collectors.toList());
//        System.out.println(pp);


    }
}