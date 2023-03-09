package SpringBoot.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import SpringBoot.sms.entity.Student;
import SpringBoot.sms.repository.StudentRepository;
import SpringBoot.sms.service.StudentService;

//Add Service annotation
@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;
	//	Add constructor using field

	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();//select * from ,,,
	}

	@Override
	public Student saveStudent(Student student) {

		return studentRepository.save(student);
	}
	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}
	@Override
	public Student updateStudent(Student student) {

		return studentRepository.save(student);
	}
	@Override
	public void deleteStudentByid(Long id) {
		studentRepository.deleteById(id);
	}
}
