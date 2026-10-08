package com.iset;

import com.iset.dao.OffreRepository;
import com.iset.entities.Offre;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class ServiceOffreEmploi1Application implements CommandLineRunner {

    private final OffreRepository offreRepository;

    public ServiceOffreEmploi1Application(OffreRepository offreRepository) {
        this.offreRepository = offreRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ServiceOffreEmploi1Application.class, args);
    }

    @Override
    public void run(String... args) {
        if (offreRepository.count() == 0) {
            offreRepository.save(new Offre("Web Design", "informatique", "AXA", 2, "France"));
            offreRepository.save(new Offre("Developpeur", "informatique", "Talys", 3, "Tunisie"));
            offreRepository.save(new Offre("Architecte", "informatique", "SIS", 2, "Allemagne"));
        }
    }
}
