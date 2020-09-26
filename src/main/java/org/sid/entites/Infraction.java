package org.sid.entites;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Infraction implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long num_infr;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date_infr;
	private String titre_infr;
	private String matriculeV;
	private double montant_infr;
	private boolean valid_infr;
	
	public Long getNum_infr() {
		return num_infr;
	}
	public void setNum_infr(Long num_infr) {
		this.num_infr = num_infr;
	}
	public Date getDate_infr() {
		return date_infr;
	}
	public void setDate_infr(Date date_infr) {
		this.date_infr = date_infr;
	}
	public Infraction(Long num_infr, Date date_infr, String titre_infr, String matriculeV, double montant_infr,
			boolean valid_infr) {
		super();
		this.num_infr = num_infr;
		this.date_infr = date_infr;
		this.titre_infr = titre_infr;
		this.matriculeV = matriculeV;
		this.montant_infr = montant_infr;
		this.valid_infr = valid_infr;
	}
	public String getTitre_infr() {
		return titre_infr;
	}
	public void setTitre_infr(String titre_infr) {
		this.titre_infr = titre_infr;
	}

	public double getMontant_infr() {
		return montant_infr;
	}
	public void setMontant_infr(double montant_infr) {
		this.montant_infr = montant_infr;
	}
	public boolean isValid_infr() {
		return valid_infr;
	}
	public void setValid_infr(boolean valid_infr) {
		this.valid_infr = valid_infr;
	}
	public Infraction() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getMatriculeV() {
		return matriculeV;
	}
	public void setMatriculeV(String matriculeV) {
		this.matriculeV = matriculeV;
	}
	
	
		
	

}
