package SpringBoot.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import SpringBoot.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		/*
		 * Student student1 =new Student("Pramod","Thombare","pramod@gmail.com");
		 * studentRepository.save(student1);
		 * 
		 * Student student2 = new Student("Dishant","shinde","Dishant@gmail.com");
		 * studentRepository.save(student2);
		 * 
		 * Student student3 = new Student("Mahesh","Chaughule","Mahesh@gmail.com");
		 * studentRepository.save(student3);
		 * System.out.println("Thank you");
		 */

		System.out.println("started.......");
	}

}
