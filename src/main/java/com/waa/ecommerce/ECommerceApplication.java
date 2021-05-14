package com.waa.ecommerce;

import com.waa.ecommerce.model.User;
import com.waa.ecommerce.model.security.Role;
import com.waa.ecommerce.model.security.UserRole;
import com.waa.ecommerce.service.UserService;
import com.waa.ecommerce.utility.SecurityUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ECommerceApplication implements CommandLineRunner {


	@Autowired
	UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(ECommerceApplication.class, args);
		System.out.println("Hello World");


	}

	@Override
	public void run(String... args) throws Exception {
		User user1=new User();
		user1.setFirstName("Ghirmay");
		user1.setLastName("Tessema");
		user1.setUsername("Ghirmay");
		user1.setPassword(SecurityUtility.passwordEncoder().encode("Ghirmay"));
		user1.setEmail("ghtessema@miu.edu");
		Set<UserRole> userRoles=new HashSet<>();
		Role role1=new Role();
		//role1.setRoleId(1);
		role1.setName("Role_Admin");
		userRoles.add(new UserRole(user1, role1));
		userService.createUser(user1,userRoles);

	}

}
