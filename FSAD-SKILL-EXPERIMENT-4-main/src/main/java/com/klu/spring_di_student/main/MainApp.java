package com.klu.spring_di_student.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.klu.spring_di_student.model.Student;

public class MainApp {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
		ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Student student = (Student) context.getBean("student");

        student.display();
    }
}