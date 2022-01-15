package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

import java.util.Objects;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

   public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
   }

   public Student(String name) {
       this(name, nextStudentId);
       nextStudentId++;
   }

   public String studentInfo() {
       return (this.name + " has a GPA of: " + this.gpa);
   }

   public void addGrade(int courseCredits, double grade) {
       double currentQualityScore = gpa * numberOfCredits;
       double classQualityScore = grade * courseCredits;
       double totalQualityScore = (currentQualityScore + classQualityScore);
       numberOfCredits = numberOfCredits + courseCredits;
       gpa = totalQualityScore / numberOfCredits;
   }

   public String getGradeLevel() {
       if (numberOfCredits >= 90) {
           return "Senior";
       } else if (numberOfCredits >= 60) {
           return "Junior";
       } else if (numberOfCredits >=30) {
           return "Sophomore";
       } else {
           return "Freshman";
       }
   }


    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId && numberOfCredits == student.numberOfCredits && Double.compare(student.gpa, gpa) == 0 && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, studentId, numberOfCredits, gpa);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId=" + studentId +
                ", numberOfCredits=" + numberOfCredits +
                ", gpa=" + gpa +
                '}';
    }
}

