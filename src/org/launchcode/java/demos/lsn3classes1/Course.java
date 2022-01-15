package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.Objects;

public class Course {
    private String subject;
    private Teacher teacher;
    private ArrayList<Student> students;




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return subject.equals(course.subject) && teacher.equals(course.teacher) && students.equals(course.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subject, teacher, students);
    }

    @Override
    public String toString() {
        return "Course{" +
                "subject='" + subject + '\'' +
                ", teacher=" + teacher +
                ", students=" + students +
                '}';
    }




    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}

