package teach.setxpro.btgpactual.orderms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class OrdermsApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrdermsApplication.class, args);
	}

}
