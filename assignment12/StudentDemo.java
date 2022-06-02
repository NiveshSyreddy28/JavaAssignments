package com.javaassignments.zemoso.corejava.assignment12;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StudentDemo {
    public static void main(String[] args) {

        ArrayList<Student> studentList = new ArrayList<Student>();

        studentList.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        studentList.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        studentList.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        studentList.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        studentList.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        studentList.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        studentList.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        studentList.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        studentList.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        studentList.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        studentList.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        studentList.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        studentList.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        studentList.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        studentList.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        studentList.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        studentList.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));

        //Print the name of all departments in the college
        Set<String> Departmentnames = studentList.stream()
                .map(n->n.engDepartment)
                .collect(Collectors.toSet());

        System.out.println("List of all Departments: "+Departmentnames+"\n");


        //Get the names of all students who have enrolled after 2018
        List<String> students = studentList.stream().filter(n-> n.yearOfEnrollment>=2018).map(n-> n.name).collect(Collectors.toList());

        System.out.println("Students who enrolled after 2018: " + students + "\n");

        //Get the details of all male student in the computer sci department
        List<Student> MaleStudents = studentList.stream().filter(n-> n.gender == "Male").collect(Collectors.toList());

        System.out.println("Details of male students in Computer Science Branch");
        for (Student student:MaleStudents) {
            System.out.println(student.toString());
        }

        //What is the average age of male and female students
        Double avgAge = studentList.stream()
                .collect(Collectors.averagingInt(s->s.age));
        System.out.println(String.format("\nAverage Age of Students is: "+ "%.2f",avgAge));

        //Get the details of student having the highest percentage
        Student highestPercentageStudent = studentList.stream()
                .max(Comparator.comparing(Student::getPercentageTillDate))
                .orElseThrow(NoSuchElementException::new);

        System.out.println("\n Student with max percentage: "+highestPercentageStudent.toString());

        //Count the number of students in each department
        List<String>DepartmentList = studentList.stream()
                .map(n-> n.engDepartment).collect(Collectors.toList());

        Map<String, Long> map = DepartmentList.stream().collect(
                        Collectors.groupingBy(
                                Function.identity(), Collectors.counting()));

        System.out.println("\nNumber of students in each department: "+map);

        // What is the average percentage achieved in each department
        for (String department: Departmentnames) {
            Double avgPercentage = studentList.stream().filter(n -> n.engDepartment == department)
                    .collect(Collectors.averagingDouble(s -> s.percentageTillDate));

            System.out.println(String.format("\nAverage Percentage of " + department +" is: " + "%.2f", avgPercentage));
        }

        //Get the details of the youngest male student in the Electronic department
        Student youngMaleStudent = studentList.stream().filter(n->n.engDepartment == "Electronic")
                .min(Comparator.comparing(Student::getAge))
                .orElseThrow(NoSuchElementException::new);
        System.out.println("\nyoungest male student in the Electronic department:");
        System.out.println(youngMaleStudent.toString());

        //How many male and female students are there in the computer science department
        List<Student> femaleCsStudents= studentList.stream().filter(n->n.engDepartment == "Computer Science").
                filter(n->n.gender=="Female").collect(Collectors.toList());

        List<Student> maleCsStudents= studentList.stream().filter(n->n.engDepartment == "Computer Science").
                filter(n->n.gender=="Male").collect(Collectors.toList());

        System.out.println("\n Number of Female Students in Computer Science: " + femaleCsStudents.size());
        System.out.println("\n Number of Male Students in Computer Science: " + maleCsStudents.size());

    }
}
