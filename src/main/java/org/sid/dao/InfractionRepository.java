package org.sid.dao;

import org.sid.entites.Infraction;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable; 
import org.springframework.data.jpa.repository.JpaRepository;

public interface InfractionRepository extends JpaRepository<Infraction, Long> {
	
	public Page<Infraction> findBynomDContains(String t, Pageable pageable);

}
