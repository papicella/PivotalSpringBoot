package pivotal.au.pas.platform.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class PivotalSpringBootApplication
{

	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(PivotalSpringBootApplication.class, args);
	}

	@PostConstruct
	public void init()
	{
		employeeRepository.save(new Employee("pas", "CEO"));
		employeeRepository.save(new Employee("lucia", "CIO"));
		employeeRepository.save(new Employee("siena", "CLERK"));
		employeeRepository.save(new Employee("lucas", "MANAGER"));
	}
}
