import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("name1",20,"HN");
        Student student2 = new Student("name2",20,"HN");
        Student student3 = new Student("name3",20,"HN");
        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        Collections.sort(list);
        for (Student student:list){
            System.out.println(student);
        }
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(list,ageComparator);
        for (Student student:list){
            System.out.println(student);
        }



    }
}
