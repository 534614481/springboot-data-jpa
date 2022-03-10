package com.ust.springbootjpa;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ust.springbootjpa.dao.StudentRepo;
import com.ust.springbootjpa.dao.StudentRepository;
import com.ust.springbootjpa.entity.Country;
import com.ust.springbootjpa.entity.Student;

@SpringBootApplication
public class SpringbootDataJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringbootDataJpaApplication.class, args);
		/*
		 * StudentRepo bean = run.getBean(StudentRepo.class); bean.save(new
		 * Country("1","Delhi","India"));
		 */
		
		StudentRepository studentBean = run.getBean(StudentRepository.class);
		
		//Student save = studentBean.save(new Student(101,"Ram",26));
		/*
		 * List<Student> saveAll = studentBean.saveAll(Arrays.asList(new
		 * Student(102,"shyam",25), new Student(103,"nanigadu",26), new
		 * Student(104,"naveen",30), new Student(105,"Ravi",19), new
		 * Student(106,"prasad",31)));
		 * 
		 * saveAll.forEach(s->System.out.println(s));
		 */	
		/*
		 * Optional<Student> findById = studentBean.findById(99);
		 * 
		 * if(findById.isPresent()) { System.out.println(findById.get()); }else {
		 * System.out.println("Id doesn't exist"); }
		 */
		
		//Student s	=	new Student(101,"update",24);
		//studentBean.save(s);
		
		//System.out.println("Count is:"+studentBean.count());
		
		/*
		 * List<Student> studentsByAge = studentBean.getStudentsByAge(24);
		 * 
		 * studentsByAge.forEach(s->System.out.println(s));
		 */
		
		/*
		 * List<Student> students = studentBean.getStudents();
		 * 
		 * students.forEach(s->System.out.println(s));
		 */

//Develop branch
		
		studentBean.deleteStudentByAge(25);

	}

}
