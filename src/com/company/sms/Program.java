/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.sms;

import com.company.sms.entity.Student;
import com.company.sms.service.StudentService;
import com.company.sms.service.StudentServiceImpl;
import com.company.sms.view.StudentView;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Program {

    public static void menu() {
        System.out.println("Student Management System");
        System.out.println("==========================");
        System.out.println("1. Add Student");
        System.out.println("2. Edit Student");
        System.out.println("3. Delete Student");
        System.out.println("4. Search Student By Id");
        System.out.println("5. Search Student By Any");
        System.out.println("6. Show All Student");
        System.out.println("7. Exit");
        System.out.println("Enter your choice [Y/N]:");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StudentService studentService = new StudentServiceImpl();
        StudentView studentView = new StudentView(scanner, studentService);
        while (true) {
            menu();

            switch (scanner.nextInt()) {
                case 1:
                    studentView.addScreen();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    studentView.showAllScreen();
                    break;
                case 7:
                    System.exit(0);
                    break;
            }// case ends here
        }//end for while
    }

}
