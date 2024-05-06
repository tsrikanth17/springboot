package com.example.university.repository;

import java.util.*;
import com.example.university.model.Course;
import com.example.university.model.Student;

public interface ProfessorRepository {
    ArrayList<Professor> getProfessors();

    Professor getProfessorById(int professorId);

    Professor addProfessor(Professor professor);

    Professor updateProfessor(int professorId, Professor professor);

    void deleteProfessor(int professorId);

    Course getProfessorCourse(int professorId);

}