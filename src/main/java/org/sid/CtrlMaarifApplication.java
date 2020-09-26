package org.sid;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.sid.dao.InfractionRepository;
import org.sid.entites.Infraction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CtrlMaarifApplication implements CommandLineRunner {
	@Autowired
	private InfractionRepository infractionRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CtrlMaarifApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		/*Date date = new Date();
		infractionRepository.save(new Infraction(null, date, "Vitesse", "F8D892", 150, true));
		infractionRepository.save(new Infraction(null, date, "Vitesse", "A87G8T", 150, false));
		infractionRepository.save(new Infraction(null, date, "Vitesse", "Q5SD54", 150, false));
		infractionRepository.save(new Infraction(null, date, "La circulation de véhicule en sens interdit", "E55F54", 700, false));
		infractionRepository.save(new Infraction(null, date, "Le non-respect du droit de la priorité", "V478D5", 500, true));
		infractionRepository.save(new Infraction(null, date, "Le stationnement non réglementaire", "B7EZ98", 300, true));
		infractionRepository.save(new Infraction(null, date, "Absence de contrôle technique", "M88F78", 700, true));*/
		
	}


}
