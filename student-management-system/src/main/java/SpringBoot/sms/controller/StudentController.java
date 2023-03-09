package SpringBoot.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import SpringBoot.sms.entity.Student;
import SpringBoot.sms.service.StudentService;

//Controller Annotation
@Controller
public class StudentController {
	private StudentService studentService;

	//	Constructor of this class
	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}


	//	Handler Method to handle list students and return mode and view
	@GetMapping("/students")
	public String listStudents(Model model) {

		model.addAttribute("students",studentService.getAllStudents());
		return "students";
	}
	//	GetMapping annotation
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		//		Create Student object to hold student from data
		Student student=new Student();
		model.addAttribute("student",student);
		return "create_student";
	}
	//	PostMapping Annotation for this methods is post
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {

		studentService.saveStudent(student);
		return "redirect:/students";
	}
	//	update Student
	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable Long id,Model model) {

		model.addAttribute("student",studentService.getStudentById(id));
		return "edit_student";
	}
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id,
			@ModelAttribute("student") Student student, Model model){
		//		get Student from database by id	
		Student existingStudent = studentService.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setFirstname(student.getFirstname());
		existingStudent.setLastname(student.getLastname());
		existingStudent.setEmail(student.getEmail());

		//		Save Updated Student Object
		studentService.updateStudent(existingStudent);
		return "redirect:/students";
	}
	//	Handler Method to handle delete student to request
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id) {
		studentService.deleteStudentByid(id);
		return "redirect:/students";
	}
}
