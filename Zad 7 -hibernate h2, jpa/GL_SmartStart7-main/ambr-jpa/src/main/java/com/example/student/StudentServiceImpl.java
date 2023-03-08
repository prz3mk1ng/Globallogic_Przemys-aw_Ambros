package com.example.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService
{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student getStudentByIndex(Long index)
    {
        return studentRepository.findByIndex(index);
    }
}
