/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.sms.service;

import com.company.sms.dao.StudentDAO;
import com.company.sms.dao.impl.StudentDAOImpl;
import com.company.sms.entity.Student;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author Lenovo
 */
public class StudentServiceImpl implements StudentService{
    
    private StudentDAO studentDAO;
    
    public StudentServiceImpl(){
        studentDAO=new StudentDAOImpl(new Vector<>());
    }

    @Override
    public void insert(Student s) {
        studentDAO.insert(s);
    }

    @Override
    public void update(Student s) {
        studentDAO.update(s);
    }

    @Override
    public boolean delete(int id) {
        return studentDAO.delete(id);
    }

    @Override
    public Student getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Student> search(String param) {
        return studentDAO.getAll();
    }

    @Override
    public List<Student> getAll() {
        return studentDAO.getAll();
    }
    
}
