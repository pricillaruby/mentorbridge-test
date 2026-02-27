package student;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static List<Student> studentList = new ArrayList<>();

    public static void main(String[] args) {
        studentList.add(new Student("Arun", 85, 2, "CSE"));
        studentList.add(new Student("Bala", 92, 3, "CSE"));
        studentList.add(new Student("Charan", 78, 1, "CSE"));
        studentList.add(new Student("Deepak", 88, 4, "CSE"));
        studentList.add(new Student("Ezhil", 95, 2, "CSE"));

        studentList.add(new Student("Jinu", 81, 3, "ECE"));
        studentList.add(new Student("Gokul", 89, 2, "ECE"));
        studentList.add(new Student("Hari", 93, 4, "ECE"));
        studentList.add(new Student("Indu", 76, 1, "ECE"));
        studentList.add(new Student("Jaya", 91, 2, "ECE"));

        studentList.add(new Student("Karthik", 82, 3, "IT"));
        studentList.add(new Student("Lavanya", 96, 4, "IT"));
        studentList.add(new Student("Mohan", 87, 2, "IT"));
        studentList.add(new Student("Nisha", 90, 1, "IT"));
        studentList.add(new Student("Oviya", 85, 2, "IT"));

        studentList.add(new Student("Prabhu", 88, 3, "MECH"));
        studentList.add(new Student("Raja", 91, 4, "MECH"));
        studentList.add(new Student("Ravi", 84, 1, "MECH"));
        studentList.add(new Student("Sita", 79, 2, "MECH"));
        studentList.add(new Student("Teena", 93, 3, "MECH"));

        studentList.add(new Student("Uma", 80, 2, "CIVIL"));
        studentList.add( new Student("Vijay", 94, 3, "CIVIL"));
        studentList.add(new Student("Rani", 86, 1, "CIVIL"));
        studentList.add( new Student("Xavier", 89, 4, "CIVIL"));
        studentList.add(new Student("Yamini", 92, 2, "CIVIL"));

        Map<String , List<Student>> departmentList = studentList.stream()
                .collect(Collectors.groupingBy(Student::getDepartment));

        HashMap<String , String> rankHolders = new HashMap<>();

        departmentList.forEach((dept,students)->{
            Student topper = students.stream()
                    .max(Comparator.comparing(Student::getPercentage)).get();

            rankHolders.put(dept, topper.getName());
        });

        System.out.println(rankHolders);
    }
}
