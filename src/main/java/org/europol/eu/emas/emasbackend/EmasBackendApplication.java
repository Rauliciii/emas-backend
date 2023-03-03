package org.europol.eu.emas.emasbackend;

import org.europol.eu.emas.emasbackend.model.Role;
import org.europol.eu.emas.emasbackend.model.User;
import org.europol.eu.emas.emasbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class EmasBackendApplication {

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(EmasBackendApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void doSomethingAfterStartup() {
		System.out.println("Started successfully.");

		if (userService.findAll().isEmpty()) {
			User user = new User();
			user.setUsername("user");
			user.setName("Raul Bob User");
			user.setPassword("user");
			user.setRole(Role.USER);
			userService.saveUser(user);

			User admin = new User();
			admin.setUsername("admin");
			admin.setName("Raul Bob Admin");
			admin.setPassword("admin");
			admin.setRole(Role.ADMIN);
			userService.saveUser(admin);
		}
	}


}
