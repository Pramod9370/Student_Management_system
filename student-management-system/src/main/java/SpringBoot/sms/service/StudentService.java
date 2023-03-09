package SpringBoot.sms.service;

import java.util.List;

import SpringBoot.sms.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();

	Student saveStudent(Student student);

	//	Method Argument
	Student getStudentById(Long id);
	Student updateStudent(Student student);

	void deleteStudentByid(Long id);

}
