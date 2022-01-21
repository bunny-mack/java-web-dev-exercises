package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
    Student bunny = new Student("bunny", 123, 1, 4.0);
    System.out.println(bunny.getName());
    System.out.println(bunny.getStudentId());
    System.out.println(bunny.getNumberOfCredits());
    System.out.println(bunny.getGpa());
    System.out.println(Student.getGradeLevel(100));
    bunny.addGrade(16, 3.5);
    System.out.println(bunny.getGpa());
    }
}
