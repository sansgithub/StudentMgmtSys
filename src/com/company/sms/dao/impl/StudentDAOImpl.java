/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.sms.dao.impl;

import com.company.sms.dao.StudentDAO;
import com.company.sms.entity.Student;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class StudentDAOImpl implements StudentDAO{
    private List<Student> studentList;
    
    public StudentDAOImpl(List<Student> studentList){
        this.studentList=studentList;
    }

    @Override
    public void insert(Student s) {
        studentList.add(s);
    }

    @Override
    public void update(Student s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int id) {
        boolean success=false;
        for(Student s: studentList){
            if(s.getId()==id){
                studentList.remove(s);
                success=true;
                break;
            }
        }
        return success;
    }

    @Override
    public Student getById(int id) {
        Student student=null;
        for(Student s: studentList){
            if(s.getId()==id){
                student=s;
                break;
            }
        }
        return student;
    }

    @Override
    public List<Student> search(String param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Student> getAll() {
        return studentList;
    }
    
}
