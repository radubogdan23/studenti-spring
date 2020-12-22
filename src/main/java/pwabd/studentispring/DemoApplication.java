package pwabd.studentispring;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import pwabd.studentispring.model.Student;
import pwabd.studentispring.repository.StudentRepository;

@SpringBootApplication
public class DemoApplication {

	@Bean
	CommandLineRunner runner(StudentRepository sr) {
		Student[] studenti = new Student[] { new Student("SKaran", "Ili", 9.75), new Student("SBaran", "Imi", 6.75),
				new Student("STaran", "Mimi", 7.75), new Student("SGaran", "Iti", 8.75),
				new Student("SValita", "Ionita", 4.75), new Student("SPetrescu", "Titi", 5.25) };

		return args -> Stream.of(studenti).forEach(n -> sr.save(n));
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
