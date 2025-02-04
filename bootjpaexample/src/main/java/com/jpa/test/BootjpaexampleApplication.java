package com.jpa.test;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication
{

	public static void main(String[] args)
	{
		ApplicationContext contexts = SpringApplication.run(BootjpaexampleApplication.class, args);

		UserRepository userRepository = contexts.getBean(UserRepository.class);
//		User user = new User();
//		user.setName("Hardik Pansheriya");
//		user.setCity("Ahmedabad");
//		user.setStatus("I am Java Programmer");
//		
//		User user1 = userRepository.save(user);
//		System.out.println(user1);
		
//		User user1 = new User();
//		user1.setName("Uttam");
//		user1.setCity("Gandhinagar");
//		user1.setStatus("I am Python Programmer");
//		
//		User user2 = new User();
//		user2.setName("Om");
//		user2.setCity("Surat");
//		user2.setStatus("I am React Programmer");
//		
//		List<User> users = List.of(user1, user2);
//		
//		Iterable<User> result = userRepository.saveAll(users);
//		
//		result.forEach(user -> {
//			System.out.println(user);
//		});
//		System.out.println("done");
		
//		Optional<User> optional = userRepository.findById(102);
//		
//		User user = optional.get();
//		user.setName("Hardik");
//		
//		User result = userRepository.save(user);
//		System.out.println(result);
		
//		Iterable<User> all = userRepository.findAll();
//		
//		all.forEach(new Consumer<User>() {
//
//			@Override
//			public void accept(User arg0)
//			{
//				System.out.println(arg0);
//			}
//		});
		
//		all.forEach(user->System.out.println(user));
		
//		List<User> byNameAndCity = userRepository.findByNameAndCity("Hardik", "Ahmedabad");
//		byNameAndCity.forEach(e->System.out.println(e));
		
		List<User> allData = userRepository.getAllData();
		allData.forEach(e->System.out.println(e));
		
		List<User> userByName = userRepository.getUserByName("Hardik");
		userByName.forEach(e->System.out.println(e));
		
	}

}
