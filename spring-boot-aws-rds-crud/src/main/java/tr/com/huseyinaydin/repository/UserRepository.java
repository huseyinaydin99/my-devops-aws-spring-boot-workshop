package tr.com.huseyinaydin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tr.com.huseyinaydin.model.User;


//بسم الله الرحمن الرحيم

/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Boot, AWS.
* 
*/

public interface UserRepository extends JpaRepository<User, Integer> {

}