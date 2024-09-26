package com.systex.eBiz.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// <class, s_num>
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
