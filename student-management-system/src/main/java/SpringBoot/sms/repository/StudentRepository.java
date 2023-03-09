package SpringBoot.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import SpringBoot.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
