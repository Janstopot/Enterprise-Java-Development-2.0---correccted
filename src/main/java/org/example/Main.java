package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("A", 98);
        Student student2 = new Student("B", 72);
        Student student3 = new Student("C", 85);
        Student student4 = new Student("D", 90);

        Map<String, Student> listaEstudiantes = new HashMap<>(Map.of());
        listaEstudiantes.put(student1.getName(), student1);
        listaEstudiantes.put(student2.getName(), student2);
        listaEstudiantes.put(student3.getName(), student3);
        listaEstudiantes.put(student4.getName(), student4);

        for(Student s : listaEstudiantes.values()){
            System.out.println(s);
        }

        Student.increaseGrade(listaEstudiantes);

        System.out.println("=======================");

        for(Student s : listaEstudiantes.values()){
            System.out.println(s);
        }
    }
}