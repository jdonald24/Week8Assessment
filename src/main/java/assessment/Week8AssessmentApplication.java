package assessment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import assessment.beans.House;
import assessment.controller.BeanConfiguration;
import assessment.repository.HouseRepository;


@SpringBootApplication
public class Week8AssessmentApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Week8AssessmentApplication.class, args);
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
	}
	@Autowired
	HouseRepository repo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext (BeanConfiguration.class);
		House h = appContext.getBean("house", House.class);
		h.setCost(376888.99);
		h.setNumOfRooms(10);
		h.setSquareFeet(500);
		h.setAddress("583 Oak Drive, Norwalk, IA");
		repo.save(h);
		List<House> allHouses = repo.findAll();
		for(House o: allHouses) {
			System.out.println(o.toString());
		}
		((AbstractApplicationContext) appContext).close();
	}

}
