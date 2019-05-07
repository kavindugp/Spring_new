package lk.codelabs.sms.service;
import java.util.*;

import lk.codelabs.sms.model.Student;
import lk.codelabs.sms.repository.HibernateStudentRepository;
import lk.codelabs.sms.repository.StudentRepository;
public class StudentServiceImpl implements StudentService {

	StudentRepository repository ;
			//new HibernateStudentRepository();
	
	
	public StudentRepository getRepository() {
		return repository;
	}


	public void setRepository(StudentRepository repository) {
		this.repository = repository;
	}


	@Override
	public List<Student> fetchAllStudents(){
		
		return repository.fetchAllStudents();
	}
}
