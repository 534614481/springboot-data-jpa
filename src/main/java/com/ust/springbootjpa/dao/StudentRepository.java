package com.ust.springbootjpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ust.springbootjpa.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
	
	@Query(value="from Student where studentAge>=:age")
	public List<Student> getStudentsByAge(Integer age);
	
	@Query(value="select * from student",nativeQuery=true)
	public List<Student> getStudents();
	
	@Transactional(readOnly=false)
	@Modifying
	@Query(value="delete from Student where studentAge=:age")
	public void deleteStudentByAge(Integer age);

}
