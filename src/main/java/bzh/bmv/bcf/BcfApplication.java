package bzh.bmv.bcf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Collection;

import org.hibernate.query.Query;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import bzh.bmv.bcf.model.Article;
import bzh.bmv.bcf.model.Media;

@SpringBootApplication
public class BcfApplication {

	/**
	 * The main method starts the SpringApplication BcfApplication
	 * @param args
	 * @author LEDOUJET
	 */
	public static void main(String[] args) {
	
	
		SpringApplication.run(BcfApplication.class, args);
	
	}
}
