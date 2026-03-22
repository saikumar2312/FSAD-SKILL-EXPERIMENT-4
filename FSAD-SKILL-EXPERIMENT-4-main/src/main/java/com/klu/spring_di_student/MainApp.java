package com.klu.spring_di_student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.klu.spring_di_student.config.AppConfig;
import com.klu.spring_di_student.model.Student;

public class MainApp {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
		ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Student student = context.getBean(Student.class);

        student.setCourse("Computer Science");
        student.setYear(2);

        student.display();
    }
}