package tr.com.huseyinaydin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tr.com.huseyinaydin.model.Student;
import tr.com.huseyinaydin.repository.DynamoDbRepository;

//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Boot, AWS.
* 
*/

// http://localhost:8085/dynamodb
@RestController
@RequestMapping("/dynamodb")
public class DynamoDbController {

	@Autowired
	private DynamoDbRepository repository;
	
	@PostMapping
	public Student insertIntoDynamoDB(@RequestBody Student student) {
		System.out.println("Öğrenci kaydı DynamoDB tablosuna başarı ile kaydedildi!");
		return repository.insertIntoDynamoDB(student);
	}

	@GetMapping
	public ResponseEntity<Student> getOneStudentDetails(@RequestParam String studentId) {
		Student student = repository.getOneStudentDetails(studentId);
		return new ResponseEntity<Student>(student, HttpStatus.OK);
	}
	
	@PutMapping
	public Student updateStudentDetails(@RequestBody Student student) {
		return repository.updateStudentDetails(student);
	}

	@DeleteMapping(value = "/{studentId}")
	public String deleteStudentDetails(@PathVariable("studentId") String studentId) {
		Student student = new Student();
		student.setStudentId(studentId);
		repository.deleteStudentDetails(student);
		return "Öğrenci kaydı DynamoDB tablosundan başarı ile silindi!";
	}
}