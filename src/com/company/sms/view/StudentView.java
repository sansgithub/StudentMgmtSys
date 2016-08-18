/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.sms.view;

import com.company.sms.entity.Student;
import com.company.sms.service.StudentService;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class StudentView {

    private Scanner scanner;
    private StudentService studentService;

    public StudentView(Scanner scanner, StudentService studentService) {
        this.scanner = scanner;
        this.studentService = studentService;
    }

    public void addScreen() {

        while (true) {
            System.out.println("Add Student");
            System.out.println("====================");
            Student student = new Student();
            System.out.println("Enter id:");
            student.setId(scanner.nextInt());
            System.out.println("Enter First Name:");
            student.setFirstName(scanner.next());
            System.out.println("Enter Last Name:");
            student.setLastName(scanner.next());
            System.out.println("Enter email:");
            student.setEmail(scanner.next());
            System.out.println("Enter address:");
            student.setAddress(scanner.next());
            System.out.println("Enter contact number:");
            student.setContactNo(scanner.next());
            try {
                System.out.println("Enter Join date:");
                DateFormat df = new SimpleDateFormat("yyyy/mm/dd");
                student.setJoinDate(df.parse(scanner.next()));
            } catch (ParseException pe) {
                System.out.println(pe.getMessage());
            }
            System.out.println("Enter status:");
            student.setStatus(scanner.nextBoolean());
            studentService.insert(student);

            System.out.println("Do you want to continue?[y/n]:");
            if (scanner.next().equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public void showAllScreen() {
        System.out.println("Listing All Sudents");
        System.out.println("=======================");
        studentService.getAll().forEach(s -> {
            System.out.println(s.toString());
        });
    }
}
