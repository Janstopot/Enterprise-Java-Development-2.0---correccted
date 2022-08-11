package org.example;

import java.util.Map;

public class Student {

    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        setGrade(grade);
    }

    public static Map<String, Student> increaseGrade(Map<String, Student> studentMap){
        for(Student s : studentMap.values()){
            int grade = (int)(s.getGrade() * 1.1) > 100 ? 100 : (int)(s.getGrade() * 1.1);
            s.setGrade(grade);
            //if((int) (s.getGrade() *1.1) > 100) s.setGrade(100);
            //else s.setGrade((int) (s.getGrade() * 1.1));
        }
        return studentMap;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if(grade < 0 || grade > 100) throw new IllegalArgumentException("La nota tiene que estar entre 0 y 100");
        this.grade = grade;
    }
}
