package com.st.repo;

import org.springframework.data.repository.CrudRepository;

import com.st.pojo.Student;

public interface Srepo extends CrudRepository<Student, Integer> {

}
