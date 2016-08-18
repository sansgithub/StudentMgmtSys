/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.sms.service;

import com.company.sms.entity.Student;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface StudentService {
    void insert(Student s);
    void update(Student s);
    boolean delete(int id);
    Student getById(int id);
    List<Student> search(String param);
    List<Student> getAll();
}
