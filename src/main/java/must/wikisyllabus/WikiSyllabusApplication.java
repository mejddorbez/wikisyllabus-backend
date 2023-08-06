package must.wikisyllabus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WikiSyllabusApplication {

	public static void main(String[] args) {

		SpringApplication.run(WikiSyllabusApplication.class, args);
	}
	
	/*
	@Bean
	CommandLineRunner commandLineRunner(EnseignantRepository etudiantRepo) {
		
		Enseignant e1 = new Enseignant(null, "Mejd", "Dorbez", "MA");
		
		Enseignant e2 = new Enseignant(null, "Hayfa", "Rajhi", "MC");
		Enseignant e3 = new Enseignant(null, "Habib", "Fathallah", "A");
		return args -> {etudiantRepo.saveAll(Arrays.asList(e1, e2, e3));};
		
		
		//return null;
	}
	*/
}
